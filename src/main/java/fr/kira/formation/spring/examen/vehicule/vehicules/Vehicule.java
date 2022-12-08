package fr.kira.formation.spring.examen.vehicule.vehicules;

import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;
import fr.kira.formation.spring.examen.vehicule.locations.Location;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;
import java.util.List;

@Data
@EntityScan
public class Vehicule {
    @Id
    private Long id;
    private String etat;
    private String immatriculation;
    private String marque;
    private String modele;
    private Float prix;
    private String status;
    private String type;

    private List<Location> location = new ArrayList<>();

    private List<Locataire> locataire = new ArrayList<>();
}
