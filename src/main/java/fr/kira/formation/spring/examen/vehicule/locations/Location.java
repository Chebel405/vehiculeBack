package fr.kira.formation.spring.examen.vehicule.locations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;
import fr.kira.formation.spring.examen.vehicule.vehicules.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;
@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class Location {
    @Id
    @Generated
    private Long id;
    @DateTimeFormat
    private DateTimeFormat dateDebut;
    @DateTimeFormat
    private DateTimeFormat dateFin;
    private Number prixTotal;

   // @ManyToOne
    private Locataire locataire;
    // @ManyToOne
    private Vehicule vehicule;


}
