package Controller;

import View.*;

public class Controller {

      public static View view = new View();

      public static void main(String[] args) {
            MainUI.launch();
      }

      //Abre una interfaz de LogIn
      public static void login(MainUI ui){
            view.closeUIs(ui);
            view.openLogin(ui);
      }
      //Abre una interfaz de SignIn
      public static void singin(MainUI ui){
            view.closeUIs(ui);
            view.openSignin(ui);
      }
      //Abre una interfaz de crear PlayList
      public static void createPlayList(MainUI ui){
            view.closeUIs(ui);
            view.openCreatePlayList(ui);
      }

      //Abre una interfaz para mostrar todas las canciones
      public static void songs(MainUI ui) {
            view.closeUIs(ui);
            view.openSongs(ui);
      }
      //Abre una interfaz que muestra todas las playlist creadas por el usuario
      public static void playlists(MainUI ui){
            view.closeUIs(ui);
            view.openPlaylist(ui);
      }
      //Abre una interfaz que muestra todos los artistas disponibles en el programa
      public static void artistas(MainUI ui){
            view.closeUIs(ui);
            view.openAuthors(ui);
      }
      //Abre una interfaz que muestra todos los albumes de los artitas
      public static void albums(MainUI ui){
            view.closeUIs(ui);
            view.openAlbums(ui);
      }
      //Abre una interfaz que muestra todos los años disponibles
      public static void years(MainUI ui){
            view.closeUIs(ui);
            view.openYears(ui);
      }

      public static void exit(MainUI ui){
            view.exit(ui);
      }
}