/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.swing.ImageIcon;


public class Criatura {
        //Atributos//
    public String nombre;
    public int puntosDeVida;
    public int nivel;
    public int ataque;
    public int defensa;
    public int movimiento;
    public static int numero;
    public ImageIcon imagen;
    
    public Criatura(int nivel){
        if (nivel==1){
        this.nombre = "Humano ";
        this.puntosDeVida= 200;
        this.nivel= nivel;
        this.ataque= 80;
        this.defensa= 20;
        this.movimiento=1;
        this.imagen=new ImageIcon(this.getClass().getResource("/Imagenes/Criaturas/1.png"));
        
        }
        if (nivel==2){
        this.nombre = "Namekusei ";
        this.puntosDeVida= 500;
        this.nivel= nivel;
        this.ataque= 150;
        this.defensa= 50;
        this.movimiento=1;
        this.imagen=new ImageIcon(this.getClass().getResource("/Imagenes/Criaturas/2.png"));
        }
        if (nivel==3){
        this.nombre = "Sayayin ";
        this.puntosDeVida= 2000;
        this.nivel= nivel;
        this.ataque= 800;
        this.defensa= 200;
        this.movimiento=1;
        this.imagen=new ImageIcon(this.getClass().getResource("/Imagenes/Criaturas/3.png"));
        }
        if (nivel==4){
        this.nombre = "Fusionado ";
        this.puntosDeVida= 5000;
        this.nivel= nivel;
        this.ataque= 1000;
        this.defensa= 700;
        this.movimiento=1;
        this.imagen=new ImageIcon(this.getClass().getResource("/Imagenes/Criaturas/4.png"));
        }
        numero+=1;

    }   
    public void Atacar(Criatura defensora){
        int Daño;
        if (this.ataque>defensora.defensa){

            Daño =  this.ataque - defensora.defensa;
            defensora.puntosDeVida = defensora.puntosDeVida - Daño;
            System.out.println(this.nombre+" ha atacado a "+defensora.nombre);
          }

        else if (this.ataque<defensora.defensa){
            Daño = this.ataque - this.defensa;
            this.puntosDeVida = this.puntosDeVida - Daño;
            System.out.println(this.nombre+" se quita a sí mismo");
        }
    }
    public void Atacar(JefeTerreno jefeTerreno){
        jefeTerreno.vida = jefeTerreno.vida - this.ataque;
    }
    
}
