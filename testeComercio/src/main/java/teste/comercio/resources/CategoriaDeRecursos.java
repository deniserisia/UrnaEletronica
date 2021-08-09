package teste.comercio.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import teste.comercio.entities.Categorias;
import teste.comercio.repositories.CategoriaDoRepositorio;

@RestController
@RequestMapping(value = "/categorias") //Mapeamento da url
public class CategoriaDeRecursos {

	@Autowired
	private CategoriaDoRepositorio categoriaDoRepositorio;
	
	@GetMapping
	// Assinatura do método para retornar todas as categorias
	public ResponseEntity<List<Categorias>> findAll() {
		List<Categorias> list = categoriaDoRepositorio.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Categorias> findById(@PathVariable Long id) {
		Categorias cat = categoriaDoRepositorio.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
}

