/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;


public class Jugador {
    public String usuario;
    public String contraseña;
    public PuzzleDeDados puzle;
    public JefeTerreno jefeTerreno;
    public int[] puntos;

    
    public Jugador(String usuario, String contraseña, PuzzleDeDados puzle, JefeTerreno jefeTerreno){
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.puzle=puzle;
        this.jefeTerreno=jefeTerreno;
        puntos = new int[5];
        //ataque, movimiento, magia, trampa, invocacion.
        //array puntos del Usuario en el orden (atk, mov, mag, tramp,inv)
    }
    
    
    //METODOS PARA VALIDAR USUARIO... ACTUALIZAR CUANDO SE TENGA LA BASE DE DATOS
    public static boolean existe(String username){
        //Modificar funcion y ver si existe en la base de datos
        // en el caso de que exista retornar true en caso contrario false
        if(username.equals("Andres")){
            return true;
        }else{
            return false;
        }
    }

    public  static boolean verificar(String username, String password){
        
        if(username.equals("Andres") && password.equals("holA")){
            return true;
        }else{
            return false;
        }
    }

}
