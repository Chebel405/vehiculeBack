package fr.kira.formation.spring.examen.vehicule.vehicules;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.annotation.Id;

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
}
