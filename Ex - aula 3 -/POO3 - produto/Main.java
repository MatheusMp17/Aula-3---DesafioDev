import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Produto pao = new   Produto("PÃO", 10.11);
    System.out.println(pao.getInfo());
    pao.aplicarPromocao(100);
    System.out.println(pao.verificarDisponibilidade(10));
    System.out.println(pao.getInfo());

    Produto p2 = new Produto("escova de dente", "higiene", 100, 20, false);
    System.out.println(p2.getInfo());
    System.out.println(p2.verificarDisponibilidade(20));
    p2.aplicarPromocao(10);
    System.out.println(p2.getInfo());
    }
}