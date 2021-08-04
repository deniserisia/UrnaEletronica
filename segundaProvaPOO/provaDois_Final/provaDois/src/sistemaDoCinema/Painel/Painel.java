package sistemaDoCinema.Painel;

import java.util.InputMismatchException;
import java.util.Scanner;

import sistemaDoCinema.Filmes.Filmes;
import sistemaDoCinema.Sessao.Sessao;
import sistemaDoCinema.enums.TipoDeIngresso;

public class Painel {

	public static void main(String[] args) {
	
		//FILMES DO CINEMA
		Filmes filme1 = new Filmes();
		Filmes filme2 = new Filmes();
		Filmes filme3 = new Filmes();
		Filmes filme4 = new Filmes();
		
		filme1.setTituloDoFilme("Cinquenta Tons de Cinza");
		filme1.setGenero("Romance/Drama");
		filme1.setFaixaEtaria("Não RECOMENDADO PARA MENORES DE 18 ANOS");
		
		filme2.setTituloDoFilme("Procurando Nemo");
		filme2.setGenero("Infantil/Aventura");
		filme2.setFaixaEtaria("LIVRE PARA TODOS OS PÚBLICOS");
		
		filme3.setTituloDoFilme("Era do Gelo");
		filme3.setGenero("Infantil/Aventura");
		filme3.setFaixaEtaria("LIVRE PARA TODOS OS PÚBLICOS");
		
		filme4.setTituloDoFilme("Dupla Explosiva 2: E a primeira-dama do crime");
		filme4.setGenero("Ação/Suspense");
		filme4.setFaixaEtaria("NÃO RECOMENDADO PARA MENORES DE 16 ANOS");	
		
		//SESSÕES DO CINEMA 
		Sessao sessao1 = new Sessao();
		Sessao sessao2 = new Sessao();
		Sessao sessao3 = new Sessao();
		Sessao sessao4 = new Sessao();
		Sessao sessao5 = new Sessao();
		
		sessao1.setHorarioDaSessao("13 Horas");
		sessao1.setDataDaSessao("30/07/2021");
		sessao1.setValorIngressoInteiro(45.0);
		sessao1.setValorMeioIngresso(25.0);
		sessao1.setNumeroDaSala(1);
		
		sessao2.setHorarioDaSessao("15 Horas");
		sessao2.setDataDaSessao("30/07/2021");
		sessao2.setValorIngressoInteiro(45.0);
		sessao2.setValorMeioIngresso(25.0);
		sessao2.setNumeroDaSala(2);
		
		sessao3.setHorarioDaSessao("18 Horas");
		sessao3.setDataDaSessao("30/07/2021");
		sessao3.setValorIngressoInteiro(45.0);
		sessao3.setValorMeioIngresso(25.0);
		sessao3.setNumeroDaSala(3);
		
		sessao4.setHorarioDaSessao("20 Horas");
		sessao4.setDataDaSessao("30/07/2021");
		sessao4.setValorIngressoInteiro(45.0);
		sessao4.setValorMeioIngresso(25.0);
		sessao4.setNumeroDaSala(4);
		
		sessao5.setHorarioDaSessao("20 Horas");
		sessao5.setDataDaSessao("30/07/2021");
		sessao5.setValorIngressoInteiro(45.0);
		sessao5.setValorMeioIngresso(25.0);
		sessao5.setNumeroDaSala(5);
		
		
		try {
			Scanner entrada = new Scanner(System.in);
			System.out.println("-------------------- SEJA BEM-VINDO(A) AO CINEMA DO VALENÇA!!! ---------------------");
			System.out.println("------- Pedimos que matenha atenção nas escolhas durante a utilização do sistema! ------------");
			
			System.out.print("\nDigite 1 para entrar no sistema ou qualquer outro número se deseja sair do sistema: ");
			int inicio = entrada.nextInt();
			entrada.nextLine();
			
			if(inicio == 1) {
				
				System.out.printf("\nOs filmes em Cartazes são: " + filme1.mostrarDados() + filme2.mostrarDados() + filme3.mostrarDados() + filme4.mostrarDados());
				System.out.println("\n------------------------------------------------------");
				System.out.println("\n-------------MENU DE OPÇÕES-----------");
				System.out.println("1 - Mostrar sessões disponiveis");
				System.out.println("2 - Sair do sistema");
		
				int opcao = entrada.nextInt(); 
				entrada.nextLine();
		
				if(opcao == 1) {
					System.out.println("---------- Sessões Disponiveis --------" + 
							"\n\nFilme: " + filme1.getTituloDoFilme() + sessao1.mostrarDados() + 
							"\n\nFilme: " + filme2.getTituloDoFilme() + sessao2.mostrarDados() + 
							"\n\nFilme: " + filme3.getTituloDoFilme() + sessao3.mostrarDados() + 
							"\n\nFilme: " + filme4.getTituloDoFilme() + sessao4.mostrarDados() +
							"\n\nFilme: " + filme3.getTituloDoFilme() + sessao5.mostrarDados());
					
					System.out.println("\nEscolha a sessão que você deseja assistir ou Digite 0(zero) para sair do sistema ");
					int sessao = entrada.nextInt();
					entrada.nextLine();
					
					if(sessao >= 1 && sessao <= 5) {
						System.out.println("\nEscolha o tipo de ingresso");
						System.out.println("1-Inteira");
						System.out.println("2-Meia entrada");
						int escolhaTipo = entrada.nextInt();
						
						if(sessao == 1) {
							if(escolhaTipo == 1) {
								sessao1.setTipoDeIngresso(TipoDeIngresso.INTEIRA);
							}else if(escolhaTipo == 2){
								sessao1.setTipoDeIngresso(TipoDeIngresso.MEIA_ENTRADA);
							}else {
								System.out.println("Tipo de ingresso inválido!");
							}
						}else if(sessao == 2) {
							if(escolhaTipo == 1) {
								sessao2.setTipoDeIngresso(TipoDeIngresso.INTEIRA);
							}else if(escolhaTipo == 2) {
								sessao2.setTipoDeIngresso(TipoDeIngresso.MEIA_ENTRADA);
							}else {
								System.out.println("Tipo de ingresso inválido!");
							}
						}else if(sessao == 3) {
							if(escolhaTipo == 1) {
								sessao3.setTipoDeIngresso(TipoDeIngresso.INTEIRA);
							}else if(escolhaTipo == 2) {
								sessao3.setTipoDeIngresso(TipoDeIngresso.MEIA_ENTRADA);
							}else {
								System.out.println("Tipo de ingresso inválido!");
							}
						}else if(sessao == 4) {
							if(escolhaTipo == 1) {
								sessao4.setTipoDeIngresso(TipoDeIngresso.INTEIRA);
							}else if(escolhaTipo == 2) {
								sessao4.setTipoDeIngresso(TipoDeIngresso.MEIA_ENTRADA);
							}else {
								System.out.println("Tipo de ingresso inválido!");
							}
						}
					}else if(sessao == 0){
						System.out.printf("Você escolheu sair do sistema! Até mais ;)");
					}else {
						System.out.println("Sessão inválida!");
					}
					
				}else if(opcao == 2){
					System.out.printf("Você escolheu sair do sistema! Até mais ;)");
				}else {
					System.out.println("A opção digitada não é válida!");
				}
				
			} else {
				System.out.printf("Você escolheu sair do sistema! Até mais ;)");
			}
			
			entrada.close();
			
		} catch (InputMismatchException e) {
			System.err.println("Não é permitido inserir letras, informe apenas números interios" + e.toString());
		} catch (NumberFormatException e) {
			System.out.println("Numero com formato errado!");
		} finally {
			System.out.println("\nFim do programa!");	
		}
		
	}
}
