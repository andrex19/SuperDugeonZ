package Modelo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Modelo.Dado;
/**
 *
 * @author Lizweert/*
 * To change this license header, choose License Headers in Project Properties.
 */
public class PuzzleDados {
    public Dado[] puzzle=new Dado[15];
    
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
    }
 
    
}
