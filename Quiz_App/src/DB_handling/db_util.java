/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_handling;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author mohitgupta
 */
public class db_util {
    private static final String USERNAME = "dbuser";
    private static final String PASSWORD = "dbpassword";

    private static final String H_CONN_STRING ="jdbc:hsqldb:data/explorecalifornia";
    private static final String M_CONN_STRING ="jdbc:mysql://localhost/explorecalifornia";

    public static Connection getconnection(dbtype db_type) throws SQLException {
         return DriverManager.getConnection(M_CONN_STRING,USERNAME,PASSWORD);
    }
}
