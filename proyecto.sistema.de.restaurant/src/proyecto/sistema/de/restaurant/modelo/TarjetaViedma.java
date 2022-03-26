package proyecto.sistema.de.restaurant.modelo;

public class TarjetaViedma extends TarjetaDeCredito {
	public TarjetaViedma(Double descuento) {
		super(descuento);
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Double calcularCosto(Double precioDeBebidas, Double precioDePlatos, Double porcentajeDePropina) {
		Double valorFinal = (precioDePlatos + precioDeBebidas);
		Double propinaTotal = (valorFinal / 100) * porcentajeDePropina;
		return valorFinal + propinaTotal;
		
	}
}
