/*
1. Classe Livro

Atributos:

- String titulo
- String autor
- String ISBN
- int numeroPaginas
- double preco

Construtores:

- Construtor padrão
- Construtor com todos os atributos
- Construtor com titulo e autor

Métodos:

- Getters e Setters para todos os atributos
- public void aplicarDesconto(double percentual)
- public String getDescricao()
- public boolean estaDentroOrcamento(double preco)
*/
import java.util.*;
public class Livro {

    private String titulo;
    private String autor;
    private String ISBN;
    private int numeroPaginas;
    private double preco;

    public Livro(){
        this.setTitulo("");
        this.setAutor("");
        this.setISBN("978858365127-7");
        this.setNumeroPaginas(0);
        this.setPreco(0.0);
    }
   public Livro(String titulo, String autor, String ISBN, int numeroPaginas, double preco){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setISBN(ISBN);
        this.setNumeroPaginas(numeroPaginas);
        this.setPreco(preco);
    }
    public Livro(String titulo, String autor){
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setISBN("978858365127-7");
        this.setNumeroPaginas(0);
        this.setPreco(0.0);
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }
    
    public void setAutor(String autor){
        this.autor = autor;
    }
    public String getAutor(){
        return this.autor;
    }
    
    public void setISBN(String ISBN){
        this.ISBN = ISBN;
    }
    public String getISBN(){
        return this.ISBN;
    }

    public void setNumeroPaginas(int numeroPaginas){
        this.numeroPaginas = numeroPaginas;
    }
    public int getNumeroPaginas(){
        return numeroPaginas;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public void aplicarDesconto(double percentual){
        this.preco = this.preco - (percentual * this.preco);
    }
    public String getDescricao(){
        return(""
        +"\nTítulo: " + getTitulo()
        +"\nAutor: " + getAutor()
        +"\nISBN: " + getISBN()
        +"\nNúmero de páginas: " + getNumeroPaginas()
        +"\nPreço: " + getPreco());
    } 
    public boolean estaDentroOrcamento(double preco){
        return (preco >= this.preco?true:false);
    }
}
