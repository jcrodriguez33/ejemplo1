package test;

import java.util.ArrayList;
import java.util.List;

import dominio.CajaDeAhorro;

/**
 * Ejemplo ABSOLUTAMENTE mejorable del uso de collections con objetos y m�todos est�ticos 
 * @author jzapana
 *
 */
public class Main {
	
	public static List<CajaDeAhorro> listaDeCajas = new ArrayList<>(); 
	
	/**
	 * Genera 3 cuentas de ejemplo
	 */
	public static void generarCuentas() {
		CajaDeAhorro c1 = new CajaDeAhorro(1, "0001", "Jeniffer Lopez", 600.00);		
		CajaDeAhorro c2 = new CajaDeAhorro(2, "0002", "Cristina Aguilera", 200.00);		
		CajaDeAhorro c3 = new CajaDeAhorro(3, "0003", "Brath Pit", 300.00);
		
		listaDeCajas.add(c1);
		listaDeCajas.add(c2);
		listaDeCajas.add(c3);		
	}

	/**
	 * Muestra todos los objetos creados
	 */
	public static void mostrarTodas() {
		for(CajaDeAhorro x:listaDeCajas) {
			System.out.println(x);
		}		
	}
	
	/**
	 * Busca una cuenta por su titular
	 * @param nombre
	 */
	public static void buscar(String nombre) {
		for(CajaDeAhorro x:listaDeCajas) {
			if(x.getTitular().equals(nombre))
				System.out.println(x);
		}
	}	
	
	
	public static void main(String[] args) {
		System.out.println("Generando cuentas....");
		generarCuentas();
		System.out.println("Mostrar todas las cuentas...");
		mostrarTodas();
		System.out.println("Buscando un titular...");
		String nombre = "Jeniffer Lopez";
		buscar(nombre);
	}

}
