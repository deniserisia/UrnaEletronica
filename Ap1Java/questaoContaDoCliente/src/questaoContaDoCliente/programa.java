package questaoContaDoCliente;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) throws Exception {
    	
        Scanner entrada = new Scanner(System.in);
        cliente cliente1 = new cliente();
        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();
        cliente1.setNome(nome);
        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        cliente1.setIdade(idade);
        System.out.println("Digite sua cidade: ");
        String cidade = entrada.nextLine();
        cliente1.setCidade(cidade);
        System.out.println("Digite o nome do seu banco: ");
        String nomeBanco = entrada.nextLine();
        cliente1.conta.setNomeBanco(nomeBanco);
        System.out.println("Digite o numero da conta: ");
        int numero = entrada.nextInt();
        entrada.nextLine();
        cliente1.conta.setNumero(numero);
        
        cliente1.exibeDadosCliente();
        cliente1.conta.deposita(900);
        cliente1.conta.exibeDadosConta();
        
        cliente1.conta.saque(200);
        cliente1.conta.exibeDadosConta();

        cliente1.conta.saque(1000);
        cliente1.conta.exibeDadosConta();

        cliente1.exibeDadosCliente();
        entrada.close();
    }
}