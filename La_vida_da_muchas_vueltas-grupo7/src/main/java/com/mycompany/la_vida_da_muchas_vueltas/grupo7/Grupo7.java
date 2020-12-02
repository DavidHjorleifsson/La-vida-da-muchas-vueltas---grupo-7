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
  
    public static void generoAleatorio(){        
        Random alG= new Random();
        String generoYo=alG.nextBoolean()?"Hombre":"Mujer";
    }
    
    public static void nombreAleatorio(){       
        Random alG= new Random();
        String generoYo=alG.nextBoolean()?"Hombre":"Mujer";
        
        if(generoYo.equals("Hombre")){
            String nombreYo[]={"MatÃ­as","Luis","Manolo","Paco","Jose","David","Pablo","NÃ©stor","Pepe","Antonio","Francisco"};
            System.out.println("Nombre: "+nombreYo);
        }else{
            String nombreYo[]={"Marta","Lola","Ana","Rosa","Angustias","Laura","Sara"};
            System.out.println("Nombre: "+nombreYo);
        }   
    }
    public static void apellidosAleatorio(){
        String apellidosYo[]={"RodrÃ­guez","Poveda","MartÃ­n","GÃ³mez","Monedero","Aguilar","Luque","De Grado"};
        String apellidosYo2[]={"Fernández","Diaz","Moreno","Torres","Ortega","Suarez","Cortes","Cano"};
        System.out.print(" "+apellidosYo+" "+apellidosYo2);
    }
    public static void main(String[] args) {       
        nombreAleatorio();
        apellidosAleatorio();
    }
    
    
    
}
