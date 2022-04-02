package proyecto.sistema.de.restaurant.modelo;

import java.time.LocalDate;
import java.util.ArrayList;

import proyecto.sistema.de.restaurant.exceptions.AppException;
import proyecto.sistema.de.restaurant.exceptions.ExcepcionPorPedidoVacio;

public class Restaurante {
	private Integer codigo;
	private String nombre;
	private String descripcion;
	private ArrayList<Pedido> pedidosActivos = new ArrayList<Pedido>();
	private ArrayList<Mesa> mesasDisponibles = new ArrayList<Mesa>();
	private RegistroDeInscripcion registro;

	public Restaurante(Integer codigo, String nombre, String descripcion, ArrayList<Mesa> mesas,
			RegistroDeInscripcion registro) {
		this.registro = registro;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.mesasDisponibles = mesas;

	}

	public void cobrarPedido(Comensal comensal, Double porcentaje) throws AppException {
		String registro = LocalDate.now().toString() + "||" + comensal.codigo() + "||" + this.codigo;
		this.registro.registrar(registro);

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
