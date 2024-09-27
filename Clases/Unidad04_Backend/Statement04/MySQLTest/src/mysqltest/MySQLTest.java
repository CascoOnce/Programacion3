package mysqltest;

// Casco_Once

import java.sql.SQLException;
import mysql.config.DBManagerMySQL;


public class MySQLTest {
    public static void main(String[] args) throws SQLException {
        DBManagerMySQL dbManager = null;
        System.out.println(dbManager);
        dbManager = DBManagerMySQL.getInstance();
        System.out.println(dbManager);
        dbManager.getConnection();
        System.out.println(dbManager);
    }
}