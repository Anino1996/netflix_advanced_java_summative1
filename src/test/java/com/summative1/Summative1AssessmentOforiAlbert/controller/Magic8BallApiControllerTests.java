package com.summative1.Summative1AssessmentOforiAlbert.controller;

import com.summative1.Summative1AssessmentOforiAlbert.models.Answer;
import com.summative1.Summative1AssessmentOforiAlbert.models.Question;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(Magic8BallApiController.class)
public class Magic8BallApiControllerTests {

    @Autowired
    private MockMvc mockMvc;

    private ObjectMapper objectMapper = new ObjectMapper();

    @Test
    public void shouldReturnAnswerWithSuppliedQuestion() throws Exception {
//        Arrange
        Question question = new Question("Will it rain?");
        String jsonInput = objectMapper.writeValueAsString(question);

//        Act and assert
        MvcResult mockMvcResult = mockMvc.perform(
                post("/magic")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonInput))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

//      Assert that response contains question
        String jsonResponse = mockMvcResult.getResponse().getContentAsString();
        Answer answer = objectMapper.readValue(jsonResponse, Answer.class);
        assertEquals(question, answer.getQuestion(), "Answer should have the question that was supplied");
    }

    @Test
    public void shouldReturnUnprocessablEntityResponse() throws Exception {

        //        Arrange
        Question question = new Question("");
        String jsonInput = objectMapper.writeValueAsString(question);

        //        Act and assert
        MvcResult mockMvcResult = mockMvc.perform(
                post("/magic")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(jsonInput))
                .andDo(print())
                .andExpect(status().isUnprocessableEntity())
                .andReturn();
    }
}
