package Exception;

public class PagamentoInvalidoException extends RuntimeException{
    public PagamentoInvalidoException(){
        super();
    }
    public PagamentoInvalidoException(String mensagem){
        super(mensagem);
    }
}
