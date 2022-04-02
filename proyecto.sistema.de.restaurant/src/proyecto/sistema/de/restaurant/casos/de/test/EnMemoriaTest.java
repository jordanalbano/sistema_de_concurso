package proyecto.sistema.de.restaurant.casos.de.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import proyecto.sistema.de.restaurant.exceptions.AppException;
import proyecto.sistema.de.restaurant.modelo.Comensal;
import proyecto.sistema.de.restaurant.modelo.Item;
import proyecto.sistema.de.restaurant.modelo.Mesa;
import proyecto.sistema.de.restaurant.modelo.Pedido;
import proyecto.sistema.de.restaurant.modelo.Restaurante;
import proyecto.sistema.de.restaurant.modelo.TarjetaComarcaPlus;

class EnMemoriaTest {

	@Test
	void enMemoriaTest() throws AppException {
		// setup//
		ArrayList<Mesa> mesas = new ArrayList<Mesa>();
		mesas.add(new Mesa(4));
		EnMemoriaRegistroDeInscripcion enMemoria = new EnMemoriaRegistroDeInscripcion();
		Restaurante rico = new Restaurante(12, "Al pacino", "restaurante rico", mesas, enMemoria);
		ArrayList<Item> bebidas = new ArrayList<Item>();
		bebidas.add(new Item("bebida", "coca cola", 250));
		bebidas.add(new Item("bebida", "coca cola", 250));
		ArrayList<Item> platos = new ArrayList<Item>();
		platos.add(new Item("plato", "sushi", 500));
		Pedido pedido = new Pedido(bebidas, platos, 3);
		TarjetaComarcaPlus tarjetaComarcaPlus = new TarjetaComarcaPlus(2.0);
		Comensal comensal = new Comensal("Jordan", "Albano", tarjetaComarcaPlus, pedido, 4);
		rico.confirmarPedido(pedido, mesas.get(0));

		// testeo;
		rico.cobrarPedido(comensal, 2.3);
		// verificacion
		assertEquals("2022-04-02||4||12", enMemoria.encontrar().get());
	}

}
