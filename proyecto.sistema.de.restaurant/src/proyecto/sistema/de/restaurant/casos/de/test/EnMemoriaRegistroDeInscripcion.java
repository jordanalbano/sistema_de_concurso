package proyecto.sistema.de.restaurant.casos.de.test;

import java.util.Objects;
import java.util.Optional;

import proyecto.sistema.de.restaurant.modelo.RegistroDeInscripcion;

public class EnMemoriaRegistroDeInscripcion implements RegistroDeInscripcion {
	private String registroGuardado = null;// String por defecto es nulo?

	public void registrar(String registro) {
		// TODO Esbozo de método generado automáticamente
		this.registroGuardado = registro;
	}

	/*
	 * public String encontrar() {
	 * 
	 * return this.registroGuardado; }
	 */

	public Optional<String> encontrar() {
		return Optional.of(Objects.requireNonNull(this.registroGuardado, "no hay ningun registro guardado"));

	}

}
