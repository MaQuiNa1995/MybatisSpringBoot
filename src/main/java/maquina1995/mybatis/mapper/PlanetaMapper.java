package maquina1995.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import maquina1995.mybatis.domain.Planeta;

@Mapper
public interface PlanetaMapper {

	/**
	 * Si necesitas llamar a un generador de secuencias: call next value for
	 * NombreSecuencia
	 * <p>
	 * Ten en cuenta que si el nombre de la key es "id" no hace falta incluir
	 * "keyProperty"
	 * <p>
	 * OJO: con el before:
	 * <li>true: te devolverá 4 porque hará la "query antes de insertar"</li>
	 * <li>false te devolverá 5 ya que ya habrá metido la entidad nueva</li>
	 * <p>
	 * Tambien podrías definir esto para generar el Id:
	 * {@link org.apache.ibatis.annotations.Options} (useGeneratedKeys = true,
	 * keyProperty = "id", keyColumn = "id")
	 * <p>
	 * pero {@link SelectKey} tiene muchas mas opciones al ser mas actual
	 */
	@Insert("INSERT INTO Planeta(nombre,fauna,centinelas,flora,clima,temperatura,lunas) "
	        + "VALUES(#{nombre}, #{fauna}, #{centinelas}, #{flora}, #{clima}, #{temperatura}, #{lunas})")
	@SelectKey(statement = "call identity()",
	        keyProperty = "id",
	        before = false,
	        resultType = Long.class)
	Long insert(Planeta planeta);

	@Select("SELECT * FROM Planeta WHERE id = #{id}")
	Planeta findById(@Param("id") Long id);

	@Select("SELECT * FROM Planeta")
	List<Planeta> findAll();

	@Update("UPDATE Planeta SET nombre=#{planeta.nombre},fauna=#{planeta.fauna},centinelas=#{planeta.centinelas},"
	        + "flora=#{planeta.flora},clima=#{planeta.clima},temperatura=#{planeta.temperatura},"
	        + "lunas=#{planeta.lunas} WHERE id=#{id}")
	Integer update(Planeta planeta, @Param("id") Long id);

	@Delete("DELETE FROM Planeta WHERE id=#{id}")
	Integer delete(Long id);

}
