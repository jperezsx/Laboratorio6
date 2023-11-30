package app;
import java.util.Stack;
import java.util.Scanner;


public class GestionTareas {
	
	public static void main(String[] args) {
		
		Stack<Tarea> tareasPendientes = new Stack<>();
				
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		
		while(opcion != 4) {
			
			System.out.println("Sistema de Gestión De Tareas Pendientes");
			System.out.println("1.-Agregar Tarea Pendiente");
			System.out.println("2.-Marcar Tarea Como Completada");
			System.out.println("3.-Mostrar Tareas Pendientes");
			System.out.println("4.-Salir");
			System.out.print("Seleccione una opción: ");
			opcion = scanner.nextInt();
			switch (opcion) {
				case 1: 
					scanner.nextLine();
					System.out.println("Ingrese el nombre de la tarea Pendiente:");
					String tarea = scanner.nextLine();
					Tarea nuevaTarea = new Tarea(tarea, "Pendiente", "18-10-2023");
					tareasPendientes.push(nuevaTarea);
					System.out.println("Tarea Agregada");
					break;
				case 2:
					if(!tareasPendientes.isEmpty()) {

						
						System.out.println("Mi lista de tareas pendientes");
						for(Tarea tareap : tareasPendientes) {
							
							System.out.println(tareap);
						
						
						}
						System.out.println("Indique el nombre de la tarea a eliminar: ");
						String nombreTarea = scanner.nextLine();
						
						for(Tarea tareab : tareasPendientes) {
							
							if(tareab.getNombre() == nombreTarea) {
								
								tareab.setEstado("Terminada");
							}
							
						}
						
						
						
						
						
						
					}
					System.out.println("Su lista de tareas pendientes esta vacía");
					break;
					
				case 3:
					break;
				case 4:
					System.out.println("Mi lista de tareas pendientes");
					for(Tarea tareap : tareasPendientes) {
						
						int numTarea = 1;
						System.out.println(numTarea + " - " + tareap);
						numTarea++;
					
					}
					break;
					
					
				default: 
					
					break;
				
			
			}
		}
		
		scanner.close();
		
		
		
	}

}
