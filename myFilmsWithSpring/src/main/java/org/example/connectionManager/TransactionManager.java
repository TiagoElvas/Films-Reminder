package org.example.connectionManager;

import java.sql.SQLException;

public class TransactionManager {
    private SessionManager cm;

    public void setConnectionManager(SessionManager sessionManager){
        this.cm = sessionManager;
    }

    public void beginRead() {
        cm.startSession();
    }

    public void beginWrite() {
        try {
            cm.getCurrentSession().setAutoCommit(false);
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

    public void commit() {
        try {
            if (!cm.getCurrentSession().getAutoCommit()) {
                cm.getCurrentSession().commit();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        cm.stopSession();
    }


    public void rollback() {
        try {
            if (!cm.getCurrentSession().getAutoCommit()) {
                cm.getCurrentSession().rollback();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        cm.stopSession();
    }
}
