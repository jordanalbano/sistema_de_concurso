package proyecto.sistema.de.restaurant.modelo;

public class TarjetaComarcaPlus extends TarjetaDeCredito {
	public TarjetaComarcaPlus(double descuento) {
		super(descuento);
	}

	public Double calcularCosto(Double precioDeBebidas, Double precioDePlatos, Double porcentajeDePropina) {
		Double valorFinal = (precioDePlatos + precioDeBebidas) * (1 - this.descuento() / 100);
		Double propinaTotal = (valorFinal / 100) * porcentajeDePropina;
		return valorFinal + propinaTotal;

	}

}
