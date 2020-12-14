/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.la_vida_da_muchas_vueltas.grupo7;

import java.util.Random;


public class Grupo7 {
    public static void main(String[] args) {     
        
        boolean generoMama= false, generoPapa=true;
    /*Variables de Yo */
    boolean generoYo= FuncionesPersona.generoAleatorio();    
    String nombreYo= FuncionesPersona.nombreAleatorio(generoYo);
    String apellidosYo= FuncionesPersona.apellidosAleatorio();
    int empatiaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int inteligenciaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int sociabilidadMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int velocidadMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int fuerzaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int edadYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
//Mama

    
    /*Variables de Mama */
    String nombreMama=FuncionesPersona.nombreAleatorio(generoMama);
    String apellidosMama=apellidosYo;
    int empatiaMama=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int inteligenciaMama=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int velocidadMama=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int fuerzaMama=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int sociabilidadMama=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int edadMama=FuncionesPersona.valorEstadisticaAleatorio((byte)30);
    /*Variables de Papa */
    String nombrePapa=FuncionesPersona.nombreAleatorio(generoPapa);
    String apellidosPapa=apellidosYo;
    int sociabilidadPapa=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int empatiaPapa=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int inteligenciaPapa=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int velocidadPapa=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int fuerzaPapa=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int numeroAleatorio= FuncionesPersona.valorEstadisticaAleatorio();
    int edadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)20);
    
        if (sociabilidadMama > sociabilidadPapa){
            sociabilidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) sociabilidadPapa, (byte) sociabilidadMama);
    }else{
            sociabilidadMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte) sociabilidadMama, (byte) sociabilidadPapa);
        }
        if (empatiaMama > empatiaPapa){
            empatiaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) empatiaPapa, (byte) empatiaMama);
    }else{
            empatiaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte) empatiaMama, (byte) empatiaPapa);
        }
        if (velocidadMama > velocidadPapa){
            velocidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) velocidadPapa, (byte) velocidadMama);
    }else{
            velocidadMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte) velocidadMama, (byte) velocidadPapa);
        }
        
        if (fuerzaMama > fuerzaPapa){
            fuerzaMaxYo = FuncionesPersona.valorEstadisticaAleatorio((byte) fuerzaPapa, (byte) fuerzaMama);
    }else{
            fuerzaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte) fuerzaMama, (byte) fuerzaPapa);
        }
   
    boolean vivoYo = true, vivaMama, vivoPapa;
        String Hermano1= "", Hermano2 ="", Hermano3 = "";
        
        /* Variables Hermano1 */
        int edadHermano1 =0;
        boolean generoHermano1=false;
        String nombreHermano1 ="";
        String apellidosHermano1="";
        int sociabilidadMaxHermano1= 0;
        int empatiaMaxHermano1= 0;
        int inteligenciaMaxHermano1=0;
        int velocidadMaxHermano1=0;
        int fuerzaMaxHermano1=0;
        
        /*Variables Hermano 2 */
        int edadHermano2 =0;
        boolean generoHermano2=false;
        String nombreHermano2 ="";
        String apellidosHermano2="";
        int sociabilidadMaxHermano2= 0;
        int empatiaMaxHermano2= 0;
        int inteligenciaMaxHermano2=0;
        int velocidadMaxHermano2=0;
        int fuerzaMaxHermano2=0;
        
        /*Variables Hermano3 */
        int edadHermano3 =0;
        boolean generoHermano3=false;
        String nombreHermano3 ="";
        String apellidosHermano3="";
        int sociabilidadMaxHermano3= 0;
        int empatiaMaxHermano3= 0;
        int inteligenciaMaxHermano3=0;
        int velocidadMaxHermano3=0;
        int fuerzaMaxHermano3=0;
        
        int nHermanos = (byte) (new Random().nextInt(4));
        
        if (nHermanos > 0){
            generoHermano1=FuncionesPersona.generoAleatorio();
            nombreHermano1= FuncionesPersona.nombreAleatorio(generoHermano1);
            
        }
        
        FuncionesPersona.imprimePersona(nombreYo, apellidosYo, generoYo,(byte) sociabilidadMaxYo, (byte)empatiaMaxYo, (byte)inteligenciaMaxYo, (byte)velocidadMaxYo, (byte)fuerzaMaxYo, (byte)edadYo);
        FuncionesPersona.imprimePersona(nombreMama, apellidosMama, generoMama,(byte) sociabilidadMama,(byte) empatiaMama, (byte)inteligenciaMama,(byte) velocidadMama, (byte)fuerzaMama, (byte)edadMama);
        FuncionesPersona.imprimePersona(nombrePapa, apellidosPapa, generoPapa, (byte)sociabilidadPapa, (byte)empatiaPapa, (byte)inteligenciaPapa, (byte)velocidadPapa, (byte)fuerzaPapa, (byte)edadPapa);
        
        
      /* Aqui sacamos por pantalla a Mama, a Papa y Yo */  
    
    //Mama por pantalla
        System.out.println(nombreMama+" "+apellidosMama+"("+generoMama+")");
        System.out.println("Sociabilidad: "+sociabilidadMama+".");
        System.out.println("Empatía: "+empatiaMama+".");
        System.out.println("Inteligencia: "+inteligenciaMama+".");
        System.out.println("Velocidad: "+velocidadMama+".");
        System.out.println("Edad: "+edadMama);
        System.out.println("------------------------------------------------------");
    //Papa por pantalla
        System.out.println(nombrePapa+" "+apellidosPapa+"("+generoPapa+")");
        System.out.println("Sociabilidad: "+sociabilidadPapa+".");
        System.out.println("Empatía: "+empatiaPapa+".");
        System.out.println("Inteligencia: "+inteligenciaPapa+".");
        System.out.println("Velocidad: "+velocidadPapa+".");
        System.out.println("Edad: "+edadPapa+".");
        System.out.println("------------------------------------------------------");
    //Yo por pantalla
        System.out.println(nombreYo+" "+apellidosYo+"("+generoYo+")");
        System.out.println("Sociabilidad: "+sociabilidadMaxYo+".");
        System.out.println("Empatía: "+empatiaMaxYo+".");
        System.out.println("Inteligencia: "+inteligenciaMaxYo+".");
        System.out.println("Velocidad: "+velocidadMaxYo+".");
    }
       
}
