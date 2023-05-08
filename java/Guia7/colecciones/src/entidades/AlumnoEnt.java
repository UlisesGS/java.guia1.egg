/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ulises
 */
public class AlumnoEnt {
    private String alumno;
    private ArrayList<Integer> notas ;

    public AlumnoEnt() {
    }

    public AlumnoEnt(String alumno, ArrayList<Integer> notas) {
        this.alumno = alumno;
        this.notas = notas;
    }

    public String getAlumno() {
        return alumno;
    }

    public void setAlumno(String alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Integer> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<Integer> notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "AlumnoEnt{" + "alumno=" + alumno + ", notas=" + notas + '}';
    }
    
    
}
