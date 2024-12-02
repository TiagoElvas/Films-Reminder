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

    public Film findById(Integer id) {
        EntityManager em = emf.createEntityManager();

        try {
            return em.find(Film.class, id);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

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

    public Film create(Film film) {

        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            Film newFilm = em.merge(film);
            em.getTransaction().commit();
            return newFilm;

        } catch (RollbackException ex) {
            em.getTransaction().rollback();
            return null;

        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void delete(Integer id) {
        EntityManager em = emf.createEntityManager();
        try {
            em.getTransaction().begin();
            Film film = em.find(Film.class, id);

            if (em != null) {
                em.remove(film);
            } else {
                System.out.println("User not found.");
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            e.printStackTrace();
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
