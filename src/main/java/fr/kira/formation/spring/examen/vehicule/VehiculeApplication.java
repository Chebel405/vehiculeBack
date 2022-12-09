package fr.kira.formation.spring.examen.vehicule;

import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jackson.Jackson2ObjectMapperBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.http.codec.cbor.Jackson2CborDecoder;

import java.time.format.DateTimeFormatter;

@SpringBootApplication
public class VehiculeApplication {

	public static void main(String[] args) {
		SpringApplication.run(VehiculeApplication.class, args);
	}

	@Bean
	public Jackson2ObjectMapperBuilderCustomizer jsonCustomizer(){
		return builder -> {
			builder.simpleDateFormat("dd/MM/yyyy")
					.serializers(new LocalDateSerializer(DateTimeFormatter.ofPattern("dd/MM/yyyy")))
					.serializers(new LocalDateSerializer(DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss")));

		};
	}

	/*@Bean
	public Docket api(){
		return new Docket(DocumentationType.Swagger_2)
				.select()
				.apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.any))
				.build();
	}*/

}
