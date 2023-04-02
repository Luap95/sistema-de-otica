package Pagamento;

import java.math.BigDecimal;

public class Pagamento {
    private BigDecimal valor;

    public void setValor(double valor) {
        this.valor = new BigDecimal(valor);
    }

    public BigDecimal getValor() {
        return valor;
    }
}
