package maquina1995.mybatis.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lombok.RequiredArgsConstructor;
import maquina1995.mybatis.domain.Planeta;

/**
 * Este repository se usa para poder llamar a los mapper que tendríamos
 * definidos en un XML o para poder envolver varias consultas en una trasacción
 * por ejemplo
 * <p>
 * Aunque como demuestro aqui tambien podrías llamar a las consultas definidas
 * en un {@link org.apache.ibatis.annotations.MapperMapper}
 * <p>
 * Para ese supuesto deberías de llamar al mapper directamente desde el
 * service...
 */
@Repository
@RequiredArgsConstructor
public class PlanetaRepositoryImpl implements PlanetaRepository {

	private final SqlSession sqlSession;

	@Override
	public Planeta findById(Long id) {
		throw new UnsupportedOperationException("falta de completar esta parte :)");
	}

}
