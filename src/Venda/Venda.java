package Venda;

import Pagamento.Pagamento;
import Produtos.Produto;
import Cliente.Cliente;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Venda {
    private Cliente cliente;
    private List<Produto> produtos = new ArrayList<Produto>();
    private List<Pagamento> pagamentos = new ArrayList<Pagamento>();

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente getCliente(){
        return this.cliente;
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

        return "Cliente.Cliente: " + this.cliente + "\n"
                + this.produtos;
    }
}
