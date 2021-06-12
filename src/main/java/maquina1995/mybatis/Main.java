package maquina1995.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
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

		log.info("Find By Nombre: ");
		log.info(planetaService.findByNombre("Euclides")
		        .toString());

		log.info("Find By Nombre2: ");
		log.info(planetaService.findByNombre2("Euclides")
		        .toString());

	}

}
