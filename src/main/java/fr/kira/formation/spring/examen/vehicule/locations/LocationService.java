package fr.kira.formation.spring.examen.vehicule.locations;

import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;

import java.util.List;

public interface LocationService {
    List<Location> findAll();

    Location findById(String id);

    void deleteById(String id);

    Location ajoutLocation(String id);
}
