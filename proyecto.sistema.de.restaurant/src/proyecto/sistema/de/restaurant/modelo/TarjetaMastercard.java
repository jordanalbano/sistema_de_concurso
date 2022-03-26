package proyecto.sistema.de.restaurant.modelo;

public class TarjetaMastercard extends TarjetaDeCredito {

	public TarjetaMastercard(Double descuento) {
		super(descuento);
		// TODO Esbozo de constructor generado automáticamente
	}

	public Double calcularCosto(Double precioDeBebidas, Double precioDePlatos, Double porcentajeDePropina) {

		Double valorFinal = (precioDePlatos * (1 - this.descuento() / 100)) + precioDeBebidas;
		Double propinaTotal = (valorFinal / 100) * porcentajeDePropina;
		return valorFinal + propinaTotal;

	}

}
