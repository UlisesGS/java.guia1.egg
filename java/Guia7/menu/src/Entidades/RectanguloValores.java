package Entidades;

/**
 *
 * @author Ulises
 */
public class RectanguloValores {
    
    private int base;
    private int altura;

    public RectanguloValores() {
    }

    public RectanguloValores(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "RectanguloValores{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
    
    
}
