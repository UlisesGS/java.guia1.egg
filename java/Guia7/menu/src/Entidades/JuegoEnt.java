package Entidades;

/*un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad
jugadas máximas que puede realizar el usuario.*/
public class JuegoEnt {
    private String [] palabraBuscada;
    private int letrasEncontradas;
    private int maximoDeJugadas;
    private String abecedario = "a b c d e f g h i j k l m n ñ o p q r s t u v w x y z";
    private  String [] muñeco = {" ||", " | ", " \"" , " / ", "O"};
    private String [] lineas;

    public JuegoEnt() {
    }

    public JuegoEnt(String[] palabraBuscada, int letrasEncontradas, int maximoDeJugadas, String[] lineas) {
        this.palabraBuscada = palabraBuscada;
        this.letrasEncontradas = letrasEncontradas;
        this.maximoDeJugadas = maximoDeJugadas;
        this.lineas = lineas;
    }

    

    public String[] getPalabraBuscada() {
        return palabraBuscada;
    }

    public void setPalabraBuscada(String[] palabraBuscada) {
        this.palabraBuscada = palabraBuscada;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getMaximoDeJugadas() {
        return maximoDeJugadas;
    }

    public void setMaximoDeJugadas(int maximoDeJugadas) {
        this.maximoDeJugadas = maximoDeJugadas;
    }

    public String getAbecedario() {
        return abecedario;
    }

    public void setAbecedario(String abecedario) {
        this.abecedario = abecedario;
    }

    public String[] getMuñeco() {
        return muñeco;
    }

    public void setMuñeco(String[] muñeco) {
        this.muñeco = muñeco;
    }

    public String[] getLineas() {
        return lineas;
    }

    public void setLineas(String[] lineas) {
        this.lineas = lineas;
    }

  
    
}
