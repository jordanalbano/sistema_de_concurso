package proyecto.sistema.de.restaurant.modelo;

public class Item {
	private String descripcion;
	private String nombre;
	private Integer precio;

	public Item(String descripcion, String nombre, Integer precio) {
		this.descripcion = descripcion;
		this.nombre = nombre;
		this.precio = precio;
	}

	public String descripcion() {
		return this.descripcion;
	}

	public String nombre() {
		return this.nombre;
	}

	public Integer precio() {
		return this.precio;
	}

}
