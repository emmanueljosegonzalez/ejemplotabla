/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import modelo.Conexion;
import modelo.Paciente;
import modelo.PacienteData;


public class VistaPacientes extends javax.swing.JFrame {

    private PacienteData pD;
    private DefaultTableModel modelo;
    
    
    
    public VistaPacientes() {
        initComponents();
        this.setLocationRelativeTo(null);
        pD = new PacienteData();
        this.cargarTabla();
        
    }


    public void cargarTabla(){
        
        List<Paciente> pac = pD.listarPacientes();
        
        if (pac == null || pac.isEmpty()) {   
            
            /*El método isEmpty () de la interfaz de la Lista en java se usa para verificar
            si una lista está vacía o no. Devuelve verdadero si la lista no contiene elementos,
            de lo contrario, devuelve falso si la lista contiene algún elemento*/
            
            //JOptionPane.showMessageDialog(null, "No hay cargados en la base de datos");
        } else {
            modelo = (DefaultTableModel) JTablePacientes.getModel();
            
            /*Se usa DefaultTableModel debido a que TableModel
            no es una clase en si sino una interfaz por lo que no puede instanciarla.
            
            getModel()
            Devuelve el TableModelque proporciona los datos mostrados por este JTable.
            
            */
            
            modelo.setRowCount(0);
            Object[] fila = new Object[modelo.getColumnCount()];

            for (int i = 0; i < pac.size(); i++) {
                fila[0] = pac.get(i).getId();
                fila[1] = pac.get(i).getNombre().toUpperCase();
                fila[2] = pac.get(i).getDni().toUpperCase();
                fila[3] = pac.get(i).getCelular().toUpperCase();
                fila[4] = pac.get(i).getP_actual();
                fila[5] = new SimpleDateFormat("yyyy/MM/dd").format(pac.get(i).getFechaNac());
                modelo.addRow(fila);
            }
        }
    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_listarPacientes = new javax.swing.JPanel();
        lab_titulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTablePacientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lab_titulo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lab_titulo.setText("LISTADO DE PACIENTES");

        JTablePacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "DNI", "Celular", "Peso", "Fec. Nac."
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTablePacientes);
        if (JTablePacientes.getColumnModel().getColumnCount() > 0) {
            JTablePacientes.getColumnModel().getColumn(0).setResizable(false);
            JTablePacientes.getColumnModel().getColumn(1).setResizable(false);
            JTablePacientes.getColumnModel().getColumn(2).setResizable(false);
            JTablePacientes.getColumnModel().getColumn(3).setResizable(false);
            JTablePacientes.getColumnModel().getColumn(4).setResizable(false);
            JTablePacientes.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout p_listarPacientesLayout = new javax.swing.GroupLayout(p_listarPacientes);
        p_listarPacientes.setLayout(p_listarPacientesLayout);
        p_listarPacientesLayout.setHorizontalGroup(
            p_listarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_listarPacientesLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lab_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p_listarPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 930, Short.MAX_VALUE)
                .addContainerGap())
        );
        p_listarPacientesLayout.setVerticalGroup(
            p_listarPacientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p_listarPacientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lab_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_listarPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_listarPacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


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
            java.util.logging.Logger.getLogger(VistaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable JTablePacientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lab_titulo;
    private javax.swing.JPanel p_listarPacientes;
    // End of variables declaration//GEN-END:variables
}
