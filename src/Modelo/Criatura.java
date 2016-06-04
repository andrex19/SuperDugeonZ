/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Modelo.Accion;

public class Criatura extends ElementosEnCampo {
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
}
