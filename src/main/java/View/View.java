package View;

import BD.*;
import Model.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;


public class View {

      public Model model = new Model();

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
      public void openCreatePlayList(MainUI ui, ArrayList<ListasRep> listasRepUser, ArrayList<Canciones> cancionesListaRep, ArrayList<Canciones> listaCanciones) {
            //se añade la interfaz de login a la ventana principal
            crearPlayList cplaylui = new crearPlayList(ui);
            ui.desktopMain.add(cplaylui);

            //configuraciones para la interfaz de crear playlist
            cplaylui.toFront();
            cplaylui.setLocation(ui.desktopMain.getWidth() / 2 - cplaylui.getWidth() / 2, ui.desktopMain.getHeight() / 2 - cplaylui.getHeight() / 2);
            cplaylui.setVisible(true);

            //se añaden las columnas a mostrar de las canciones
            DefaultTableModel aux = (DefaultTableModel) cplaylui.songTable.getModel();
            aux.addColumn("ID");
            aux.addColumn("Título");
            aux.addColumn("Año");
            aux.addColumn("Album");
            aux.addColumn("Artista");

            //se añade la informacion a mostrar a la tabla
            for (int i = 0; i < listaCanciones.size(); i++) {
                  aux.addRow(new Object[]{listaCanciones.get(i).getCid(), listaCanciones.get(i).getCtitulo(), model.verAnyo(listaCanciones.get(i).getYid()), model.verAlbum(listaCanciones.get(i).getAid()), model.verArtista(listaCanciones.get(i).getAtid())});
            }

            //se añaden las columnas a mostrar de los playlist creadas por el usuario
            DefaultTableModel aux1 = (DefaultTableModel) cplaylui.playListsTable.getModel();
            aux1.addColumn("ID");
            aux1.addColumn("Nombre");
            aux1.addColumn("Usuario");

            //se añade la informacion a mostrar a la tabla
            for (int i = 0; i < listasRepUser.size(); i++) {
                  aux1.addRow(new Object[]{listasRepUser.get(i).getLid(), listasRepUser.get(i).getLnombre(), model.verUsuario(listasRepUser.get(i).getUid())});
            }

            //se añaden las columnas a mostrar de las canciones de la playlist elegida
            DefaultTableModel aux2 = (DefaultTableModel) cplaylui.playListTable.getModel();
            aux2.addColumn("ID");
            aux2.addColumn("Título");
            aux2.addColumn("Año");
            aux2.addColumn("Album");
            aux2.addColumn("Artista");

            //se añaden las canciones de la playlist elegida
            for (int i = 0; i < cancionesListaRep.size(); i++) {
                  aux2.addRow(new Object[]{cancionesListaRep.get(i).getCid(), cancionesListaRep.get(i).getCtitulo(), model.verAnyo(cancionesListaRep.get(i).getYid()), model.verAlbum(cancionesListaRep.get(i).getAid()), model.verArtista(cancionesListaRep.get(i).getAtid())});
            }
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la ui de canciones
       * @param listaCanciones lista de canciones a mostrar
       */
      public void openSongs(MainUI ui, ArrayList<Canciones> listaCanciones) {
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

            //se añade la informacion a mostrar a la tabla
            for (int i = 0; i < listaCanciones.size(); i++) {
                  aux.addRow(new Object[]{listaCanciones.get(i).getCid(), listaCanciones.get(i).getCtitulo(), model.verAnyo(listaCanciones.get(i).getYid()), model.verAlbum(listaCanciones.get(i).getAid()), model.verArtista(listaCanciones.get(i).getAtid())});
            }
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui, mostrando todas las playlist creadas por el usuario
       * @param listasReps Lista de playlist creadas por el usuario a mostar
       */
      public void openPlaylist(MainUI ui, ArrayList<ListasRep> listasReps) {
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

            //se añade la informacion a mostrar a la tabla
            for (int i = 0; i < listasReps.size(); i++) {
                  aux.addRow(new Object[]{listasReps.get(i).getLid(), listasReps.get(i).getLnombre(), model.verUsuario(listasReps.get(i).getUid())});
            }
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui, mostrando los autores disponibles
       * @param artistList Lista de autores disponibles a mostrar
       */
      public void openAuthors(MainUI ui, ArrayList<Artistas> artistList) {
            //añade ui de listas a la interfasz principal
            ListasUI listasUI = new ListasUI();
            ui.desktopMain.add(listasUI);

            //configuro la interfaz usada para mostrar las listas
            listasUI.toFront();
            listasUI.setLocation(ui.desktopMain.getWidth() / 2 - listasUI.getWidth() / 2, ui.desktopMain.getHeight() / 2 - listasUI.getHeight() / 2);
            listasUI.titleListas.setIcon(new ImageIcon("src/main/java/Img/artistas.png"));
            listasUI.setVisible(true);
            listasUI.playButton.setVisible(false);
            listasUI.stopButton.setVisible(false);

            //se añaden las columnas a mostrar de los autores
            DefaultTableModel aux = (DefaultTableModel) listasUI.tablaListas.getModel();
            aux.addColumn("ID");
            aux.addColumn("Nombre");

            //se añade la informacion a mostrar a la tabla
            for (int i = 0; i < artistList.size(); i++) {
                  aux.addRow(new Object[]{artistList.get(i).getAtid(), artistList.get(i).getAtnombre()});
            }
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui, mostrando los albumes
       * @param albumList Lista de albumes a mostrar
       */
      public void openAlbums(MainUI ui, ArrayList<Albumes> albumList) {
            //añade ui de listas a la interfasz principal
            ListasUI listasUI = new ListasUI();
            ui.desktopMain.add(listasUI);

            //configuro la interfaz usada para mostrar las listas
            listasUI.toFront();
            listasUI.setLocation(ui.desktopMain.getWidth() / 2 - listasUI.getWidth() / 2, ui.desktopMain.getHeight() / 2 - listasUI.getHeight() / 2);
            listasUI.titleListas.setIcon(new ImageIcon("src/main/java/Img/albumes.png"));
            listasUI.setVisible(true);
            listasUI.playButton.setVisible(false);
            listasUI.stopButton.setVisible(false);

            //se añaden las columnas a mostrar de los albumes
            DefaultTableModel aux = (DefaultTableModel) listasUI.tablaListas.getModel();
            aux.addColumn("ID");
            aux.addColumn("Título");
            aux.addColumn("Año");
            aux.addColumn("Artista");

            //se añade la informacion a mostrar a la tabla
            for (int i = 0; i < albumList.size(); i++) {
                  aux.addRow(new Object[]{albumList.get(i).getAid(), albumList.get(i).getAtitulo(), model.verAnyo(albumList.get(i).getYid()), model.verArtista(albumList.get(i).getAtid())});
            }
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz listasui, muestra los años disponibles
       * @param anyosList Lista de años disponibles
       */
      public void openYears(MainUI ui, ArrayList<Anyos> anyosList) {
            //añade ui de listas a la interfasz principal
            ListasUI listasUI = new ListasUI();
            ui.desktopMain.add(listasUI);

            //configuro la interfaz usada para mostrar las listas
            listasUI.toFront();
            listasUI.setLocation(ui.desktopMain.getWidth() / 2 - listasUI.getWidth() / 2, ui.desktopMain.getHeight() / 2 - listasUI.getHeight() / 2);
            listasUI.titleListas.setIcon(new ImageIcon("src/main/java/Img/anyos.png"));
            listasUI.setVisible(true);
            listasUI.playButton.setVisible(false);
            listasUI.stopButton.setVisible(false);

            //se añaden las columnas a mostrar de los años
            DefaultTableModel aux = (DefaultTableModel) listasUI.tablaListas.getModel();
            aux.addColumn("ID");
            aux.addColumn("Año");

            //se añade la informacion a mostrar a la tabla
            for (int i = 0; i < anyosList.size(); i++) {
                  aux.addRow(new Object[]{anyosList.get(i).getYid(), anyosList.get(i).getYnumero()});
            }
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
       * @param username Nombre de usuario que aparecera en la interfaz general
       */
      public void actualizarUsuario(MainUI ui, String username) {
            ui.usuarioText.setText(username);
      }
}
