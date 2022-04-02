package proyecto.sistema.de.restaurant.accesos;

import java.util.List;

import proyecto.sistema.de.restaurant.exceptions.AppException;

public interface RegistroDeInscripcionDao {
	void create(String registro) throws AppException;

	void update(String registro);

	String find(String registro);

	List<String> findAll();

}
