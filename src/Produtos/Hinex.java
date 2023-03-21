package Produtos;

public class Hinex extends Lente{

    public Hinex(){
        super.setNome("1.56 com AR");
        super.setPreco(170.00);

    }
    @Override
    public void grade(double esf, double cil) {
        if(esf >= -4.00 || esf <= 4.00){

        }
    }
}
