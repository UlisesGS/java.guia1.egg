/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Ulises
 */
public class VotarVotoEnt {
    
    private VotarAlumnoEnt alumno;
    private ArrayList<VotarAlumnoEnt> listaAlumnos;

    public VotarVotoEnt() {
    }

    public VotarVotoEnt(VotarAlumnoEnt alumno, ArrayList<VotarAlumnoEnt> listaAlumnos) {
        this.alumno = alumno;
        this.listaAlumnos = listaAlumnos;
    }

    public VotarAlumnoEnt getAlumno() {
        return alumno;
    }

    public void setAlumno(VotarAlumnoEnt alumno) {
        this.alumno = alumno;
    }

    public ArrayList<VotarAlumnoEnt> getListaAlumnos() {
        return listaAlumnos;
    }

    public void setListaAlumnos(ArrayList<VotarAlumnoEnt> listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    @Override
    public String toString() {
        return "VotarVotoEnt{" + "alumno=" + alumno + ", listaAlumnos=" + listaAlumnos +"\n"+ '}';
    }

    

    

  
    
    
}
