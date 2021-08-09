package teste.comercio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import teste.comercio.entities.Produto;
import teste.comercio.repositories.RepositorioDoProduto;

@RestController
@RequestMapping(value = "/produtos") //Mapeamento da url
public class RecursosDoProduto {

	@Autowired
	private RepositorioDoProduto categoriaDoRepositorio;
	
	@GetMapping
	// Assinatura do método para retornar todas as categorias
	public ResponseEntity<List<Produto>> findAll() {
		List<Produto> list = categoriaDoRepositorio.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id) {
		Produto cat = categoriaDoRepositorio.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}

