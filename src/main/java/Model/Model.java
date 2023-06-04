package Model;

import BD.*;

import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;

public class Model {

    /**
     * Atributos para la conexión a la base de datos.
     */
    static Enlace E = Enlace.getInstance();

    /**
     * Método para conectar a la base de datos.
     */
    public void conectar() {
        E.getInstance();
    }

    /**
     * Método para cerrar la conexión a la base de datos.
     */
    public void desconectar() {
        E.desconexion();
    }

    /**
     * Método para mostrar las canciones.
     *
     * @return
     */

    public ArrayList<Canciones> mostrarCanciones() {

        ResultSet resultado = null;
        ArrayList<Canciones> canciones = new ArrayList<Canciones>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM canciones");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Canciones c = new Canciones(resultado.getInt("cid"), resultado.getInt("yid"), resultado.getInt("aid"), resultado.getInt("atid"), resultado.getString("ctitulo"));
                canciones.add(c);
            }

            resultado.close();
            sentencia.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar las canciones: " + e.getMessage());
        }
        return canciones;
    }

    /**
     * Método para mostrar los álbumes.
     * @return
     */
    public ArrayList<Albumes> mostrarAlbumes() {

        ResultSet resultado = null;
        ArrayList<Albumes> albumes = new ArrayList<Albumes>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM albumes");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Albumes a = new Albumes(resultado.getInt("yid"), resultado.getInt("aid"), resultado.getInt("atid"), resultado.getString("atitulo"));
                albumes.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los álbumes: " + e.getMessage());
        }
        return albumes;
    }

    /**
     * Método para mostrar los años.
     * @return
     */
    public ArrayList<Anyos> mostrarAnyos() {

        ResultSet resultado = null;
        ArrayList<Anyos> anyos = new ArrayList<Anyos>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM anyos");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Anyos a = new Anyos (resultado.getInt("yid"), resultado.getString("ynumero"));
                anyos.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los anyos: " + e.getMessage());
        }
        return anyos;
    }

    /**
     * Método para mostrar los artistas.
     * @return
     */
    public ArrayList<Artistas> mostrarArtistas() {

        ResultSet resultado = null;
        ArrayList<Artistas> artistas = new ArrayList<Artistas>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM artistas");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Artistas a = new Artistas (resultado.getInt("atid"), resultado.getString("atnombre"));
                artistas.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los artistas: " + e.getMessage());
        }
        return artistas;
    }

    /**
     * Método para mostrar las listas de reproducción.
     * @return
     */
    public ArrayList<ListasRep> mostrarListasRep() {

        ResultSet resultado = null;
        ArrayList<ListasRep> listasrep = new ArrayList<ListasRep>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM listasrep");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                ListasRep l = new ListasRep (resultado.getInt("lid"), resultado.getInt("uid"), resultado.getString("lnombre"));
                listasrep.add(l);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar las listas de reproducción: " + e.getMessage());
        }
        return listasrep;
    }

    /**
     * Método para mostrar las canciones de las listas de reproducción.
     * @return
     */
    public ArrayList<CancionesLR> mostrarCancionesLR() {

        ResultSet resultado = null;
        ArrayList<CancionesLR> cancioneslr = new ArrayList<CancionesLR>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM componen");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                CancionesLR clr = new CancionesLR (resultado.getInt("lid"), resultado.getInt("cid"));
                cancioneslr.add(clr);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar las listas de reproducción: " + e.getMessage());
        }
        return cancioneslr;
    }

    public ArrayList<Usuarios> mostrarUsuarios() {

        ResultSet resultado = null;
        ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM usuarios");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Usuarios u = new Usuarios (resultado.getInt("uid"), resultado.getString("unombre"), resultado.getString("ucontrasena"));
                usuarios.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar las listas de reproducción: " + e.getMessage());
        }
        return usuarios;
    }
}
