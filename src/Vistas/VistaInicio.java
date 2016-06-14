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

        botonEntrar = new javax.swing.JButton();
        botonRegistrar = new javax.swing.JButton();
        botonRegistrar1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1000, 625));
        setMinimumSize(new java.awt.Dimension(1000, 625));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 625));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonEntrar.setFont(new java.awt.Font("Gill Sans Ultra Bold Condensed", 0, 14)); // NOI18N
        botonEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonEjecutar1.jpg"))); // NOI18N
        botonEntrar.setBorder(null);
        botonEntrar.setBorderPainted(false);
        botonEntrar.setContentAreaFilled(false);
        botonEntrar.setFocusPainted(false);
        botonEntrar.setFocusable(false);
        botonEntrar.setPreferredSize(new java.awt.Dimension(90, 30));
        botonEntrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonEjecutar3.jpg"))); // NOI18N
        botonEntrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonEjecutar2.jpg"))); // NOI18N
        getContentPane().add(botonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 160, 70));

        botonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonCreditos1.jpg"))); // NOI18N
        botonRegistrar.setBorderPainted(false);
        botonRegistrar.setContentAreaFilled(false);
        botonRegistrar.setFocusPainted(false);
        botonRegistrar.setFocusable(false);
        botonRegistrar.setPreferredSize(new java.awt.Dimension(90, 30));
        botonRegistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonCreditos3.jpg"))); // NOI18N
        botonRegistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonCreditos2.1.jpg"))); // NOI18N
        getContentPane().add(botonRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, 320, 60));

        botonRegistrar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonSalir1.jpg"))); // NOI18N
        botonRegistrar1.setBorderPainted(false);
        botonRegistrar1.setContentAreaFilled(false);
        botonRegistrar1.setFocusPainted(false);
        botonRegistrar1.setFocusable(false);
        botonRegistrar1.setPreferredSize(new java.awt.Dimension(90, 30));
        botonRegistrar1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonSalir3.jpg"))); // NOI18N
        botonRegistrar1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Botones/botonSalir2.jpg"))); // NOI18N
        getContentPane().add(botonRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 280, 160, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vistaLogin.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(1000, 625));
        jLabel1.setMinimumSize(new java.awt.Dimension(1000, 625));
        jLabel1.setPreferredSize(new java.awt.Dimension(1000, 625));
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
        this.botonEntrar.addActionListener(al);
        this.botonRegistrar.addActionListener(al);
    }
    public JButton getBotonIngresar(){
        return this.botonEntrar;
        
    }
    public JButton getBotonRegistrar(){
        return this.botonRegistrar;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonEntrar;
    private javax.swing.JButton botonRegistrar;
    private javax.swing.JButton botonRegistrar1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
