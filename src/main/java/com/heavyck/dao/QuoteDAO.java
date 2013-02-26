package com.heavyck.dao;

import com.heavyck.entity.Quote;
import com.heavyck.util.HibernateUtil;
import org.hibernate.Session;

import javax.swing.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class QuoteDAO {

    public static void save(Quote quote) throws IOException {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        session.save(quote);
        session.getTransaction().commit();

        if (session != null && session.isOpen()) {
            session.close();
        }
    }

    public static List<Quote> load() throws IOException, SQLException {
        Session session = null;
        List<Quote> list = new ArrayList<Quote>();

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            list = session.createCriteria(Quote.class).list();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'getAll'", JOptionPane.OK_OPTION);

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return list;
    }

    public static void delete(Integer id) throws SQLException {
        Session session = null;
        Quote quote = getById(id);

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.delete(quote);
            session.getTransaction().commit();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Delete Error", JOptionPane.OK_OPTION);

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

    public static Quote getById(Integer id) throws SQLException {
        Session session = null;
        Quote quote = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            quote = (Quote) session.get(Quote.class, id);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'findById'", JOptionPane.OK_OPTION);

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return quote;
    }

    /*public static Quote getByAuthor(Integer id) throws SQLException {
        Session session = null;
        Quote quote = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            quote = (Quote) session.get(Quote.class, id);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error 'findById'", JOptionPane.OK_OPTION);

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }

        return quote;
    }*/

    public static void update(Integer id, Quote quote) throws SQLException {
        Session session = null;

        try {
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.update(quote);
            session.getTransaction().commit();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Update Error", JOptionPane.OK_OPTION);
        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}
