/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.border.LineBorder;

/**
 *
 * @author Samsung
 */
public class VistaBatalla extends javax.swing.JFrame {

    /**
     * Creates new form VistaTerreno2
     */
    public VistaBatalla() {
        initComponents();
        setLocationRelativeTo(null);
        
        
        this.panelTerreno.setLayout(new GridLayout(15,15));
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                botones [i][j]= new JButton();
                botones [i][j].setIcon(null);
                botones [i][j].setBorderPainted(true);
                this.panelTerreno.add(botones[i][j]);
                
                
            }
        
        }
        
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
        panelTerreno = new javax.swing.JPanel();
        btnInvocar = new javax.swing.JButton();
        btnFinalizar = new javax.swing.JButton();
        btnMover = new javax.swing.JButton();
        btnLanzar = new javax.swing.JButton();
        btnMagia = new javax.swing.JButton();
        btnTrampa = new javax.swing.JButton();
        barraUsuario1 = new javax.swing.JProgressBar();
        barraUsuario2 = new javax.swing.JProgressBar();
        barraUsuario3 = new javax.swing.JProgressBar();
        barraUsuario4 = new javax.swing.JProgressBar();
        btnAtacar = new javax.swing.JButton();
        lblUsuario1 = new javax.swing.JLabel();
        lblUsuario2 = new javax.swing.JLabel();
        lblUsuario3 = new javax.swing.JLabel();
        lblUsuario4 = new javax.swing.JLabel();
        lblPuntos = new javax.swing.JLabel();
        lblInvocar = new javax.swing.JLabel();
        lblAtacar = new javax.swing.JLabel();
        lblMagia = new javax.swing.JLabel();
        lblMover = new javax.swing.JLabel();
        lblTrampa = new javax.swing.JLabel();
        lblTurno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1000, 1000));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelTerreno.setEnabled(false);
        panelTerreno.setLayout(new java.awt.GridLayout(1, 0));
        getContentPane().add(panelTerreno, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 480, 480));

        btnInvocar.setText("Invocar");
        btnInvocar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInvocarActionPerformed(evt);
            }
        });
        getContentPane().add(btnInvocar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 109, -1));

        btnFinalizar.setText("Finalizar turno");
        getContentPane().add(btnFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, 109, -1));

        btnMover.setText("Mover ");
        getContentPane().add(btnMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 300, 109, -1));

        btnLanzar.setText("Lanzar dados");
        getContentPane().add(btnLanzar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 109, -1));

        btnMagia.setText("Magia");
        getContentPane().add(btnMagia, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 109, -1));

        btnTrampa.setText("Trampa");
        getContentPane().add(btnTrampa, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 360, 109, -1));

        barraUsuario1.setStringPainted(true);
        getContentPane().add(barraUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 90, 98, -1));

        barraUsuario2.setStringPainted(true);
        getContentPane().add(barraUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 98, -1));

        barraUsuario3.setStringPainted(true);
        getContentPane().add(barraUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 130, 98, -1));

        barraUsuario4.setStringPainted(true);
        getContentPane().add(barraUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 150, 98, -1));

        btnAtacar.setText("Atacar");
        getContentPane().add(btnAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 109, -1));

        lblUsuario1.setText("jLabel1");
        getContentPane().add(lblUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 90, -1, -1));

        lblUsuario2.setText("jLabel2");
        getContentPane().add(lblUsuario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 110, -1, -1));

        lblUsuario3.setText("jLabel3");
        getContentPane().add(lblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, -1, -1));

        lblUsuario4.setText("jLabel4");
        getContentPane().add(lblUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, -1, -1));

        lblPuntos.setText("Puntos");
        getContentPane().add(lblPuntos, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        lblInvocar.setText("jLabel7");
        getContentPane().add(lblInvocar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 270, -1, -1));

        lblAtacar.setText("jLabel8");
        getContentPane().add(lblAtacar, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 330, -1, -1));

        lblMagia.setText("jLabel9");
        getContentPane().add(lblMagia, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, -1, -1));

        lblMover.setText("jLabel10");
        getContentPane().add(lblMover, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        lblTrampa.setText("jLabel11");
        getContentPane().add(lblTrampa, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, -1, -1));

        lblTurno.setText("jLabel1");
        getContentPane().add(lblTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInvocarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInvocarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInvocarActionPerformed

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
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaBatalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaBatalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraUsuario1;
    private javax.swing.JProgressBar barraUsuario2;
    private javax.swing.JProgressBar barraUsuario3;
    private javax.swing.JProgressBar barraUsuario4;
    private javax.swing.JButton btnAtacar;
    private javax.swing.JButton btnFinalizar;
    private javax.swing.JButton btnInvocar;
    private javax.swing.JButton btnLanzar;
    private javax.swing.JButton btnMagia;
    private javax.swing.JButton btnMover;
    private javax.swing.JButton btnTrampa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblAtacar;
    private javax.swing.JLabel lblInvocar;
    private javax.swing.JLabel lblMagia;
    private javax.swing.JLabel lblMover;
    private javax.swing.JLabel lblPuntos;
    private javax.swing.JLabel lblTrampa;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JLabel lblUsuario1;
    private javax.swing.JLabel lblUsuario2;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblUsuario4;
    private javax.swing.JPanel panelTerreno;
    // End of variables declaration//GEN-END:variables
    
    public JButton[][] botones = new JButton[15][15];
    
    
    public void agregarListener(ActionListener al,MouseAdapter ml,KeyListener kl){
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                this.botones[i][j].addActionListener(al);
                this.botones[i][j].addMouseListener(ml);
                
            }
        }
        this.panelTerreno.addMouseWheelListener(ml);
        this.btnInvocar.addActionListener(al);
        this.btnFinalizar.addActionListener(al);
        this.btnLanzar.addActionListener(al);
        this.btnMagia.addActionListener(al);
        this.btnMover.addActionListener(al);
        this.btnTrampa.addActionListener(al);
        this.btnAtacar.addActionListener(al);
        this.addKeyListener(kl);
        //this.setFocusable(true);
        
        
        
        
    }
    public JButton getBtnInvocar(){
        return this.btnInvocar;
    }
    public JButton[][] getBotonesTerreno(){
        return this.botones;
    }
    public JPanel getPanelTerreno(){
        return this.panelTerreno;
    }
    public JButton getBtnFinalizar(){
        return this.btnFinalizar;
    }
    public JButton getBtnLanzar(){
        return this.btnLanzar;
    }
    public JButton getBtnMagia(){
        return this.btnMagia;
    }
    public JButton getBtnMover(){
        return this.btnMover;
    }
    public JButton getBtnTrampa(){
        return this.btnTrampa;
    }
    public JButton getBtnAtacar(){
        return this.btnAtacar;
    }
    
    
    public JLabel getLblTurno(){
        return this.lblTurno;
    }
    
    //GETS DE LOS LABEL DE USUARIOS
    public JLabel getLblUsuario1(){
        return this.lblUsuario1;
    }
    public JLabel getLblUsuario2(){
        return this.lblUsuario2;
    }
    public JLabel getLblUsuario3(){
        return this.lblUsuario3;
    }
    public JLabel getLblUsuario4(){
        return this.lblUsuario4;
    }
    
    //GET DE LOS LABEL DE PUNTOS
    public JLabel getLblInvocar(){
        return this.lblInvocar;
    }
    public JLabel getLblMover(){
        return this.lblMover;
    }
    public JLabel getLblAtacar(){
        return this.lblAtacar;
    }
    public JLabel getLblTrampa(){
        return this.lblTrampa;
    }
    public JLabel getLblMagia(){
        return this.lblMagia;
    }
    
    //GET DE BARRAS DE LOS JEFES DE TERRENO
    public JProgressBar getBarraUsuario1(){
        return this.barraUsuario1;
    }
    public JProgressBar getBarraUsuario2(){
        return this.barraUsuario2;
    }
    public JProgressBar getBarraUsuario3(){
        return this.barraUsuario3;
    }
    public JProgressBar getBarraUsuario4(){
        return this.barraUsuario4;
    }
    
    
    
    
    
       
}
