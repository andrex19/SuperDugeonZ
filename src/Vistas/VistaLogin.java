/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Samsung
 */
public class VistaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VistaLogin
     */
    public VistaLogin() {
        initComponents();
        setLocationRelativeTo(null);
        
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
        botonIngresar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        casillaContraseña = new javax.swing.JPasswordField();
        casillaUsuario = new javax.swing.JTextField();
        labelUsuario = new javax.swing.JLabel();
        labelContraseña = new javax.swing.JLabel();
        labelMensajeUsuario = new javax.swing.JLabel();
        labelMensajeContraseña = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1000, 625));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonIngresar.setText("Ingresar");
        botonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(botonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 370, -1, -1));

        botonCancelar.setText("Cancelar");
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, -1, -1));
        getContentPane().add(casillaContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 330, 73, -1));
        getContentPane().add(casillaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 73, -1));

        labelUsuario.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        labelUsuario.setText("Usuario");
        getContentPane().add(labelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 290, -1, -1));

        labelContraseña.setFont(new java.awt.Font("Microsoft Sans Serif", 1, 10)); // NOI18N
        labelContraseña.setText("Contraseña");
        getContentPane().add(labelContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        labelMensajeUsuario.setForeground(new java.awt.Color(204, 0, 0));
        labelMensajeUsuario.setText("*");
        getContentPane().add(labelMensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, -1, -1));

        labelMensajeContraseña.setForeground(new java.awt.Color(204, 0, 0));
        labelMensajeContraseña.setText("*");
        getContentPane().add(labelMensajeContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vistaLogin.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 625));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonIngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonIngresar;
    private javax.swing.JPasswordField casillaContraseña;
    private javax.swing.JTextField casillaUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel labelContraseña;
    private javax.swing.JLabel labelMensajeContraseña;
    private javax.swing.JLabel labelMensajeUsuario;
    private javax.swing.JLabel labelUsuario;
    // End of variables declaration//GEN-END:variables

    public void agregarListener(ActionListener al){
        this.botonIngresar.addActionListener(al);
        this.botonCancelar.addActionListener(al);
    }
    
    public String getUsr(){
        return this.casillaUsuario.getText();
    }
    public String getPwd(){
        return this.casillaContraseña.getText();
    }
    public JButton getBotonIngresar(){
        return this.botonIngresar;
    }
    public JButton getBotonCancelar(){
        return this.botonCancelar;
    }
    public void setMensajeUsuario(String mensaje){
        this.labelMensajeUsuario.setText(mensaje);
    }
    public void setMensajeContraseña(String mensaje){
        this.labelMensajeContraseña.setText(mensaje);
    }
    //BORRAR DESPUES Y CAMBIAR POR MODIFICAR UNOS LABEL EN LA VENTANA DE LOGIN 
    // QUITAR EL JOptionPane de los import!*** (cuando se borre esto!)
    /*
    private void alerta(String s){
        JOptionPane.showMessageDialog(null, s);
    }
    public void userError(String usuario) {
        alerta("Usuario "+usuario+" inexistente"); 
    }

    public void bienvenida(String usuario) {
        alerta("Bienvenido "+usuario);
    }

    public void passError(String usuario) {
        alerta("Contraseña incorrecta para "+usuario);
    }
    */
    
}
