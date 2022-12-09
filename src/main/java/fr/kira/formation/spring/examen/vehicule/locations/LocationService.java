package fr.kira.formation.spring.examen.vehicule.locations;

import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;

import java.util.List;

public interface LocationService {

    /**
     * Permet de récuperer la liste de location
     * @return
     */
    List<Location> findAll();
    /**
     * Permet de retrouver une location en particuler
     * @param id permet de récuperer la location demander
     * @return
     */
    Location findById(String id);
    /**
     * Permet de supprimer une location
     * @param id permet la selection d'une location à supprimer
     */
    void deleteById(String id);

    /**
     * Permet l'ajout d'une location
     * @param id identifiant donné à la nouvelle location
     * @return
     */
    Location ajoutLocation(String id);
}
