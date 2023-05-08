package Entidades;


public class Bancaria {
    
    private int numerocuenta;
    private long dni;
    private int saldoactual;

    public Bancaria() {
    }

    public Bancaria(int numerocuenta, long dni, int saldoactual) {
        this.numerocuenta = numerocuenta;
        this.dni = dni;
        this.saldoactual = saldoactual;
    }

    public int getNumerocuenta() {
        return numerocuenta;
    }

    public void setNumerocuenta(int numerocuenta) {
        this.numerocuenta = numerocuenta;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public int getSaldoactual() {
        return saldoactual;
    }

    public void setSaldoactual(int saldoactual) {
        this.saldoactual = saldoactual;
    }

    @Override
    public String toString() {
        return "BancariaServ{" + "numerocuenta=" + numerocuenta + ", dni=" + dni + ", saldoactual=" + saldoactual + '}';
    }
    
    
}
