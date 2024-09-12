public class Filme {
    //Atributos
    private String titulo;
    private String diretor;
    private String resumo;
    private int duracao;
    private int anoLancamento;
    private double avaliacao;
    //Métodos

    //Construtor default
    public Filme(){
        setTitulo("");
        setDiretor("");
        setResumo("");
        setDuracao(0);
        setAnoLancamento(1900);
        setAvaliacao(0.0);
    }

    //outro construtor com parâmetros
    public Filme(String titulo, String diretor, String resumo, int duracao, int anoLancamento, double avaliacao){
        setTitulo(titulo);
        setDiretor(diretor);
        setResumo(resumo);
        setDuracao(duracao);
        setAnoLancamento(anoLancamento);
        setAvaliacao(avaliacao);
    }
    public Filme(String titulo, String diretor, int anoLancamento){
        setTitulo(titulo);
        setDiretor(diretor);
        setAnoLancamento(anoLancamento);
    }
    
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public String getTitulo(){
        return this.titulo;
    }

    public void setDiretor(String diretor){
        this.diretor = diretor;
    }
    public String getDiretor(){
        return this.diretor;
    }

    public void setResumo(String resumo){
        this.resumo = resumo;
    }
    public String getResumo(){
        return this.resumo;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
    public int getDuracao(){
        return this.duracao;
    }

    public void setAnoLancamento(int anoLancamento){
        this.anoLancamento = anoLancamento;
    }
    public int getAnoLancamento(){
        return this.anoLancamento;
    }

    public void setAvaliacao(double avaliacao){
        this.avaliacao = avaliacao;
    }
    public double getAvaliacao(){
        return this.avaliacao;
    }
    public void atualizarAvaliacao(double novaAvaliacao){
        setAvaliacao(novaAvaliacao);
    }   
}