import Produtos.Produto;

import java.util.HashSet;
import java.util.Set;

public class Venda {
    private Cliente cliente;
    private Set<Produto> produtos = new HashSet<>();

    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    public Cliente cliente(){
        return cliente;
    }

    public void setProdutos(Produto produto){
        this.produtos.add(produto);
    }

    @Override
    public String toString(){

        return "Cliente: " + this.cliente + "\n"
                + this.produtos;
    }
}
