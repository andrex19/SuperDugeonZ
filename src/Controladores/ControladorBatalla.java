/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Modelo.Criatura;
//import static Modelo.Criatura.verificarCriatura;
import Modelo.Dado;
import Modelo.Jugador;
import Modelo.Tablero;
import Vistas.VistaBatalla;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.ImageIcon;
import superdugeonz_2.ControladorPrincipal;



/**
 *
 * @author Samsung
 */
public class ControladorBatalla extends MouseAdapter implements ActionListener, KeyListener{
    ControladorPrincipal cp;
    ControladorSeleccionDados controladorSeleccionDados;
    VistaBatalla vistaBatalla;
    ImageIcon goku,rojo,verde,azul,kaio;
    Dado dado;
    public int[][] carasDado;
    public static int numeroFiguraDado=0;
    public static int rotacion=0;
    public ArrayList <Integer> ordenTurnos;
    private int ultimo_boton;
    public Tablero tablero;
    public int turno;
    public Jugador jugadorActual;
    ArrayList<Jugador> arregloJugadores = new ArrayList<Jugador>();
    ArrayList<Dado> dadosSeleccionados = new ArrayList<Dado>();
    
    //para atacar!
    Criatura criaturaAtk = null;
    Criatura criaturaDef = null ;
    
    //para moverme!
    Criatura criaturaMov = null;
    int posicionInicialI;
    int posicionInicialJ;
    

    public ControladorBatalla() {
        //this.controladorElegirDados=new ControladorElegirDados();
        this.tablero = new Tablero();
        this.ordenTurnos = new ArrayList<Integer>();
        this.goku = new ImageIcon(this.getClass().getResource("/Imagenes/goku.png"));
        this.kaio = new ImageIcon(this.getClass().getResource("/Imagenes/Kaio-Sama.PNG"));
        this.rojo = new ImageIcon(this.getClass().getResource("/Imagenes/rojo.png"));
        this.verde = new ImageIcon(this.getClass().getResource("/Imagenes/verde.png"));
        this.azul = new ImageIcon(this.getClass().getResource("/Imagenes/azul.png"));
    
        }
    public void generarTurnos(){
        Random random= new Random();
        int aleatorio;
        ArrayList <Integer> aux = new ArrayList<Integer>();
        System.out.println(this.arregloJugadores.size());
        while (aux.size()<this.arregloJugadores.size()){
            aleatorio=random.nextInt(this.arregloJugadores.size());
            if (aux.contains(aleatorio)==false){
                System.out.println("agregar este aleatorio: " + aleatorio);
                aux.add(aleatorio);
            }
        }
        //System.out.println(aux);
        this.ordenTurnos=(ArrayList<Integer>) aux.clone();
        //System.out.println(this.ordenTurnos);  
    }
     
    public void verVista(ControladorPrincipal cp,ArrayList<Jugador> jugadoresReady) {
    
        this.cp=cp;
        this.arregloJugadores= (ArrayList<Jugador>) jugadoresReady.clone();
        this.vistaBatalla=new VistaBatalla();
        this.vistaBatalla.setVisible(true);
        this.vistaBatalla.agregarListener(this,this,this); 
        ponerJefesTerreno(arregloJugadores);
        generarTurnos();
        System.out.print("orden de turno en esta fase: ");
        System.out.println(this.ordenTurnos);
        //System.out.println(ordenTurnos.get(turno));
        jugadorActual=arregloJugadores.get(ordenTurnos.get(turno));
        System.out.println(jugadorActual.usuario+" usuario actual al principio de batalla ");
        System.out.println("turno: "+turno);
        verificarPuntos();

        
    }
    public void ponerJefesTerreno(ArrayList<Jugador> arregloJugadores){
        if (arregloJugadores.size()==2){
            tablero.infoCasillas[0][7].terreno=arregloJugadores.get(0).usuario;
            tablero.infoCasillas[7][0].terreno=arregloJugadores.get(1).usuario;
            vistaBatalla.botones[0][7].setIcon(arregloJugadores.get(0).jefeTerreno.imagen);
            vistaBatalla.botones[7][0].setIcon(arregloJugadores.get(1).jefeTerreno.imagen);
            
        }
        else if (arregloJugadores.size()==3){
            tablero.infoCasillas[0][7].terreno=arregloJugadores.get(0).usuario;
            tablero.infoCasillas[7][0].terreno=arregloJugadores.get(1).usuario;
            tablero.infoCasillas[14][7].terreno=arregloJugadores.get(2).usuario;
            vistaBatalla.botones[0][7].setIcon(arregloJugadores.get(0).jefeTerreno.imagen);
            vistaBatalla.botones[7][0].setIcon(arregloJugadores.get(1).jefeTerreno.imagen);
            vistaBatalla.botones[14][7].setIcon(arregloJugadores.get(2).jefeTerreno.imagen);
        }
        else if (arregloJugadores.size()==4){
            tablero.infoCasillas[0][7].terreno=arregloJugadores.get(0).usuario;
            tablero.infoCasillas[7][0].terreno=arregloJugadores.get(1).usuario;
            tablero.infoCasillas[14][7].terreno=arregloJugadores.get(2).usuario;
            tablero.infoCasillas[7][14].terreno=arregloJugadores.get(3).usuario;
            vistaBatalla.botones[0][7].setIcon(arregloJugadores.get(0).jefeTerreno.imagen);
            vistaBatalla.botones[7][0].setIcon(arregloJugadores.get(1).jefeTerreno.imagen);
            vistaBatalla.botones[14][7].setIcon(arregloJugadores.get(2).jefeTerreno.imagen);
            vistaBatalla.botones[7][14].setIcon(arregloJugadores.get(3).jefeTerreno.imagen);
            /*System.out.println(tablero.infoCasillas[0][7].terreno+ " terreno puesto en poner terreno");
            System.out.println(tablero.infoCasillas[7][0].terreno+ " terreno puesto en poner terreno");
            System.out.println(tablero.infoCasillas[14][7].terreno+ " terreno puesto en poner terreno");
            System.out.println(tablero.infoCasillas[7][14].terreno+ " terreno puesto en poner terreno");*/
        }
    }
    

    public void ponerFiguraDado(int[][] carasDado,String jefe1, ImageIcon imagen){
                      
        for (int[]fila:carasDado){
            vistaBatalla.botones[fila[0]][fila[1]].setIcon(imagen);
            tablero.infoCasillas[fila[0]][fila[1]].terreno=jefe1;
        }
        
    }
    public void invocarCriatura(int[][] carasDado,Criatura criatura){
        int n = (int)Math.round((5)*Math.random());
        int x = carasDado[n][0];
        int y = carasDado[n][1];
                
        vistaBatalla.botones[x][y].setIcon(azul);
        tablero.infoCasillas[x][y].criatura=criatura;
        tablero.infoCasillas[x][y].ocupadoPor=jugadorActual.usuario;
    }

    public void limpiar(){
        for (int i=0;i<15;i++){
            for (int j=0;j<15;j++){
                if (tablero.infoCasillas[i][j].terreno.equals("")){
                    vistaBatalla.botones[i][j].setIcon(null);
                }
                
            }
        }
    }
    public void pintarTerrenoValido(int[][] carasDado, boolean boleano){
        boolean aux=true;
        if(boleano==true){
            aux=tablero.verificarTerreno(carasDado,jugadorActual.usuario,tablero);
            if (aux){
                for (int[]cara:carasDado){
                    if ((cara[0]>=0 && cara[0]<15 && cara[1]>=0 && cara[1]<15)){           
                        if (tablero.infoCasillas[cara[0]][cara[1]].terreno.equals("")){
                            vistaBatalla.botones[cara[0]][cara[1]].setIcon(verde);     
                        }
                    }
                }
                
            }
            else{
                for (int[]cara:carasDado){
                    if ((cara[0]>=0 && cara[0]<15 && cara[1]>=0 && cara[1]<15)){           
                        if (tablero.infoCasillas[cara[0]][cara[1]].terreno.equals("")){
                            vistaBatalla.botones[cara[0]][cara[1]].setIcon(rojo);     
                        }
                    }
                }
                
            }
        }
        else{
            limpiar();
        }
    }
    public void verificarPuntos(){
        this.vistaBatalla.getLblAtacar().setText(Integer.toString(this.jugadorActual.puntos[0]));
        this.vistaBatalla.getLblMover().setText(Integer.toString(this.jugadorActual.puntos[1]));
        this.vistaBatalla.getLblMagia().setText(Integer.toString(this.jugadorActual.puntos[2]));
        this.vistaBatalla.getLblTrampa().setText(Integer.toString(this.jugadorActual.puntos[3]));
        this.vistaBatalla.getLblInvocar().setText(Integer.toString(this.jugadorActual.puntos[4]));
            if(this.jugadorActual.puntos[0]<=0){
                this.vistaBatalla.getBtnAtacar().setEnabled(false);
            }
            else{
                this.vistaBatalla.getBtnAtacar().setEnabled(true);
            }
            if(this.jugadorActual.puntos[1]<=0){
                this.vistaBatalla.getBtnMover().setEnabled(false);
            }
            else{
                this.vistaBatalla.getBtnMover().setEnabled(true);
            }
            if(this.jugadorActual.puntos[2]<=0){
                this.vistaBatalla.getBtnMagia().setEnabled(false);
            }
            else{
                this.vistaBatalla.getBtnMagia().setEnabled(true);
            }
            if(this.jugadorActual.puntos[3]<=0){
                this.vistaBatalla.getBtnTrampa().setEnabled(false);
            }
            else{
                this.vistaBatalla.getBtnTrampa().setEnabled(true);
            }
            if(this.jugadorActual.puntos[4]<=0){
                this.vistaBatalla.getBtnInvocar().setEnabled(false);
            }
            else{
                this.vistaBatalla.getBtnInvocar().setEnabled(true);
            }
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (vistaBatalla.getBtnInvocar()==e.getSource()){ //invocar = boton 1
            System.out.println("click en boton invocar criatura");          
            ultimo_boton=1; //habilitar la funcionliadad para invocar 
        }
        if (ultimo_boton==1){
            for (int i=0;i<15;i++){
                for (int j=0;j<15;j++){
                   if (vistaBatalla.botones[i][j]==e.getSource()){
                        //System.out.println(" haz presionado el boton !("+i+","+j+")" );
                        System.out.println("jugador Actual " + jugadorActual.usuario);
                        dado=jugadorActual.puzle.puzzle[1];
                        //HAY QUE ELEGIR EL DADO QUE SE NECESITA INVOCARR!!! (ASI COMO ESTA... INVOCA UNA CRIATURA DE UN DADO EN ESPECIFICO)
                        carasDado=dado.generarTerreno(i,j,numeroFiguraDado,rotacion);
                        if (tablero.verificarTerreno(carasDado,jugadorActual.usuario,tablero)){
                            ponerFiguraDado(carasDado,jugadorActual.usuario,jugadorActual.jefeTerreno.imagen);
                            invocarCriatura(carasDado,dado.criatura);
                            System.out.println(dado.criatura.nombre + "ha sido invocada");
                            this.jugadorActual.puntos[4]-=1;
                            verificarPuntos();
                            ultimo_boton=0;
                        }
                        else{
                            System.out.println("No se peude desplegar el dado");
                        }

                   }
                }
            }
        }
        
        if (vistaBatalla.getBtnMagia()==e.getSource()){
            ultimo_boton=2;
            System.out.println("click en boton magia");
            
        }
        if (ultimo_boton==2){
            
        }
        
        
        if (vistaBatalla.getBtnMover()==e.getSource()){
            ultimo_boton=3;
            
            System.out.println("click en boton mover");
        }
        if (ultimo_boton==3){
            if(criaturaMov==null){
                for (int i=0;i<15;i++){
                    for (int j=0;j<15;j++){
                        if (vistaBatalla.botones[i][j]==e.getSource()){
                            if (tablero.infoCasillas[i][j].criatura!=null){
                                System.out.println("existe una criatura en esta posicion");
                                if(tablero.infoCasillas[i][j].ocupadoPor.equals(jugadorActual.usuario)){
                                    System.out.println("esta criatura me pertencese!!");
                                    criaturaMov=tablero.infoCasillas[i][j].criatura;
                                    posicionInicialI=i;
                                    posicionInicialJ=j;
                                    
                                    System.out.println("se ha seleccionado la criatura para moverla");
                                }
                                else{
                                    System.out.println("esta criatura no me pertenece!");
                                }
                                //System.out.println(" haz presionado el boton !("+i+","+j+")" );
                                //System.out.println(tablero.infoCasillas[i][j].criatura.nombre);
                                //System.out.println(tablero.infoCasillas[i][j].ocupadoPor);
                            }
                        }
                        else{
                            System.out.println("no existe una criatura en esta posicion");
                        }
                    }
                }
            }
            if(criaturaMov!=null){
                for (int i=0;i<15;i++){
                    for (int j=0;j<15;j++){
                        if (vistaBatalla.botones[i][j]==e.getSource()){
                            
                                if(tablero.infoCasillas[i][j].ocupadoPor.equals("") &&tablero.infoCasillas[i][j].terreno.equals("")==false ){
                                    System.out.println("casilla no ocupada y con terreno");

                                    //hay que ver lo de cuanto se puede mover la criatura!!! 
                                    
                                    if (tablero.verificarAdyacenteCriatura(posicionInicialI, posicionInicialJ, i, j)){
                                        System.out.println("la criatura se puede mover");
                                        System.out.println(posicionInicialI+" "+ posicionInicialJ);
                                        System.out.println(i+" "+ j);
                                        //Borrando informacion de la casilla anterior
                                        tablero.infoCasillas[posicionInicialI][posicionInicialJ].criatura=null;
                                        tablero.infoCasillas[posicionInicialI][posicionInicialJ].ocupadoPor="";
                                        ImageIcon imagenPosicionInicial=null;//capturar bien la imagen 
                                        //ya que no es la imagen del jefe de terreno la que hay que poner! si no que la de terreno propio
                                        for (int d=0;d<arregloJugadores.size();d++){
                                            if (arregloJugadores.get(d).usuario.equals(
                                                 tablero.infoCasillas[posicionInicialI][posicionInicialJ].terreno)){
                                                imagenPosicionInicial=arregloJugadores.get(d).jefeTerreno.imagen;
                                            }
                                        }
                                        vistaBatalla.botones[posicionInicialI][posicionInicialJ].setIcon(imagenPosicionInicial);
                                        //insertando la informacion en la nueva casilla
                                        tablero.infoCasillas[i][j].criatura=criaturaMov;
                                        tablero.infoCasillas[i][j].ocupadoPor=jugadorActual.usuario;
                                        vistaBatalla.botones[i][j].setIcon(azul);
                                        this.jugadorActual.puntos[1]-=1;
                                        verificarPuntos();
                                        
                                        
                                        //reiniciando valeres del controlador
                                        criaturaMov=null;
                                        ultimo_boton=0;
                                    }
                                    else {
                                        System.out.println(" la criatura no se puede mover ");
                                    }


                                }
                                else{
                                    System.out.println("casilla ocupada o sin terreno");
                                }
                            
                        }
                    }
                }
            }
            else{
                System.out.println("tiene que seleccionar una criatura para mover");
            }  
        }
        if (vistaBatalla.getBtnTrampa()==e.getSource()){
            ultimo_boton=4;
            System.out.println("click en boton trampa");
        }
        if (ultimo_boton==4){
            
        }
         if (vistaBatalla.getBtnLanzar()==e.getSource()){ //lanzar = boton 5
            ultimo_boton=5;
            this.controladorSeleccionDados = new ControladorSeleccionDados();
            System.out.println("click en boton lanzar");
            this.controladorSeleccionDados.verVista(this);

        }
        /*if (ultimo_boton==5){
                nose si se ocupara estoooo asi que lo comento1 :ASd :D By Andres! :z el Bellakilo  5Letras!
        }*/
        if (vistaBatalla.getBtnAtacar()==e.getSource()){
            ultimo_boton=6;
            criaturaAtk=null;
            criaturaDef=null;
            posicionInicialI=0;
            posicionInicialJ=0;
            System.out.println("click en boton Atacar");
        }
        if (ultimo_boton==6){
            if(criaturaAtk==null){
                for (int i=0;i<15;i++){
                    for (int j=0;j<15;j++){
                        if (vistaBatalla.botones[i][j]==e.getSource()){
                            if (tablero.infoCasillas[i][j].criatura!=null){
                                if(tablero.infoCasillas[i][j].ocupadoPor.equals(jugadorActual.usuario)){
                                    System.out.println("esta criatura me pertencese!!");
                                    criaturaAtk=tablero.infoCasillas[i][j].criatura;
                                    posicionInicialI=i;
                                    posicionInicialJ=j;
                                    System.out.println("se ha seleccionado la criatura para atacar debe serleccionar una criatura objetivo");
                                }
                                else{
                                    System.out.println("esta criatura no pertenece al jugador");
                                }
                                //System.out.println(" haz presionado el boton !("+i+","+j+")" );
                                //System.out.println(tablero.infoCasillas[i][j].criatura.nombre);
                                //System.out.println(tablero.infoCasillas[i][j].ocupadoPor);
                            }
                            else{
                                System.out.println("no existe una criatura en esta posicion");
                            }
                        }
                    }
                }
            }
            if(criaturaAtk!=null){
                for (int i=0;i<15;i++){
                    for (int j=0;j<15;j++){
                        if (vistaBatalla.botones[i][j]==e.getSource()){
                            if (tablero.infoCasillas[i][j].criatura!=null){
                                if(tablero.infoCasillas[i][j].ocupadoPor.equals(jugadorActual.usuario)==false){
                                    System.out.println("esta criatura no me pertencese!!criatura defensora");
                                    criaturaDef=tablero.infoCasillas[i][j].criatura;
                                    System.out.println("puntos de vida antes: " + criaturaDef.puntosDeVida);

                                    System.out.println(tablero.verificarAdyacenteCriatura(posicionInicialI, posicionInicialJ, i, j));
                                    if (tablero.verificarAdyacenteCriatura(posicionInicialI, posicionInicialJ, i, j)){
                                        System.out.println("se puede atacar a la criatura");
                                        criaturaAtk.Atacar(criaturaDef);
                                        this.jugadorActual.puntos[0]-=1;
                                        verificarPuntos();
                                        System.out.println("se ha seeccionado la criatura para defender");
                                        System.out.println("puntos de vida despues: " + criaturaDef.puntosDeVida);
                                        criaturaAtk=null;
                                        criaturaDef=null;
                                        ultimo_boton=0;
                                    }
                                    else {
                                        System.out.println(" criatura fuera del rango posible de ataque...");
                                    }

                                    
                                }
                                else {
                                    System.out.println("criatura objetiva es del mismo jugador");
                                }
                            }
                            else { 
                                System.out.println("no existe una criatura en esta posicion");
                            }
                        }
                    }
                }
            }
            else{
                System.out.println("tiene que seleccionaar una criatura atacante");
            }
            
            
        }
        if (vistaBatalla.getBtnFinalizar()==e.getSource()){
            System.out.println("click en boton finalizar turno");
            turno+=1;
            if (turno==arregloJugadores.size()){
                turno=0;
                generarTurnos();
                System.out.print("orden de turno en esta fase: ");
                System.out.println(this.ordenTurnos);

            }
            //System.out.println(ordenTurnos.get(turno));
            jugadorActual=arregloJugadores.get(ordenTurnos.get(turno));
            System.out.println("turno: "+turno);
            System.out.println("turno de: "+ jugadorActual.usuario);
            this.vistaBatalla.getBtnLanzar().setEnabled(true);
            verificarPuntos();
            
            ultimo_boton=0;
        }
    }


    @Override
    public void mouseWheelMoved(MouseWheelEvent e){
        if (ultimo_boton==1){
            if (e.getWheelRotation()==1){
                System.out.println(" Cambiar a figura " + numeroFiguraDado);
                if (numeroFiguraDado>0){
                    numeroFiguraDado-=1;
                }
                limpiar();
            }
            else if(e.getWheelRotation()==-1){
                System.out.println(" cambiar a figura: "+ numeroFiguraDado);
                if (numeroFiguraDado<10){
                    numeroFiguraDado+=1;
                } 
                limpiar();
            }
        }
    }
    
    
    
    //MOUSE LISTENERS
    @Override
    public void mousePressed(MouseEvent e){
        if (ultimo_boton==1){
            if (e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
                System.out.println("rotar las figuras 90 grados");
                rotacion+=1;
                if (rotacion==4){
                    rotacion=0;
                }
                limpiar();
            }
        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if(ultimo_boton == 1){
            for (int i=0;i<15;i++){
                for (int j=0;j<15;j++){
                   if (vistaBatalla.botones[i][j]==e.getSource()){
                        //System.out.println(" mouse sobre el boton!("+i+","+j+")" );
                        //vistaTerreno.botones[i][j].setIcon(pasto);
                        //System.out.println(carasDado);
                        //System.out.println(jugadorActual.puzle.puzzle[0]);
                        carasDado=jugadorActual.puzle.puzzle[0].generarTerreno(i,j,numeroFiguraDado,rotacion);
                        //CAMBIAR ARREGLAR LO DEL METODO GENNERAR TERRENO !!!"#!"#SALKDFJALSDKFJQWR1"#!#
                        pintarTerrenoValido(carasDado,true);

                   }
                }
            }
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {
        if(ultimo_boton == 1){
            for (int i=0;i<15;i++){
                for (int j=0;j<15;j++){
                   if (vistaBatalla.botones[i][j]==e.getSource()){
                        //System.out.println(" mouse sobre el boton!("+i+","+j+")" );
                        //vistaTerreno.botones[i][j].setIcon(pasto);
                        carasDado=jugadorActual.puzle.puzzle[0].generarTerreno(i,j,numeroFiguraDado,rotacion);
                        //CAMBIAR ARREGLAR LO DEL METODO GENNERAR TERRENO !!!"#!"#SALKDFJALSDKFJQWR1"#!#
                        pintarTerrenoValido(carasDado,false);
                    }
                }
            }
            
        }
        
    }
    
    
    // KEY LISTENERS
    @Override
    public void keyTyped(KeyEvent ke) {
       
    }

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("presione algo");
  
        
////        if (e.getKeyCode() == KeyEvent.VK_W){
////             System.out.println("Up_Arrow_Key Pressed");
////        }
////        else if (e.getKeyCode() == KeyEvent.VK_A){
////             System.out.println("Left_Arrow_Key Pressed");          
////        }
////        else if (e.getKeyCode() == KeyEvent.VK_S){
////             System.out.println("down_Arrow_Key Pressed");          
////        }
////        else if (e.getKeyCode() == KeyEvent.VK_D){
////             System.out.println("Right_Arrow_Key Pressed");          
////        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
   
    }
  
    
}
