package Entidades;

/**
 *ISBN, Título, Autor,
    Número de páginas,
 * @author Ulises
 */
public class LibrosPaginas {
        
    //ATRIBUTOS
    public int codigo;
    public String titulo;
    public String autor;
    public int cantPaginas;
    
        
    //CONSTRUCTORES

    public LibrosPaginas() {
    }

    public LibrosPaginas(int codigo, String titulo, String autor, int cantPaginas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.cantPaginas = cantPaginas;
    }
        
     
    //get y set

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    @Override
    public String toString() {
        return "LibrosPaginas{" + "codigo=" + codigo + ", titulo=" + titulo + ", autor=" + autor + ", cantPaginas=" + cantPaginas + '}';
    }

}
