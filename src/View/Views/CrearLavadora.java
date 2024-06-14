/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package View.Views;

import controller.ListaDeLavadoras;
import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author derno
 */
public class CrearLavadora extends javax.swing.JPanel {

    private ListaDeLavadoras lavadoras;
    public CrearLavadora(ListaDeLavadoras lavadora) {
        this.lavadoras=lavadora;
        initComponents();
    }
    
    
       private void MostrarJpanel(JPanel p){
        p.setSize(1082,630);   
        p.setLocation(0,0);
        BackgroundCrearLavadora.removeAll();
        BackgroundCrearLavadora.add(p,BorderLayout.CENTER);
        BackgroundCrearLavadora.revalidate();
        BackgroundCrearLavadora.repaint();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundCrearLavadora = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        CrearLavadoraDefecto = new javax.swing.JLabel();
        CrearLavadoraTeclado = new javax.swing.JLabel();
        CrearLavadoraPesoPrecio = new javax.swing.JLabel();

        BackgroundCrearLavadora.setBackground(new java.awt.Color(255, 255, 255));
        BackgroundCrearLavadora.setPreferredSize(new java.awt.Dimension(1082, 630));

        jPanel2.setBackground(new java.awt.Color(21, 101, 192));

        CrearLavadoraDefecto.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CrearLavadoraDefecto.setForeground(new java.awt.Color(255, 255, 255));
        CrearLavadoraDefecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrearLavadoraDefecto.setText("Crear por defecto");
        CrearLavadoraDefecto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearLavadoraDefecto.setIconTextGap(35);
        CrearLavadoraDefecto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CrearLavadoraDefectoMouseMoved(evt);
            }
        });
        CrearLavadoraDefecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearLavadoraDefectoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearLavadoraDefectoMouseExited(evt);
            }
        });

        CrearLavadoraTeclado.setBackground(new java.awt.Color(255, 255, 255));
        CrearLavadoraTeclado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CrearLavadoraTeclado.setForeground(new java.awt.Color(255, 255, 255));
        CrearLavadoraTeclado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrearLavadoraTeclado.setText("Crear por teclado");
        CrearLavadoraTeclado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearLavadoraTeclado.setIconTextGap(35);
        CrearLavadoraTeclado.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CrearLavadoraTecladoMouseMoved(evt);
            }
        });
        CrearLavadoraTeclado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearLavadoraTecladoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearLavadoraTecladoMouseExited(evt);
            }
        });

        CrearLavadoraPesoPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        CrearLavadoraPesoPrecio.setForeground(new java.awt.Color(255, 255, 255));
        CrearLavadoraPesoPrecio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CrearLavadoraPesoPrecio.setText("Crear con precio y peso");
        CrearLavadoraPesoPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CrearLavadoraPesoPrecio.setIconTextGap(35);
        CrearLavadoraPesoPrecio.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                CrearLavadoraPesoPrecioMouseMoved(evt);
            }
        });
        CrearLavadoraPesoPrecio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CrearLavadoraPesoPrecioMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CrearLavadoraPesoPrecioMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrearLavadoraTeclado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CrearLavadoraPesoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(CrearLavadoraDefecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(CrearLavadoraTeclado, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(CrearLavadoraPesoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(CrearLavadoraDefecto, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout BackgroundCrearLavadoraLayout = new javax.swing.GroupLayout(BackgroundCrearLavadora);
        BackgroundCrearLavadora.setLayout(BackgroundCrearLavadoraLayout);
        BackgroundCrearLavadoraLayout.setHorizontalGroup(
            BackgroundCrearLavadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundCrearLavadoraLayout.createSequentialGroup()
                .addGap(166, 166, 166)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(759, Short.MAX_VALUE))
        );
        BackgroundCrearLavadoraLayout.setVerticalGroup(
            BackgroundCrearLavadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundCrearLavadoraLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, 1195, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundCrearLavadora, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void CrearLavadoraDefectoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraDefectoMouseMoved

    }//GEN-LAST:event_CrearLavadoraDefectoMouseMoved

    private void CrearLavadoraDefectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraDefectoMouseClicked
        boolean resultado = lavadoras.crearLavadora();
        if (resultado) {
            JOptionPane.showMessageDialog(null, "Lavadora registrada con éxito.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
        }
        
    }//GEN-LAST:event_CrearLavadoraDefectoMouseClicked

    private void CrearLavadoraDefectoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraDefectoMouseExited

    }//GEN-LAST:event_CrearLavadoraDefectoMouseExited

    private void CrearLavadoraTecladoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraTecladoMouseMoved

    }//GEN-LAST:event_CrearLavadoraTecladoMouseMoved

    private void CrearLavadoraTecladoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraTecladoMouseClicked
        MostrarJpanel (new LavadoraTeclado(lavadoras));
    }//GEN-LAST:event_CrearLavadoraTecladoMouseClicked

    private void CrearLavadoraTecladoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraTecladoMouseExited

    }//GEN-LAST:event_CrearLavadoraTecladoMouseExited

    private void CrearLavadoraPesoPrecioMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraPesoPrecioMouseMoved

    }//GEN-LAST:event_CrearLavadoraPesoPrecioMouseMoved

    private void CrearLavadoraPesoPrecioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraPesoPrecioMouseClicked
          MostrarJpanel (new LavadoraPrecioPeso(lavadoras));
    }//GEN-LAST:event_CrearLavadoraPesoPrecioMouseClicked

    private void CrearLavadoraPesoPrecioMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CrearLavadoraPesoPrecioMouseExited

    }//GEN-LAST:event_CrearLavadoraPesoPrecioMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundCrearLavadora;
    private javax.swing.JLabel CrearLavadoraDefecto;
    private javax.swing.JLabel CrearLavadoraPesoPrecio;
    private javax.swing.JLabel CrearLavadoraTeclado;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
