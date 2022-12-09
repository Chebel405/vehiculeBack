package fr.kira.formation.spring.examen.vehicule.locataires;

import java.util.List;

public interface LocataireService {

    /**
     * Permet de récuperer la liste des locataires
     * @return
     */
    List<Locataire> findAll();

    /**
     * Permet de retrouver un locataire en particuler
     * @param id permet de récuperer le locataire demander
     * @return
     */
    Locataire findById(String id);

    /**
     * Permet de supprimer un locataire
     * @param id permet la selection du locataire à supprimer
     */
    void deleteById(String id);

    /**
     * Permet l'ajout d'un locataire
     * @param id identifiant donné au nouveau locataire
     * @return
     */
    Locataire ajoutLocataire(String id);
}
