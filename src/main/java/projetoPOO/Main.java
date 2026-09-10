package projetoPOO;

public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("Chaveiro", "Produto com 60% de lucro", 14);
        Produto p2 = new Produto("Maquina de cabelo", "com 40% de lucro", 55.90);

        Carrinho c = new Carrinho();
        c.adicionar(p1);
        c.adicionar(p2);

        c.remover("Chaveiro");

        Venda v = new Venda(c);
        v.totalPreco();

    }
}