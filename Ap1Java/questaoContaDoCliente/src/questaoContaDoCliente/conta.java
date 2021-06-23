package questaoContaDoCliente;

public class conta {
	
    private String nomeBanco;
    private int numero;
    private double saldo;

    public void saque(double valor){
    }
    
    public void deposita(double valor){
    }

    public void exibeDadosConta(){
    }
}


    public conta(String nomeBanco, int numero, double saldo) {
        this.nomeBanco = nomeBanco;
        this.numero = numero;
        this.saldo = saldo;
    }

    public conta() {
    }

    public String getNomeBanco() {
        return this.nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}