package com.heavyck.controller;

import com.heavyck.entity.Author;
import com.heavyck.entity.Quote;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @RequestMapping(value = "/quotes", method = RequestMethod.GET)
    public String main(Model model) {

        Author author = new Author();
        author.setId(1L);
        author.setName("Author");

        Quote quote = new Quote();
        quote.setId(1L);
        quote.setQuote("quote 1");
        quote.setCategory("category");
        quote.setAuthor(author);

        Quote quote2 = new Quote();
        quote2.setId(2L);
        quote2.setQuote("quote 2");
        quote2.setCategory("category 2");
        quote2.setAuthor(author);

        List<Quote> quotes = new ArrayList<Quote>();
        quotes.add(quote);
        quotes.add(quote2);

        int numberOfQuotes = quotes.size();

        int quoteNumber= (int) (Math.random() * numberOfQuotes);

        model.addAttribute("quote", quotes.get(quoteNumber));

        return "quotes";
    }

}
