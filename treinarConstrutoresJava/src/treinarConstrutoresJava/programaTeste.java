package treinarConstrutoresJava;

public class programaTeste {

	public static void main(String[] args) {
		
		garrafa garrafa1 = new garrafa("Plástico", 10);
		System.out.println("Garrafa 01:");
		garrafa1.mostrarConteudo();
		
		System.out.println(); //Apenas para pular linha

		garrafa garrafa2 = new garrafa("Aluminio", 20);
		System.out.println("Garrafa 02:");
		garrafa2.mostrarConteudo();
		
		System.out.println(); 
		
		garrafa garrafa3 = new garrafa("Vidro", 15);
		System.out.println("Garrafa 03:");
		garrafa3.mostrarConteudo();
		
	}
}
