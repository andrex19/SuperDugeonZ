/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Criatura{
    //Atributos//
    
    public String Nombre;
    public int puntosDeVida;
    public int Nivel;
    public int Ataque;
    public int Defensa;
    public int movimiento;
    //metodos//
    
    public Criatura(String Nombre, int puntosDevida, int Nivel, int Ataque, int Defensa){
        this.Nombre = Nombre;
        this.Ataque = Ataque;
        this.puntosDeVida = puntosDevida;
        this.Defensa = Defensa;
        this.Nivel = Nivel;
    }
    
    
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
            System.out.println(this.Nombre+" ha atacado a "+defensora.Nombre+" con "+Danno+" de daño");
            System.out.println("A "+defensora.Nombre+" le quedan "+defensora.puntosDeVida+" puntos de vida");
          }
          
        else if (this.Ataque<defensora.Defensa){
            Danno = this.Ataque - this.Defensa;
            this.puntosDeVida = this.puntosDeVida - Danno;
            System.out.println(this.Nombre+" se quita a sí mismo");
        }
    
    }
}
