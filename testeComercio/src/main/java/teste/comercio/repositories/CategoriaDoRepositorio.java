package teste.comercio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import teste.comercio.entities.Categorias;

@Repository
public interface CategoriaDoRepositorio extends JpaRepository <Categorias, Long>{

	
}
