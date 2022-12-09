package fr.kira.formation.spring.examen.vehicule.locataires;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.kira.formation.spring.examen.vehicule.vehicules.Vehicule;
import fr.kira.formation.spring.examen.vehicule.vehicules.VehiculeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDateTime;
import java.util.List;

public class LocataireServiceImpl implements LocataireService{

    private final LocataireRepository locataireRepository;

    private final ObjectMapper objectMapper;

    private final VehiculeService vehiculeService;






    public LocataireServiceImpl(LocataireRepository locataireRepository, ObjectMapper objectMapper, VehiculeService vehiculeService) {
        this.locataireRepository = locataireRepository;
        this.objectMapper = objectMapper;
        this.vehiculeService = vehiculeService;
    }

    @Override
    public List<Locataire> findAll() {
        return locataireRepository.findAll();
    }

    @Override
    public Locataire findById(String id){
        return locataireRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    }

    @Override
    public void deleteById(String id){
        locataireRepository.deleteById(id);
    }

    @Override
    public Locataire ajoutLocataire(String id){
        Locataire locataire = this.findById(id);
        return locataire;
    }

}
