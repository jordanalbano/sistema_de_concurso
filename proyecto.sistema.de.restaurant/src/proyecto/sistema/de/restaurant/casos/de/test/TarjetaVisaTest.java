package proyecto.sistema.de.restaurant.casos.de.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import proyecto.sistema.de.restaurant.modelo.Comensal;
import proyecto.sistema.de.restaurant.modelo.Item;
import proyecto.sistema.de.restaurant.modelo.Pedido;
import proyecto.sistema.de.restaurant.modelo.TarjetaVisa;

class TarjetaVisaTest {

	@Test
	void test() {
		// setup
		TarjetaVisa tarjetaComarcaPlus = new TarjetaVisa(2.0);
		ArrayList<Item> bebidas = new ArrayList<Item>();
		bebidas.add(new Item("bebida", "coca cola", 250));
		bebidas.add(new Item("bebida", "coca cola", 250));

		ArrayList<Item> platos = new ArrayList<Item>();
		platos.add(new Item("plato", "sushi", 500));
		Pedido pedido = new Pedido(bebidas, platos, 1);

		Comensal comensal = new Comensal("Jordan", "Albano", tarjetaComarcaPlus, pedido, 2);
		// ejercicio//testeo
		Double res = comensal.pagar(2.0);
		// verificar
		assertEquals(1009.8, res, 0.01);// tercer valor
	}

}
