package Controller;

import View.*;
import Model.*;

public class Controller {

      static Model MODEL = new Model();
      static View VIEW = new View();
      public void login(MainUI ui){
            VIEW.openLogin(ui);
      }

      public static void ConectarseABD(){
            MODEL.conectar();
      }

      public static void DesconectarseABD(){
            MODEL.desconectar();
      }


}