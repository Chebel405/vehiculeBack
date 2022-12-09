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


    @GetMapping("")
    public List<Locataire> findAll() {
        return locataireService.findAll();
    }

    @DeleteMapping("{id}")
    public void deletedById(@PathVariable String id){
        locataireService.deleteById(id);
    }

    @PutMapping("{id}/locataire")
    public Locataire ajoutLocataire(@PathVariable String id ){
        return this.locataireService.ajoutLocataire(id);
    }

}
