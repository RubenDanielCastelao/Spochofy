package Testing;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para la conexión a la base de datos.
 */

public class Enlace {


    private static Enlace con = null;
    Connection ccn = null;
    Statement st = null;

    /**
     * Conexión a la base de datos.
     */
    private Enlace() {
        try {
            String rutafile = "/database/spochofy.db";
            String Url = "jdbc:sqlite:src" + rutafile;
            ccn = DriverManager.getConnection(Url);
            st = ccn.createStatement();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "CONEXIÓN FALLIDA: " + e);
        }
    }

    /**
     * Singleton para la conexión a la base de datos.
     * @return
     */
    public static Enlace getInstance() {
        if (con == null) {
            con = new Enlace();
        }
        return con;
    }

    /**
     * Getter para la conexión a la base de datos.
     * @return
     */
    public Connection getConnection() {
        return ccn;
    }


    /**
     * Método para cerrar la conexión a la base de datos.
     */
    public void Desconexion() {
        try {
            ccn.close();
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.exit(0);
        }


    }
}
