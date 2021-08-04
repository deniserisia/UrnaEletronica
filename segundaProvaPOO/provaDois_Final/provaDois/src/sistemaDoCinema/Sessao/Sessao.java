package sistemaDoCinema.Sessao;

import sistemaDoCinema.Filmes.Filmes;
import sistemaDoCinema.enums.TipoDeIngresso;

public class Sessao extends Filmes{
	
	private Sala sala = new Sala(); //composicao, objeto onde o numero da sala sera armazenado	
	
	private String horarioDaSessao;
	private String dataDaSessao;
	private double valorIngressoInteiro;
	private double valorMeioIngresso;
	private TipoDeIngresso tipoDeIngresso;

	@Override
	public String mostrarDados() {
		return "\nSala: " + sala.getNumeroDaSala() + 
				"\nInicio da Sessão: " + horarioDaSessao + 
				"\nData da Sessão: " + dataDaSessao + 
				"\nValor do Ingresso Inteiro: " + valorIngressoInteiro + 
				"\nValor do Meio Ingresso: " + valorMeioIngresso;
	}
	
	public String getHorarioDaSessao() {
		return horarioDaSessao;
	}
	public void setHorarioDaSessao(String string) { 
	    this.horarioDaSessao = string; 
	}
	
	public String getDataDaSessao() {
		return dataDaSessao;
	}
	public void setDataDaSessao(String string) { 
	    this.dataDaSessao = string; 
	}

	public double getValorIngressoInteiro() {
		return valorIngressoInteiro;
	}
	public void setValorIngressoInteiro(double valorIngressoInteiro) {
		this.valorIngressoInteiro = valorIngressoInteiro;
	}

	public double getValorMeioIngresso() {
		return valorMeioIngresso;
	}
	public void setValorMeioIngresso(double valorMeioIngresso) {
		this.valorMeioIngresso = valorMeioIngresso;
	}

	public TipoDeIngresso getTipoDeIngresso() {
		return tipoDeIngresso;
	}
	public void setTipoDeIngresso(TipoDeIngresso tipoDeIngresso) {
		this.tipoDeIngresso = tipoDeIngresso;
	}

	public Sala getSala() {
		return sala;
	}
	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public int getNumeroDaSala() {
		return sala.getNumeroDaSala();
	}
	public void setNumeroDaSala(int numeroDaSala) {
		this.sala.setNumeroDaSala(numeroDaSala);
	}
	
}
