package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by vserdiuk on 2/4/17.
 */
public class Util {

    private static final Logger logger = Logger.getLogger(Util.class.getName());
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/user";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root1";

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            logger.log(Level.INFO, "Connection is OK");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            logger.log(Level.SEVERE, "Connection has ERROR", e);
        }
        return connection;
    }

}