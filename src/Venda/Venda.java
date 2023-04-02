package Venda;

import Pagamento.*;
import Produtos.Produto;
import Cliente.Cliente;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import Exception.*;

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
    public void setPagamentos(double valor, FormaPagamento formaPagamento ){
        if(valorAPagar()>0){
            if(valorAPagar()>=valor){
                this.pagamentos.add(new Pagamento(valor, formaPagamento));
            }else {
                throw new PagamentoInvalidoException("Valor do pagamento acima do valor a pagar da venda");
            }
        }else {
            throw new PagamentoInvalidoException("Venda não tem valores pendentes");
        }
    }
    public double valorAPagar(){
        BigDecimal valorPago = new BigDecimal(0);
        for(Pagamento pagamento : this.pagamentos){
            valorPago = valorPago.add(pagamento.getValor());
        }
        return getTotalVenda() - valorPago.doubleValue();
    }
    @Override
    public String toString(){

        return "Cliente.Cliente: " + this.cliente + "\n"
                + this.produtos;
    }
}
