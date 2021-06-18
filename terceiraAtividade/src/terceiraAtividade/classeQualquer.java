package terceiraAtividade;

public class classeQualquer {

	public static void main(String[] args) throws Exception {

        Garrafa garrafa01 = new Garrafa(1,"plástica");
        Garrafa garrafa02 = new Garrafa(3,"alumínio");
        Garrafa garrafa03 = new Garrafa(2,"vidro");
        Garrafa garrafa04 = new Garrafa(5,"inoxidável");

        garrafa01.mostrarConteudo();
        garrafa02.mostrarConteudo();
        garrafa03.mostrarConteudo();
        garrafa04.mostrarConteudo();

    }
	
}
