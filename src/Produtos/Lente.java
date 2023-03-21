package Produtos;

public class Lente extends Produto{
    private double esferico;
    private double cilindrico;

    public void setDioptria(double esf, double cil) {
        if(esf % 0.25 != 0 && cil % 0.25 != 0){
            throw new DioptriaInvalidaException("Valor invalido. Digite numeros multiplos de 0.25.");
        }
        this.esferico = esf;
        this.cilindrico = cil;
    }
    public String getDioptria(){
        return esferico + "/" + cilindrico;
    }
}
