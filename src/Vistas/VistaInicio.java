/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Samsung
 */
public class VistaInicio extends javax.swing.JFrame {

    public VistaInicio() {
        initComponents();
        setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnEjecutar = new javax.swing.JButton();
        btnCreditos = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 625));
        setMinimumSize(new java.awt.Dimension(1000, 625));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEjecutar.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 14)); // NOI18N
        btnEjecutar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonEjecutar1.jpg"))); // NOI18N
        btnEjecutar.setBorder(null);
        btnEjecutar.setBorderPainted(false);
        btnEjecutar.setContentAreaFilled(false);
        btnEjecutar.setFocusPainted(false);
        btnEjecutar.setFocusable(false);
        btnEjecutar.setPreferredSize(new java.awt.Dimension(90, 30));
        btnEjecutar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonEjecutar3.jpg"))); // NOI18N
        btnEjecutar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonEjecutar2.jpg"))); // NOI18N
        getContentPane().add(btnEjecutar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 160, 70));

        btnCreditos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonCreditos1.jpg"))); // NOI18N
        btnCreditos.setBorderPainted(false);
        btnCreditos.setContentAreaFilled(false);
        btnCreditos.setFocusPainted(false);
        btnCreditos.setFocusable(false);
        btnCreditos.setPreferredSize(new java.awt.Dimension(90, 30));
        btnCreditos.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonCreditos3.jpg"))); // NOI18N
        btnCreditos.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonCreditos2.1.jpg"))); // NOI18N
        getContentPane().add(btnCreditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 320, 60));

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonSalir1.jpg"))); // NOI18N
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setFocusPainted(false);
        btnSalir.setFocusable(false);
        btnSalir.setPreferredSize(new java.awt.Dimension(90, 30));
        btnSalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonSalir3.jpg"))); // NOI18N
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonSalir2.jpg"))); // NOI18N
        getContentPane().add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 160, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vistaLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, -1));

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
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInicio().setVisible(true);
            }
        });
    }


    public void agregarListener(ActionListener al){
        this.btnEjecutar.addActionListener(al);
        this.btnCreditos.addActionListener(al);
        this.btnSalir.addActionListener(al);
    }
    public JButton getBtnEjecutar(){
        return this.btnEjecutar;
        
    }
    public JButton getBntCreditos(){
        return this.btnCreditos;
        
    }
    public JButton getBntSalir(){
        return this.btnSalir;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreditos;
    private javax.swing.JButton btnEjecutar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
