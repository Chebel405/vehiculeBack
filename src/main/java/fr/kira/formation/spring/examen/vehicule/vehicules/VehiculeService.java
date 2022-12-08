package fr.kira.formation.spring.examen.vehicule.vehicules;

import java.util.List;

public interface VehiculeService {
    /**
     * Permet de récuperer la liste des véhicules
     * @return
     */
    List<Vehicule> findAll();

    /**
     * Permet de retrouver un véhicule en particuler
     * @param id permet de récuperer le véhicule demander
     * @return
     */
    Vehicule findById(String id);

    /**
     * Permet de supprimer un véhicule
     * @param id permet la selection du véhicule à supprimer
     */

    void deleteById(String id);

    /**
     * Permet l'ajout d'un véhicule
     * @param id identifiant donné au nouveau véhicule
     * @return
     */
    Vehicule ajoutVehicule(String id);

}




