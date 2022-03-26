package proyecto.sistema.de.restaurant.modelo;

//pasar descuento
public abstract class TarjetaDeCredito {
	private Double descuento;
	
	public TarjetaDeCredito(Double descuento) {
		this.descuento = descuento;
	}

	public Double descuento() {
		return this.descuento;
	}

	protected abstract Double calcularCosto(Double precioDeBebidas, Double precioDePlatos, Double propina);

}
