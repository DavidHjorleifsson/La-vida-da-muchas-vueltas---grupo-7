/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.la_vida_da_muchas_vueltas.grupo7;

import java.util.Random;

/**
 *
 * @author 2904d
 */
public class Grupo7 {
    public static void main(String[] args) {       
    String generoYo= FuncionesPersona.generoAleatorio();
    String nombreYo= FuncionesPersona.nombreAleatorio();
    String apellidosYo= FuncionesPersona.apellidosAleatorio();
        System.out.println(generoYo);
        System.out.println(nombreYo);
        System.out.println(apellidosYo);
    }
       
}
