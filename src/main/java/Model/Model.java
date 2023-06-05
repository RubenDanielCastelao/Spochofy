package Model;

import BD.*;
import Controller.Controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import org.example.BD.Enlace;

public class Model extends Observable {

    /**
     *
     *
     *
     * A PARTIR DE AQUÍ, LOS MÉTODOS SON PARA PODER INTERACTUAR CON LA BASE DE DATOS.
     *
     *
     *
     */

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
     * @return canciones
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
     *
     * @return albumes
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
     *
     * @return anyos
     */
    public ArrayList<Anyos> mostrarAnyos() {

        ResultSet resultado = null;
        ArrayList<Anyos> anyos = new ArrayList<Anyos>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM anyos");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Anyos a = new Anyos(resultado.getInt("yid"), resultado.getString("ynumero"));
                anyos.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los anyos: " + e.getMessage());
        }
        return anyos;
    }

    /**
     * Método para mostrar los artistas.
     *
     * @return artistas
     */
    public ArrayList<Artistas> mostrarArtistas() {

        ResultSet resultado = null;
        ArrayList<Artistas> artistas = new ArrayList<Artistas>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM artistas");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Artistas a = new Artistas(resultado.getInt("atid"), resultado.getString("atnombre"));
                artistas.add(a);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar los artistas: " + e.getMessage());
        }
        return artistas;
    }

    /**
     * Método para mostrar las listas de reproducción.
     *
     * @return listasrep
     */
    public ArrayList<ListasRep> mostrarListasRep() {

        ResultSet resultado = null;
        ArrayList<ListasRep> listasrep = new ArrayList<ListasRep>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM listasrep");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                ListasRep l = new ListasRep(resultado.getInt("lid"), resultado.getInt("uid"), resultado.getString("lnombre"));
                listasrep.add(l);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar las listas de reproducción: " + e.getMessage());
        }
        return listasrep;
    }

    /**
     * Método para mostrar las canciones de las listas de reproducción.
     *
     * @return cancioneslr
     */
    public ArrayList<CancionesLR> mostrarCancionesLR() {

        ResultSet resultado = null;
        ArrayList<CancionesLR> cancioneslr = new ArrayList<CancionesLR>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM componen");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                CancionesLR clr = new CancionesLR(resultado.getInt("lid"), resultado.getInt("cid"));
                cancioneslr.add(clr);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar las listas de reproducción: " + e.getMessage());
        }
        return cancioneslr;
    }

    /**
     * Método para mostrar los usuarios.
     *
     * @return usuarios
     */
    public ArrayList<Usuarios> mostrarUsuarios() {

        ResultSet resultado = null;
        ArrayList<Usuarios> usuarios = new ArrayList<Usuarios>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM usuarios");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Usuarios u = new Usuarios(resultado.getInt("uid"), resultado.getString("unombre"), resultado.getString("ucontrasena"));
                usuarios.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar las listas de reproducción: " + e.getMessage());
        }
        return usuarios;
    }

    /**
     * Método para añadir canciones a una playlist.
     *
     * @param a id de la playlist
     * @param b id de la cancion
     * @return canciones
     */
    public void anyadirCancionAPlaylist(int a, int b) {

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("insert into componen values (" + a + "," + b + ")");
            sentencia.execute();

        } catch (SQLException e) {
            System.out.println("Error al añadir a la playlist: " + e.getMessage());
        }

    }

    /**
     * Método para borrar canciones de una playlist.
     * @param a id de la playlist
     * @param b id de la cancion
     */
    public void borrarCancionDePlaylist(int a, int b) {

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("delete from componen where lid = '" + a + "' and cid = '" + b + "'");
            sentencia.execute();

        } catch (SQLException e) {
            System.out.println("Error al borrar de la playlist: " + e.getMessage());
        }
    }

    /**
     * Método para borrar una playlist.
     * @param a
     */
    public void borrarPlaylist(int a) {

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("delete from listasrep where lid = '" + a + "'");
            sentencia.execute();

            //Se notifica al Observador que se ha borrado la playlist.
            setChanged();
            notifyObservers();
        } catch (SQLException e) {
            System.out.println("Error al borrar la playlist: " + e.getMessage());
        }

    }

    /**
     * Método para crear una playlist.
     * @param username
     * @param lnombre
     */
    public void crearPlaylist(String username, String lnombre) {

        try {
            int userid = checkUserID(username);

            PreparedStatement sentencia = E.conexion.prepareStatement("insert into listasrep values (" + null + ", '" + lnombre + "','" + userid + "')");
            sentencia.execute();

            //Se notifica al Observador que se ha creado la playlist.
            setChanged();
            notifyObservers();
        } catch (SQLException e) {
            System.out.println("Error al crear la playlist: " + e.getMessage());
        }
    }

    /**
     * Método para comprobar el ID de usuario.
     * @param username
     * @return aux
     */
    public int checkUserID(String username) {

        ResultSet resultado = null;
        int aux = 999;

        try {

            PreparedStatement st = E.conexion.prepareStatement("select uid from usuarios where unombre = '" + username + "'");
            resultado = st.executeQuery();
            aux = resultado.getInt("uid");

            resultado.close();
            st.close();

        } catch (SQLException e) {
            System.out.println("Error al comprobar el usuario: " + e.getMessage());
        }
        return aux;
    }

    /**
     * Método para cambiar el nombre de una playlist.
     * @param nombrenuevo
     * @param lid
     */
    public void cambiarNombrePlaylist(String nombrenuevo, int lid) {

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("update listasrep set lnombre = '" + nombrenuevo + "' where lid = '" + lid + "'");
            sentencia.execute();

            //Se notifica al Observador que se ha cambiado el nombre de la playlist.
            setChanged();
            notifyObservers();
        } catch (SQLException e) {
            System.out.println("Error al cambiar el nombre de la playlist: " + e.getMessage());
        }
    }

    /**
     * Método para mostrar las canciones de una playlist.
     * @param lid
     * @return cancionesPlaylist
     */
    public ArrayList<Canciones> mostrarCancionesPlaylist(int lid) {

        ResultSet resultado = null;
        ArrayList<Canciones> cancionesPlaylist = new ArrayList<Canciones>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM canciones WHERE cid IN (SELECT cid FROM componen WHERE lid = '" + lid + "')");
            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                Canciones c = new Canciones(resultado.getInt("cid"), resultado.getInt("yid"), resultado.getInt("aid"), resultado.getInt("atid"), resultado.getString("ctitulo"));
                cancionesPlaylist.add(c);
            }

            resultado.close();
            sentencia.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar las canciones de la playlist: " + e.getMessage());
        }
        return cancionesPlaylist;
    }

    /**
     * Método para registrarse en la aplicación
     * @param username
     * @param contra
     */
    public void registrarse(String username, String contra) {
        try {
            PreparedStatement sentencia = E.conexion.prepareStatement("INSERT INTO usuarios VALUES (" + null + ",'" + username + "', '" + contra + "')");
            sentencia.executeQuery();
        } catch (SQLException e) {
            System.out.println("Registro fallido: " + e.getMessage());
        }

    }


    /**
     * Método para iniciar sesión en la aplicación
     * @param username
     * @param contra
     * @return el resultado del inicio de sesión: 1 si es correcto, 2 si la contraseña es incorrecta y 3 si el usuario no existe
     */
    public boolean login(String username, String contra){

        ResultSet resultado = null;
        boolean found= false;
        boolean logged = false;

        try{

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT unombre, ucontrasena FROM usuarios");
            resultado = sentencia.executeQuery();
            String pwd = "";
            while(resultado.next() && !found){
                if (resultado.getString("unombre").equals(username)) {
                    found = true;
                    pwd = resultado.getString("ucontrasena");
                }
            }
            if (found && pwd.equals(contra)) {
                logged = true;
            }


        }catch (SQLException e){
            System.out.println("Error al hacer login: " + e.getMessage());
        }
        return logged;
    }

    /**
     * Método para mostrar las listas de reproducción de un usuario.
     * @param username
     * @return listasrep
     */
    public ArrayList<ListasRep> mostrarListasRepUsuario(String username) {

        int aux=checkUserID(username);
        ResultSet resultado = null;
        ArrayList<ListasRep> listasrep = new ArrayList<ListasRep>();

        try {

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM listasrep WHERE uid  = '" + aux + "'");

            resultado = sentencia.executeQuery();
            while (resultado.next()) {
                ListasRep l = new ListasRep(resultado.getInt("lid"), resultado.getInt("uid"), resultado.getString("lnombre"));
                listasrep.add(l);
            }

            resultado.close();
            sentencia.close();

        } catch (SQLException e) {
            System.out.println("Error al mostrar las listas de reproducción: " + e.getMessage());
        }
        return listasrep;
    }

    /**
     * Método para mostrar el nombre de un álbum recibiendo su ID.
     * @param num
     * @return el nombre del álbum
     */
    public String verAlbum(int num){

        ResultSet resultado = null;
        String aux = null;

        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT atitulo FROM albumes WHERE aid = '" + num + "'");
            resultado = sentencia.executeQuery();
            aux = resultado.getString("atitulo");

            resultado.close();
            sentencia.close();

        }catch (SQLException e){
            System.out.println("Error al mostrar el album: " + e.getMessage());
        }
        return aux;
    }

    /**
     * Método para mostrar el nombre de un artista recibiendo su ID.
     * @param num
     * @return el nombre del artista
     */
    public String verArtista(int num){

        ResultSet resultado = null;
        String aux = null;

        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT atnombre FROM artistas WHERE atid = '" + num + "'");
            resultado = sentencia.executeQuery();
            aux = resultado.getString("atnombre");

            resultado.close();
            sentencia.close();

    }catch (SQLException e){
            System.out.println("Error al mostrar el artista: " + e.getMessage());
        }
        return aux;
    }

    /**
     * Método para mostrar el número de un año recibiendo su ID.
     * @param num
     * @return el número del año
     */
    public String verAnyo(int num){

        ResultSet resultado = null;
        String aux = null;

        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT ynumero FROM anyos WHERE yid = '" + num + "'");
            resultado = sentencia.executeQuery();
            aux = resultado.getString("ynumero");

            resultado.close();
            sentencia.close();

        }catch (SQLException e){
            System.out.println("Error al mostrar el año: " + e.getMessage());
        }
        return aux;
    }

    /**
     * Método para mostrar el título de una canción recibiendo su ID.
     * @param num
     * @return el título de la canción
     */
    public String verCancion(int num){

        ResultSet resultado = null;
        String aux = null;

        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT ctitulo FROM canciones WHERE cid = '" + num + "'");
            resultado = sentencia.executeQuery();
            aux = resultado.getString("ctitulo");

            resultado.close();
            sentencia.close();

        }catch (SQLException e){
            System.out.println("Error al mostrar el título: " + e.getMessage());
        }
        return aux;
        }

    /**
     * Método para ver el título de una lista recibiendo su ID.
     * @param num
     * @return el título de la lista
     */
    public String verLista(int num){

        ResultSet resultado = null;
        String aux = null;

            try{
                PreparedStatement sentencia = E.conexion.prepareStatement("SELECT lnombre FROM listasrep WHERE lid = '" + num + "'");
                resultado = sentencia.executeQuery();
                aux = resultado.getString("lnombre");

                resultado.close();
                sentencia.close();

            }catch (SQLException e){
                System.out.println("Error al mostrar el título de la playlist: " + e.getMessage());
            }
            return aux;
        }

    /**
     *
      * @param num id del usuario a mostrar
     * @return nombre del usuario
     */
    public String verUsuario(int num){

        ResultSet resultado = null;
        String aux = null;

        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT unombre FROM usuarios WHERE uid = '" + num + "'");
            resultado = sentencia.executeQuery();
            aux = resultado.getString("unombre");

            resultado.close();
            sentencia.close();

        }catch (SQLException e){
            System.out.println("Error al mostrar el título: " + e.getMessage());
        }
        return aux;
    }

    Thread musicThread;

    /**
     *
     * @param musicFiles Array de musica que se va a reproducir
     */
    public void playMusicPL(ArrayList<Canciones> musicFiles) {

        // Crear una lista de nombres de archivos
        List<String> filenames = new ArrayList<>();
        for (Canciones cancion : musicFiles) {
            filenames.add("src/music/" + cancion.getCtitulo() + ".mp3");
        }

        // Crear un objeto Model y reproducir la música en segundo plano
        musicThread = new Thread(() -> Controller.musicPlayer.playMusic(filenames));
        musicThread.start();
    }

    /**
     *
     * @param cancion Nombre de la canción que se va a reproducir
     */
    public void playMusic(String cancion) {

        // Crear una lista de nombres de archivos
        List<String> filenames = new ArrayList<>();
        filenames.add("src/music/" + cancion + ".mp3");

        // Crear un objeto Model y reproducir la música en segundo plano
        MusicPlayer musicPlayer = new MusicPlayer();
        musicThread = new Thread(() -> Controller.musicPlayer.playMusic(filenames));
        musicThread.start();
    }
}

