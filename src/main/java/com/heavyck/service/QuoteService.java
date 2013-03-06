package com.heavyck.service;

import com.heavyck.dao.QuoteDAO;
import com.heavyck.entity.Quote;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class QuoteService {

    /*public static Quote getRandomQuote() throws SQLException {
        return QuoteDAO.getRandomQuote();
    }*/

    public static Quote getRandomQuote() throws SQLException {
        Quote quote = null;

        while (quote == null) {
            int result = (int) (Math.random() * QuoteDAO.getMaxId() + 1);

            quote = QuoteDAO.getById(result);
        }

        return quote;
    }

}
