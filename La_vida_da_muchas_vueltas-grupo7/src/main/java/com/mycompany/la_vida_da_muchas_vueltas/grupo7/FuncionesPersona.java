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
public class FuncionesPersona {
    
    public static Boolean generoAleatorio(){           
        Random alG= new Random();
        boolean resultado;
        String rt = ("");
        Boolean [] generos={true,false};
        int generoRandom = alG.nextInt(2);
        boolean generoAleatorio = (generos[generoRandom]);
        
                return generoAleatorio;
    }
    
    public static String nombreAleatorio(String generoYo){       
        String res="";
        if(generoYo.equals("Hombre")){
            String nombreYo[]={"MatÃ­as","Luis","Manolo","Paco","Jose","David","Pablo","NÃ©stor","Pepe","Antonio","Francisco"};
            res+=("Nombre: "+nombreYo);
        }else{
            String nombreYo[]={"Marta","Lola","Ana","Rosa","Angustias","Laura","Sara"};
            res+=("Nombre: "+nombreYo);
        }   
        return res;
    }
    public static String apellidosAleatorio(){
        String res="";
        String apellidos[]={"RodrÃ­guez","Poveda","MartÃ­n","GÃ³mez","Monedero","Aguilar","Luque","De Grado"};
        String apellidos2[]={"Fernández","Diaz","Moreno","Torres","Ortega","Suarez","Cortes","Cano"};
        res+=(" "+apellidos+" "+apellidos2);
        return res;
    }
}
