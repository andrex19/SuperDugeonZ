/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Samsung
 */
public class Tablero {
    public Casilla[][] infoCasillas=new Casilla[15][15];
    public Tablero(){
        //System.out.println("hola tablero ");
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                this.infoCasillas[i][j]=new Casilla();
                //System.out.println("casilla creada ("+i+","+j+")");
            }
       
        
        }
        
    }
    // metodo para verificar si todas las caras de la figura a desplegar esta adyacente a terreno propio
    public boolean verificarAdyacente(int[][] carasDado,String jugador, Tablero tablero){
        
        boolean aux=false;
        for (int[]cara:carasDado){
            
                if ((cara[0]+1>=0 && cara[0]+1<15 && cara[1]>=0 && cara[1]<15)){
                    if (tablero.infoCasillas[cara[0]+1][cara[1]].terreno.equals(jugador)){
                        return true ;
                    }
                }
                if ((cara[0]>=0 && cara[0]<15 && cara[1]+1>=0 && cara[1]+1<15)){
                    if (tablero.infoCasillas[cara[0]][cara[1]+1].terreno.equals(jugador)){
                        return true ;
                    }
                }
                if ((cara[0]-1>=0 && cara[0]-1<15 && cara[1]>=0 && cara[1]<15)){
                    if (tablero.infoCasillas[cara[0]-1][cara[1]].terreno.equals(jugador)){
                        return true ;
                    }
                }
                if ((cara[0]>=0 && cara[0]<15 && cara[1]-1>=0 && cara[1]-1<15)){
                    if (tablero.infoCasillas[cara[0]][cara[1]-1].terreno.equals(jugador)){
                        return true ;
                    }
                }
                
            }
        return aux;    
    }
    public boolean verificarAdyacenteCriatura(int ii,int ji,int ig,int jg){
        if (ii==ig+1 && ji==jg ||ii==ig-1 && ji==jg ||ii==ig && ji==jg+1 ||ii==ig && ji==jg-1  ){
            return true;
        }
        return false;    
    }
    
  
    //metodo para verificar si se peude poner la figura a desplegar 
    // 1) verificar adyacente
    // 2) verificar si esta dentro de la matriz
    // 3) verificar si donde se esta poniendo la figura no esta ocupada por alguien
    public boolean verificarTerreno(int[][]carasDado, String jugador,Tablero tablero){
        boolean aux=false;
        
        aux=verificarAdyacente(carasDado,jugador, tablero);
        for (int[]cara:carasDado){ //verificando punto 2)
            if (cara[0]<0 || cara[0]>14 || cara[1]<0 || cara[1]>14){
                aux=false;
                }
        }  
        for (int[]cara:carasDado){ //verificando punto 3)
            if ((cara[0]>=0 && cara[0]<15 && cara[1]>=0 && cara[1]<15)){
                if (tablero.infoCasillas[cara[0]][cara[1]].terreno.equals("")==false){
                    aux=false;
                }
            }
        }
    return aux;
    }
    
    
    
}
