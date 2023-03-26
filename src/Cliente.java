public class Cliente {
    private String nome;
    private String telefone;
    private String cpf;

    public void cadastraCliente(String nome, String telefone, String cpf){
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Nome: " + nome + "\n" +
                "Telefone: " + telefone + "\n" +
                "CPF: " + cpf;
    }
}
