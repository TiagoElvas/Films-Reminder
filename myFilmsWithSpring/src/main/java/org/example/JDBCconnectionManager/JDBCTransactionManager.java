package org.example.JDBCconnectionManager;

import java.sql.SQLException;

public class JDBCTransactionManager {
    private JDBCSessionManager cm;

    public void setConnectionManager(JDBCSessionManager sessionManager){
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
