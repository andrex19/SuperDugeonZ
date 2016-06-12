/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controladores.ControladorMenu;
import javax.swing.JButton;

/**
 *
 * @author Samsung
 */
public class VistaMenu extends javax.swing.JFrame {

    /**
     * Creates new form VistaMenu
     */
    public VistaMenu() {
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

        btnBE = new javax.swing.JButton();
        btnBT = new javax.swing.JButton();
        btnIC = new javax.swing.JButton();
        btnIP = new javax.swing.JButton();
        FondoMenu = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnBE.setText("Batalla General");
        getContentPane().add(btnBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 81, -1, -1));

        btnBT.setText("Torneo");
        getContentPane().add(btnBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        btnIC.setText("Información de criaturas");
        getContentPane().add(btnIC, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 166, -1, -1));

        btnIP.setText("Información de partidas");
        getContentPane().add(btnIP, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, -1, -1));

        FondoMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/fondoMenu.png"))); // NOI18N
        getContentPane().add(FondoMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenu1.setText("Cuentas");

        jMenuItem5.setText("Iniciar sesión");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem5);

        jMenu3.setText("Cerrar sesión");

        jMenuItem1.setText("Usuario 1");
        jMenu3.add(jMenuItem1);

        jMenuItem2.setText("Usuario 2");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem3.setText("Usuario 3");
        jMenu3.add(jMenuItem3);

        jMenuItem4.setText("Usuario 4");
        jMenu3.add(jMenuItem4);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

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
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoMenu;
    private javax.swing.JButton btnBE;
    private javax.swing.JButton btnBT;
    private javax.swing.JButton btnIC;
    private javax.swing.JButton btnIP;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables


public JButton getBtnBE(){
    return btnBE;
} 
public JButton getBtnBT(){
    return btnBT;
}
public JButton getBtnIC(){
    return btnIC;
}
public JButton getBtnIP(){
    return btnIP;
}

    //AGREGAR LOS BOTONES PARA QUE ESCUCHE  EL CONTROLADOR 
    public void agregarListener(ControladorMenu controladorMenu) {
        this.btnBE.addActionListener(controladorMenu);
        this.btnBT.addActionListener(controladorMenu);
        this.btnIC.addActionListener(controladorMenu);
        this.btnIP.addActionListener(controladorMenu);
    }
}
