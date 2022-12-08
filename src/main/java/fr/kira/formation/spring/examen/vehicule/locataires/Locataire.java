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

    public Long id;
    public String email;
    public String nom;
    public String prenom;
    public String password;
    //Faire la liste de location de vehicule
    private List<Location> location = new ArrayList<>();
    //Faire la liste de vehicules louées
    private List<Vehicule> vehicule = new ArrayList<>();


}
