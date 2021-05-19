package primeiraAtividade;

import java.util.Scanner;

public class numeros {

	public static void main(String[] args ) {

	Scanner input = new Scanner(System.in);
		
	double primeiroNumero = Double.parseDouble( input.next() );
	double segundoNumero = Double.parseDouble( input.next());

	Double soma = primeiroNumero + segundoNumero;
	Double quociente = primeiroNumero / segundoNumero;
	Double produto = primeiroNumero * segundoNumero;
	Double diferenca = primeiroNumero - segundoNumero;
	
	System.out.printf("O valor do quociente, da soma, do produto e da diferença desses números são: %.2f , %.2f , %.2f , %.2f ", quociente, soma, produto, diferenca );
	
	}
}
