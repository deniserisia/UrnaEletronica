package questaoAnimal;

public class animal {
	
	String especie;
	Double peso;
	
	public animal(String especie, Double peso) {	
	}
	public animal() {
		System.out.println("Objeto do tipo Animal foi instanciado!");
	}
}
// O construtor nada mais é do que um método responsável por alocar espaço na memória,
// para a manipulação do objeto e pode conter também a chamada para outros métodos,
// possibilitando assim a criação de objetos mais comlexos na orientação a objetos.
// Além disso, é válido lembrar que o construtor é responsável por construir um objeto com
// determinados valores.