package fr.kira.formation.spring.examen.vehicule.vehicules;

import fr.kira.formation.spring.examen.vehicule.locataires.LocataireService;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class VehiculeConfiguration {
    private static final Logger logger = (Logger) LoggerFactory.getLogger(VehiculeConfiguration.class);

    @Bean
    public VehiculeService vehiculeService(VehiculeRepository vehiculeRepository){
        logger.debug("Creation du bean VéhiculeService");
        return new VehiculeServiceImpl(vehiculeRepository);
    }
}
