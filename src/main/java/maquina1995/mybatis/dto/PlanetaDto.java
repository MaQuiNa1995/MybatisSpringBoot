package maquina1995.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import maquina1995.mybatis.domain.Planeta;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlanetaDto {

	private String nombre;
	private String fauna;
	private String hostilidadCentinelas;
	private String flora;
	private String climatologia;
	private Float temperaturaCentigrados;
	private Float temperaturaFahrenhait;
	private Integer numeroLunas;

	public PlanetaDto(Planeta planeta) {
		this.nombre = planeta.getNombre();
		this.climatologia = planeta.getClima();
		this.fauna = planeta.getFauna();
		this.flora = planeta.getFlora();
		this.hostilidadCentinelas = planeta.getCentinelas();
		this.numeroLunas = planeta.getLunas();
		this.temperaturaCentigrados = planeta.getTemperatura();
		this.temperaturaFahrenhait = planeta.getTemperatura() + 273F;
	}

}
