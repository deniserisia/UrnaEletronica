package Application;

import java.util.Locale;
import java.util.Scanner;

import Exception.BusinessException;
import entities.Account;

public class program {
	
	public static void main(String[] args) {
		
		// Separador de decimais 
		Locale.setDefault(Locale.US);
		Scanner entrada = new Scanner(System.in);
		
		// Começando a entrada de dados
		System.out.println("Informe os seus dados, por gentiliza!");
		System.out.println("Número da Conta: ");
		int number = entrada.nextInt();
		System.out.println("Títular da Conta: ");
		entrada.nextLine();
		String holder = entrada.nextLine();
		System.out.println("Saldo total: ");
		Double balance = entrada.nextDouble();
		System.out.println("Limite do Saque: ");
		Double withdrawLimit = entrada.nextDouble();
		
		// Usando o construtor com os argumentos
		Account acc = new Account(number, holder, balance, withdrawLimit);
			
		System.out.println();
		System.out.print("Informe uma quantia que deseja sacar: ");
		double amount = entrada.nextDouble();
		
		// Tratamento de erros 
		try {
		acc.withdraw(amount);
		System.out.println("Novo saldo:"+ String.format("%.2f", + acc.getBalance()));
		}
		catch ( BusinessException e) {
			System.out.println(e.getMessage());
		}
		entrada.close();
	}
}
