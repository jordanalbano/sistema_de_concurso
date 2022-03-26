package proyecto.sistema.de.restaurant.modelo;

public class Mesa {
	private Integer capacidad;
	public Mesa(Integer capacidad) {
		this.capacidad = capacidad;
	}
	public Integer capacidadTotal() {
		return this.capacidad;
	}

}
