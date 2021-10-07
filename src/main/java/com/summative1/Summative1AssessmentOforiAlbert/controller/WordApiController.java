package com.summative1.Summative1AssessmentOforiAlbert.controller;

import com.summative1.Summative1AssessmentOforiAlbert.models.Definition;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class WordApiController {
    private List<Definition> wordList;
    private final Random randomGenerator;

    public WordApiController() {
        randomGenerator = new Random();
        int id = 1;
        wordList = Arrays.asList(
                new Definition(id++, "consider", "deem to be"),
                new Definition(id++, "minute", "infinitely or immeasurably small"),
                new Definition(id++, "accord", "concurrence of opinion"),
                new Definition(id++, "evident", "clearly revealed to the mind or the senses or judgment"),
                new Definition(id++, "practice", "a customary way of operation or behavior"),
                new Definition(id++, "intend", "have in mind as a purpose"),
                new Definition(id++, "concern", "something that interests you because it is important"),
                new Definition(id++, "commit", "perform an act, usually with a negative connotation"),
                new Definition(id++, "issue", "some situation or event that is thought about"),
                new Definition(id++, "approach", "move towards"),
                new Definition(id++, "establish", "set up or found"),
                new Definition(id++, "utter", "without qualification"),
                new Definition(id++, "conduct", "direct the course of; manage or control"),
                new Definition(id++, "engage", "consume all of one's attention or time"),
                new Definition(id++, "obtain", "come into possession of"),
                new Definition(id++, "scarce", "deficient in quantity or number compared with the demand"),
                new Definition(id++, "policy", "a plan of action adopted by an individual or social group"),
                new Definition(id++, "straight", "successive, without a break"),
                new Definition(id++, "stock", "capital raised by a corporation through the issue of shares"),
                new Definition(id++, "apparent", "clearly revealed to the mind or the senses or judgment"),
                new Definition(id++, "property", "a basic or essential attribute shared by members of a class"),
                new Definition(id++, "fancy", "imagine; conceive of; see in one's mind"),
                new Definition(id++, "concept", "an abstract or general idea inferred from specific instances"),
                new Definition(id++, "court", "an assembly to conduct judicial business"),
                new Definition(id++, "appoint", "assign a duty, responsibility, or obligation to")
        );
    }

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    Definition getWordOfTheDay() {
        return wordList.get(randomGenerator.nextInt(wordList.size()));
    }
}
