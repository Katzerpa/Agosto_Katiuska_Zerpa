package PracticaClasesyObjetos_E03;

public class Libro {
    //Atributos
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPagina;

    //Constructores

    public Libro(){
        isbn = 1234;
        titulo= "Sin Titulo";
        autor = "Santiago Pino ";
        numeroPagina=123;
    }

    public Libro(int isbn,String titulo,String autor,int numeroPagina){
        this.isbn = isbn;
        this.titulo= titulo;
        this.autor = autor;
        this.numeroPagina= numeroPagina;
    }

    //Metodos

    public int getIsbn(){

        return this.isbn ;
    }

    public void setIsbn(int unIsbn) {
        this.isbn = unIsbn;
    }
    public String getTitulo(){

        return this.titulo;
    }

    public void setTitulo(String unTitulo) {

        this.titulo = unTitulo;
    }

    public String getAutor() {

        return autor;
    }

    public void setAutor(String unAutor) {
        this.autor = unAutor;
    }

    public int getNumeroPagina() {

        return numeroPagina;
    }

    public void setNumeroPagina(int unNumeroPagina) {

        this.numeroPagina = unNumeroPagina;
    }

    public boolean elAutorEstaEnNull(){
        if (this.autor == null || this.autor.length()==0 || this.autor.equalsIgnoreCase("")) {
            return true;
        }
        else{
            return false;
        }
    }

    public String toString() {
       String  retorno = "El libro con ISBN " + this.isbn + "  Titulo  " + this.titulo +
                " tiene  " +  this.numeroPagina + " paginas ";
       if (elAutorEstaEnNull()){

           retorno += "  Autor Desconocido";
       }
       else {
           retorno += " Autor : "  + this.autor;
       }
       return retorno;

    }
}
