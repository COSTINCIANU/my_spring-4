package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.Livre;

@Repository
public interface LivreRepository extends CrudRepository<Livre, Long> {

}