/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbc.persistencia;

import com.mycompany.jdbc.entidades.producto;
import java.sql.Statement;

/**
 *
 * @author Ulises
 */
public final class ProductosDAO extends DAO{
    
    
    public void guardarProducto(producto Producto) throws Exception{
    
        try {
            
            if (Producto == null) {
                throw new Exception("ERROR, ingrese un producto valido");
            }
            
            String sql = "INSERT INTO producto(codigo, nombre, precio, codigo_fabricante) VALUES ("+ Producto.getCodigo()+", '"+Producto.getNombre()+"' , "+Producto.getPrecio()+", "+Producto.getCodigo_fabricante()+" )";                      
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    
    }
    
   public void modificarProducto(producto Producto) throws Exception{
    
        try {
            
            if (Producto==null) {
                throw new Exception("ERROR, ingrese un fabricante valido a modificar");
            }
            
            String sql = "UPDATE producto SET nombre= '"+Producto.getNombre()+"', precio= '"+Producto.getPrecio()+"', codigo_fabricante= '"+Producto.getCodigo_fabricante()+"' WHERE codigo = '"+Producto.getCodigo()+"' ";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            
            throw e;
            
        }
    
    }
   
       public void eliminarProducto(String nombre) throws Exception{
    
        try {
            
            String sql="DELETE FROM producto WHERE nombre ='"+nombre+"';";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    
    }
       
    public producto buscarProducto(String nombre) throws Exception{
    
        try {
            
            String sql ="SELECT * FROM producto "
                            + "WHERE nombre = '"+nombre+"'";
            
            consultarBase(sql);
            
            producto Producto = null;
            
            while (resultado.next()) {                
                
                System.out.println(" | "+resultado.getInt(1)+" | "+resultado.getString(2)+" | "+resultado.getDouble(3)+" | "+resultado.getInt(4));

            }
            
            desconectarBase();
            
            return Producto;
            
        } catch (Exception e) {
            System.out.println("ERROR!!!");
            desconectarBase();
            throw e;
 
        }
    
    }
    
    public void listarProducto() throws Exception{
    
        try {
            
            conectarBase();
            
            Statement sentencia = conexion.createStatement();
            resultado= sentencia.executeQuery("SELECT * FROM producto");
            
            System.out.println("-_-_-_-_-LISTA DE PRODUCTOS-_-_-_-_-_-");
            while (resultado.next()) {                
                System.out.println(" | "+resultado.getInt(1)+" | "+resultado.getString(2)+" | "+resultado.getDouble(3)+" | "+resultado.getInt(4));
            }
            
            desconectarBase();
            
        } catch (Exception e) {
            desconectarBase();
            throw e;
            
        }
    
    }
    
    public void listarNomPrecio() throws Exception{
    
        try {
            
            conectarBase();
            
            Statement sentencia = conexion.createStatement();
            resultado= sentencia.executeQuery("SELECT * FROM producto");
            
            System.out.println("-_-_-_-_-LISTA DE PRODUCTOS-_-_-_-_-_-");
            System.out.println("Nombre <-------------------> Precio");
            while (resultado.next()) {                
                System.out.println(" | "+resultado.getString(2)+" | "+resultado.getDouble(3));
            }
            
            desconectarBase();
            
        } catch (Exception e) {
        
            desconectarBase();
            throw e;
        
        }
    
    }
    
    public void ordenPrecio() throws Exception{
    
        try {
            
            conectarBase();
            
            Statement sentencia = conexion.createStatement();
            resultado= sentencia.executeQuery("SELECT * FROM producto WHERE precio>119 AND precio<203");
            
            System.out.println("-_-_-_-_-LISTA DE PRODUCTOS-_-_-_-_-_-");
            while (resultado.next()) {                
                  System.out.println(" | "+resultado.getInt(1)+" | "+resultado.getString(2)+" | "+resultado.getDouble(3)+" | "+resultado.getInt(4));
            }
            
            desconectarBase();
            
        } catch (Exception e) {
        
            desconectarBase();
            throw e;
            
        }
    
    }
    
    public void listarPortatiles() throws Exception{
    
            try {
            
            conectarBase();
            
            Statement sentencia = conexion.createStatement();
            resultado= sentencia.executeQuery(" SELECT * FROM producto WHERE nombre LIKE 'Portátil%' ");
            
            System.out.println("-_-_-_-_-LISTA DE PRODUCTOS-_-_-_-_-_-");
            while (resultado.next()) {                
                  System.out.println(" | "+resultado.getInt(1)+" | "+resultado.getString(2)+" | "+resultado.getDouble(3)+" | "+resultado.getInt(4));
            }
            
            desconectarBase();
            
        } catch (Exception e) {
        
            desconectarBase();
            throw e;
            
        }
    
    }
    
        public void productoBarato() throws Exception{
    
            try {
            
            conectarBase();
            
            Statement sentencia = conexion.createStatement();
            resultado= sentencia.executeQuery("SELECT nombre, precio FROM producto WHERE precio=(SELECT MIN(precio) FROM producto)  ");
            
            System.out.println("-_-_-_-_-LISTA DE PRODUCTOS-_-_-_-_-_-");
            while (resultado.next()) {                
                  System.out.println(" | "+resultado.getString("nombre")+" | "+resultado.getDouble("precio"));
            }
            
            desconectarBase();
            
        } catch (Exception e) {
        
            desconectarBase();
            throw e;
            
        }
    
    }
}
