package com.utn.vista;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class main {

	public static Map<Integer, Zapato> Zapatito = new TreeMap<Integer, Zapato>();
	static Comparator<Zapato> sortearTalle = new Comparador();
	static List<Zapato> zapatos = new ArrayList<>();

	public static void main(String[] args) {
		String[] opcionesInterfaz = { "agregar zapato", "Mostrar talles en orden", "cerrar" };

		boolean stahp = true;

		while (stahp) {
			int opcionesInterfaz1 = JOptionPane.showOptionDialog(null, "seleccione las opciones", "bibliofer", 0, 0,
					null, opcionesInterfaz, 1);
			switch (opcionesInterfaz1) {
			case 0:
				int talleTemporal = Integer.parseInt(JOptionPane.showInputDialog("escriba el talle del zapato"));
				Zapatito.put(talleTemporal, new Zapato(talleTemporal));
				break;

			case 1:
				Zapatito.forEach((k, v) -> {
					zapatos.add(v);
				});
				zapatos.sort(sortearTalle);
				for (Zapato zapatosio : zapatos) {
					JOptionPane.showMessageDialog(null, zapatosio.toString());
				}

				break;

			case 2:
				System.exit(0);
			}

		}
	}

}
