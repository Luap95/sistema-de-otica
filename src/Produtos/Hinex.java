package Produtos;

public class Hinex extends Lente{

    public Hinex(double esf, double cil){
        super.setNome("1.56 com AR");
        super.setPreco(85.00);
        super.setGrade(4.00, -4.00, 0.00, -2.00);
        super.setDioptria(esf, cil);
    }

}
