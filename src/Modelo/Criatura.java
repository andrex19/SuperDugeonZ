/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Criatura{
    //Atributos//
    
    private String Nombre;
    private int puntosDeVida;
    private int Nivel;
    private int Ataque;
    private int Defensa;
    private int movimiento;
    //metodos//
    public String getNombre(){
    
        return this.Nombre;
    }
    public int getVida(){
    
        return this.puntosDeVida;
    }
    public int getNivel(){
    
        return this.Nivel;
    }
    public int getAtaque(){
    
        return this.Ataque;
    }
    public int getDefensa(){
    
        return this.Defensa;
    }
    public int getMovimiento(){
        return this.movimiento;
    }
    public void Accion(){
    //pedimos las acciones posibles a la clase Accion//
    }
    
    public void Atacar(Criatura defensora){
        int Danno;
        if (this.Ataque>defensora.Defensa){
              
            Danno =  this.Ataque - defensora.Defensa;
            defensora.puntosDeVida = defensora.puntosDeVida - Danno;
            System.out.println(this.Nombre+" ha atacado a "+defensora.Nombre);
          }
          
        else if (this.Ataque<defensora.Defensa){
            Danno = this.Ataque - this.Defensa;
            this.puntosDeVida = this.puntosDeVida - Danno;
            System.out.println(this.Nombre+" se quita a sí mismo");
        }
    
    }
}
