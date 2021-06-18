package calculadora;

import java.util.Scanner;

public class calcularSimplesJava {

	public static void main(String[] args) {
			
		Scanner entrada = new Scanner(System.in);
			
		System.out.println("---------- Apenas Uma Simples Calculadora Java -----------");
		System.out.println("---------- Calculadora de Números Inteiros ---------------");
		System.out.println("Digite um número: ");
		double numero1 = entrada.nextDouble();
		System.out.println("Digite um segundo número: ");
		double numero2 = entrada.nextDouble();
			
		System.out.println("-> Agora escolha uma operação:");
		System.out.println("01 - Soma");
		System.out.println("02 - Produto");
		System.out.println("03 - Quociente");
		System.out.println("04 - Subtração");
		System.out.println("05 - O resto da Divisão");
		int op = entrada.nextInt();
			
		switch(op) {
			case 01:
				System.out.println("Soma: " + (numero1+numero2));
				break;
			case 02:
				System.out.println("Produto:" + (numero1*numero2));
				break;
			case 03:
				System.out.println("Quociente:" + (numero1/numero2));
				break;
			case 04:
				System.out.println("Subtração:" + (numero1-numero2));	
				break;
			case 05:
				System.out.println("O resto da Divisão é:" + (numero1%numero2));
				break;
			default:
				System.out.println("A opção digitada não é válida!");
		}
			
	}
}

