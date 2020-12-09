/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.la_vida_da_muchas_vueltas.grupo7;

import java.util.Random;


public class Grupo7 {
    public static void main(String[] args) {       
    boolean generoYo= FuncionesPersona.generoAleatorio();
    String nombreYo= FuncionesPersona.nombreAleatorio(generoYo);
    String apellidosYo= FuncionesPersona.apellidosAleatorio();
    int sociabilidadMaxYo=FuncionesPersona.imprimePersona();
    int empatiaMaxYo=FuncionesPersona.imprimePersona();
    int inteligenciaMaxYo=FuncionesPersona.imprimePersona();
    int velocidadMaxYo=FuncionesPersona.imprimePersona();
    int fuerzaMaxYo=FuncionesPersona.imprimePersona();
    String nombreMamaYo=FuncionesPersona.imprimePersona();
    String apellidosMamaYo=FuncionesPersona.imprimePersona();
    boolean generoMamaYo=FuncionesPersona.generoAleatorio();
    int sociabilidadMamaYo=;
    int empatiaMamaYo=;
    int inteligenciaMamaYo=;
    int velocidadMamaYo=;
    int fuerzaMamaYo=;
    String nombrePapaYo=FuncionesPersona.imprimePersona();
    String apellidosPapaYo=FuncionesPersona.imprimePersona();
    boolean generoPapaYo=FuncionesPersona.generoAleatorio();
    int sociabilidadPapaYo=;
    int empatiaPapaYo=;
    int inteligenciaPapaYo=;
    int velocidadPapaYo=;
    int fuerzaPapaYo=;
    int numeroAleatorio= FuncionesPersona.valorEstadisticaAleatorio();
    
        System.out.println(nombreYo+" "+apellidosYo+"("+generoYo+")");
    }
       
}
