package fr.kira.formation.spring.examen.vehicule.locations;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;
import fr.kira.formation.spring.examen.vehicule.vehicules.Vehicule;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

import java.lang.annotation.Target;
import java.time.LocalDateTime;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
@Configuration
@EntityScan
public class Location  {
    @Id
    @Generated

    private Long id;

    @JsonFormat(pattern = "ww day/MM/yyyy")
    private LocalDateTime dateDebut;

    @JsonFormat(pattern = "ww day/MM/yyyy")
    private LocalDateTime dateFin;

    private Number prixTotal;

    //@ManyToOne
    private Locataire locataire;
    //@OneToMany
    private Vehicule vehicule;


}
