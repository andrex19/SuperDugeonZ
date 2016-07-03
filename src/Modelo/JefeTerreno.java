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
    
    public JefeTerreno(){}
    
    public JefeTerreno(int numero){
        if (numero==1){
            this.nombre = "Goku";
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Goku_1.png"));
            this.vida=5000;
        }
        else if (numero==2){
            this.nombre = "Vegeta";
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Vegeta.png"));
            this.vida=5000;
        }
        else if (numero==3){
            this.nombre = "Zolezzi";
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Zolezzi.png"));
            this.vida=5000;
        }
        else if (numero==4){
            this.nombre = "Mr.Satan";
            this.imagen = new ImageIcon(this.getClass().getResource("/Imagenes/Mr.Satan.png"));
            this.vida=5000;
        }
    }
    
    
    
}
