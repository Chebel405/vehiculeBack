package fr.kira.formation.spring.examen.vehicule.locataires;

import fr.kira.formation.spring.examen.vehicule.locations.Location;
import fr.kira.formation.spring.examen.vehicule.vehicules.Vehicule;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import java.util.ArrayList;
import java.util.List;

@Data
@EntityScan

public class Locataire {
    private Long id;
    private String email;

    private String nom;
    private String prenom;
    private String password;
    //Faire la liste de location de vehicule
    private List<Location> location = new ArrayList<>();
    //Faire la liste de vehicules louées
    private List<Vehicule> vehicule = new ArrayList<>();


}
