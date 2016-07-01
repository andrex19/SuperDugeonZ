/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;


public class Dado {
    public int posicionCarasDado[][];
    public Criatura criatura;
    public String[] caras;
   
    public String toString(){
        return this.criatura.nombre;
    }
    public Dado(Criatura criatura) {
        int numero = criatura.nivel;
        this.posicionCarasDado = new int[6][2];
        caras=new String[6];
        this.criatura=criatura;
        
        
        if (numero==1){
            this.caras[0]="Mov";
            this.caras[1]="Inv";
            this.caras[2]="Atk";
            this.caras[3]="Atk";
            this.caras[4]="Mov";
            this.caras[5]="Inv";
            
        }
        if (numero==2){
            this.caras[0]="Tramp";
            this.caras[1]="Inv";
            this.caras[2]="AtkX2";
            this.caras[3]="Atk";
            this.caras[4]="Inv";
            this.caras[5]="Tramp";
        }
        if (numero==3){
            this.caras[0]="MovX3";
            this.caras[1]="Inv";
            this.caras[2]="Atk";
            this.caras[3]="Atk";
            this.caras[4]="Mov";
            this.caras[5]="MagX2";
        }
        if (numero==4){
            this.caras[0]="Inv";
            this.caras[1]="Inv";
            this.caras[2]="AtkX4";
            this.caras[3]="AtkX3";
            this.caras[4]="AtkX2";
            this.caras[5]="Atk";
        }
        
        
    }

    public int[][] generarTerreno(int f,int c,int num,int rot){
    int[][] posicionCarasDado =  new int[6][2];
        if (num==0){
       
                //figura 1,1
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f+1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f+2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f+3;
                posicionCarasDado[3][1]=c;
                posicionCarasDado[4][0]=f+2;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f+2;
                posicionCarasDado[5][1]=c+1;
        }
        else if (num==1){
                //figura 2,1
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f-3;
                posicionCarasDado[3][1]=c;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c+1;
        }
        else if (num==2){
                //figura 1,2
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c-1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f-4;
                posicionCarasDado[5][1]=c-1;
        }
        else if (num==3){
                //figura 2, 2  
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c+1;
                posicionCarasDado[5][0]=f-4;
                posicionCarasDado[5][1]=c+1;
        }
        else if (num==4){
                //figura1,3
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c+1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-2;
                posicionCarasDado[4][1]=c+2;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c+2;
        }
        else if (num==5){
                //figura 1,4
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f;
                posicionCarasDado[1][1]=c-1;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c-1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c-1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c-2;
        }
        else if (num==6){
                //figura 1,5
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c-1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c-1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c-1;
                posicionCarasDado[5][0]=f-2;
                posicionCarasDado[5][1]=c-2;
        }
        else if (num==7){
                // esta mala!
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-2;
                posicionCarasDado[2][1]=c;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c+1;
                posicionCarasDado[5][0]=f-4;
                posicionCarasDado[5][1]=c+1;
        }
        else if (num==8){
                //figura 2,3
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c-1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c-1;
                posicionCarasDado[4][0]=f-2;
                posicionCarasDado[4][1]=c-2;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c-2;
        }
        else if (num==9){
                //figura2,4
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f;
                posicionCarasDado[1][1]=c+1;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c+1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c+1;
                posicionCarasDado[5][0]=f-3;
                posicionCarasDado[5][1]=c+2;
        }
        else if (num==10){
                //figura 2,5
                posicionCarasDado[0][0]=f;
                posicionCarasDado[0][1]=c;
                posicionCarasDado[1][0]=f-1;
                posicionCarasDado[1][1]=c;
                posicionCarasDado[2][0]=f-1;
                posicionCarasDado[2][1]=c+1;
                posicionCarasDado[3][0]=f-2;
                posicionCarasDado[3][1]=c+1;
                posicionCarasDado[4][0]=f-3;
                posicionCarasDado[4][1]=c+1;
                posicionCarasDado[5][0]=f-2;
                posicionCarasDado[5][1]=c+2;
        }
        if (rot==1){
            girarTerreno(posicionCarasDado);
        }
            
        
        else if (rot==2){
            girarTerreno(posicionCarasDado);
            girarTerreno(posicionCarasDado);
        }
        else if (rot==3){
            girarTerreno(posicionCarasDado);
            girarTerreno(posicionCarasDado);
            girarTerreno(posicionCarasDado);
            
        }
    return posicionCarasDado;
        }
    public int[][] girarTerreno(int[][] carasDado){
        int f = carasDado[0][0];
        int c = carasDado[0][1];
        for (int[]posicion:carasDado){
            posicion[0]=posicion[0]-f;
            posicion[1]=posicion[1]-c;
        }
        for (int[]posicion:carasDado){
            int y=posicion[0];
            int x=posicion[1];
            posicion[0]=-x;
            posicion[1]=y;
        }
        for (int[]posicion:carasDado){
            posicion[0]=posicion[0]+f;
            posicion[1]=posicion[1]+c;
        }
    return carasDado;
    }
    //Metodos//
    //array caras con las 6 caras del dado
    //array puntos del Usuario en el orden (atk, mov, mag, tramp,inv)
    public String lanzarDado(String [] caras, int[] puntos){
        int n = (int)Math.round((5)*Math.random());
        System.out.println("este es el valor de n: " + n+ "que es la posicion del ramdom para la cara del dado");
        String caraDado = this.caras[n];
        if("Atk".equals(caraDado)){
            puntos[0] = puntos[0] + 1;
            System.out.println("Obtuvo 1 punto de Ataque");
            return "Atak1";
        }
        else if("Mov".equals(caraDado)){
            puntos[1] = puntos[1] + 1;         
            System.out.println("Obtuvo 1 punto de Movimiento"); 
            return "Mov1";
        }
        else if("Mag".equals(caraDado)){
            puntos[2] = puntos[2] + 1;
            System.out.println("Obtuvo 1 punto de Magia");
            return "Magia1";
        }
        else if("Tramp".equals(caraDado)){
            puntos[3] = puntos[3] + 1;
            System.out.println("Obtuvo 1 punto de Trampa");
            return "Trampa1";
        }
        else if("Inv".equals(caraDado)){
            puntos[4] = puntos[4] + 1;
            System.out.println("Obtuvo 1 punto de Invocacion");
            return "Inv";
        }
        else if("AtkX2".equals(caraDado)){
            puntos[0] = puntos[0] + 2;
            System.out.println("Obtuvo 2 punto de Ataque");
            return "Atak2";
        }
        else if("MovX2".equals(caraDado)){
            puntos[1] = puntos[1] + 2;          
            System.out.println("Obtuvo 2 punto de Movimiento");    
            return "Mov3";
        }
        else if("MagX2".equals(caraDado)){
            puntos[2] = puntos[2] + 2;
            System.out.println("Obtuvo 2 punto de Magia");
            return "Magia2";
        }
        else if("TrampX2".equals(caraDado)){
            puntos[3] = puntos[3] + 2;
            System.out.println("Obtuvo 2 punto de Trampa");
            return "Trampa2";
        }
        else if("AtkX3".equals(caraDado)){
            puntos[0] = puntos[0] + 3;
            System.out.println("Obtuvo 3 punto de Ataque");
            return "Atak3";
        }
        else if("MovX3".equals(caraDado)){
            puntos[1] = puntos[1] + 3;         
            System.out.println("Obtuvo 3 punto de Movimiento"); 
            return "Mov3";
        }
        else if("MagX3".equals(caraDado)){
            puntos[2] = puntos[2] + 3;
            System.out.println("Obtuvo 3 punto de Magia");
            return "Magia3";
        }
        else if("TrampX3".equals(caraDado)){
            puntos[3] = puntos[3] + 3; 
            System.out.println("Obtuvo 3 punto de Trampa");
            return "Trampa3";
        }
        else{
            return "error";
        }
        
    }
}