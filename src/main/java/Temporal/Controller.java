package Temporal;

import View.*;

public class Controller {

      public static View view = new View();
      public static MainUI ui = new MainUI();
      public static Login logui = new Login();
      public static Sign signui = new Sign();

      public static void main(String[] args) {
            ui.setVisible(true);
      }

      //Abre una interfaz de LogIn
      public static void login(){view.openLogin(ui);}
      //Abre una interfaz de SignIn
      public static void singin(){view.openSignin(ui);}
}