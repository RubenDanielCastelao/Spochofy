package Testing;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Enlace {

    DefaultTableModel model; // Modelo de la tabla
    Connection connect; // Conexión a la base de datos
    String url = "src/database/spochofy.db"; // Ruta de la base de datos

    /**
     * Método para conectar a la base de datos
     */
    public void conectarBD(){

       try{ connect = DriverManager.getConnection(url);}
       catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());}

    }

    /**
     * Método para desconectar de la base de datos
     */
    public void desconectarBD(){

        try{ connect.close();}
        catch(SQLException e){JOptionPane.showMessageDialog(null, e.getMessage());}

    }


}
