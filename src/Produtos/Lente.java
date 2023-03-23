package Produtos;

public abstract class Lente extends Produto{
    private double esferico;
    private double cilindrico;
    private double esfMax;
    private double esfMin;
    private double cilMax;
    private double cilMin;

    public void setDioptria(double esf, double cil) {
        validaDioptria(esf, cil);
        this.esferico = esf;
        this.cilindrico = cil;
    }
    public String getDioptria(){
        return esferico + "/" + cilindrico;
    }
    public void setGrade(double esfMax, double esfMin, double cilMax, double cilMin){
        validaDioptria(esfMin, cilMin);
        validaDioptria(esfMax, cilMax);
        this.esfMin = esfMin;
        this.esfMax = esfMax;
        this.cilMin =  cilMin;
        this.cilMax =  cilMax;
    }

    private void verificaGrade(double esf, double cil){
        if(esf <= this.esfMin || esf >= this.esfMax){
            throw new DioptriaForaDaGradeException("Dioptria esferica não disponível na grade.");
        }
        if(cil <= this.cilMin || cil >= this.cilMax){
            throw new DioptriaForaDaGradeException("Dioptria cilindrica não disponível na grade.");
        }
    }

    private void validaDioptria(double esf, double cil){
        if(esf % 0.25 != 0 || cil % 0.25 != 0){
            throw new DioptriaInvalidaException("Valor invalido. Digite numeros multiplos de 0.25.");
        }
    }
}
