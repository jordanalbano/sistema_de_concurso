package proyecto.sistema.de.restaurant.modelo;

public class ExcepcionPorMesasNoDisponibles extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ExcepcionPorMesasNoDisponibles(String message) {
		super(message);
	}
}
