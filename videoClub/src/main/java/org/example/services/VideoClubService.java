package org.example.services;


import org.example.JPAConnectionManager.JPATransactionManager;
import org.example.dao.Dao;
import org.example.model.Film;
import org.hibernate.TransactionException;

import javax.persistence.EntityManager;
import javax.persistence.RollbackException;
import java.util.List;

public class VideoClubService {

    private Dao dao;
    private JPATransactionManager tm;

    public List<Film> readListFilms() {
        try {
            tm.beginRead();
            return dao.read();
        } finally {
            tm.commit();
        }
    }

    public void addFilm(Film film){
        try {
            tm.beginWrite();
            dao.create(film);
            tm.commit();
        } catch (TransactionException e){
            tm.rollback();
        }
    }

    public void delete(Integer id){
        try{
            tm.beginWrite();
            dao.delete(id);
            tm.commit();
        } catch(TransactionException e){
            tm.rollback();
        }
    }

    public void setTm(JPATransactionManager tm) {
        this.tm = tm;
    }

    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
