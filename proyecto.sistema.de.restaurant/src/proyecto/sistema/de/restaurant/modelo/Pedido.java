package proyecto.sistema.de.restaurant.modelo;

import java.util.ArrayList;

public class Pedido {
	private ArrayList<Item> bebidas;
	private ArrayList<Item> platos;

	private Integer codigo;

	public Pedido(ArrayList<Item> bebidas, ArrayList<Item> platos, Integer codigo) {
		this.bebidas = bebidas;
		this.platos = platos;
		this.codigo = codigo;
		// lo mas importante calcular los costos
	}

	public Double obtenerPrecioTotal() {
		return this.precioTotalDeBebidas() + this.precioTotalDePlatos();
	}

	public Pedido(Integer codigo) {
		this.codigo = codigo;
	}

	public void agregarBebida(Item bebida) {
		this.bebidas.add(bebida);
	}

	public void agregarPlato(Item plato) {
		this.platos.add(plato);
	}

	public Double precioTotalDeBebidas() {
		return (double) bebidas.stream().mapToLong(b -> b.precio()).sum();
	}

	public Double precioTotalDePlatos() {
		return (double) platos.stream().mapToLong(p -> p.precio()).sum();
	}

	@SuppressWarnings("unused")
	private Integer codigo() {
		return this.codigo;
	}

	public int cantidadDeBebidas() {
		return this.bebidas.size();
	}

	public Integer cantidadDePlatos() {
		return this.platos.size();
	}

}
