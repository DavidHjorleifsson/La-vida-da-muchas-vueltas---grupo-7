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
    int empatiaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)5);
    int inteligenciaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int sociabilidadYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int velocidadYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int fuerzaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)0, (byte)6);
    int sociabilidadMaxYo;
    int empatiaMaxYo;
    int inteligenciaMaxYo;
    int velocidadMaxYo;
    int fuerzaMaxYo;
    int edadYo;
//Mama

    String nombreMama=FuncionesPersona.nombreAleatorio(generoMama);
    String apellidosMamaYo=FuncionesPersona.apellidosAleatorio() + " " + FuncionesPersona.apellidosAleatorio();
    boolean generoMamaYo=FuncionesPersona.generoAleatorio();
    int empatiaMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int inteligenciaMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int velocidadMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int fuerzaMamaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int sociabilidadMama=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int edadMama=FuncionesPersona.valorEstadisticaAletorio((byte)30);
    //papa
    String nombrePapaYo=FuncionesPersona.nombreAleatorio(generoPapa);
    String apellidosPapaYo=FuncionesPersona.apellidosAleatorio() + " " + FuncionesPersona.apellidosAleatorio();
    boolean generoPapaYo=FuncionesPersona.generoAleatorio();
    int sociabilidadPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int empatiaPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int inteligenciaPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int velocidadPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int fuerzaPapaYo=FuncionesPersona.valorEstadisticaAleatorio((byte)50);
    int numeroAleatorio= FuncionesPersona.valorEstadisticaAleatorio();
    int edadPapa = FuncionesPersona.valorEstadisticaAleatorio((byte)30);
    
        System.out.println(nombreYo+" "+apellidosYo+"("+generoYo+")");
    }
       
}
