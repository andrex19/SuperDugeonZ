package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Lizweert
 */
public class Trampa{
    
    //Atributos//
    Criatura criatura;
    /*String jugador;
    public Trampa(String usuario){
        this.jugador=usuario;
    }*/
    public void trampaDaño (Criatura criatura ){
       this.criatura=criatura;
       this.criatura.puntosDeVida=(int)(this.criatura.puntosDeVida - (this.criatura.puntosDeVida*0.4));
       
       
        
    }
    //public void verificarTrampa()
    
    
   // public void 
}
