package com.heavyck.service;

import com.heavyck.dao.QuoteDAO;
import com.heavyck.entity.Quote;
import net.sf.json.JSONSerializer;
import org.springframework.stereotype.Service;

import java.sql.SQLException;

@Service
public class QuoteService {

    public static Quote getRandomQuote() throws SQLException {
        return QuoteDAO.getRandomQuote();
    }

    /*public String toJson() {
        return new JSONSerializer().exclude("Quote.class").serialize(this);
    }*/

}
