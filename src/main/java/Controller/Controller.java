package Controller;

import BD.*;
import View.*;
import Model.*;

import javax.swing.*;
import java.util.ArrayList;

public class Controller {


      public static View view = new View();
      public static Model model = new Model();
      public static String estado;
      public static MusicPlayer musicPlayer = new MusicPlayer();

      public static void main(String[] args) {
            MainUI.launch();
      }
      //Inicia sesion en el programa
      public static void login(MainUI ui, String username, String password) {
            boolean log = model.login(username, password);
            if (log) {
                  view.closeUIs(ui);
                  view.actualizarUsuario(ui, username);
            }else {
                  JOptionPane.showMessageDialog(null,"Credencioales incorrectas");
            }
      }
      //Abre una interfaz de LogIn
      public static void openLogin(MainUI ui){
            view.closeUIs(ui);
            view.openLogin(ui);
      }
      //Abre una interfaz de SignIn
      public static void openSingin(MainUI ui){
            view.openSignin(ui);
      }
      //Crea un usuario nuevo
      public static void signin(String username, String password){
            model.registrarse(username, password);
      }
      //Abre una interfaz de crear PlayList
      public static void createPlayListUI(MainUI ui){
            view.closeUIs(ui);
            String user = ui.usuarioText.getText();
            ArrayList<ListasRep> listasRepsUser = model.mostrarListasRepUsuario(user);
            ArrayList<Canciones> cancioneslistaRep = model.mostrarCancionesPlaylist(0);
            ArrayList<Canciones> listaCanciones = model.mostrarCanciones();
            view.openCreatePlayList(ui, listasRepsUser, cancioneslistaRep, listaCanciones);
      }
      //Muestra la lista de canciones de seleccionada en la tabla
      public static void selectPlaylist(MainUI ui, int aux){
            view.closeUIs(ui);
            String user = ui.usuarioText.getText();
            ArrayList<ListasRep> listasRepsUser = model.mostrarListasRepUsuario(user);
            ArrayList<Canciones> cancioneslistaRep = model.mostrarCancionesPlaylist(aux );
            ArrayList<Canciones> listaCanciones = model.mostrarCanciones();
            view.openCreatePlayList(ui, listasRepsUser, cancioneslistaRep, listaCanciones);
      }
      //Modifica el nombre de la PlayList seleccionada en la tabla
      public static void updatePlaylistName(MainUI ui, int aux, String name){
            model.cambiarNombrePlaylist(name, aux);
            Controller.createPlayListUI(ui);
      }
      //Eliminar la PlayList seleccionada en la tabla
      public static void deletePlaylist(MainUI ui, int aux){
            model.borrarPlaylist(aux);
            Controller.createPlayListUI(ui);
      }
      //Añade una PlayList a la base de datos y la muestra en la interfaz
      public static void createPlaylist(MainUI ui, String lnombre){
            String user = ui.usuarioText.getText();
            model.crearPlaylist(user, lnombre);
            Controller.createPlayListUI(ui);
      }
      //Añade una cancion a una PlayList
      public static void addSongToPlaylist(MainUI ui, int lid, int cid){
            model.anyadirCancionAPlaylist(lid ,cid);
            selectPlaylist(ui,lid);
      }
      //Borra una cancion de una PlayList
      public static void removeSongFromPlaylist(MainUI ui, int lid, int cid){
            model.borrarCancionDePlaylist(lid ,cid);
            selectPlaylist(ui,lid);
      }
      //Abre una interfaz para mostrar todas las canciones
      public static void songs(MainUI ui) {
            view.closeUIs(ui);
            ArrayList<Canciones> listaCanciones = model.mostrarCanciones();
            view.openSongs(ui, listaCanciones);
            estado = "SONGS";
      }
      //Abre una interfaz que muestra todas las playlist creadas por el usuario
      public static void playlists(MainUI ui){
            view.closeUIs(ui);
            String user = ui.usuarioText.getText();
            ArrayList<ListasRep> listasReps = model.mostrarListasRepUsuario(user);
            view.openPlaylist(ui, listasReps);
            estado = "PLAYLISTS";
      }
      //Abre una interfaz que muestra todos los artistas disponibles en el programa
      public static void artistas(MainUI ui){
            view.closeUIs(ui);
            ArrayList<Artistas> artistList = model.mostrarArtistas();
            view.openAuthors(ui, artistList);
      }
      //Abre una interfaz que muestra todos los albumes de los artitas
      public static void albums(MainUI ui){
            view.closeUIs(ui);
            ArrayList<Albumes> albumList = model.mostrarAlbumes();
            view.openAlbums(ui, albumList);
      }
      //Abre una interfaz que muestra todos los años disponibles
      public static void years(MainUI ui){
            view.closeUIs(ui);
            ArrayList<Anyos> anyosList = model.mostrarAnyos();
            view.openYears(ui, anyosList);
      }
      //Reproduce la PLayList seleccionada en la tabla
      public static void playMusic(int id){
            if (estado.equals("PLAYLISTS")) {
                  ArrayList<Canciones> playList = model.mostrarCancionesPlaylist(id);
                  model.playMusicPL(playList);
            }else if (estado.equals("SONGS")) {
                  String cancion = model.verCancion(id);
                  model.playMusic(cancion);
            }
      }
      //Para la musica que se esta reproduciendo
      public static void stopMusic(){
            Controller.musicPlayer.stop();
      }
      //Cierra el programa
      public static void exit(MainUI ui){
            view.exit(ui);
      }
}