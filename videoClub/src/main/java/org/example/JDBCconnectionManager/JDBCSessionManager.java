package org.example.JDBCconnectionManager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCSessionManager {
        private Connection connection = null;

        public Connection startSession() {

            try {
                if (connection == null) {
                    connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/films", "root", "");
                }
            } catch (SQLException ex) {
                System.out.println("Failure to connect to database : " + ex.getMessage());
            }
            return connection;
        }

        public void stopSession() {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException ex) {
                System.out.println("Failure to close database connections: " + ex.getMessage());
            }
        }

        public Connection getCurrentSession(){
            startSession();
            return connection;
        }
    }

