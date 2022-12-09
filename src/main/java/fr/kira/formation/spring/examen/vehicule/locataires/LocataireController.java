package fr.kira.formation.spring.examen.vehicule.locataires;

import fr.kira.formation.spring.examen.vehicule.vehicules.Vehicule;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locataires")
@CrossOrigin
public class LocataireController {

    private final LocataireService locataireService;

    /**
     * Constructeur
     * @param locataireService
     */
    public LocataireController(LocataireService locataireService) {
        this.locataireService = locataireService;
    }

    /**
     * Appel à la méthode findAll pour afficher tout les locataires
     * @return La liste des locataires
     */
    @GetMapping("")
    public List<Locataire> findAll() {
        return locataireService.findAll();
    }

    /**
     * Permet de supprimer les locataires en faisant appel à leur id
     * @param id identifiant du locataire à supprimer
     */
    @DeleteMapping("{id}")
    public void deletedById(@PathVariable String id){
        locataireService.deleteById(id);
    }

    /**
     * Permet d'ajouter un nouveau locataire avec comme parametre un nouvel identifiant
     * @param id identifiant du nouveau locataire
     * @return
     */
    @PutMapping("{id}/locataire")
    public Locataire ajoutLocataire(@PathVariable String id ){
        return this.locataireService.ajoutLocataire(id);
    }

}
