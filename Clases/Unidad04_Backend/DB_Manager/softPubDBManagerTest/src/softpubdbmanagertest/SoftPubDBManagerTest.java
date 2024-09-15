package softpubdbmanagertest;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import softpub.config.DBManager;

// Casco_Once

public class SoftPubDBManagerTest {
    public static void main(String[] args) {
        DBManager dbManager = null;
        System.out.println(dbManager);
        dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        try {
            Connection conexion = dbManager.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SoftPubDBManagerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(dbManager);
    }
}
