package maquina1995.mybatis.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

}
