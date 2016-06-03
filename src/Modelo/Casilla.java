/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modelo;

import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

/**
 *
 * @author Cristian
 */
public class Casilla extends JButton implements ActionListener {
    public int PosicionFila;
    public int PosicionColumna;
    public boolean Abierta;
    ImageIcon Pintada, Criaturax;
    byte value = 0;
    
    public Casilla(){
        Pintada =new ImageIcon(this.getClass().getResource("/Imagenes/X.png"));
        Criaturax=new ImageIcon(this.getClass().getResource("/Imagenes/O.png"));
        this.addActionListener(this);
        Abierta = true;
    }
    public void actionPerformed(ActionEvent e){
		value++;
		value%=3;
		switch(value){
                    
			case 0:
				setIcon(null);
                                set_abierta(true);
				break;
			case 1:
				setIcon(Pintada);
                                set_abierta(false);
				break;
			case 2:
				setIcon(Criaturax);
                                set_abierta(false);
				break;
		}
    }
    
    public void set_abierta(boolean valor){
        this.Abierta = valor;
    }
    
    public boolean get_abierta(){
        return this.Abierta;
    }

    
}
