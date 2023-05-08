/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jdbc.persistencia;

import com.mycompany.jdbc.entidades.fabricante;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Ulises
 */
public final class FabricanteDAO extends DAO{
    
    public void guardarFabricante(fabricante Fabricante) throws Exception{
    
        try {
            
            if (Fabricante==null) {
                throw new Exception("ERROR, ingrese un fabricante valido");
            }else{
            
            
            String sql = "INSERT INTO fabricante(codigo, nombre) VALUES( "+Fabricante.getCodigo()+ " , ' "+Fabricante.getNombre()+" ');";
            
            insertarModificarEliminar(sql);
            
            System.out.println(Fabricante.getCodigo() +"  "+ Fabricante.getNombre());
            }
        } catch (Exception e) {
            
            throw e;
            
        }
        
    }
    
    public void modificarFabricante(fabricante Fabricante) throws Exception{
    
        try {
            
            if (Fabricante==null) {
                throw new Exception("ERROR, ingrese un fabricante valido a modificar");
            }
            
            String sql = "UPDATE fabricante SET nombre= '"+Fabricante.getNombre()+"' WHERE codigo = '"+Fabricante.getCodigo()+"' ; ";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            
            throw e;
            
        }
    
    }
    
    public void eliminarFabricante(String nombre) throws Exception{
    
        try {
            
            String sql="DELETE FROM fabricante WHERE nombre =' "+nombre+" ';";
            
            insertarModificarEliminar(sql);
            
        } catch (Exception e) {
            throw e;
        }
    
    }
    
    public fabricante buscarFabricante(String nombre) throws Exception{
    
        try {

            String sql ="SELECT * FROM fabricante "
                            + "WHERE nombre = '"+nombre+"'";
            
             consultarBase(sql);

            fabricante Fabricante = null;

            while (resultado.next()) {     
                
                System.out.println(" | "+resultado.getInt(1)+" | "+resultado.getString(2));
                Fabricante.setCodigo(resultado.getInt(1));
                Fabricante.setNombre(resultado.getString(2));
            }
            
            desconectarBase();
            
            return Fabricante;
            
        } catch (Exception e) {
        
            desconectarBase();
            throw e;
 
        }
    
    }
    
    //PARA AGREGAR MAS DE UN FABRICANTE
        public Collection<fabricante> listaFabricantes() throws Exception{
    
        try {
            
            String sql ="SELECT codigo, nombre FROM fabricante ;";
            
            consultarBase(sql);
            
            fabricante Fabricante = null;
            
            Collection<fabricante> Fabricantes = new ArrayList();
            
            while (resultado.next()) {                
                
                Fabricante = new fabricante();
                Fabricante.setCodigo(resultado.getInt(1));
                Fabricante.setNombre(resultado.getString(2));
                Fabricantes.add(Fabricante);
            }
            
            desconectarBase();
            
            return Fabricantes;
            
        } catch (Exception e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("ERROR en el sistema");
 
        }
    
    }
        
    public void listarFabricante(){
    
        try {
            
            conectarBase();
            
            Statement sentencia = conexion.createStatement();
            resultado= sentencia.executeQuery("SELECT * FROM fabricante");
            
            System.out.println("Lista de Fabricantes");
            while (resultado.next()) {                
                System.out.println(" | "+resultado.getInt(1)+" | "+resultado.getString(2));
            }
            
        } catch (Exception e) {
            System.out.println("Error!!!");
        }
        
    }
    
}
