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
        boolean generoYo= FuncionesPersona.generoAleatorio();
    
    String nombreYo= FuncionesPersona.nombreAleatorio(generoYo);
    String apellidosYo= FuncionesPersona.apellidosAleatorio();
    int empatiaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)5);
    int inteligenciaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int sociabilidadYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int velocidadMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int fuerzaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
//Mama

    String nombreMamaYo=FuncionesPersona.nombreAleatorio(generoMama);
    String apellidosMamaYo=apellidosYo;
    int empatiaMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int inteligenciaMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int velocidadMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int fuerzaMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int sociabilidadMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int edadMama=FuncionesPersona.valorEstadisticaAleatorio((byte)30);
    //papa
    String nombrePapaYo=FuncionesPersona.nombreAleatorio(generoPapa);
    String apellidosPapaYo=apellidosYo;
    int sociabilidadPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int empatiaPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int inteligenciaPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int velocidadPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int fuerzaPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int numeroAleatorio= FuncionesPersona.valorEstadisticaAleatorio();
    int edadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)20);
    
        if (sociabilidadMama > sociabilidadPapa){
        sociabilidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio=((byte) sociabilidadPapa, (byte) sociabilidadMama);
    }else{
            sociabilidadMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte) sociabilidadMama, (byte) sociabilidadPapa);
        }
        if (empatiaMama > empatiaPapa){
        empatiaMaxYo = FuncionesPersona.valorEstadisticaAleatorio=((byte) empatiaPapa, (byte) empatiaMama);
    }else{
            empatiaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte) empatiaMama, (byte) empatiaPapa);
        }
        if (velocidadMama > velocidadPapa){
        velocidadMaxYo = FuncionesPersona.valorEstadisticaAleatorio=((byte) velocidadPapa, (byte) velocidadMama);
    }else{
            velocidadMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte) velocidadMama, (byte) velocidadPapa);
        }
        
        if (fuerzaMama > fuerzaPapa){
        fuerzaMaxYo = FuncionesPersona.valorEstadisticaAleatorio=((byte) fuerzaPapa, (byte) fuerzaMama);
    }else{
            fuerzaMaxYo=FuncionesPersona.valorEstadisticaAleatorio((byte) fuerzaMama, (byte) fuerzaPapa);
        }
        
        boolean vivoYo = true, vivaMama, vivoPapa;
        String Hermano1= "", Hermano2 ="", Hermano3 = "";
        
        // Variables Hermano1
        int edadHermano1 =0;
        boolean generoHermano1=false;
        String nombreHermano1 ="";
        String apellidosHermano1="";
        int sociabilidadMaxHermano1= 0;
        int empatiaMaxHermano1= 0;
        int inteligenciaMaxHermano1=0;
        int velocidadMaxHermano1=0;
        int fuerzaMaxHermano1=0;
        //Variables Hermano 2
        int edadHermano2 =0;
        boolean generoHermano2=false;
        String nombreHermano2 ="";
        String apellidosHermano2="";
        int sociabilidadMaxHermano2= 0;
        int empatiaMaxHermano2= 0;
        int inteligenciaMaxHermano2=0;
        int velocidadMaxHermano2=0;
        int fuerzaMaxHermano2=0;
        //Variables Hermano3
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
        
        
        
        
    
    //Mama por pantalla
        System.out.println(nombreMamaYo+" "+apellidosMamaYo+"("+generoMama+")");
        System.out.println("Sociabilidad: "+sociabilidadMamaYo+".");
        System.out.println("Empatía: "+empatiaMamaYo+".");
        System.out.println("Inteligencia: "+inteligenciaMamaYo+".");
        System.out.println("Velocidad: "+velocidadMamaYo+".");
        System.out.println("Edad: "+edadMama);
        System.out.println("------------------------------------------------------");
    //Papa por pantalla
        System.out.println(nombrePapaYo+" "+apellidosPapaYo+"("+generoPapa+")");
        System.out.println("Sociabilidad: "+sociabilidadPapaYo+".");
        System.out.println("Empatía: "+empatiaPapaYo+".");
        System.out.println("Inteligencia: "+inteligenciaPapaYo+".");
        System.out.println("Velocidad: "+velocidadPapaYo+".");
        System.out.println("Edad: "+edadPapa+".");
        System.out.println("------------------------------------------------------");
    //Yo por pantalla
        System.out.println(nombreYo+" "+apellidosYo+"("+generoYo+")");
        System.out.println("Sociabilidad: "+sociabilidadYo+".");
        System.out.println("Empatía: "+empatiaMaxYo+".");
        System.out.println("Inteligencia: "+inteligenciaMaxYo+".");
        System.out.println("Velocidad: "+velocidadMaxYo+".");
    }
       
}
