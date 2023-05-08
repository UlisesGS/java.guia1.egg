package Entidades;

/**
 *
 * @author Ulises
 */
public class NifEnt {
    private long DNI;
    private String NIF;

    public NifEnt() {
    }

    public NifEnt(long DNI, String NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
}
