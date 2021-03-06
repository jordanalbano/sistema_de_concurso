package proyecto.sistema.de.restaurant.persistencia;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import proyecto.sistema.de.restaurant.modelo.RegistroDeInscripcion;

public class EnDiscoRegistroDeInscripcion implements RegistroDeInscripcion {

	@Override
	public void registrar(String registro) {
		try {
			Files.write(Paths.get("C:\\Users\\usuario\\Desktop\\restaurant.txt"), registro.getBytes(),
					StandardOpenOption.APPEND);
		} catch (IOException e) {
			throw new RuntimeException("No se pudo persistir", e);
		}

	}
}
