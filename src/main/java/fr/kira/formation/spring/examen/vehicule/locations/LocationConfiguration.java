package fr.kira.formation.spring.examen.vehicule.locations;

import fr.kira.formation.spring.examen.vehicule.locataires.LocataireService;
import fr.kira.formation.spring.examen.vehicule.vehicules.VehiculeService;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
@Configuration
public class LocationConfiguration {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(LocationConfiguration.class);

    @Bean
    public LocationService locationService(LocationRepository locationRepository, VehiculeService vehiculeService, LocataireService locataireService){
        return new LocationServiceImpl(locationRepository, vehiculeService, locataireService) {

        };



    }

}
