package fr.kira.formation.spring.examen.vehicule.locations;

import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/locations")
@CrossOrigin
public class LocationController {

    private final LocationService locationService;



    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    @GetMapping("")
    public List<Location> findAll(){
        return locationService.findAll();
    }

    @GetMapping("{id}")
    public Location findById(@PathVariable String id){
        return locationService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable String id){
        locationService.deleteById(id);

    }

    @PutMapping("{id}/locations")
    public Location ajoutLocation(@PathVariable String id ){
        return this.locationService.ajoutLocation(id);
    }

}


