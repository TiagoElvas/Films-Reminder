package org.example.JPAConnectionManager;

import org.example.JDBCconnectionManager.JDBCSessionManager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import java.sql.SQLException;

public class JPATransactionManager {

    private JPASessionManager sm;


    public void beginRead() {
        sm.startSession();
    }

    public void beginWrite() {
        sm.getCurrentSession().getTransaction().begin();
    }

    public void commit() {
        if(sm.getCurrentSession().getTransaction().isActive()){
            sm.getCurrentSession().getTransaction().commit();
        }
        sm.stopSession();
    }

    public void rollback() {
        if(sm.getCurrentSession().getTransaction().isActive()){
            sm.getCurrentSession().getTransaction().rollback();
        }
        sm.stopSession();
    }


    public void setJPASessionManager(JPASessionManager sm) {
        this.sm = sm;
    }


}
