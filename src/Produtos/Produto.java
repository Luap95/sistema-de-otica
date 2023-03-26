package Produtos;

import java.math.BigDecimal;

public abstract class Produto {
    private String nome;
    private int quantidade;
    private BigDecimal preco;
    private TipoProduto tipo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = BigDecimal.valueOf(preco);
    }

    public TipoProduto getTipo() {
        return tipo;
    }

    public void setTipo(TipoProduto tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return this.getNome();
    }
}
