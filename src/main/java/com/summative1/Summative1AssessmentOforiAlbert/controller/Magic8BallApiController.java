package com.summative1.Summative1AssessmentOforiAlbert.controller;

import com.summative1.Summative1AssessmentOforiAlbert.models.Answer;
import com.summative1.Summative1AssessmentOforiAlbert.models.Question;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class Magic8BallApiController {
    private List<Answer> answerList;
    private final Random randomGenerator = new Random();

    public Magic8BallApiController() {

        int id = 1;
        answerList = Arrays.asList(
                new Answer(id++, "Yes ."),
                new Answer(id++, "No ."),
                new Answer(id++, "No doubt about it ."),
                new Answer(id++, "Absolutely ."),
                new Answer(id++, "The stars say no ."),
                new Answer(id++, "So it shall be."),
                new Answer(id++, "Unlikely ."),
                new Answer(id++, "Indications say yes ."),
                new Answer(id++, "Positively ."),
                new Answer(id++, "You can count on it."),
                new Answer(id++, "Answer unclear ask later ."),
                new Answer(id++, "Don't bet on it."),
                new Answer(id++, "Looks like yes ."),
                new Answer(id++, "Chances aren't good ."),
                new Answer(id++, "Focus and ask again ."),
                new Answer(id++, "Can't say now ."),
                new Answer(id++, "Prospect good."),
                new Answer(id++, "Very likely ."),
                new Answer(id++, "Consult me later ."),
                new Answer(id++, "Cannot foretell now .")
        );
    }

    @RequestMapping(value = "/magic", method = RequestMethod.POST)
    Answer getMagicAnswer(@RequestBody @Valid Question question) {
        Answer response = answerList.get(randomGenerator.nextInt(answerList.size()));
        response.setQuestion(question);

        return response;
    }
}
