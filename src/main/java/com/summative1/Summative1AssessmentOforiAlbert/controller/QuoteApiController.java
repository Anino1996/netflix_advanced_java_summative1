package com.summative1.Summative1AssessmentOforiAlbert.controller;

import com.summative1.Summative1AssessmentOforiAlbert.models.Quote;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
public class QuoteApiController {
    private int id = 1;
    private final List<Quote> quoteList;
    private final Random randomGenerator;

    public QuoteApiController() {
        randomGenerator = new Random();
        quoteList = Arrays.asList (
                new Quote(id++, "Stephen Chbosky", "Even if we don't have the power to choose where we come from, we can still choose " +
                        "where we go from there"),
                new Quote(id++, "John Steinbeck", "And now that you don't have to be perfect, you can be good."),
                new Quote(id++, "John Green", "It hurt because it mattered."),
                new Quote(id++, "Margaret Atwood", "Life's not fair; why should I be?"),
                new Quote(id++, "Henry David Thoreau", "Never look back unless you are planning to go that way. "),
                new Quote(id++, "Stephen King", "Sooner or later, even the fastest runners have to stand and fight. "),
                new Quote(id++, "Robert Ingersoll", "We rise by lifting others. "),
                new Quote(id++, "Ralph Waldo Emerson", "Life is a journey, not a destination."),
                new Quote(id++, "Paula Coelho", "Straight roads do not make skillful drivers. "),
                new Quote(id++, "William Shakespeare", "To thine own self be true. "),
                new Quote(id++, "Ayn Rand", "Never think of pain or danger or enemies a moment longer than is necessary to fight them. "),
                new Quote(id++, "Aristotle", "To avoid criticism: say nothing, do nothing, be nothing. "),
                new Quote(id++, "Emily Dickinson", "Dwell in possibility. "),
                new Quote(id++, "Richie Norton", "A bad day doesn’t cancel out a good life. Keep going. "),
                new Quote(id++, "Alice Walker", "The most common way people give up their power is by thinking they don’t have any. "),
                new Quote(id++, "Mark Strand", "Each moment is a place you’ve never been. "),
                new Quote(id++, "Oscar Wilde", "We are all in the gutter, but some of us are looking at the stars. "),
                new Quote(id++, "L. M. Montgomery", "Tomorrow is always fresh, with no mistakes in it yet. "),
                new Quote(id++, "George Orwell", "Perhaps one did not want to be loved so much as to be understood. "),
                new Quote(id++, "Gabriel García Márquez", "There is always something left to love. "),
                new Quote(id++, "Mokokoma Mokhonoana", " How was your day?' ought to be ‘How did you look at your day?' "),
                new Quote(id++, "Joseph Heller", "Anything worth dying for is certainly worth living for.")
        );
    }

    //    Returns a random Quote in JSON Format.
    @RequestMapping(value = "/quote", method = RequestMethod.GET)
    public Quote getQuote() {
        return quoteList.get(
                randomGenerator.nextInt(quoteList.size()));
    }
}
