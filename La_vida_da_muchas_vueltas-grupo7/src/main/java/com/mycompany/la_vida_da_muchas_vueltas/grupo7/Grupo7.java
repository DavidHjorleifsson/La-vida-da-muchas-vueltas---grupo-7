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
        int numeroAleatorio= FuncionesPersona.valorEstadisticaAleatorio();
        System.out.println(generoYo);
        System.out.println(nombreYo);
        System.out.println(apellidosYo);
        System.out.println(FuncionesPersona.apellidosAleatorio());
    }
       
}
