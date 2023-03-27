import Produtos.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Venda {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<Produto>();

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente cliente(){
        return cliente;
    }

    public void setProdutos(Produto produto){
        this.produtos.add(produto);
    }

    public double getTotalVenda() {
        double sum = 0.0;
        for (Produto produto : this.produtos) {
            double preco = produto.getPreco().doubleValue();
            sum += preco;
        }
        return sum;
    }

    @Override
    public String toString(){

        return "Cliente: " + this.cliente + "\n"
                + this.produtos;
    }
}
