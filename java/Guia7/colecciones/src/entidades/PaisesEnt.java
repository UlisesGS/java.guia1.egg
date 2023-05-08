/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Ulises
 */
public class PaisesEnt {
    
    private String pais;

    public PaisesEnt() {
    }

    public PaisesEnt(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.pais);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PaisesEnt other = (PaisesEnt) obj;
        return Objects.equals(this.pais, other.pais);
    }

    @Override
    public String toString() {
        return "PaisesEnt{" + "pais=" + pais + '}';
    }
    
    
    
}
