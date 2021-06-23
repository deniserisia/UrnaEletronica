package questaoAluno;

public class teste {
	
	public static void main(String[] args) throws Exception{
		
		aluno aluno1 = new aluno("Denise", 23,"Engenharia de Software");
		System.out.println("Esse é o resultado: ");
		aluno1.mostrarMedia(7.5,8.9,9.4);
		aluno1.mostrarConteudo();
	}
}
