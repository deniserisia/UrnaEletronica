package teste.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import teste.comercio.entities.Produto;

@Repository
public interface RepositorioDoProduto extends JpaRepository<Produto, Long>{
	
}
