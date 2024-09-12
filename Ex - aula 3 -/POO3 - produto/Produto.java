/*
3. Classe Produto

Atributos:

- String nome
- String categoria
- double preco
- int quantidadeEstoque
- boolean emPromocao

Construtores:
- Construtor com todos os atributos
- Construtor com nome e preco

Métodos:

- Getters e Setters para todos os atributos
- public void aplicarPromocao(double percentualDesconto) (aplicar desconto passado por parâmetro 10 até 50% e setar como emPromocão)
- public String getInfo() (Mostrar todas as características do produto)
- public boolean verificarDisponibilidade(int quantidadeDesejada)
*/
public class Produto{
    private String nome;
    private String categoria;
    private double preco;
    private int quantidadeEstoque;
    private boolean emPromocao;

    // Construtores
    public Produto(String nome, String categoria, double preco, int quantidadeEstoque, boolean emPromocao){
      setNome(nome);
      setCategoria(categoria);
      setPreco(preco);
      setQuantidadeEstoque(quantidadeEstoque);
      setEmPromocao(emPromocao);  
    }

    public Produto(String nome, double preco){
        setNome(nome);
        setPreco(preco);
        setCategoria("indefinido");
        setQuantidadeEstoque(0);
        setEmPromocao(false);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    
    public void setCategoria(String categoria){
        this.categoria = categoria;
    }
    public String getCategoria(){
        return this.categoria;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return this.preco;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque){
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public int getQuantidadeEstoque(){
        return this.quantidadeEstoque;
    }

    public void setEmPromocao(boolean emPromocao){
        this.emPromocao = emPromocao;
    }
    public boolean getEmPromocao(){
        return this.emPromocao;
    }

    public void aplicarPromocao(double percentualDesconto){
        if (percentualDesconto >= 10 && percentualDesconto <= 50){
            setPreco(preco - ((percentualDesconto / 100) * preco));
            setEmPromocao(true);
        }
    }
    public String getInfo(){
        return (""
        +"INFORMAÇÕES:"
        +"\n__________________________"
        +"\nNome: " + getNome()
        +"\nCategoria: " + getCategoria()
        +"\nPreço: " + getPreco() + " R$\n"
        +"Quantidade em estoque: " + getQuantidadeEstoque()
        +"\nPromoção: " + getEmPromocao());
    }
    public boolean verificarDisponibilidade(int quantidadeDesejada){
        return (quantidadeDesejada <= this.quantidadeEstoque)? true : false;
    }
}