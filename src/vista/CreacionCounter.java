/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.Controlador;

public class CreacionCounter extends javax.swing.JFrame {    
    
    public CreacionCounter() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jLabelTituloCounter = new javax.swing.JLabel();
        jLabelNombreCounter = new javax.swing.JLabel();
        jLabelCedulaJuridica = new javax.swing.JLabel();
        jLabelDireccionCounter = new javax.swing.JLabel();
        jLabelCantidadCasilleros = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_CedulaJuridica = new javax.swing.JTextField();
        txt_Dir = new javax.swing.JTextField();
        txt_cantidad = new javax.swing.JTextField();
        jButtonCrearCounter = new javax.swing.JButton();
        jLabelIconoCounter = new javax.swing.JLabel();
        jButtonSalirCounter = new javax.swing.JButton();
        jLabelFondoCounter = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTituloCounter.setBackground(new java.awt.Color(0, 102, 153));
        jLabelTituloCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelTituloCounter.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTituloCounter.setText("Creación del Counter");
        getContentPane().add(jLabelTituloCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, 150, 40));

        jLabelNombreCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelNombreCounter.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNombreCounter.setText("Nombre del Counter");
        getContentPane().add(jLabelNombreCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabelCedulaJuridica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCedulaJuridica.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCedulaJuridica.setText("Cedula Juridica");
        getContentPane().add(jLabelCedulaJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, -1, -1));

        jLabelDireccionCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelDireccionCounter.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDireccionCounter.setText("Dirección");
        getContentPane().add(jLabelDireccionCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, -1, -1));

        jLabelCantidadCasilleros.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabelCantidadCasilleros.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCantidadCasilleros.setText("Cantidad de Casilleros");
        getContentPane().add(jLabelCantidadCasilleros, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, -1, -1));

        txt_nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 180, -1));

        txt_CedulaJuridica.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_CedulaJuridica, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 180, -1));

        txt_Dir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_Dir, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 260, 180, -1));

        txt_cantidad.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(txt_cantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(269, 320, 180, -1));

        jButtonCrearCounter.setBackground(new java.awt.Color(0, 102, 153));
        jButtonCrearCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCrearCounter.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCrearCounter.setText("Crear");
        jButtonCrearCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCrearCounterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCrearCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 150, 60));

        jLabelIconoCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/paqueteria.png"))); // NOI18N
        getContentPane().add(jLabelIconoCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 520, 370));

        jButtonSalirCounter.setBackground(new java.awt.Color(0, 102, 153));
        jButtonSalirCounter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalirCounter.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalirCounter.setText("Salir");
        jButtonSalirCounter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirCounterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalirCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 0, 90, 30));

        jLabelFondoCounter.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoCounter.jpg"))); // NOI18N
        jLabelFondoCounter.setName(""); // NOI18N
        getContentPane().add(jLabelFondoCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(-9, -4, 600, 470));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void jButtonSalirCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirCounterActionPerformed
        //System.exit(0);
        show(false);
    }//GEN-LAST:event_jButtonSalirCounterActionPerformed

    private void jButtonCrearCounterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCrearCounterActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCrearCounterActionPerformed

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
            java.util.logging.Logger.getLogger(CreacionCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreacionCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreacionCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreacionCounter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreacionCounter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jButtonCrearCounter;
    private javax.swing.JButton jButtonSalirCounter;
    private javax.swing.JLabel jLabelCantidadCasilleros;
    private javax.swing.JLabel jLabelCedulaJuridica;
    private javax.swing.JLabel jLabelDireccionCounter;
    private javax.swing.JLabel jLabelFondoCounter;
    private javax.swing.JLabel jLabelIconoCounter;
    private javax.swing.JLabel jLabelNombreCounter;
    private javax.swing.JLabel jLabelTituloCounter;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JTextField txt_CedulaJuridica;
    public javax.swing.JTextField txt_Dir;
    public javax.swing.JTextField txt_cantidad;
    public javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
