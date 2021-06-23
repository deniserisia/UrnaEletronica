package questaoAluno;

public class aluno {
	
	private String nome;
	private int idade;
	private String curso;
	private Double media;
	
	public aluno(String nome, int idade, String curso) {
		this.nome = nome;
		this.idade = idade;
		this.curso = curso;
	}
	public Double mostrarMedia(Double notaUm, Double notaDois, Double notaTres) {
		this.media = (notaUm + notaDois + notaTres) / 3;
		return this.media;
	}
	public void mostrarConteudo(){		
		System.out.println("O nome do(a) aluno(a): " + this.getNome());
        System.out.println("A Idade do(a) é: " + this.getIdade());
        System.out.println("O Curso do(a) é: " + this.getCurso());
        System.out.println("A Média do(a) aluno(a) foi: " + this.getMedia());
	}
	// Métodos Especiais - SET E GET
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public double getMedia() {
		return media;
	}
	public void setMedia(Double media) {
		this.media = media;
	}
}
