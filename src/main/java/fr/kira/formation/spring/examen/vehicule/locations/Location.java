package fr.kira.formation.spring.examen.vehicule.locations;

import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    private Long id;
    private DateTimeFormat dateDebut;
    private DateTimeFormat dateFin;
    private Number prixTotal;

   // private locataire Locataire;

  //  private vehicule Vehicule;


}
