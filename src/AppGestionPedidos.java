import java.util.InputMismatchException;
import java.util.Scanner;

import entidades.ListaPrecios;
import entidades.Producto;
import entidades.Tarjeta;

public class AppGestionPedidos {

	
	public static void main(String[] args) {
		ListaPrecios listaPrecios = null;
		
		Scanner sc = new Scanner(System.in);
		int opcion = -1;
		while (opcion != 0) {
			
			System.out.println("Ingrese 1 para cargar la lista de precios");
			System.out.println("Ingrese 2 para ver la lista de precios");
			System.out.println("Ingrese 0 para salir");
			
			opcion = sc.nextInt();
			sc.nextLine();
			
			switch (opcion) {
				case 1: listaPrecios = crearListaPrecios(sc);
						break;
				case 2: listaPrecios.verListaVenta();
						break;
			}
				
			
		
		}

	}
	
	
	public static ListaPrecios crearListaPrecios(Scanner sc) {
		ListaPrecios listaPrecios = new ListaPrecios(1l, "Juan Perez y asociados");
		String salir = "n";
		while ("n".equals(salir)) {
			System.out.print("Ingrese el codigo del producto ");
			String codProd = sc.nextLine();
			
			System.out.print("Ingrese el nombre del producto ");
			String nombreProd = sc.nextLine();
			
			System.out.print("Ingrese el precio del producto $ ");
			
			double precioProd = 0.0;
			
			Producto prod = new Producto(codProd,nombreProd);
			boolean precioValido = false;

			precioProd = sc.nextDouble();
			sc.nextLine();

			
			prod.setPrecio(precioProd);
			listaPrecios.agregarProducto(prod);
		
			System.out.println("Desea salir? s/n");
			salir = sc.nextLine();
			
		}
		
		
		return listaPrecios;
	}

}
