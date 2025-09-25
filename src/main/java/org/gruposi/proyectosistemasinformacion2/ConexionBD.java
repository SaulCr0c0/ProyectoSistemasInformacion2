package org.gruposi.proyectosistemasinformacion2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {

    private static final String HOST = "bswuf2kphdgfgjhdjsed-mysql.services.clever-cloud.com"; // MYSQL_ADDON_HOST
    private static final String PORT = "3306";                                                // MYSQL_ADDON_PORT
    private static final String DB   = "bswuf2kphdgfgjhdjsed";                                // MYSQL_ADDON_DB
    private static final String USER = "uxn53ywbvamo9zg2";                                    // MYSQL_ADDON_USER
    private static final String PASS = "jTLMRfw9yWbGrkMF0qQ8";                                // MYSQL_ADDON_PASSWORD

    private static final String URL =
            "jdbc:mysql://" + HOST + ":" + PORT + "/" + DB
                    + "?useSSL=true&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    public static Connection getConnection() {
        try {
            System.out.println("Conectando a: " + URL);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}