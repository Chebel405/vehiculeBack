package fr.kira.formation.spring.examen.vehicule.locataires;

import java.util.List;

public interface LocataireService {
    List<Locataire> findAll();

    Locataire findById(String id);

    void deleteById(String id);

    Locataire ajoutLocataire(String id);
}
