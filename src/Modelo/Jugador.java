/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.swing.ImageIcon;


public class Jugador {
    public String usuario;
    public String contraseña;
    public PuzzleDados puzle;
    public JefeTerreno jefeTerreno;
    public int[] puntos;
    public ImageIcon imagenTerreno;
    public Trampa trampa;

    
    public Jugador(String usuario, String contraseña, PuzzleDados puzle, JefeTerreno jefeTerreno){
        this.usuario=usuario;
        this.contraseña=contraseña;
        this.puzle=puzle;
        this.jefeTerreno=jefeTerreno;
        puntos = new int[5];
        this.trampa=new Trampa();
        //ataque, movimiento, magia, trampa, invocacion.
        //array puntos del Usuario en el orden (atk, mov, mag, tramp,inv)
    }
    
    
    //METODOS PARA VALIDAR USUARIO... ACTUALIZAR CUANDO SE TENGA LA BASE DE DATOS
    public static boolean existe(ArrayList<Jugador> arreglo_usuarios_registrados,String usuario){

        //Modificar funcion y ver si existe en la base de datos
        // en el caso de que exista retornar true en caso contrario false
        for (int i=0;i<arreglo_usuarios_registrados.size();i++){
            if(arreglo_usuarios_registrados.get(i).usuario.equals(usuario)){
                System.out.println("TRUE");
                return true;
            }
        }
        
        return false;   
    }

    public  static boolean verificar(String usuario, String password ,ArrayList<Jugador> arreglo_usuarios_registrados ){
        
        for (int i=0;i<arreglo_usuarios_registrados.size();i++){
            if(arreglo_usuarios_registrados.get(i).usuario.equals(usuario)){
                if(arreglo_usuarios_registrados.get(i).contraseña.equals(password)){
                    return true;
                    
                }
            }
    
        }
        return false;
    }

}
