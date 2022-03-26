package proyecto.sistema.de.restaurant.modelo;

public class TarjetaVisa extends TarjetaDeCredito {

	public TarjetaVisa(Double descuento) {
		super(descuento);
	}

	public Double calcularCosto(Double precioDeBebidas, Double precioDePlatos, Double porcentajeDePropina) {
		Double valorFinal = (precioDeBebidas * (1 - this.descuento() / 100)) + precioDePlatos;
		Double propinaTotal = (valorFinal / 100) * porcentajeDePropina;
		return valorFinal + propinaTotal;

	}

}
