package View;

import Controller.Controller;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;


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
       * @param ui Objeto de la MainUI usado para modificar la interfaz create PlayList
       */
      public void openCreatePlayList(MainUI ui) {
            //se añade la interfaz de login a la ventana principal
            crearPlayList cplaylui = new crearPlayList();
            ui.desktopMain.add(cplaylui);

            //configuraciones para la interfaz de crear playlist
            cplaylui.toFront();
            cplaylui.setLocation(ui.desktopMain.getWidth() / 2 - cplaylui.getWidth() / 2, ui.desktopMain.getHeight() / 2 - cplaylui.getHeight() / 2);
            cplaylui.setVisible(true);
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

            //se añaden las columnas a mostrar de las canciones
            DefaultTableModel aux = (DefaultTableModel) listasUI.tablaListas.getModel();
            aux.addColumn("ID");
            aux.addColumn("Título");
            aux.addColumn("Año");
            aux.addColumn("Album");
            aux.addColumn("Artista");

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

            //se añaden las columnas a mostrar de los playlist creadas por el usuario
            DefaultTableModel aux = (DefaultTableModel) listasUI.tablaListas.getModel();
            aux.addColumn("ID");
            aux.addColumn("Nombre");
            aux.addColumn("Usuario");
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

            //se añaden las columnas a mostrar de los autores
            DefaultTableModel aux = (DefaultTableModel) listasUI.tablaListas.getModel();
            aux.addColumn("ID");
            aux.addColumn("Nombre");
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

            //se añaden las columnas a mostrar de los albumes
            DefaultTableModel aux = (DefaultTableModel) listasUI.tablaListas.getModel();
            aux.addColumn("ID");
            aux.addColumn("Título");
            aux.addColumn("Año");
            aux.addColumn("Artista");
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

            //se añaden las columnas a mostrar de los años
            DefaultTableModel aux = (DefaultTableModel) listasUI.tablaListas.getModel();
            aux.addColumn("ID");
            aux.addColumn("Año");
      }

      public void  exit(MainUI ui) {
            if (JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?")==0)
                  ui.dispose();
      }
      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz general, cerrando todas las ventanas que estuviesen abiertas
       */
      public void closeUIs(MainUI ui){
            //Recorre y cierra todas las ventanas abiertas
            for (JInternalFrame allFrame : ui.desktopMain.getAllFrames()) {
                  allFrame.dispose();
            }
      }
      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz general, actualizando el nombre de usuario
       */
      public void actualizarUsuario(MainUI ui, String username) {
            ui.usuarioText.setText(username);
      }
}
