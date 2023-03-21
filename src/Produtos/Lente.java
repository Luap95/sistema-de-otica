package Produtos;

public abstract class Lente extends Produto{
    private double esferico;
    private double cilindrico;
    private double esfMax;
    private double esfMin;
    private double cilMax;
    private double cilMin;

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

    public abstract void grade(double esf, double cil);
}
