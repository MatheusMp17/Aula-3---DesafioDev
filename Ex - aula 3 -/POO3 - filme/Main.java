public class Main {
    public static void main(String[] args) {
        Filme jurassicPark = new Filme();
        jurassicPark.setTitulo("Jurassic Park");
        jurassicPark.setDiretor("Steven Spielberg");
        jurassicPark.setResumo("Em uma ilha próxima à Costa Rica, um empresário tenta criar o maior parque de diversão de todos os tempos. Para isso, ele oferece aos visitantes uma atração extraordinária: dinossauros vivos.");
        jurassicPark.setDuracao(126);
        jurassicPark.setAnoLancamento(1993);
        jurassicPark.setAvaliacao(4.6);

        System.out.println(""
        +"Título: " + jurassicPark.getTitulo()
        +"\nDiretor: " + jurassicPark.getDiretor()
        +"\nResumo: " + jurassicPark.getResumo()
        +"\nDuração: " + jurassicPark.getDuracao() + " min\n"
        +"Ano de Lançamento: " + jurassicPark.getAnoLancamento()
        +"\nAvaliação: " + jurassicPark.getAvaliacao());
        Filme f2 = new Filme("Star Wars IV", "George Luccas", 1977);
        f2.setResumo("Vwoom, Weeeooo, pew pew, Raaawwwrr");
        f2.setDuracao(121);
        f2.setAvaliacao(4.7);
        System.out.println();
        System.out.println(""
        +"Título: " + f2.getTitulo()
        +"\nDiretor: " + f2.getDiretor()
        +"\nResumo: " + f2.getResumo()
        +"\nDuração: " + f2.getDuracao() + " min\n"
        +"Ano de Lançamento: " + f2.getAnoLancamento()
        +"\nAvaliação: " + f2.getAvaliacao());

        Filme f3 = new Filme("Algum Filme", "Alguém", "alguma coisa acontece", 144, 2024, 5);
        System.out.println();
        System.out.println(""
        +"Título: " + f3.getTitulo()
        +"\nDiretor: " + f3.getDiretor()
        +"\nResumo: " + f3.getResumo()
        +"\nDuração: " + f3.getDuracao() + " min\n"
        +"Ano de Lançamento: " + f3.getAnoLancamento()
        +"\nAvaliação: " + f3.getAvaliacao());
    }
}