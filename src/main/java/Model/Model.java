package Model;

import BD.*;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.AudioDevice;
import javazoom.jl.player.JavaSoundAudioDevice;
import javazoom.jl.player.Player;
import java.io.FileInputStream;
import java.sql.*;
import java.util.ArrayList;
import java.io.File;
import java.util.List;

public class Model implements Runnable {

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
     * @param a
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
     * @param a
     * @param b
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


            PreparedStatement sentencia = E.conexion.prepareStatement("insert into listasrep values (" + null + ", " + lnombre + "," + userid + ")");
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

        int aux = 999;
        try {

            PreparedStatement st = E.conexion.prepareStatement("select uid from usuarios where unombre = '" + username + "'");
            st.execute();
            aux = st.getResultSet().getInt("uid");
            System.out.println(aux);
            return aux;
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
            PreparedStatement sentencia = E.conexion.prepareStatement("INSERT INTO usuarios VALUES (" + username + ", " + contra + ")");
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
    public int login(String username, String contra){
        String aux1, aux2;
        try{

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT unombre FROM usuario");
            sentencia.executeQuery();
            aux1 = sentencia.getResultSet().getString("unombre");

            PreparedStatement sentencia2 = E.conexion.prepareStatement("SELECT ucontrasena FROM usuario");
            sentencia.executeQuery();
            aux2 = sentencia2.getResultSet().getString("ucontrasena");

            if(aux1.equals(username) && aux2.equals(contra)){
                return 1;

            } else if(aux1.equals(username)&&aux2.equals(contra)==false){
                return 2;

            } else{
                return 3;
            }

        }catch (SQLException e){
            System.out.println("Error al hacer login: " + e.getMessage());
        }
        return 999;
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

            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT * FROM listasrep WHERE uid  = '" + aux + "')");

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
     * Método para mostrar el nombre de un álbum recibiendo su ID.
     * @param num
     * @return el nombre del álbum
     */
    public String verAlbum(int num){

        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT anombre FROM album WHERE aid = '" + num + "'");
            sentencia.executeQuery();
            return sentencia.getResultSet().getString("anombre");

        }catch (SQLException e){
            System.out.println("Error al mostrar el album: " + e.getMessage());
        }
        return null;
    }

    /**
     * Método para mostrar el nombre de un artista recibiendo su ID.
     * @param num
     * @return el nombre del artista
     */
    public String verArtista(int num){
        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT atnombre FROM artista WHERE atid = '" + num + "'");
            sentencia.executeQuery();
            return sentencia.getResultSet().getString("atnombre");
    }catch (SQLException e){
            System.out.println("Error al mostrar el artista: " + e.getMessage());
        }
        return null;
    }

    /**
     * Método para mostrar el número de un año recibiendo su ID.
     * @param num
     * @return el número del año
     */
    public String verAnyo(int num){
        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT ynumero FROM anyo WHERE yid = '" + num + "'");
            sentencia.executeQuery();
            return sentencia.getResultSet().getString("ynumero");
        }catch (SQLException e){
            System.out.println("Error al mostrar el año: " + e.getMessage());
        }
        return null;
    }

    /**
     * Método para mostrar el título de una canción recibiendo su ID.
     * @param num
     * @return el título de la canción
     */
    public String verCancion(int num){
        try{
            PreparedStatement sentencia = E.conexion.prepareStatement("SELECT ctitulo FROM canciones WHERE cid = '" + num + "'");
            sentencia.executeQuery();
            return sentencia.getResultSet().getString("ctitulo");
        }catch (SQLException e){
            System.out.println("Error al mostrar el título: " + e.getMessage());
        }
        return null;
        }

    /**
     * Método para ver el título de una lista recibiendo su ID.
     * @param num
     * @return el título de la lista
     */
    public String verLista(int num){

            try{
                PreparedStatement sentencia = E.conexion.prepareStatement("SELECT lnombre FROM listasrep WHERE lid = '" + num + "'");
                sentencia.executeQuery();
                return sentencia.getResultSet().getString("lnombre");
            }catch (SQLException e){
                System.out.println("Error al mostrar el título de la playlist: " + e.getMessage());
            }
            return null;
        }

    /**
     *
     *
     *
     * A PARTIR DE AQUÍ, LOS MÉTODOS SON PARA PODER REPRODUCIR MÚSICA CON ÉXITO.
     *
     *
     *
     */

    /**
     * Método para la reproducción de la música.
     */
    public void whatevsMusic() {
        File musicFolder = new File("src\\music");
        File[] musicFiles = musicFolder.listFiles((dir, name) -> name.endsWith(".mp3"));

        // Crear una lista de nombres de archivos
        List<String> filenames = new ArrayList<>();
        for (File file : musicFiles) {
            filenames.add(file.getAbsolutePath());
        }

        // Crear un objeto Model y reproducir la música en segundo plano
        Model musicPlayer = new Model();
        Thread musicThread = new Thread(() -> musicPlayer.playMusic(filenames));
        musicThread.start();
    }

    /**
     *
     * MUSIC PLAYER
     *
     *
     */

    private Player player;

    /**
     * Método para la reproducción de la música.
     * @param filenames
     */
    public void playMusic(List<String> filenames) {
        try {
            for (String filename : filenames) {
                /**
                 * Cargar el archivo de música
                 */
                FileInputStream fileInputStream = new FileInputStream(filename);

                /**
                 * Crear un objeto Player y un objeto AudioDevice para la reproducción de la música
                 */
                AudioDevice audioDevice = new JavaSoundAudioDevice();
                player = new Player(fileInputStream, audioDevice);

                /**
                 * Iniciar un nuevo hilo para la reproducción de la música
                 */
                Thread musicThread = new Thread(this);
                musicThread.start();

                /**
                 * Esperar a que el hilo de música termine antes de continuar con el siguiente archivo
                 */
                musicThread.join();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Implementar el método run() de la interfaz Runnable para la reproducción de la música en segundo plano
     */
    public void run() {
        try {
            /**
             * Reproducir la música
             */
            player.play();
        } catch (JavaLayerException e) {
            e.printStackTrace();
        }
    }
}

