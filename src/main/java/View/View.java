package View;

public class View {

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz
       */
      public void openLogin(MainUI ui) {
            //creo y añado la interfaz de login
            Login logui = new Login();
            ui.desktopMain.add(logui);

            //configuraciones para la interfaz de login
            logui.toFront();
            logui.setLocation(ui.desktopMain.getWidth() / 2 - logui.getWidth() / 2, ui.desktopMain.getHeight() / 2 - logui.getHeight() / 2);
            logui.setVisible(true);
      }
}
