package ProdutoPrincial;

public class ProdutoDoSupermercado {
	
	public static void main(String[] args) {
		
		ProdutoDoEstoque p1 = new ProdutoDoEstoque();
		p1.nome = "Laranja";
		p1.preco = 3;
		p1.desconto = 0.25;
		
		var p2 = new ProdutoDoEstoque();
		p2.nome = "Melancia";
		p2.preco = 4.55;
		p2.desconto = 0.25;
		
		var p3 = new ProdutoDoEstoque();
		p3.nome = "Abacaxi";
		p3.preco = 3.40;
		p3.desconto = 0.44;
		
		var p4 = new ProdutoDoEstoque();
		p4.nome = "Melão";
		p4.preco = 5.55;
	 	p4.desconto = 0.55;
		
		System.out.println(p1.nome);
		System.out.println(p2.nome);
		System.out.println(p3.nome);
		System.out.println(p4.nome);
		
		double precoFinal1 = p1.preco * ( 1 - p1.desconto);
		double precoFinal2 = p2.preco * ( 1 - p2.desconto);
		double precoFinal3 = p3.preco * ( 1 - p3.desconto);
		double precoFinal4 = p4.preco * ( 1 - p4.desconto);
		double mediaCarrinho = ((precoFinal1 + precoFinal2 + precoFinal3 + precoFinal4) / 4 );
		
		System.out.printf(" A média do carrinho foi: R$%.2f", mediaCarrinho);	
	}
}
