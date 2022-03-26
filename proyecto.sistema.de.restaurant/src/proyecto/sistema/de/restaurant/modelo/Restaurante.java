package proyecto.sistema.de.restaurant.modelo;

import java.util.ArrayList;

public class Restaurante {
	private Integer codigo;
	private String nombre;
	private String descripcion;
	private ArrayList<Pedido> pedidosActivos = new ArrayList<Pedido>();
	private ArrayList<Mesa> mesasDisponibles = new ArrayList<Mesa>();

	public Restaurante(Integer codigo, String nombre, String descripcion, ArrayList<Mesa> mesas) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.mesasDisponibles = mesas;

	}

	public void cobrarPedido(Comensal comensal, Double porcentaje) {
		comensal.pagar(porcentaje);
	}

	private Integer codigo() {
		return this.codigo;
	}

	private String nombre() {
		return this.nombre;
	}

	private String descripcion() {
		return this.descripcion;
	}

	// los usuarios no pueden armar un pedido si no estan en una mesa?
	public void confirmarPedido(Pedido pedido, Mesa mesaParaOcupar) {
		if (pedido == null) {
			throw new NullPointerException("El pedido Es Nulo");
		}
		if (pedido.cantidadDeBebidas() == 0 && pedido.cantidadDePlatos() == 0) {
			throw new ExcepcionPorPedidoVacio("Debe Pedir Al Menos Una Bebida o Un Plato");
		}

		this.pedidosActivos.add(pedido);
	}

}
