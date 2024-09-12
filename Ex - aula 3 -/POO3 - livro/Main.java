import java.util.*;
public class Main{
    public static void main(String[] args){
        Livro dungeonAndDragons;
        dungeonAndDragons = new Livro("Dungeon And Dragons 5e", "Gary Gygax");
        System.out.println(dungeonAndDragons.getDescricao());
        Livro oHobbit = new Livro();
        oHobbit.setAutor("JRR Tolkien");
        oHobbit.setTitulo("O Hobbit");
        oHobbit.setISBN("000000000-0");
        oHobbit.setNumeroPaginas(336);
        oHobbit.setPreco(69.90);
        System.out.println(oHobbit.getDescricao());
        System.out.println(oHobbit.estaDentroOrcamento(100));
        oHobbit.aplicarDesconto(0.4);
        System.out.println(oHobbit.getPreco());
        Livro oSenhorDosAneis = new Livro("O Senhor dos Aneis", "JRR Tolkien", "000000000-0", 423, 74.3);
    System.out.println(oSenhorDosAneis.getDescricao());
    }

}