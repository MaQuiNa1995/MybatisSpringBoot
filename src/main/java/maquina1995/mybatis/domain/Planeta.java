package maquina1995.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import maquina1995.mybatis.dto.PlanetaDto;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Planeta {

	private Long id;
	private String nombre;
	private String fauna;
	private String centinelas;
	private String flora;
	private String clima;
	private Float temperatura;
	private Integer lunas;

	public Planeta(PlanetaDto planetaDto) {
		this.centinelas = planetaDto.getHostilidadCentinelas();
		this.clima = planetaDto.getClimatologia();
		this.fauna = planetaDto.getFauna();
		this.flora = planetaDto.getFlora();
		this.lunas = planetaDto.getNumeroLunas();
		this.nombre = planetaDto.getNombre();
		this.temperatura = planetaDto.getTemperaturaCentigrados();

	}

}
