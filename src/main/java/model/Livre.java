package model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "livre")
public class Livre {
	//Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "title")
    private String title;
    private String description;
    @Column(name = "date_publication")
    private Date date_publication; 
    
    
    // Constructeur 
    public Livre() {}
    
    // Constructeur avec paramètres sauf ID
    public Livre(String title, String description, Date date_publication) {
        this.title = title;
        this.description = description;
        this.date_publication = date_publication;
    }
    
    
    // Getters et Setters 
    
    // id
    public Long getId() {
      return this.id;
    }
    public void setId(Long id) {
      this.id = id;
    }
    //title
    public String getTitle() {
      return this.title;
    }
    public void setTitle(String title) {
      this.title = title;
    }
    // description
    public String getDescription() {
      return this.description;
    }
    public void setDescription(String description) {
      this.description = description;
    }
    // date_publication
    public Date getDate_publication() {
      return this.date_publication;
    }
    public void setDate_publication(Date date_publication) {
      this.date_publication = date_publication;
    }

    // ToString 
    @Override
    public String toString() {
        return "Livre {" +
               "id=" + id +
               ", title='" + title + '\'' +
               ", description='" + description + '\'' +
               ", date_publication='" + date_publication + '\'' +
               '}';
    }

}

