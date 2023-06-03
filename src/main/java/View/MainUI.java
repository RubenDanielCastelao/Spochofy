/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Temporal.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author ruben
 */
public class MainUI extends javax.swing.JFrame {


    /**
     * Creates new form MainUI
     */
    public MainUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopMain = new javax.swing.JDesktopPane();
        backgroundLabel = new javax.swing.JLabel();
        menuBarMain = new CustomMenuBar();
        exitMenu = new javax.swing.JMenu();
        cancionesMenu = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        listasMenu = new javax.swing.JMenu();
        artistasMenu = new javax.swing.JMenu();
        albumMenu = new javax.swing.JMenu();
        anyosManu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        backgroundLabel.setIcon(new javax.swing.ImageIcon("src/main/java/Img/background.png")); // NOI18N

        desktopMain.setLayer(backgroundLabel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout desktopMainLayout = new javax.swing.GroupLayout(desktopMain);
        desktopMain.setLayout(desktopMainLayout);
        desktopMainLayout.setHorizontalGroup(
            desktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        desktopMainLayout.setVerticalGroup(
            desktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backgroundLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        menuBarMain.setBorder(null);
        menuBarMain.setPreferredSize(new java.awt.Dimension(70, 130));
        menuBarMain.setRequestFocusEnabled(false);

        exitMenu.setBackground(new java.awt.Color(0, 0, 0));
        exitMenu.setBorder(null);
        exitMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/logo.png")); // NOI18N
        exitMenu.setBorderPainted(false);
        exitMenu.setFocusable(false);
        exitMenu.setPreferredSize(new java.awt.Dimension(189, 130));
        exitMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMenuMouseClicked(evt);
            }
        });
        menuBarMain.add(exitMenu);
        exitMenu.getAccessibleContext().setAccessibleDescription("");

        cancionesMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/canciones.png")); // NOI18N
        cancionesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancionesMenuMouseClicked(evt);
            }
        });

        albumMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                albumMenuMouseClicked(evt);
            }
        });

        anyosManu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anyosMenuMouseClicked(evt);
            }
        });

        listasMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listasMenuMouseClicked(evt);
            }
        });

        artistasMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artistasMenuMouseClicked(evt);
            }
        });

        jMenuItem1.setText("Canciones");

        cancionesMenu.add(jMenuItem1);

        jMenuItem2.setText("PlayList");
        cancionesMenu.add(jMenuItem2);

        menuBarMain.add(cancionesMenu);

        listasMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/listas.png")); // NOI18N
        menuBarMain.add(listasMenu);

        artistasMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/artistas.png")); // NOI18N
        menuBarMain.add(artistasMenu);

        albumMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/albumes.png")); // NOI18N
        albumMenu.setToolTipText("");
        menuBarMain.add(albumMenu);

        anyosManu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/anyos.png")); // NOI18N
        menuBarMain.add(anyosManu);

        setJMenuBar(menuBarMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desktopMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     *
     * @param evt evento al que reaccionar
     */
    private void exitMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMenuMouseClicked
        Controller.login(this);
    }//GEN-LAST:event_exitMenuMouseClicked

    private void albumMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionesMenuActionPerformed
        Controller.albums(this);
    }//GEN-LAST:event_cancionesMenuActionPerformed

    private void anyosMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionesMenuActionPerformed
        Controller.years(this);
    }//GEN-LAST:event_cancionesMenuActionPerformed

    private void artistasMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionesMenuActionPerformed
        Controller.artistas(this);
    }//GEN-LAST:event_cancionesMenuActionPerformed

    private void listasMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionesMenuActionPerformed
        Controller.playlists(this);
    }//GEN-LAST:event_cancionesMenuActionPerformed

    private void cancionesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionesMenuActionPerformed
        Controller.songs(this);
    }//GEN-LAST:event_cancionesMenuActionPerformed

    public static void launch() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu albumMenu;
    private javax.swing.JMenu anyosManu;
    private javax.swing.JMenu artistasMenu;
    private javax.swing.JLabel backgroundLabel;
    private javax.swing.JMenu cancionesMenu;
    public javax.swing.JDesktopPane desktopMain;
    private javax.swing.JMenu exitMenu;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenu listasMenu;
    public javax.swing.JMenuBar menuBarMain;
    // End of variables declaration//GEN-END:variables
}
