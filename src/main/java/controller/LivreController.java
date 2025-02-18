package controller;

import model.Livre;
import service.LivreService;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;

@RestController
public class LivreController {
    
	  @Autowired
	  private LivreService livreService;

	  @GetMapping("/livres")
	  public List<Livre> getlivres() {
	    return livreService.getAllLivres();
	  }

	  @GetMapping("/livre/{id}")
	  public Optional<Livre> getLivre(@PathVariable String id) {
	    return livreService.getLivreById(Long.valueOf(id));
	  }

	  @PostMapping("livre")
	  public void addLivre(@RequestBody Livre livre){
	    livreService.addLivre(livre);
	  }
	  
	  @PatchMapping("livre")
	  public void updateLivre(@RequestBody Livre livre){
	    livreService.addLivre(livre);
	  }

	  @PutMapping("livre/{id}")
	  public void replaceLivre(@PathVariable String id, @RequestBody Livre livre) {
	    livre.setId(Long.valueOf(id));
	    livreService.replaceLivre(livre);
	  }

	  @DeleteMapping("livre/{id}")
	  public void removeLivre(@PathVariable String id){
	    livreService.removeLivre(Long.valueOf(id));
	  }
}
