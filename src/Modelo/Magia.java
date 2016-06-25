/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import Controladores.ControladorBatalla;
//import Controladores.

/**
 *
 * @author Felipe
 */
public class Magia {
    
    Criatura criatura;
    
    public void MeteoroFuego (Criatura criatura ){
       this.criatura=criatura;
       this.criatura.puntosDeVida=(int)(this.criatura.puntosDeVida - (this.criatura.puntosDeVida*0.4));
    }
    
    
    
    public int[][] TerrenoMeteoro(int f, int c){
        int[][] posicionMagia =  new int[61][2];
                posicionMagia[0][0]=f;
                posicionMagia[0][1]=c;
                posicionMagia[1][0]=f;
                posicionMagia[1][1]=c-5;
                posicionMagia[2][0]=f-1;
                posicionMagia[2][1]=c-4;
                posicionMagia[3][0]=f;
                posicionMagia[3][1]=c-4;
                posicionMagia[4][0]=f+1;
                posicionMagia[4][1]=c-4;
                posicionMagia[5][0]=f-2;
                posicionMagia[5][1]=c-3;
                posicionMagia[6][0]=f-1;
                posicionMagia[6][1]=c-3;
                posicionMagia[7][0]=f;
                posicionMagia[7][1]=c-3;
                posicionMagia[8][0]=f+1;
                posicionMagia[8][1]=c-3;
                posicionMagia[9][0]=f+2;
                posicionMagia[9][1]=c-3;
                posicionMagia[10][0]=f-3;
                posicionMagia[10][1]=c-2;
                posicionMagia[11][0]=f-2;
                posicionMagia[11][1]=c-2;
                posicionMagia[12][0]=f-1;
                posicionMagia[12][1]=c-2;
                posicionMagia[13][0]=f;
                posicionMagia[13][1]=c-2;
                posicionMagia[14][0]=f+1;
                posicionMagia[14][1]=c-2;
                posicionMagia[15][0]=f+2;
                posicionMagia[15][1]=c-2;
                posicionMagia[16][0]=f+3;
                posicionMagia[16][1]=c-2;
                posicionMagia[17][0]=f-4;
                posicionMagia[17][1]=c-1;
                posicionMagia[18][0]=f-3;
                posicionMagia[18][1]=c-1;
                posicionMagia[19][0]=f-2;
                posicionMagia[19][1]=c-1;
                posicionMagia[20][0]=f-1;
                posicionMagia[20][1]=c-1;
                posicionMagia[21][0]=f;
                posicionMagia[21][1]=c-1;
                posicionMagia[22][0]=f+1;
                posicionMagia[22][1]=c-1;
                posicionMagia[23][0]=f+2;
                posicionMagia[23][1]=c-1;
                posicionMagia[24][0]=f+3;
                posicionMagia[24][1]=c-1;
                posicionMagia[25][0]=f+4;
                posicionMagia[25][1]=c-1;
                posicionMagia[26][0]=f-5;
                posicionMagia[26][1]=c;
                posicionMagia[27][0]=f-4;
                posicionMagia[27][1]=c;
                posicionMagia[28][0]=f-3;
                posicionMagia[28][1]=c;
                posicionMagia[29][0]=f-2;
                posicionMagia[29][1]=c;
                posicionMagia[30][0]=f-1;
                posicionMagia[30][1]=c;
                posicionMagia[31][0]=f+1;
                posicionMagia[31][1]=c;
                posicionMagia[32][0]=f+2;
                posicionMagia[32][1]=c;
                posicionMagia[33][0]=f+3;
                posicionMagia[33][1]=c;
                posicionMagia[34][0]=f+4;
                posicionMagia[34][1]=c;
                posicionMagia[35][0]=f+5;
                posicionMagia[35][1]=c;
                posicionMagia[36][0]=f-4;
                posicionMagia[36][1]=c+1;
                posicionMagia[37][0]=f-3;
                posicionMagia[37][1]=c+1;
                posicionMagia[38][0]=f-2;
                posicionMagia[38][1]=c+1;
                posicionMagia[39][0]=f-1;
                posicionMagia[39][1]=c+1;
                posicionMagia[40][0]=f;
                posicionMagia[40][1]=c+1;
                posicionMagia[41][0]=f+1;
                posicionMagia[41][1]=c+1;
                posicionMagia[42][0]=f+2;
                posicionMagia[42][1]=c+1;
                posicionMagia[43][0]=f+3;
                posicionMagia[43][1]=c+1;
                posicionMagia[44][0]=f+4;
                posicionMagia[44][1]=c+1;
                posicionMagia[45][0]=f-3;
                posicionMagia[45][1]=c+2;
                posicionMagia[46][0]=f-2;
                posicionMagia[46][1]=c+2;
                posicionMagia[47][0]=f-1;
                posicionMagia[47][1]=c+2;
                posicionMagia[48][0]=f;
                posicionMagia[48][1]=c+2;
                posicionMagia[49][0]=f+1;
                posicionMagia[49][1]=c+2;
                posicionMagia[50][0]=f+2;
                posicionMagia[50][1]=c+2;
                posicionMagia[51][0]=f+3;
                posicionMagia[51][1]=c+2;
                posicionMagia[52][0]=f-2;
                posicionMagia[52][1]=c+3;
                posicionMagia[53][0]=f-1;
                posicionMagia[53][1]=c+3;
                posicionMagia[54][0]=f;
                posicionMagia[54][1]=c+3;
                posicionMagia[55][0]=f+1;
                posicionMagia[55][1]=c+3;
                posicionMagia[56][0]=f+2;
                posicionMagia[56][1]=c+3;
                posicionMagia[57][0]=f-1;
                posicionMagia[57][1]=c+4;
                posicionMagia[58][0]=f;
                posicionMagia[58][1]=c+4;
                posicionMagia[59][0]=f+1;
                posicionMagia[59][1]=c+4;
                posicionMagia[60][0]=f;
                posicionMagia[60][1]=c+5;
        return posicionMagia;
        
    }
       
}   
