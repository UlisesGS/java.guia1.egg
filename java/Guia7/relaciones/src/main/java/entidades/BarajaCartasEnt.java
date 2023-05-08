package entidades;

/**
 *
 * @author Ulises
 */
public class BarajaCartasEnt {
    
    private String carta;
    private Integer numero;

    public BarajaCartasEnt() {
    }

    public BarajaCartasEnt(Integer numero, String carta) {
        this.carta = carta;
        this.numero = numero;
    }

    public String getCarta() {
        return carta;
    }

    public void setCarta(String carta) {
        this.carta = carta;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "BarajaCartasEnt{" + "carta=" + carta + ", numero=" + numero + '}';
    }

  
}
