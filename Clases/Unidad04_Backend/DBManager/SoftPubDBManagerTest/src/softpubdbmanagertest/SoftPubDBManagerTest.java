package softpubdbmanagertest;

// Casco_Once

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import softpub.config.DBManager;
import softpub.util.Cifrado;

public class SoftPubDBManagerTest {
    public static void main(String[] args) {
        DBManager dbManager = null;
        System.out.println(dbManager);
        dbManager = DBManager.getInstance();
        System.out.println(dbManager);
        System.out.println(Cifrado.descifrarMD5("dFRPNanHgeHz3QvAxKBs0Q=="));
        try {
            dbManager.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(SoftPubDBManagerTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(dbManager);
    }
}