package com.heavyck.controller;

import com.heavyck.dao.AuthorDAO;
import com.heavyck.dao.QuoteDAO;
import com.heavyck.entity.Author;
import com.heavyck.entity.Quote;
import com.heavyck.service.QuoteService;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.RequestAttributes;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class MainController {

    @RequestMapping(value = "/quotes", method = RequestMethod.GET)
    public String main(Model model) throws SQLException {
        model.addAttribute("randomQuote", QuoteService.getRandomQuote());

        return "quotes";
    }

    @ResponseBody
    @RequestMapping(value = "/quotes/json", method = RequestMethod.POST)
    public Quote json(Model model) throws SQLException {
        model.addAttribute("randomQuote", QuoteService.getRandomQuote());
        Quote quote = QuoteService.getRandomQuote();

        return quote;
    }

    @RequestMapping(value = "/quotes/add", method = RequestMethod.POST)
    public String addQuote(@RequestParam("quote") String quote,
                           @RequestParam("author") String author_id,
                           @RequestParam("category") String category) throws SQLException, IOException {

        Quote newQuote = new Quote();
        newQuote.setQuote(quote);
        newQuote.setAuthor(AuthorDAO.getById(Integer.parseInt(author_id)));
        newQuote.setCategory(category);

        QuoteDAO.save(newQuote);

        return "quotes";
    }

    @RequestMapping(value = "/administration", method = RequestMethod.GET)
    public String administration(Model model) throws SQLException, IOException {
        model.addAttribute("authors", AuthorDAO.load());

        return "administration";
    }

}
