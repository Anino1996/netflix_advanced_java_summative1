package com.summative1.Summative1AssessmentOforiAlbert.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(QuoteApiController.class)
public class QuoteApiControllerTests {

    @Autowired
    private MockMvc mockMvc;

    //    Testing http method GET uri /quote
    @Test
    public void shouldReturnQuote() throws Exception {
//        Act
        MvcResult result = mockMvc.perform(get("/quote"))
                .andDo(print())
                .andExpect(status().isOk())
                .andReturn();

//        Assert that response is not null
        assertNotNull(result.getResponse().getContentAsString());
    }
}