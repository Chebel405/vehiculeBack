package fr.kira.formation.spring.examen.vehicule.locataires;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.kira.formation.spring.examen.vehicule.vehicules.VehiculeService;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;

public class LocataireConfiguration {

    private static final Logger logger = (Logger) LoggerFactory.getLogger(LocataireConfiguration.class);

    @Bean
    public LocataireService locataireService(LocataireRepository locataireRepository, ObjectMapper objectMapper, VehiculeService vehiculeService){
        logger.debug("Creation");
        return new LocataireServiceImpl(locataireRepository, objectMapper, vehiculeService);
    }
}
