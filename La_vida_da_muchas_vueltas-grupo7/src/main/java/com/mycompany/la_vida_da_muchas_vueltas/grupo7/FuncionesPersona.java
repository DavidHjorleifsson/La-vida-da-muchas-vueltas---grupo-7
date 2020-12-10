/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.la_vida_da_muchas_vueltas.grupo7;

import java.util.Random;

/**
 * Clase principal,contiene el main donde se generan variables.
 * 
 * @author David Hjorleifsson 
 * @author Daniel Cabello
 * @author Jesús Guirao
 * @version 1.0
 * @since 0.2
 */
public class FuncionesPersona {
    /**
     *Programa en el cual creamos estadísticas aleatorias de una persona también de sus padres y de sus hermanos,
     * generamos un nombre aleatorio según el género que sea.
     */
    public static Boolean generoAleatorio(){           
        Random alG= new Random();
        String generoYo=alG.nextBoolean()?"Hombre":"Mujer";
        return alG.nextBoolean();
    }
    
    public static String nombreAleatorio(Boolean generoYo){       
        String res="";
        if(generoYo.equals("Hombre")){
            String nombreYo[]={"MatÃ­as","Luis","Manolo","Paco","Jose","David","Pablo","NÃ©stor","Pepe","Antonio","Francisco"};
            res+=("Nombre: "+nombreYo);
            return nombreYo[new Random().nextInt(nombreYo.length)];
        }else{
            String nombreYo[]={"Marta","Lola","Ana","Rosa","Angustias","Laura","Sara"};
            res+=("Nombre: "+nombreYo);
            return nombreYo[new Random().nextInt(nombreYo.length)];
        }   
        
    }
    public static String apellidosAleatorio(){
        String res="";
        String apellidos[]={"RodrÃ­guez","Poveda","MartÃ­n","GÃ³mez","Monedero","Aguilar","Luque","De Grado"};
        String apellidos2[]={"Fernández","Diaz","Moreno","Torres","Ortega","Suarez","Cortes","Cano"};
        res+=(" "+apellidos+" "+apellidos2);
        return apellidos[new Random().nextInt(apellidos.length)];
    }
    public static int valorEstadisticaAleatorio(){
    
    Random aleatorio = new Random();
    int numeroAleatorio=aleatorio.nextInt((101-0));
    
    return numeroAleatorio; 
    }
    
     public static int valorEstadisticaAleatorio(int min){
   
    Random aleatorio = new Random();
    int numeroAleatorio=aleatorio.nextInt((101-min)+min);
    
    return numeroAleatorio; 
    }
     public static int valorEstadisticaAleatorio(int min, int max){
   
    Random aleatorio = new Random();
    int numeroAleatorio=aleatorio.nextInt(max-min)+min;
    
    return numeroAleatorio; 
    }
     public static String imprimePersona(String nombre, String apellidos, boolean genero, byte sociabilidad, byte empatia, byte inteligencia, byte velocidad, byte fuerza){
     
     }

}

