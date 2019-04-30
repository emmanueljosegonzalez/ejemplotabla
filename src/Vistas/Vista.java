/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


public class Vista extends javax.swing.JFrame {

    public Vista() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dp_escritorio = new javax.swing.JDesktopPane();
        mb_menuPrincipal = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        mi_listarPacientes = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);

        javax.swing.GroupLayout dp_escritorioLayout = new javax.swing.GroupLayout(dp_escritorio);
        dp_escritorio.setLayout(dp_escritorioLayout);
        dp_escritorioLayout.setHorizontalGroup(
            dp_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 856, Short.MAX_VALUE)
        );
        dp_escritorioLayout.setVerticalGroup(
            dp_escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 463, Short.MAX_VALUE)
        );

        jMenu2.setText("Pacientes");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        mi_listarPacientes.setText("Listar Pacientes");
        mi_listarPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_listarPacientesActionPerformed(evt);
            }
        });
        jMenu2.add(mi_listarPacientes);

        mb_menuPrincipal.add(jMenu2);

        setJMenuBar(mb_menuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(dp_escritorio)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(dp_escritorio)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void mi_listarPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_listarPacientesActionPerformed
        // TODO add your handling code here:
        dp_escritorio.removeAll();
        dp_escritorio.repaint();
        VistaPacientes pac = new VistaPacientes();
        pac.setVisible(true);
        dp_escritorio.add(pac);
        dp_escritorio.moveToFront(pac);
    }//GEN-LAST:event_mi_listarPacientesActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dp_escritorio;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar mb_menuPrincipal;
    private javax.swing.JMenuItem mi_listarPacientes;
    // End of variables declaration//GEN-END:variables
}
