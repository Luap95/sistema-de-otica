package Produtos;

public class TestaProduto {
    public static void main(String[] args) {
        Lente lente = new Hinex();
        lente.setDioptria(-1.25, -0.25);

        System.out.println(lente.getDioptria());
    }
}
