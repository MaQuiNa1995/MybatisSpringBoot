package maquina1995.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import maquina1995.mybatis.domain.Planeta;

@Mapper
public interface PlanetaMapper {

	@Select("SELECT * FROM Planeta WHERE nombre = #{nombre}")
	Planeta findByNombre(@Param("nombre") String nombre);

}
