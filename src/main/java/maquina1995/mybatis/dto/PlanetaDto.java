package maquina1995.mybatis.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

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

}
