package Pagamento;

import java.math.BigDecimal;

public class Pagamento {
    private BigDecimal valor;
    private FormaPagamento pagamento;

    public Pagamento(double valor, FormaPagamento formaPagamento){
        setValor(valor);
        pagamento = formaPagamento;
    }
    public void setValor(double valor) {
        this.valor = new BigDecimal(valor);
    }
    public BigDecimal getValor() {
        return valor;
    }
}
