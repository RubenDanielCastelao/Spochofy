package View;

import Temporal.Controller;

import javax.swing.*;

public class View {

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz login
       */
      public void openLogin(MainUI ui) {
            //se añade la interfaz de login a la ventana principal
            Login logui = new Login(ui);
            ui.desktopMain.add(logui);

            //configuraciones para la interfaz de login
            logui.toFront();
            logui.setLocation(ui.desktopMain.getWidth() / 2 - logui.getWidth() / 2, ui.desktopMain.getHeight() / 2 - logui.getHeight() / 2);
            logui.setVisible(true);
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz signin
       */
      public void openSignin(MainUI ui) {
            //se añade la interfaz de signin a la ventana principal
            Sign signui = new Sign();
            ui.desktopMain.add(signui);

            //configuraciones para la interfaz de login
            signui.toFront();
            signui.setLocation(ui.desktopMain.getWidth() / 2 - signui.getWidth() / 2, ui.desktopMain.getHeight() / 2 - signui.getHeight() / 2);
            signui.setVisible(true);
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui
       */
      public void openSongs(MainUI ui) {
            //añade ui de listas a la interfaz principal
            ListasUI listasUI = new ListasUI();
            ui.desktopMain.add(listasUI);

            //configuro la interfaz usada para mostrar las listas
            listasUI.toFront();
            listasUI.setLocation(ui.desktopMain.getWidth() / 2 - listasUI.getWidth() / 2, ui.desktopMain.getHeight() / 2 - listasUI.getHeight() / 2);
            listasUI.titleListas.setIcon(new ImageIcon("src/main/java/Img/canciones.png"));
            listasUI.setVisible(true);
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui, mostrando todas las playlist creadas por el usuario
       */
      public void openPlaylist(MainUI ui) {
            //añade ui de listas a la interfasz principal
            ListasUI listasUI = new ListasUI();
            ui.desktopMain.add(listasUI);

            //configuro la interfaz usada para mostrar las listas
            listasUI.toFront();
            listasUI.setLocation(ui.desktopMain.getWidth() / 2 - listasUI.getWidth() / 2, ui.desktopMain.getHeight() / 2 - listasUI.getHeight() / 2);
            listasUI.titleListas.setIcon(new ImageIcon("src/main/java/Img/listas.png"));
            listasUI.setVisible(true);
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui, mostrando los autores disponibles
       */
      public void openAuthors(MainUI ui) {
            //añade ui de listas a la interfasz principal
            ListasUI listasUI = new ListasUI();
            ui.desktopMain.add(listasUI);

            //configuro la interfaz usada para mostrar las listas
            listasUI.toFront();
            listasUI.setLocation(ui.desktopMain.getWidth() / 2 - listasUI.getWidth() / 2, ui.desktopMain.getHeight() / 2 - listasUI.getHeight() / 2);
            listasUI.titleListas.setIcon(new ImageIcon("src/main/java/Img/artistas.png"));
            listasUI.setVisible(true);
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui, mostrando los albumes
       */
      public void openAlbums(MainUI ui) {
            //añade ui de listas a la interfasz principal
            ListasUI listasUI = new ListasUI();
            ui.desktopMain.add(listasUI);

            //configuro la interfaz usada para mostrar las listas
            listasUI.toFront();
            listasUI.setLocation(ui.desktopMain.getWidth() / 2 - listasUI.getWidth() / 2, ui.desktopMain.getHeight() / 2 - listasUI.getHeight() / 2);
            listasUI.titleListas.setIcon(new ImageIcon("src/main/java/Img/albumes.png"));
            listasUI.setVisible(true);
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui, muestra los años disponibles
       */
      public void openYears(MainUI ui) {
            //añade ui de listas a la interfasz principal
            ListasUI listasUI = new ListasUI();
            ui.desktopMain.add(listasUI);

            //configuro la interfaz usada para mostrar las listas
            listasUI.toFront();
            listasUI.setLocation(ui.desktopMain.getWidth() / 2 - listasUI.getWidth() / 2, ui.desktopMain.getHeight() / 2 - listasUI.getHeight() / 2);
            listasUI.titleListas.setIcon(new ImageIcon("src/main/java/Img/anyos.png"));
            listasUI.setVisible(true);
      }

      public void closeUIs(MainUI ui){
            for (JInternalFrame allFrame : ui.desktopMain.getAllFrames()) {
                  allFrame.dispose();
            }
      }
}
