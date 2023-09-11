package Consola;


import Logica.Restaurante;

public class Aplicacion {
	
	Restaurante restaurante = new Restaurante();
	public void ejecutarAplicacion() {
		boolean continuar = true;
		while(continuar) {
			
			try {
				mostrarMenu();
				int opcion = Integer.parseInt(input("Porfavor seleccione una opción: "));
				if(opcion == 1) {
					ejecutarMostrarMenu();
				}else if (opcion == 2) {
					ejecutarNuevoPedido();
				}else if (opcion == 3) {
					ejecutarAgregarElemento();
				}else if (opcion == 4) {
					ejecutarCerrarPedido();
				}else if (opcion ==5) {
					ejecutarConsultarPedidoID();
				}else if (opcion == 6){
					System.out.println("Saliendo de la aplicación ...");
					continuar = false;
				}else {
					System.out.println("Por favor seleccione una opción válida.");
				}
			}
			catch (NumberFormatException e)
			{
				System.out.println("Debe seleccionar uno de los números de las opciones.");
			}
		}
	}

	private String input(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	public void mostrarMenu() {
		System.out.println("Opciones\n");
		System.out.println("1. Mostrar el Menu");
		System.out.println("2. Iniciar un nuevo pedido");
		System.out.println("3. Agregar un elemento al pedido");
		System.out.println("4. Cerrar el pedido y guardar la factura");
		System.out.println("5. Consultar la informacion de un pedido dado su ID");
		System.out.println("6. Salir de la aplicación\n");
	}
	private void ejecutarMostrarMenu() {
		
	}
	private void ejecutarNuevoPedido(){
		
	}
	private void ejecutarAgregarElemento() {
		
	}
	private void ejecutarCerrarPedido() {
		
	}
	private void ejecutarConsultarPedidoID() {
		
	}
	
	public static void main(String[] args) {
		Aplicacion aplicacion = new Aplicacion();
		aplicacion.ejecutarAplicacion();
	}
}
