package fr.kira.formation.spring.examen.vehicule.vehicules;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vehicules")
@CrossOrigin
public class VehiculeController {
    private final VehiculeService vehiculeService;


    /**
     * Constructor
     * @param vehiculeService
     */
    public VehiculeController(VehiculeService vehiculeService) {
        this.vehiculeService = vehiculeService;
    }
    @GetMapping("")
    public List<Vehicule> findAll(){
       return vehiculeService.findAll();
    }

    /**
     * Trouver un véhicule par son identifiant
     * @param id
     * @return
     */
    @GetMapping("{id}")
    public Vehicule findById(@PathVariable String id){
        return vehiculeService.findById(id);
    }

    /**
     * Supprime un vehicule
     * @param id identifiant représentant le véhicule supprimé
     */
    @DeleteMapping({"id"})
    public void deleteById(@PathVariable String id){
        vehiculeService.deleteById(id);
    }
    @PutMapping("{id}/vehicules")
    public Vehicule ajoutVehicule(@PathVariable String id ){
        return this.vehiculeService.ajoutVehicule(id);
    }



}
