/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;

/**
 *
 * @author Diego
 */
public class VistaInfoCriaturas extends javax.swing.JFrame {

    /**
     * Creates new form VistaInfoCriaturas
     */
    public VistaInfoCriaturas() {
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

        labelImage = new javax.swing.JLabel();
        labelNombre = new javax.swing.JLabel();
        labelVida = new javax.swing.JLabel();
        labelAtk = new javax.swing.JLabel();
        labelDef = new javax.swing.JLabel();
        labelNivel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelInfoNombre = new javax.swing.JLabel();
        labelInfoVida = new javax.swing.JLabel();
        labelInfoAtk = new javax.swing.JLabel();
        labelInfoDef = new javax.swing.JLabel();
        labelInfoNivel = new javax.swing.JLabel();
        BtnVolver = new javax.swing.JButton();
        CboxCriaturas = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        labelNombre.setText("Nombre:");

        labelVida.setText("Vida:");

        labelAtk.setText("Ataque:");

        labelDef.setText("Defensa:");

        labelNivel.setText("Nivel:");

        labelInfoVida.setText("jLabel1");

        labelInfoAtk.setText("jLabel1");

        labelInfoDef.setText("jLabel1");

        labelInfoNivel.setText("jLabel1");

        BtnVolver.setText("Volver");

        CboxCriaturas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(labelNombre)
                            .addComponent(labelVida)
                            .addComponent(labelAtk)
                            .addComponent(labelDef)
                            .addComponent(labelNivel))
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BtnVolver)
                            .addComponent(CboxCriaturas, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(108, 108, 108)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(labelInfoNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 3, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(labelInfoAtk)
                                    .addComponent(labelInfoVida)
                                    .addComponent(labelInfoDef)
                                    .addComponent(labelInfoNivel))))
                        .addGap(353, 353, 353))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CboxCriaturas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(BtnVolver)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNombre)
                    .addComponent(jLabel7)
                    .addComponent(labelInfoNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelVida)
                    .addComponent(labelInfoVida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAtk)
                    .addComponent(labelInfoAtk))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelDef)
                    .addComponent(labelInfoDef))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelNivel)
                    .addComponent(labelInfoNivel))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VistaInfoCriaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaInfoCriaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaInfoCriaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaInfoCriaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaInfoCriaturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnVolver;
    private javax.swing.JComboBox<String> CboxCriaturas;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel labelAtk;
    private javax.swing.JLabel labelDef;
    private javax.swing.JLabel labelImage;
    private javax.swing.JLabel labelInfoAtk;
    private javax.swing.JLabel labelInfoDef;
    private javax.swing.JLabel labelInfoNivel;
    private javax.swing.JLabel labelInfoNombre;
    private javax.swing.JLabel labelInfoVida;
    private javax.swing.JLabel labelNivel;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JLabel labelVida;
    // End of variables declaration//GEN-END:variables

    public JButton getBtnVolver(){
        return this.BtnVolver;
    }
    public JComboBox getCboxCriaturas(){
        return this.CboxCriaturas;
    }
    public JLabel getLabelInfoNombre(){
        return this.labelInfoNombre;
    }
    public JLabel getLabelInfoVida(){
        return this.labelInfoVida;
    }
    public JLabel getLabelInfoAtaque(){
        return this.labelInfoAtk;
    }
    public JLabel getLabelInfoDefensa(){
        return this.labelInfoDef;
    }
    public JLabel getLabelInfoNivel(){
        return this.labelInfoNivel;
    }
    public JLabel getLabelImage(){
        return this.labelImage;
    }
    public Object getItemCboxCriaturas(){
    return this.CboxCriaturas.getSelectedItem();
    }
    
    public void agregarListener(ActionListener al){
        
        this.CboxCriaturas.addActionListener(al);
        this.BtnVolver.addActionListener(al);
        
    
}
}
