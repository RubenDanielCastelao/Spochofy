package View;

import javax.swing.*;
import java.awt.*;

public class CustomMenuBar extends JMenuBar {

      private Image bgimg;

      public CustomMenuBar() {
            super();
            bgimg = Toolkit.getDefaultToolkit().getImage("src/main/java/Img/background.png");
      }

      @Override
      protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.drawImage(bgimg,0,0,getWidth(),getHeight(),this);
      }
}
