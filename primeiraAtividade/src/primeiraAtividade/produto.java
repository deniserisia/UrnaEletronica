package primeiraAtividade;

import java.util.Scanner;

public class produto {
	
	public static void main(String[] args ) {
		
	Scanner input = new Scanner(System.in);
	
	double valorFinal; // Valor total com a prestação e com o valor de venda do produto
	
	int prestacao = Integer.parseInt( input.next() );
	double vendaDoProduto = Double.parseDouble( input.next());
			
	valorFinal = prestacao * vendaDoProduto;
	
	System.out.printf("O valor total é de R$ %.2f", valorFinal);
	
	}
}
