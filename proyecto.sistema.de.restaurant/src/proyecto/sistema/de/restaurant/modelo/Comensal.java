package proyecto.sistema.de.restaurant.modelo;

public class Comensal {
	private String nombre;
	private String apellido;
	private TarjetaDeCredito tarjeta;
	private Pedido pedido;
	private int codigo;

	public Comensal(String nombre, String apellido, TarjetaDeCredito tarjeta, Pedido pedido, int codigo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.tarjeta = tarjeta;
		this.pedido = pedido;
		this.codigo = codigo;
	}

	public int codigo() {
		return this.codigo;
	}

	public String nombre() {
		return this.nombre;
	}

	public String apellido() {
		return this.apellido;
	}

	public Double pagar(Double porcentajeDePropina) {
		Double precioDeBebidas = pedido.precioTotalDeBebidas();
		Double precioDePlatos = pedido.precioTotalDePlatos();

		return tarjeta.calcularCosto(precioDeBebidas, precioDePlatos, porcentajeDePropina);

	}
}
