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
     * Aqu
     */
    public static Boolean generoAleatorio(){           
        Random alG= new Random();
        return alG.nextBoolean();
    }
    /* Generamos nombre aleatorio conforme a los nombres que tenemos*/
    public static String nombreAleatorio(Boolean generoYo){       
        String res="";
        if(generoYo){
            String nombreYo[]={"MatÃ­as","Luis","Manolo","Paco","Jose","David","Pablo","NÃ©stor","Pepe","Antonio","Francisco","Eustaquio",
                               "Mariano","Antón","Claudio","Koldo","Patricio","Ignacio", "Oscar", "Alex", "Juan", "Lander", "Agustin", "Cesar", "Natxo", 
                               "Nacho", "Javier", "Jorge", "Pablo", "Guillermo","Abel","Dario","Leandro","Amador","Felix",};
            res+=("Nombre: "+nombreYo);
            return nombreYo[new Random().nextInt(nombreYo.length)];
        }else{
            String nombreYo[]={"Paca", "Presentación", "Sarai", "Antonia", "Loli", "Juani", "Olga", "Susana", "Ruth", "Eustaquia",
                "Godofreda", "Josefina", "Ermerigilda", "Úrsula", "Angie", "Carla", "Isabel", "Marta", "Dolores", "Sonia", "Raquel", "Esther",
                "Erika", "Patrocinio", "Luisa", "Natalia", "Almudena", "Laura", "Kassandra", "Violeta", "María", "Mery", "Susana", "Daniela",
                "Juana", "Rebeca", "Eustaquia", "Herminia", "Sandra", "Lorena", "Maria", "Paula", "Ainhoa", "Mar", "Manoli", "Julia", "Rocio"};
            res+=("Nombre: "+nombreYo);
            return nombreYo[new Random().nextInt(nombreYo.length)];
        }   
        
    }
    /**
     *Se le asigna a las estadisticas de cada persona un apellido aleatorio dentro de los que tenemos aquí
     */
    public static String apellidosAleatorio(){
        String apellidos[]={"Fernández", "De todos los santos", "Heredia", "Aguirre", "Del Piero", "Trump", "Obama", "Rajoy", "Pérez", "Reverte",
                            "Rojas", "Muñoz", "de la Rosa", "de la O", "Guiérrez", "Molina", "López", "Romero", "Franco", "Martínez", "Fernández","Ruiz", "Machís",
                            "Duarte", "Díaz", "Vico", "Montoro"};
        
        return apellidos[new Random().nextInt(apellidos.length)]+" "+apellidos[new Random().nextInt(apellidos.length)];
    }
    /**
     *Creamos números aleatorios a la hora de generar las estadísticas de las personas
     * De esta manera las estadísticas no serán iguales y si lo son es por casualidad
     */
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
     public static String imprimePersona(String nombre, String apellidos, boolean genero, byte sociabilidad, byte empatia, byte inteligencia, byte velocidad, byte fuerza,byte edad){
         String res="";
         res+=(nombre+" "+apellidos+"("+genero+")");
         res+=("Sociabilidad: "+sociabilidad+".");
         res+=("Empatía: "+empatia+".");
         res+=("Inteligencia: "+inteligencia+".");
         res+=("Velocidad: "+velocidad+".");
         res+=("Fuerza: "+fuerza+".");
         res+=("Edad: "+edad+".");
         res+=("---------------------------------------------------");
         return res;
     }

}

