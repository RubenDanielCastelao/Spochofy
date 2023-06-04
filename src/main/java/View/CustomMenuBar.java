package View;

import javax.swing.*;
import java.awt.*;

public class CustomMenuBar extends JMenuBar {

      private Image bgimg;
      private Color color;

      public CustomMenuBar() {
            super();
            bgimg = Toolkit.getDefaultToolkit().getImage("src/main/java/Img/background.png");
            color = Color.black;
      }

      @Override
      protected void paintComponent(Graphics g){
            super.paintComponent(g);
            g.setColor(color);
            g.fillRect(0,0,getWidth(),getHeight());
            //g.drawImage(bgimg,0,0,getWidth(),getHeight(),this);
      }
}
