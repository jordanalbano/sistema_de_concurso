package proyecto.sistema.de.restaurant.persistencia;

import proyecto.sistema.de.restaurant.accesos.RegistroDeInscripcionDAOJDBC;
import proyecto.sistema.de.restaurant.accesos.RegistroDeInscripcionDao;
import proyecto.sistema.de.restaurant.exceptions.AppException;
import proyecto.sistema.de.restaurant.modelo.RegistroDeInscripcion;

public class EnBaseDeDatosRegistroDeInscripcion implements RegistroDeInscripcion {
	private RegistroDeInscripcionDao registro;

	public EnBaseDeDatosRegistroDeInscripcion() {
		registro = new RegistroDeInscripcionDAOJDBC();
	}

	@Override
	public void registrar(String registro) throws AppException {
		this.registro.create(registro);
	}

}
