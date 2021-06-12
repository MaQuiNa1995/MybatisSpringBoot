package maquina1995.mybatis.service;

import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import maquina1995.mybatis.dao.PlanetaRepository;
import maquina1995.mybatis.domain.Planeta;
import maquina1995.mybatis.dto.PlanetaDto;
import maquina1995.mybatis.mapper.PlanetaMapper;

@Service
@RequiredArgsConstructor
public class PlanetaService {

	private final PlanetaRepository planetaRepository;
	private final PlanetaMapper planetaMapper;

	public PlanetaDto findByNombre(String nombre) {
		Planeta planeta = planetaMapper.findByNombre(nombre);
		return this.convertToDto(planeta);
	}

	public PlanetaDto findByNombre2(String nombre) {
		Planeta planeta = planetaRepository.findByNombre(nombre);
		return this.convertToDto(planeta);
	}

	private PlanetaDto convertToDto(Planeta planeta) {
		Float temperaturaCentigrados = planeta.getTemperatura();
		Float temperaturaFahrenhait = temperaturaCentigrados + 273F;

		return PlanetaDto.builder()
		        .nombre(planeta.getNombre())
		        .climatologia(planeta.getClima())
		        .fauna(planeta.getFauna())
		        .flora(planeta.getFlora())
		        .hostilidadCentinelas(planeta.getCentinelas())
		        .numeroLunas(planeta.getLunas())
		        .temperaturaCentigrados(temperaturaCentigrados)
		        .temperaturaFahrenhait(temperaturaFahrenhait)
		        .build();
	}

}
