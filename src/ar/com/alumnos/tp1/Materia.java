package ar.com.alumnos.tp1;

public class Materia {
	
	private String nombre;
	private int nota;
	
	public Materia(String nombre, int nota) {
		this.nombre = nombre;
		this.nota = nota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getNota() {
		return nota;
	}
	public void setNota(int nota) {
		this.nota = nota;
	}
}
