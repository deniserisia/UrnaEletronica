package primeiraAtividade;

import java.util.Scanner;

public class velocidade {
	
	public static void main(String[] args ) {
		
	Scanner input = new Scanner(System.in);
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite se era um carro ou caminhao:");
	
	String nome = entrada.next();
	
	double velocidadeMaximaDaPista =  Double.parseDouble( input.next());
	double veloDoMotorista = Double.parseDouble(input.next());		
	
	// Primeiras operações 
	double finalCarro = velocidadeMaximaDaPista / veloDoMotorista;
	double finalCaminhao = velocidadeMaximaDaPista / veloDoMotorista;
	
	// Segunda Operação 
	double peCar =  finalCarro * 0.10;
	double peCam = finalCaminhao * 0.05;
	
	if ( nome.equalsIgnoreCase("carro") && finalCarro != peCar) {
		System.out.printf(" Você ultrapassou os limites da vida - Carro!", peCar);
	}else { 
		System.out.printf(" Você caminhoneiro ultrapassou os limites da via! - Caminhão", peCam);
	}
	
	}	
}
