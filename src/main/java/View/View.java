package View;

import Temporal.Controller;

public class View {

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz login
       */
      public void openLogin(MainUI ui) {
            //se añade la interfaz de login a la ventana principal
            ui.desktopMain.add(Controller.logui);

            //configuraciones para la interfaz de login
            Controller.logui.toFront();
            Controller.logui.setLocation(ui.desktopMain.getWidth() / 2 - Controller.logui.getWidth() / 2, ui.desktopMain.getHeight() / 2 - Controller.logui.getHeight() / 2);
            Controller.logui.setVisible(true);
      }

      /**
       *
       * @param ui Objeto de la MainUI usado para modificar la interfaz signin
       */
      public void openSignin(MainUI ui) {
            //se añade la interfaz de signin a la ventana principal
            ui.desktopMain.add(Controller.signui);

            //configuraciones para la interfaz de login
            Controller.signui.toFront();
            Controller.signui.setLocation(ui.desktopMain.getWidth() / 2 - Controller.signui.getWidth() / 2, ui.desktopMain.getHeight() / 2 - Controller.signui.getHeight() / 2);
            Controller.signui.setVisible(true);
      }
}
