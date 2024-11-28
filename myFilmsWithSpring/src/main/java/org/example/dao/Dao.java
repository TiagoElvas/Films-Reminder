package org.example.dao;
import org.example.Bootstrap;
import org.example.model.Film;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.RollbackException;
import javax.persistence.TypedQuery;
import java.util.List;

public class Dao {

    private EntityManagerFactory emf;

    public List<Film> read() {
        EntityManager em = emf.createEntityManager();

        try {
            TypedQuery<Film> query =
                    em.createQuery("SELECT film FROM Film film", Film.class);
            return query.getResultList();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public Film create(Film film){

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Film object = em.merge(film);
            em.getTransaction().commit();
            return object;

        } catch (RollbackException ex) {
            // something went wrong, make sure db is consistent
            em.getTransaction().rollback();
            return null;

        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }
}
