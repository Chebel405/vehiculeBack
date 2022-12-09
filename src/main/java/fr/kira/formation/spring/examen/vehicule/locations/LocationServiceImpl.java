package fr.kira.formation.spring.examen.vehicule.locations;

import com.mongodb.client.result.UpdateResult;
import fr.kira.formation.spring.examen.vehicule.locataires.Locataire;
import fr.kira.formation.spring.examen.vehicule.locataires.LocataireService;
import fr.kira.formation.spring.examen.vehicule.vehicules.VehiculeService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

public class LocationServiceImpl implements LocationService{

    public static final Logger logger = LoggerFactory.getLogger(LocationRepository.class);

    private final LocationRepository locationRepository;

    private final VehiculeService vehiculeService;

    private final LocataireService locataireService;


    public LocationServiceImpl(LocationRepository locationRepository, VehiculeService vehiculeService, LocataireService locataireService) {
        this.locationRepository = locationRepository;
        this.vehiculeService = vehiculeService;
        this.locataireService = locataireService;
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll();
    }

    @Override
    public Location findById(String id){
        return locationRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id){
        locationRepository.deleteById(id);
    }

    @Override
    public Location ajoutLocation(String id){
        Location location = this.findById(id);
        return location;
    }



}
