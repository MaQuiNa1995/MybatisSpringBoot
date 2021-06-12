package maquina1995.mybatis.dao;

import maquina1995.mybatis.domain.Planeta;

public interface PlanetaRepository {

	Planeta findByNombre(String nombre);

}