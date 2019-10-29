/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author joshu
 */
public class Interfaz extends javax.swing.JFrame {

    
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setExtendedState(823);
        
    }
    
    @Override
    public Image getIconImage(){
        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/logo.png"));
        return retValue;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonSalir = new javax.swing.JButton();
        BtnAdministracionClientes = new javax.swing.JButton();
        BtnRecepcionArticulos = new javax.swing.JButton();
        BtnRetiroArticulos = new javax.swing.JButton();
        BtnAdministracionEntregables = new javax.swing.JButton();
        NombreCounter = new javax.swing.JScrollPane();
        txt_titulo = new javax.swing.JTextArea();
        jLabelFondo = new javax.swing.JLabel();
        jMenuBarInterfaz = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        CompraVentaDolar = new javax.swing.JMenuItem();
        ResumenContable = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonSalir.setBackground(new java.awt.Color(0, 51, 102));
        jButtonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("Salir");
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, 90, 40));

        BtnAdministracionClientes.setBackground(new java.awt.Color(0, 102, 153));
        BtnAdministracionClientes.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnAdministracionClientes.setForeground(new java.awt.Color(255, 255, 255));
        BtnAdministracionClientes.setText("Administrador de Clientes");
        BtnAdministracionClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdministracionClientesActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAdministracionClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        BtnRecepcionArticulos.setBackground(new java.awt.Color(0, 102, 153));
        BtnRecepcionArticulos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnRecepcionArticulos.setForeground(new java.awt.Color(255, 255, 255));
        BtnRecepcionArticulos.setText("Recepcion de Articulos");
        BtnRecepcionArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecepcionArticulosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRecepcionArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        BtnRetiroArticulos.setBackground(new java.awt.Color(0, 102, 153));
        BtnRetiroArticulos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnRetiroArticulos.setForeground(new java.awt.Color(255, 255, 255));
        BtnRetiroArticulos.setText("Retiro de Articulos");
        BtnRetiroArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRetiroArticulosActionPerformed(evt);
            }
        });
        getContentPane().add(BtnRetiroArticulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, -1, -1));

        BtnAdministracionEntregables.setBackground(new java.awt.Color(0, 102, 153));
        BtnAdministracionEntregables.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        BtnAdministracionEntregables.setForeground(new java.awt.Color(255, 255, 255));
        BtnAdministracionEntregables.setText("Administracion de Entregables");
        BtnAdministracionEntregables.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAdministracionEntregablesActionPerformed(evt);
            }
        });
        getContentPane().add(BtnAdministracionEntregables, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        NombreCounter.setBackground(new java.awt.Color(0, 102, 153));
        NombreCounter.setBorder(null);
        NombreCounter.setForeground(new java.awt.Color(255, 255, 255));
        NombreCounter.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        txt_titulo.setBackground(new java.awt.Color(0, 102, 153));
        txt_titulo.setColumns(20);
        txt_titulo.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        txt_titulo.setForeground(new java.awt.Color(0, 51, 51));
        txt_titulo.setRows(5);
        NombreCounter.setViewportView(txt_titulo);

        getContentPane().add(NombreCounter, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 280, -1));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/logoCounter.jpg"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 823, 539));

        jMenuBarInterfaz.setBackground(new java.awt.Color(0, 102, 153));
        jMenuBarInterfaz.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        jMenuBarInterfaz.setForeground(new java.awt.Color(255, 255, 255));

        jMenu1.setText("Otros");

        CompraVentaDolar.setText("Consultar compra y venta del Dolar");
        CompraVentaDolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompraVentaDolarActionPerformed(evt);
            }
        });
        jMenu1.add(CompraVentaDolar);

        ResumenContable.setText("Resumen Contable del dia");
        jMenu1.add(ResumenContable);

        jMenuBarInterfaz.add(jMenu1);

        setJMenuBar(jMenuBarInterfaz);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        show(false);
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void BtnRecepcionArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecepcionArticulosActionPerformed
        RecepcionArticulos abrir= new RecepcionArticulos();
        abrir.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_BtnRecepcionArticulosActionPerformed

    private void CompraVentaDolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompraVentaDolarActionPerformed
        Dolar abrir= new Dolar();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CompraVentaDolarActionPerformed

    private void BtnAdministracionClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdministracionClientesActionPerformed
        AdministradorClientes abrir= new AdministradorClientes();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnAdministracionClientesActionPerformed

    private void BtnRetiroArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRetiroArticulosActionPerformed
        RetiroArticulos abrir= new RetiroArticulos();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnRetiroArticulosActionPerformed

    private void BtnAdministracionEntregablesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAdministracionEntregablesActionPerformed
        AdministracionEntregables abrir= new AdministracionEntregables();
        abrir.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BtnAdministracionEntregablesActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAdministracionClientes;
    private javax.swing.JButton BtnAdministracionEntregables;
    private javax.swing.JButton BtnRecepcionArticulos;
    private javax.swing.JButton BtnRetiroArticulos;
    private javax.swing.JMenuItem CompraVentaDolar;
    private javax.swing.JScrollPane NombreCounter;
    private javax.swing.JMenuItem ResumenContable;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBarInterfaz;
    public javax.swing.JTextArea txt_titulo;
    // End of variables declaration//GEN-END:variables
}
