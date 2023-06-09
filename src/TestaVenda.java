import Cliente.Cliente;
import Pagamento.FormaPagamento;
import Produtos.Hinex;
import Produtos.Oakley;
import Produtos.Produto;
import Venda.Venda;

public class TestaVenda {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.cadastraCliente("Lucas de Almeida", "1198888888", "11111111111");
        System.out.println(cliente);

        Produto lenteOd = new Hinex(-1.00, -0.50);
        Produto lenteOe = new Hinex(-0.75, -2.00);
        Produto armacao = new Oakley();

        Venda venda = new Venda();
        venda.setCliente(cliente);
        venda.setProdutos(lenteOd);
        venda.setProdutos(lenteOe);
        venda.setProdutos(armacao);

        System.out.println("Valor a pagar: R$" + venda.valorAPagar());
        venda.setPagamentos(300, FormaPagamento.DINHEIRO);
        System.out.println("Valor a pagar: R$" + venda.valorAPagar());
        venda.setPagamentos(200, FormaPagamento.CREDITO);
        System.out.println("Valor a pagar: R$" + venda.valorAPagar());
        venda.setPagamentos(100, FormaPagamento.DEBITO);
        System.out.println("Valor a pagar: R$" + venda.valorAPagar());
        venda.setPagamentos(160, FormaPagamento.PIX);

        System.out.println("Valor a pagar: R$" + venda.valorAPagar());

        System.out.println(venda);

        System.out.println(venda.getTotalVenda());
    }
}
