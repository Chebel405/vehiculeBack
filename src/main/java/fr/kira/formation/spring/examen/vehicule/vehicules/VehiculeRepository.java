package fr.kira.formation.spring.examen.vehicule.vehicules;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface VehiculeRepository extends MongoRepository<Vehicule, String> {

}
