package com.gheorghina.my_spring_4.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.gheorghina.my_spring_4.model.Livre;


@Repository
public interface LivreRepository extends CrudRepository<Livre, Long> {

}