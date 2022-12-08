package fr.kira.formation.spring.examen.vehicule.vehicules;

import java.util.List;

public interface VehiculeService {
    List<Vehicule> findAll();

    Vehicule findById(String id);

    void deleteById(String id);

    Vehicule ajoutVehicule(String id);

}




