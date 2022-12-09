package fr.kira.formation.spring.examen.vehicule.locataires;

import fr.kira.formation.spring.examen.vehicule.locations.Location;
import fr.kira.formation.spring.examen.vehicule.vehicules.Vehicule;
import lombok.Data;
import lombok.Generated;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

import java.util.ArrayList;
import java.util.List;

@Data
@EntityScan
@Configuration

public class Locataire {
    @Id
    private Long id;

    private String email;

    private String nom;
    private String prenom;
    private String password;

    /**
     * Faire appel à la liste des locations
     */

    @DBRef
    private List<Location> location = new ArrayList<>();

    /**
     * Faire appel à la liste des véhicules loués par les locataires
     */

    @DBRef
    private List<Vehicule> vehicule = new ArrayList<>();


}
