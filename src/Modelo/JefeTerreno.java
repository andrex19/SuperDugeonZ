/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.ImageIcon;



/**
 *
 * @author Samsung
 */
public class JefeTerreno {
    public String nombre;
    public int vida;
    public String nombre_habilidad;
    public ImageIcon imagen;
    
    
    
    public JefeTerreno(int numero){
        if (numero==1){
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
            this.vida=5000;
        }
        else if (numero==2){
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Kaio-Sama.png"));
            this.vida=5000;
        }
        else if (numero==3){
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
            this.vida=5000;
        }
        else if (numero==4){
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
            this.vida=5000;
        }
    }
    
    
    
}
