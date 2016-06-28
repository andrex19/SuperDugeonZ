package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Modelo.Dado;
import java.util.ArrayList;
/**
 *
 * @author Lizweert/*
 * To change this license header, choose License Headers in Project Properties.
 */
public class PuzzleDados {
    public Dado[] puzzle=new Dado[15];
    public ArrayList<Dado> puzzle2= new ArrayList<Dado>();
    
    public PuzzleDados(Dado[] puzzle){
        this.puzzle=puzzle;
    }
    public PuzzleDados(){
        
        for(int i=0;i<8;i++){
            puzzle[i]=new Dado(new Criatura(1));
        }
        for(int i=0;i<4;i++){
            puzzle[i+8]=new Dado(new Criatura(2));
        }
        for(int i=0;i<2;i++){
            puzzle[i+12]=new Dado(new Criatura(3));
        }
        puzzle[14]=new Dado(new Criatura(4));
        //ESTO ES PARA PROBAR UNA COSA!
        for (int i=0;i<15;i++){
            puzzle2.add(puzzle[i]);
        }
    }
 
    
}
