package teste.comercio;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import teste.comercio.entities.Categorias;
import teste.comercio.entities.Produto;
import teste.comercio.repositories.CategoriaDoRepositorio;
import teste.comercio.repositories.RepositorioDoProduto;

@SpringBootApplication
public class TesteComercioApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaDoRepositorio categoriaDoRepositorio;
	
	@Autowired
	private RepositorioDoProduto repositorioDoProduto;
	
	public static void main(String[] args) {
		SpringApplication.run(TesteComercioApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categorias cat1 = new Categorias(null, "Comida");
		Categorias cat2 = new Categorias(null, "Bebida");

		Produto p1 = new Produto(null, "Hambúguer com Fritas", 22.00, cat1);
		Produto p2 = new Produto(null, "Coca-Cola", 6.00, cat2);
		Produto p3 = new Produto(null, "Donuts Simples", 8.00, cat1);
		Produto p4 = new Produto(null, "Água", 5.00, cat2);

		cat1.getProdutos().addAll(Arrays.asList(p1, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2, p4));
		
		categoriaDoRepositorio.save(cat1);
		categoriaDoRepositorio.save(cat2);
		
		repositorioDoProduto.save(p1);
		repositorioDoProduto.save(p2);
		repositorioDoProduto.save(p3);
		repositorioDoProduto.save(p4);
	}

}
