package Produtos;

public class TestaProduto {
    public static void main(String[] args) {
        Lente lente = new Hinex(-1.25, -0.25);

        System.out.println(lente);

        Armacao armacao = new Oakley();

        System.out.println(armacao);
    }
}
