package fr.kira.formation.spring.examen.vehicule.locations;

import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
@CrossOrigin
public class LocationController {

    private final LocationService locationService;


    /**
     *
     * @param locationService Creation du constructor
     */
    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    /**
     * Appel à la méthode findAll()
     * @return
     */
    @GetMapping("")
    public List<Location> findAll(){
        return locationService.findAll();
    }

    /**
     * Trouver une location avec son id
     * @param id qui permet de trouver la location
     * @return
     */
    @GetMapping("{id}")
    public Location findById(@PathVariable String id){
        return locationService.findById(id);
    }

    /**
     * Permet de supprimer une location par son id
     * @param id qui permet de retrouver la location à supprimer
     */

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        locationService.deleteById(id);

    }

    /**
     * Permet d'ajouter une nouvelle location avec comme param un nouvel id
     * @param id nouvelle id représentant la nouvelle location
     * @return
     */

    @PutMapping("{id}/locations")
    public Location ajoutLocation(@PathVariable String id ){
        return this.locationService.ajoutLocation(id);
    }

}


