package app;

import java.util.Objects;

public class Tarea {
	
	private String nombre;
	private String estado;
	private String fecha;
	private String apellido;

	
	public Tarea(String nombre, String estado, String fecha, String apellido) {
		
		this.nombre = nombre;
		this.estado = estado;
		this.fecha = fecha;
		this.apellido = apellido;
		
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getEstado() {
		return estado;
	}


	public void setEstado(String estado) {
		this.estado = estado;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	@Override
	public String toString() {
		return "Tarea [nombre=" + nombre + ", estado=" + estado + ", fecha=" + fecha + "]";
	}
	

	@Override
	public boolean equals(Object obj) {
		
		Tarea other = (Tarea) obj;
		return Objects.equals(estado, other.estado) && Objects.equals(fecha, other.fecha)
				&& Objects.equals(nombre, other.nombre);
	}
	


}