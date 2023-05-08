/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.jdbc;

import com.mycompany.jdbc.servicio.Servicios;

/**
 *
 * @author Ulises
 */
public class Jdbc {

    public static void main(String[] args) throws Exception {

        Servicios valorF = new Servicios();
        
        try {
            valorF.menu();
            
        }catch (Exception e) {
            throw e;
            
        }
        

    }
}
