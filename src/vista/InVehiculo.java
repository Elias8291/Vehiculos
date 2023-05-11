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
public class InVehiculo extends javax.swing.JDialog {

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
        public InVehiculo(java.awt.Frame parent, boolean modal) {
                super(parent, modal);
                initComponents();
                EntityManagerFactory emf = Persistence.createEntityManagerFactory("VehiculosPU");
                ctipov = new TipovehiculoJpa(emf);
                cvehiculo = new VehiculoJpa(emf);
                tiposv = ctipov.findTipovehiculoEntities();
                tipos = cvehiculo.findVehiculoEntities();
                modelot = new TModeloVehiculo(tipos);
                modelot.fireTableDataChanged();
                Tabla7.setModel(modelot);
                setDefaultCloseOperation(this.DO_NOTHING_ON_CLOSE);
                cargartipov();
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
                Tabla7 = new javax.swing.JTable();
                label_color = new javax.swing.JLabel();

                jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

                setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

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

                button_agregar.setText("Agregar");
                button_agregar.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                button_agregarActionPerformed(evt);
                        }
                });

                Tabla7.setModel(new javax.swing.table.DefaultTableModel(
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
                jScrollPane1.setViewportView(Tabla7);

                label_color.setText("jLabel8");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(64, 64, 64)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3)
                                                        .addComponent(jLabel4)
                                                        .addComponent(jLabel5)
                                                        .addComponent(jLabel6))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(txt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(238, 238, 238)
                                                                                .addComponent(jLabel7))
                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                .addGap(105, 105, 105)
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(Combo_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Spin_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(Combo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(105, 105, 105)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGap(138, 138, 138)
                                                                                .addComponent(label_color))))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(button_agregar)
                                                .addGap(39, 39, 39)))
                                .addGap(121, 121, 121)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(61, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(286, 286, 286))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txt_Placa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(107, 107, 107)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(107, 107, 107)
                                                .addComponent(jLabel7))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addComponent(jLabel2)
                                                .addGap(59, 59, 59)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel3)
                                                        .addComponent(Spin_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(70, 70, 70)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jLabel4)
                                                        .addComponent(Combo_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(label_color))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(Combo_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(115, 115, 115)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel6)
                                        .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addComponent(button_agregar)
                                .addGap(63, 63, 63))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void button_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_agregarActionPerformed
                vehiculo = new Vehiculo();
                vehiculo.setPlaca(txt_Placa.getText());
                vehiculo.setColor((String) Combo_color.getSelectedItem());
                vehiculo.setAnio((Integer) Spin_año.getValue());
                vehiculo.setMarca((String) Combo_marca.getSelectedItem());
                vehiculo.setTipo(tiposv.get(combo_tipo.getSelectedIndex()));
                cvehiculo.create(vehiculo);
                modelot.fireTableDataChanged();
                 tipos .add( vehiculo);
        }//GEN-LAST:event_button_agregarActionPerformed

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
                        java.util.logging.Logger.getLogger(InVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(InVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(InVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(InVehiculo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the dialog */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                InVehiculo dialog = new InVehiculo(new javax.swing.JFrame(), true);
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
        private javax.swing.JTable Tabla7;
        private javax.swing.JButton button_agregar;
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
