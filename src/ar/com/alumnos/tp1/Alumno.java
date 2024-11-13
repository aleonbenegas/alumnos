package ar.com.alumnos.tp1;

import java.util.List;

public class Alumno {
	private String nombre;
	private String division;
	private List<Materia> materias;
	
	public Alumno(String nombre, String division, List<Materia>materias){
		this.nombre = nombre;
		this.division = division;
		this.materias = materias;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDivision() {
		return division;
	}

	public void setDivision(String division) {
		this.division = division;
	}

	public List<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(List<Materia> materias) {
		this.materias = materias;
	}
	
	public void getMateriasYNotas() {
		
		for (Materia materia : materias) {
			System.out.println(materia.getNombre() + " - " + materia.getNota());	
		}
	}
}