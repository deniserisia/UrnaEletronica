package Metodos;

import java.util.Scanner;

public class PrincipalMetodos {
	
	public static void main(String[] args) {
		
		Principal principalExibe = new Principal();
		Scanner entrada = new Scanner(System.in); // Vai pegar a string que o usuário digitar
		System.out.println("Digite o seu nome, por favor:");
		String nome = entrada.next(); // Vai receber a string 
		System.out.println("Digite o seu sobrenome, por favor:");
		String sobrenome = entrada.next(); // Vai receber a string 
		
		// EXEMPLOS 1 E 2 
		//principalExibe.saudacoes(nome); // Esse aqui é o metodo que vai da classe principal
		// OBJETO.METODO
		//principalExibe.saudacoes(sobrenome); // Vai retornar o sobrenome da pessoa
		// OBJETO.METODO		
		
		// OUTRO EXEMPLO
		//System.out.println(principalExibe.nomeCompleto(nome, sobrenome));
		// Aqui o usuário vai ver o nome e sobrenome digitados
		
		principalExibe.saudacoes(principalExibe.nomeCompleto(nome, sobrenome));
	}	
}
