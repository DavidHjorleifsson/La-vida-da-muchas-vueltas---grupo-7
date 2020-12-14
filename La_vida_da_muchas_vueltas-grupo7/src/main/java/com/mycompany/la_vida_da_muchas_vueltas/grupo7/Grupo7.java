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
    int edadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)30);
    
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
