package questaoContaDoCliente;

public class cliente{
	
    private String nome;
    private int idade;
    private String cidade;
    public Conta conta = new Conta();

    public void exibeDadosCliente(){
    }

    public cliente(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public cliente() {
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public conta getConta() {
        return this.conta;
    }

    public void setConta(conta conta) {
        this.conta = conta;
    }

    public void setConta(String nomeBanco, int numero, double saldo) {
        conta.setNomeBanco(nomeBanco);
        conta.setNumero(numero);
        conta.setSaldo(saldo);
    }

}