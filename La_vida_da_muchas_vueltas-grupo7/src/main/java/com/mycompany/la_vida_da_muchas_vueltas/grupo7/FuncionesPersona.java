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
        String generoYo=alG.nextBoolean()?"Hombre":"Mujer";
        return alG.nextBoolean();
    }
    
    public static String nombreAleatorio(boolean generoYo){       
        String res="";
        if(generoYo==true){
            String nombreYo[]={"MatÃ­as","Luis","Manolo","Paco","Jose","David","Pablo","NÃ©stor","Pepe","Antonio","Francisco"};
            res+=("Nombre: "+nombreYo);
        }else{
            String nombreYo[]={"Marta","Lola","Ana","Rosa","Angustias","Laura","Sara"};
            res+=("Nombre: "+nombreYo);
        }   
        return nombreYo[(int)nombreYo(alG.nextInt)];
    }
    public static String apellidosAleatorio(){
        String res="";
        String apellidosYo[]={"RodrÃ­guez","Poveda","MartÃ­n","GÃ³mez","Monedero","Aguilar","Luque","De Grado"};
        res+=("Apellido: "+apellidosYo);
        return res;
    }
}
