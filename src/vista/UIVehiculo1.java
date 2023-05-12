/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package vista;

import control.TipovehiculoJpa;
import control.VehiculoJpa;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.TModeloVehiculo;
import modelo.Tipovehiculo;
import modelo.Vehiculo;

/**
 *
 * @author Elias
 */
public class UIVehiculo1 extends javax.swing.JDialog {

        private VehiculoJpa cvehiculo;
        private TipovehiculoJpa ctipov;
        private Vehiculo vehiculo;
        private Tipovehiculo tipov;
        private List<Tipovehiculo> tiposv;
        private List<Vehiculo> tipos;
        private TModeloVehiculo modelot;

        /**
         * Creates new form InVehiculo
         */
        public UIVehiculo1(java.awt.Frame parent, boolean modal) {
                super(parent, modal);
                initComponents();
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("VehiculosPU");
                ctipov = new TipovehiculoJpa(emf);
                cvehiculo = new VehiculoJpa(emf);
                tiposv = ctipov.findTipovehiculoEntities();
                tipos = cvehiculo.findVehiculoEntities();
                modelot = new TModeloVehiculo(tipos);
                modelot.fireTableDataChanged();
                TablaVehiculos.setModel(modelot);
                cargartipov();
                setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
        }

        private void cargartipov() {
                tiposv = ctipov.findTipovehiculoEntities();
                combo_tipo.removeAllItems();
                for (Tipovehiculo tv : tiposv) {
                        combo_tipo.addItem(tv.getNombre());
                }
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jComboBox1 = new javax.swing.JComboBox<>();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                jLabel3 = new javax.swing.JLabel();
                jLabel4 = new javax.swing.JLabel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                txt_Placa = new javax.swing.JTextField();
                Spin_año = new javax.swing.JSpinner();
                jLabel7 = new javax.swing.JLabel();
                Combo_marca = new javax.swing.JComboBox<>();
                combo_tipo = new javax.swing.JComboBox<>();
                Combo_color = new javax.swing.JComboBox<>();
                button_agregar = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                TablaVehiculos = new javax.swing.JTable();
                label_color = new javax.swing.JLabel();
                button_eliminar = new javax.swing.JButton();
                button_actualizar = new javax.swing.JButton();

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
                setBackground(new java.awt.Color(0, 0, 0));

                jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 36)); // NOI18N
                jLabel1.setText("VEHICULOS");

                jLabel2.setText("Placa");

                jLabel3.setText("Año");

                jLabel4.setText("Color");

                jLabel5.setText("Marca");

                jLabel6.setText("Tipo");

                Spin_año.setModel(new javax.swing.SpinnerNumberModel(2000, 2000, 2023, 1));

                Combo_marca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "FIAT", "NISAN", "KIA", "CHEBROLET", "MG", "SUZUKY", "VW", " " }));

                Combo_color.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Azul", "Blanco", "Gris", "Negro", "Rojo", "Plata", "Verde" }));

                button_agregar.setBackground(new java.awt.Color(204, 204, 255));
                button_agregar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                button_agregar.setForeground(new java.awt.Color(51, 0, 51));
                button_agregar.setText("Agregar");
                button_agregar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                button_agregarActionPerformed(evt);
                        }
                });

                TablaVehiculos.setBackground(new java.awt.Color(153, 204, 255));
                TablaVehiculos.setModel(new javax.swing.table.DefaultTableModel(
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
                TablaVehiculos.setSelectionBackground(new java.awt.Color(51, 0, 51));
                jScrollPane1.setViewportView(TablaVehiculos);

                label_color.setText("-");

                button_eliminar.setBackground(new java.awt.Color(204, 204, 255));
                button_eliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                button_eliminar.setForeground(new java.awt.Color(51, 0, 51));
                button_eliminar.setText("Eliminar");
                button_eliminar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                button_eliminarActionPerformed(evt);
                        }
                });

                button_actualizar.setBackground(new java.awt.Color(204, 204, 255));
                button_actualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
                button_actualizar.setForeground(new java.awt.Color(51, 0, 51));
                button_actualizar.setText("Actualizar");
                button_actualizar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                button_actualizarActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(350, 350, 350)
                                                .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(54, 54, 54)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel6)
                                                                .addGap(13, 13, 13))
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel3)
                                                                .addComponent(jLabel4)
                                                                .addComponent(jLabel2))
                                                        .addComponent(jLabel5))
                                                .addGap(85, 85, 85)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(txt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                        .addComponent(combo_tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(Combo_marca, javax.swing.GroupLayout.Alignment.LEADING, 0, 1, Short.MAX_VALUE)
                                                                        .addComponent(Combo_color, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                        .addComponent(Spin_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(18, 18, 18)
                                                                .addComponent(label_color, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(41, 41, 41)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(386, 386, 386)
                                                .addComponent(jLabel1))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(201, 201, 201)
                                                .addComponent(button_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(64, 64, 64)
                                                .addComponent(button_eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(73, 73, 73)
                                                .addComponent(button_actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(69, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(170, 170, 170))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(79, 79, 79)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel3)
                                                                        .addComponent(Spin_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(33, 33, 33)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(Combo_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jLabel4)
                                                                        .addComponent(label_color)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(txt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(201, 201, 201)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel5)
                                                                        .addComponent(Combo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(51, 51, 51)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jLabel6)
                                                                        .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(button_agregar)
                                                        .addComponent(button_eliminar)
                                                        .addComponent(button_actualizar))
                                                .addGap(83, 83, 83))))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void button_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_agregarActionPerformed
                vehiculo = new Vehiculo();
                if (!txt_Placa.getText().trim().equalsIgnoreCase("")) {
                        vehiculo.setPlaca(txt_Placa.getText());
                        vehiculo.setColor((String) Combo_color.getSelectedItem());
                        vehiculo.setAnio((Integer) Spin_año.getValue());
                        vehiculo.setMarca((String) Combo_marca.getSelectedItem());
                        vehiculo.setTipo(tiposv.get(combo_tipo.getSelectedIndex()));
                        cvehiculo.create(vehiculo);
                        modelot.fireTableDataChanged();
                        tipos.add(vehiculo);
                }
        }//GEN-LAST:event_button_agregarActionPerformed

        private void button_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_eliminarActionPerformed

        }//GEN-LAST:event_button_eliminarActionPerformed

        private void button_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_actualizarActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_button_actualizarActionPerformed

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
                        java.util.logging.Logger.getLogger(UIVehiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(UIVehiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(UIVehiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(UIVehiculo1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>
                //</editor-fold>

                /* Create and display the dialog */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                UIVehiculo1 dialog = new UIVehiculo1(new javax.swing.JFrame(), true);
                                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                                        @Override
                                        public void windowClosing(java.awt.event.WindowEvent e) {
                                                System.exit(0);
                                        }
                                });
                                dialog.setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JComboBox<String> Combo_color;
        private javax.swing.JComboBox<String> Combo_marca;
        private javax.swing.JSpinner Spin_año;
        private javax.swing.JTable TablaVehiculos;
        private javax.swing.JButton button_actualizar;
        private javax.swing.JButton button_agregar;
        private javax.swing.JButton button_eliminar;
        private javax.swing.JComboBox<String> combo_tipo;
        private javax.swing.JComboBox<String> jComboBox1;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JLabel label_color;
        private javax.swing.JTextField txt_Placa;
        // End of variables declaration//GEN-END:variables
}
