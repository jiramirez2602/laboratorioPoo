/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import View.Views.Contenido;
import View.Views.Lavadora;
import View.Views.MostrarElectrodomesticos;
import View.Views.Televisor;
import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

/**
 *
 * @author derno
 */
public class Dasboard extends javax.swing.JFrame {
    
    private ListaDeLavadoras lavadoras;
    private ListaDeTelevisores televisores;
    int xMouse;
    int yMouse;

    public Dasboard() {
        initComponents();
        InitContent();
        this.setLocationRelativeTo(null);
        lavadoras = new ListaDeLavadoras();
        televisores = new ListaDeTelevisores();
    }
    
    private void InitContent(){
    MostrarJpanel (new Contenido());
    }
    
    private void MostrarJpanel(JPanel p){
        p.setSize(1082,630);   
        p.setLocation(0,0);
        ContenidoDash.removeAll();
        ContenidoDash.add(p,BorderLayout.CENTER);
        ContenidoDash.revalidate();
        ContenidoDash.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        PanelIzquierdo = new javax.swing.JPanel();
        BackgroundLabels = new javax.swing.JPanel();
        Botoninicio = new javax.swing.JLabel();
        BotonLavadora = new javax.swing.JLabel();
        MostrarElectrodomesticos = new javax.swing.JLabel();
        BotonTelevisor1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        PanelHorizontal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        ContenidoDash = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1368, 768));
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setMinimumSize(new java.awt.Dimension(1370, 768));

        PanelIzquierdo.setBackground(new java.awt.Color(21, 101, 192));
        PanelIzquierdo.setPreferredSize(new java.awt.Dimension(270, 768));

        BackgroundLabels.setBackground(new java.awt.Color(51, 153, 255));

        Botoninicio.setBackground(new java.awt.Color(255, 255, 255));
        Botoninicio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Botoninicio.setForeground(new java.awt.Color(255, 255, 255));
        Botoninicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        Botoninicio.setText("Inicio");
        Botoninicio.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(51, 153, 255)));
        Botoninicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Botoninicio.setIconTextGap(35);
        Botoninicio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotoninicioMouseMoved(evt);
            }
        });
        Botoninicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotoninicioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotoninicioMouseExited(evt);
            }
        });

        BotonLavadora.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonLavadora.setForeground(new java.awt.Color(255, 255, 255));
        BotonLavadora.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonLavadora.setText("Lavadora");
        BotonLavadora.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(51, 153, 255)));
        BotonLavadora.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonLavadora.setIconTextGap(35);
        BotonLavadora.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotonLavadoraMouseMoved(evt);
            }
        });
        BotonLavadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonLavadoraMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonLavadoraMouseExited(evt);
            }
        });

        MostrarElectrodomesticos.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        MostrarElectrodomesticos.setForeground(new java.awt.Color(255, 255, 255));
        MostrarElectrodomesticos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MostrarElectrodomesticos.setText("Mostrar Electrodomesticos");
        MostrarElectrodomesticos.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(51, 153, 255)));
        MostrarElectrodomesticos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MostrarElectrodomesticos.setIconTextGap(35);
        MostrarElectrodomesticos.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                MostrarElectrodomesticosMouseMoved(evt);
            }
        });
        MostrarElectrodomesticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MostrarElectrodomesticosMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MostrarElectrodomesticosMouseExited(evt);
            }
        });

        BotonTelevisor1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BotonTelevisor1.setForeground(new java.awt.Color(255, 255, 255));
        BotonTelevisor1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        BotonTelevisor1.setText("Televisor");
        BotonTelevisor1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 20, 1, 1, new java.awt.Color(51, 153, 255)));
        BotonTelevisor1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BotonTelevisor1.setIconTextGap(35);
        BotonTelevisor1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                BotonTelevisor1MouseMoved(evt);
            }
        });
        BotonTelevisor1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonTelevisor1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BotonTelevisor1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLabelsLayout = new javax.swing.GroupLayout(BackgroundLabels);
        BackgroundLabels.setLayout(BackgroundLabelsLayout);
        BackgroundLabelsLayout.setHorizontalGroup(
            BackgroundLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLabelsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Botoninicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(MostrarElectrodomesticos, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(BotonTelevisor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        BackgroundLabelsLayout.setVerticalGroup(
            BackgroundLabelsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLabelsLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(Botoninicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(BotonLavadora, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(BotonTelevisor1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(MostrarElectrodomesticos, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Repara Todo");

        javax.swing.GroupLayout PanelIzquierdoLayout = new javax.swing.GroupLayout(PanelIzquierdo);
        PanelIzquierdo.setLayout(PanelIzquierdoLayout);
        PanelIzquierdoLayout.setHorizontalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel1))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelIzquierdoLayout.setVerticalGroup(
            PanelIzquierdoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelIzquierdoLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(BackgroundLabels, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        PanelHorizontal.setBackground(new java.awt.Color(21, 101, 192));

        jPanel1.setBackground(new java.awt.Color(21, 101, 192));

        jLabel2.setFont(new java.awt.Font("Berlin Sans FB", 0, 36)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(21, 101, 192));
        jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel2MouseDragged(evt);
            }
        });
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1046, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelHorizontalLayout = new javax.swing.GroupLayout(PanelHorizontal);
        PanelHorizontal.setLayout(PanelHorizontalLayout);
        PanelHorizontalLayout.setHorizontalGroup(
            PanelHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelHorizontalLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        PanelHorizontalLayout.setVerticalGroup(
            PanelHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHorizontalLayout.createSequentialGroup()
                .addGroup(PanelHorizontalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 96, Short.MAX_VALUE))
        );

        ContenidoDash.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout ContenidoDashLayout = new javax.swing.GroupLayout(ContenidoDash);
        ContenidoDash.setLayout(ContenidoDashLayout);
        ContenidoDashLayout.setHorizontalGroup(
            ContenidoDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContenidoDashLayout.setVerticalGroup(
            ContenidoDashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addComponent(PanelIzquierdo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelHorizontal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ContenidoDash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addComponent(PanelHorizontal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(ContenidoDash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(PanelIzquierdo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 780, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotoninicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoninicioMouseClicked
        MostrarJpanel (new Contenido());
    }//GEN-LAST:event_BotoninicioMouseClicked

    private void BotonLavadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLavadoraMouseClicked
        ListaDeLavadoras Lista = new ListaDeLavadoras();
        MostrarJpanel (new Lavadora(lavadoras));
    }//GEN-LAST:event_BotonLavadoraMouseClicked

    private void MostrarElectrodomesticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarElectrodomesticosMouseClicked
        MostrarJpanel (new MostrarElectrodomesticos(lavadoras,televisores));
    }//GEN-LAST:event_MostrarElectrodomesticosMouseClicked

    private void BotoninicioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoninicioMouseMoved
      
    }//GEN-LAST:event_BotoninicioMouseMoved

    private void BotonLavadoraMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLavadoraMouseMoved
    
    }//GEN-LAST:event_BotonLavadoraMouseMoved

    private void MostrarElectrodomesticosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarElectrodomesticosMouseMoved
       
    }//GEN-LAST:event_MostrarElectrodomesticosMouseMoved

    private void BotoninicioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotoninicioMouseExited
       
    }//GEN-LAST:event_BotoninicioMouseExited

    private void BotonLavadoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonLavadoraMouseExited
     
    }//GEN-LAST:event_BotonLavadoraMouseExited

    private void MostrarElectrodomesticosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MostrarElectrodomesticosMouseExited
     
    }//GEN-LAST:event_MostrarElectrodomesticosMouseExited

    private void BotonTelevisor1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTelevisor1MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTelevisor1MouseMoved

    private void BotonTelevisor1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTelevisor1MouseClicked
          MostrarJpanel (new Televisor(televisores));
    }//GEN-LAST:event_BotonTelevisor1MouseClicked

    private void BotonTelevisor1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonTelevisor1MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonTelevisor1MouseExited

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MousePressed
        xMouse=evt.getX();
        yMouse=evt.getY();
    }//GEN-LAST:event_jPanel2MousePressed

    private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_jPanel2MouseDragged

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dasboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dasboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel BackgroundLabels;
    private javax.swing.JLabel BotonLavadora;
    private javax.swing.JLabel BotonTelevisor1;
    private javax.swing.JLabel Botoninicio;
    private javax.swing.JPanel ContenidoDash;
    private javax.swing.JLabel MostrarElectrodomesticos;
    private javax.swing.JPanel PanelHorizontal;
    private javax.swing.JPanel PanelIzquierdo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
