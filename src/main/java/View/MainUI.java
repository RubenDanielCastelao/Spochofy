/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.Controller;

import java.awt.*;
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
        Controller.openLogin(this);
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
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        cancionesMenu = new javax.swing.JMenu();
        listasMenu = new javax.swing.JMenu();
        showListas = new javax.swing.JMenuItem();
        createListas = new javax.swing.JMenuItem();
        artistasMenu = new javax.swing.JMenu();
        albumMenu = new javax.swing.JMenu();
        anyosManu = new javax.swing.JMenu();
        usuarioText = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);

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
        desktopMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desktopMainMouseClicked(evt);
            }
        });
        albumMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                albumMenuMouseClicked(evt);
            }
        });

        cancionesMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancionesMenuMouseClicked(evt);
            }
        });

        anyosManu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                anyosMenuMouseClicked(evt);
            }
        });

        artistasMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                artistasMenuMouseClicked(evt);
            }
        });

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem1.setText("Log Out");
        exitMenu.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        jMenuItem2.setText("Exit");
        exitMenu.add(jMenuItem2);

        menuBarMain.add(exitMenu);
        exitMenu.getAccessibleContext().setAccessibleDescription("");

        cancionesMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/canciones.png")); // NOI18N

        menuBarMain.add(cancionesMenu);

        listasMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/listas.png")); // NOI18N
        listasMenu.setPreferredSize(new java.awt.Dimension(300, 76));

        showListas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_3, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        showListas.setText("Ver listas de reproducción");
        showListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showListasActionPerformed(evt);
            }
        });
        listasMenu.add(showListas);

        createListas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_4, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        createListas.setText("Crear listas de reproducción");
        createListas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createListasActionPerformed(evt);
            }
        });
        listasMenu.add(createListas);

        menuBarMain.add(listasMenu);

        artistasMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/artistas.png")); // NOI18N
        artistasMenu.setMinimumSize(new java.awt.Dimension(300, 66));
        artistasMenu.setPreferredSize(new java.awt.Dimension(290, 66));
        menuBarMain.add(artistasMenu);

        albumMenu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/albumes.png")); // NOI18N
        albumMenu.setToolTipText("");
        menuBarMain.add(albumMenu);

        anyosManu.setIcon(new javax.swing.ImageIcon("src/main/java/Img/anyos.png")); // NOI18N
        anyosManu.setPreferredSize(new java.awt.Dimension(270, 76));
        menuBarMain.add(anyosManu);

        usuarioText.setText("");
        usuarioText.setFont(new java.awt.Font("Gotham", 1, 18)); // NOI18N
        usuarioText.setForeground(Color.white);
        menuBarMain.add(usuarioText);

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

        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });

        pack();
    }// </editor-fold>//GEN-END:initComponents



    private void albumMenuMouseClicked(java.awt.event.MouseEvent evt) {                                              
        Controller.albums(this);
    }                                             

    private void anyosMenuMouseClicked(java.awt.event.MouseEvent evt) {                                              
        Controller.years(this);
    }                                             

    private void artistasMenuMouseClicked(java.awt.event.MouseEvent evt) {                                              
        Controller.artistas(this);
    }
    private void cancionesMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancionesMenuActionPerformed
        Controller.songs(this);
    }//GEN-LAST:event_cancionesMenuActionPerformed

    private void createListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createListasActionPerformed
        Controller.createPlayListUI(this);
    }//GEN-LAST:event_createListasActionPerformed

    private void showListasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListasActionPerformed
        Controller.playlists(this);
    }//GEN-LAST:event_showListasActionPerformed
    private void desktopMainMouseClicked(MouseEvent evt) {//GEN-FIRST:event_showListasActionPerformed
    }//GEN-LAST:event_showListasActionPerformed
    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListasActionPerformed
        Controller.openLogin(this);
    }//GEN-LAST:event_showListasActionPerformed
    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showListasActionPerformed
        Controller.exit(this);
    }//GEN-LAST:event_showListasActionPerformed

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
    public javax.swing.JMenu albumMenu;
    public javax.swing.JMenu anyosManu;
    public javax.swing.JMenu artistasMenu;
    private javax.swing.JLabel backgroundLabel;
    public javax.swing.JMenu cancionesMenu;
    private javax.swing.JMenuItem createListas;
    public javax.swing.JDesktopPane desktopMain;
    private javax.swing.JMenu exitMenu;
    public javax.swing.JMenu usuarioText;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    public javax.swing.JMenu listasMenu;
    private javax.swing.JMenuBar menuBarMain;
    private javax.swing.JMenuItem showListas;
    // End of variables declaration//GEN-END:variables
}
