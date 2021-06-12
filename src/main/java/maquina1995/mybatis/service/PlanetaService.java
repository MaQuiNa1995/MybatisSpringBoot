package maquina1995.mybatis.service;

import java.util.stream.Stream;

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

	public Long create(PlanetaDto planetaDto) {
		Planeta planeta = new Planeta(planetaDto);
		planetaMapper.insert(planeta);
		return planeta.getId();
	}

	public PlanetaDto findById(Long id) {
		Planeta planeta = planetaMapper.findById(id);
		return new PlanetaDto(planeta);
	}

	public Stream<PlanetaDto> findAll() {
		return planetaMapper.findAll()
		        .stream()
		        .map(PlanetaDto::new);
	}

	public int update(PlanetaDto planetaDto, Long id) {
		Planeta planeta = new Planeta(planetaDto);
		return planetaMapper.update(planeta, id);
	}

	public Integer deleteById(Long id) {
		return planetaMapper.delete(id);
	}

}
