package maquina1995.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
import maquina1995.mybatis.dto.PlanetaDto;
import maquina1995.mybatis.service.PlanetaService;

@Slf4j
@SpringBootApplication
public class Main implements CommandLineRunner {

	public static void main(String... args) {
		SpringApplication.run(Main.class);
	}

	@Autowired
	private PlanetaService planetaService;

	@Override
	public void run(String... args) {

		PlanetaDto planetaDto = PlanetaDto.builder()
		        .climatologia("Contaminado")
		        .fauna("Desolada")
		        .flora("Desolada")
		        .hostilidadCentinelas("Nula")
		        .nombre("Calypso")
		        .numeroLunas(3)
		        .temperaturaCentigrados(576.6f)
		        .temperaturaFahrenhait(576.6f + 273)
		        .build();

		Long id = planetaService.create(planetaDto);
		log.info("----------- Insert -----------");
		log.info(String.valueOf(id));

		log.info("----------- Find -----------");
		log.info(String.valueOf(planetaService.findById(id)));

		log.info("----------- Find All -----------");
		planetaService.findAll()
		        .map(PlanetaDto::toString)
		        .forEach(log::info);

		log.info("----------- Update -----------");
		log.info("Haciendo update al registro con id 1");
		log.info(planetaService.findById(1L)
		        .toString());

		PlanetaDto planetaDtoUpdate = PlanetaDto.builder()
		        .climatologia("Cambiado")
		        .fauna("Cambiado")
		        .flora("Cambiado")
		        .hostilidadCentinelas("Cambiado")
		        .nombre("Cambiado")
		        .numeroLunas(0)
		        .temperaturaCentigrados(0F)
		        .build();

		log.info("Columnas Afectadas {}", planetaService.update(planetaDtoUpdate, 1L));
		log.info(planetaService.findById(1L)
		        .toString());

		log.info("----------- Delete -----------");
		log.info("Delete del registro con id 1");
		log.info(planetaService.findById(1L)
		        .toString());
		log.info("Columnas Afectadas {}", planetaService.deleteById(1L));
		log.info("Haciendo un find all para demostrar el delete");
		planetaService.findAll()
		        .map(PlanetaDto::toString)
		        .forEach(log::info);
	}

}
