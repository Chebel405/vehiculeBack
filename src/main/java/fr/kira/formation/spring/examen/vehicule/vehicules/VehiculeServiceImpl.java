package fr.kira.formation.spring.examen.vehicule.vehicules;

import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

public class VehiculeServiceImpl implements VehiculeService{

    private VehiculeRepository vehiculeRepository;

    //private LocataireService locataireService;

    public VehiculeServiceImpl(VehiculeRepository vehiculeRepository) {
        this.vehiculeRepository = vehiculeRepository;
    }

    @Override
    public List<Vehicule> findAll(){
        return vehiculeRepository.findAll();
    }

    @Override
    public Vehicule findById(String id){
        return vehiculeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));

    }
    @Override
    public void deleteById(String id){
        vehiculeRepository.deleteById(id);
    }
    @Override
    public Vehicule ajoutVehicule(String id){
        Vehicule vehicule = this.findById(id);

        return vehicule;
    }



}
