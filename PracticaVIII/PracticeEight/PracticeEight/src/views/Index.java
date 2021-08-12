/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.io.IOException;

/**
 *
 * @author hendr
 */
public class Index extends javax.swing.JFrame {

    /**
     * Creates new form Index
     */
    public Index() {
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

        jLabel1 = new javax.swing.JLabel();
        TxtMonto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        CbxCondiciones = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        TxtFactura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        SelectFecha = new com.toedter.calendar.JDateChooser();
        IdCliente = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        CbxEstado = new javax.swing.JComboBox<>();
        BtnDigitalizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("DATOS DE FACTURA\n");

        TxtMonto.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtMonto.setName("TxtMonto"); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Condiciones:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("ID Cliente:");

        CbxCondiciones.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CbxCondiciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pago al contado", "Pago anticipado", "Pago aplazado" }));
        CbxCondiciones.setName("CbxCondiciones"); // NOI18N

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("No. Factura:");

        TxtFactura.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        TxtFactura.setName("TxtFactura"); // NOI18N
        TxtFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtFacturaActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setText("Fecha de factura:");

        SelectFecha.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        IdCliente.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        IdCliente.setName("TxtIdCliente"); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Monto:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel7.setText("Estado:");

        CbxEstado.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        CbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pagada", "Pendiente" }));
        CbxEstado.setToolTipText("");
        CbxEstado.setName("CbxCondiciones"); // NOI18N

        BtnDigitalizar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        BtnDigitalizar.setText("DIGITALIZAR");
        BtnDigitalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDigitalizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BtnDigitalizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtMonto)
                            .addComponent(CbxCondiciones, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TxtFactura, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SelectFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(IdCliente)
                            .addComponent(CbxEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(69, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel1)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFactura, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CbxCondiciones, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(SelectFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(34, 34, 34)
                .addComponent(BtnDigitalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtFacturaActionPerformed

    private void BtnDigitalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDigitalizarActionPerformed
        String Factura = TxtFactura.getText();
        String Condiciones = CbxCondiciones.getSelectedItem().toString();
        String Cliente = IdCliente.getText();
        String FechaFactura = SelectFecha.getDate().toString();
        String Monto = TxtMonto.getText();
        String Estado = CbxEstado.getSelectedItem().toString();
        try{
            ProcessBuilder builder = new ProcessBuilder(
                "cmd.exe", 
                "/c", 
                "C:\\Users\\hendr\\source\\repos\\ImagesApp\\ImagesApp\\bin\\Debug\\ImagesApp", 
                Factura,
                Condiciones,
                Cliente,
                FechaFactura,
                Monto,
                Estado
            );
            builder.redirectErrorStream(true);
            Process p = builder.start(); 
        } catch (Exception ex) {
            System.out.println("Error: "+ex.getMessage());
        }
    }//GEN-LAST:event_BtnDigitalizarActionPerformed

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
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Index.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Index().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDigitalizar;
    private javax.swing.JComboBox<String> CbxCondiciones;
    private javax.swing.JComboBox<String> CbxEstado;
    private javax.swing.JTextField IdCliente;
    private com.toedter.calendar.JDateChooser SelectFecha;
    private javax.swing.JTextField TxtFactura;
    private javax.swing.JTextField TxtMonto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
