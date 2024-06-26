package View.Views;


import model.Lavadora;
import controller.ListaDeLavadoras;
import controller.ListaDeTelevisores;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Televisor;
import javax.swing.table.DefaultTableModel;


public class EliminarTelevisoresLista extends javax.swing.JPanel {
    
    private ListaDeTelevisores listaDeTelevisores;
    private DefaultTableModel tableModel;
    private Map<Integer, String> idMap;
    
    
    public EliminarTelevisoresLista(ListaDeTelevisores televisor) {
        initComponents();
        this.listaDeTelevisores = televisor;
        idMap = new HashMap<>();
        inicializarTabla();
        actualizarTabla();
        configurarBotonBorrar();
    }
    
    private void inicializarTabla() {
        String[] columnas = {"Tipo", "Precio Base", "Color", "Consumo", "Peso", "Carga"};
        tableModel = new DefaultTableModel(columnas, 0);
        jTable1.setModel(tableModel);
    }
    
    public void actualizarTabla() {
         
        tableModel.setRowCount(0);
        idMap.clear(); 
        int row = 0;
        
         for (model.Televisor televisor : listaDeTelevisores.getListaDeTelevisores()) {
            Object[] fila = {
                "Televisor",
                televisor.getPrecioBase(),
                televisor.getColor(),
                televisor.getConsumoEnergetico(),
                televisor.getPeso(),
                televisor.getPulgadas(),
                televisor.isTDT() ? "Si" : "No"
            };
            tableModel.addRow(fila);
            idMap.put(row, televisor.getId()); // Asociar la fila con el ID
            row++;
        }
    }
    
    private void MostrarJpanel(JPanel p){
        p.setSize(1082,630);   
        p.setLocation(0,0);
        BackgroundMostrarLavadoras.removeAll();
        BackgroundMostrarLavadoras.add(p,BorderLayout.CENTER);
        BackgroundMostrarLavadoras.revalidate();
        BackgroundMostrarLavadoras.repaint();
    }
     
    private void configurarBotonBorrar() {
        BorrarTelevisor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evt) {
                BorrarTelevisorActionPerformed(evt);
            }
        });
    }
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackgroundMostrarLavadoras = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        BorrarTelevisor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));

        BackgroundMostrarLavadoras.setBackground(new java.awt.Color(255, 255, 255));

        title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        title.setText("Lista de Televisores");

        BorrarTelevisor.setBackground(new java.awt.Color(18, 90, 173));
        BorrarTelevisor.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        BorrarTelevisor.setForeground(new java.awt.Color(255, 255, 255));
        BorrarTelevisor.setText("Borrar");
        BorrarTelevisor.setBorderPainted(false);
        BorrarTelevisor.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        BorrarTelevisor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarTelevisorActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout BackgroundMostrarLavadorasLayout = new javax.swing.GroupLayout(BackgroundMostrarLavadoras);
        BackgroundMostrarLavadoras.setLayout(BackgroundMostrarLavadorasLayout);
        BackgroundMostrarLavadorasLayout.setHorizontalGroup(
            BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMostrarLavadorasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1004, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(BackgroundMostrarLavadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundMostrarLavadorasLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundMostrarLavadorasLayout.createSequentialGroup()
                        .addComponent(BorrarTelevisor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(53, 53, 53))))
        );
        BackgroundMostrarLavadorasLayout.setVerticalGroup(
            BackgroundMostrarLavadorasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundMostrarLavadorasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(64, 64, 64)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(BorrarTelevisor)
                .addGap(52, 52, 52))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMostrarLavadoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackgroundMostrarLavadoras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BorrarTelevisorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarTelevisorActionPerformed
        int selectedRow = jTable1.getSelectedRow();
    if (selectedRow > -1) {
        String tipo = (String) tableModel.getValueAt(selectedRow, 0);
        String id = idMap.get(selectedRow); // Obtener el ID del mapa usando la fila seleccionada

        if (tipo.equals("Televisor")) {
            boolean eliminado = eliminarTelevisor(id);

            if (eliminado) {
                actualizarTabla();
            } else {
                JOptionPane.showMessageDialog(this, "Error al eliminar el televisor", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Seleccione un televisor para borrar", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Seleccione un televisor para borrar", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_BorrarTelevisorActionPerformed
    
    public boolean eliminarTelevisor(String id) {
        Televisor televisor = listaDeTelevisores.listarTelevisor(id);
        if (televisor != null) {
            listaDeTelevisores.getListaDeTelevisores().remove(televisor);
            return true;
        }
        return false;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackgroundMostrarLavadoras;
    private javax.swing.JButton BorrarTelevisor;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}