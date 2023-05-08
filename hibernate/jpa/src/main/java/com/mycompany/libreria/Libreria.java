 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.libreria;

import com.mycompany.CRUD.Menu;
import com.mycompany.CRUD.ServicioAutor;
import com.mycompany.CRUD.ServicioEditorial;
import com.mycompany.entidades.Autor;
import com.mycompany.entidades.Editorial;

/**
 *
 * @author Ulises
 */
public class Libreria {

    public static void main(String[] args) {
        Menu menu = new Menu();

        try {
                menu.menu();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
