package BD;

import javax.swing.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Clase para la conexión a la base de datos.
 */

public class Enlace {


    /**
     * Atributos para la conexión a la base de datos.
     */
    public Connection conexion;
    private static Enlace conectar = null;
    String url = "jdbc:sqlite:src/database/spochofy.db";



    /**
     * Conexión a la base de datos.
     */
    private Enlace() {
        try {
            conexion = DriverManager.getConnection(url);
            if (conexion != null) {
                JOptionPane.showMessageDialog(null,"Conexión a base de datos realizada con éxito.");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Conexión a base de datos fallida: " + e);
        }
    }

    /**
     * Singleton para la conexión a la base de datos.
     * @return
     */
    public static Enlace getInstance() {
        if (conectar == null) {
            conectar = new Enlace();
        }
        return conectar;
    }

    /**
     * Método para cerrar la conexión a la base de datos.
     */
    public void desconexion() {
        try {
            conexion.close();
            JOptionPane.showMessageDialog(null, "Desconexión a base de datos realizada con éxito.");
        } catch (SQLException ex) {
            Logger.getLogger(Enlace.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
