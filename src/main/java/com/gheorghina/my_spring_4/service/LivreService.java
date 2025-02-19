package com.gheorghina.my_spring_4.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gheorghina.my_spring_4.model.Livre;
import com.gheorghina.my_spring_4.repository.LivreRepository;

import java.util.List;
import java.util.Optional;

import lombok.Data;

@Data
@Service
public class LivreService {
  
  //Attributs 
  @Autowired
  private LivreRepository repository;

  //Methods
  // Select_ALL
  public List<Livre> getAllLivres(){
    return (List<Livre>) repository.findAll();
  };
  // Select BY_ID
  public Optional<Livre> getLivreById(Long Id){
    return repository.findById(Id);
  }
  // Insert
  public void addLivre(Livre livre){
    repository.save(livre);
  }

    // Update Patch
    public void updateLivre(Livre livre){
      repository.save(livre);
    }
    // Pour metre a jour un livre
    // Update Put
    public void replaceLivre(Livre livre){
      repository.save(livre);
    }

    // Pour supprimer un livre
    // Delete
    public void removeLivre(Long id){
      repository.deleteById(id);
    }

}