package org.example.JPAConnectionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JPASessionManager {

    private EntityManagerFactory emf;
    private EntityManager em;

    public void startSession() {
        if (em == null) {
            em = emf.createEntityManager();
        }
    }

    public void stopSession() {
        if (em != null) {
            em.close();
        }
        em = null;
    }

    public EntityManager getCurrentSession() {
        startSession();
        return em;
    }

    public void setEntityManagerFactory(EntityManagerFactory emf) {
        this.emf = emf;
    }
}
