package Produtos;

public abstract class Armacao extends Produto {
    private String grife;
    private String cor;

    public void setGrife(String grife){
        this.grife = grife;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getGrife(){
        return this.grife;
    }
    public String getCor(){
        return this.cor;
    }

    @Override
    public String toString() {
        return "Produto: " + super.getNome() + "\n"
                + "Grife: " + grife + "\n"
                + "Cor: " + cor + "\n"
                + "Preço: " + super.getPreco();
        }
}
