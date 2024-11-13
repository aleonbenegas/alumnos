package ar.com.alumnos.tp1;

import java.util.ArrayList;
import java.util.List;

public class Escuela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Materia> materiasJuan = new ArrayList<Materia>();
		List<Materia> materiasFlor = new ArrayList<Materia>();
		List<Alumno> alumnos= new ArrayList<Alumno>();
		
		Materia lengua = new Materia("Lengua", 9);
		Materia historia = new Materia("Historia", 9);
		Materia matematica = new Materia("Matematica", 9);
		
		Materia lenguaFlor = new Materia("Lengua", 10);
		Materia historiaFlor = new Materia("Historia", 8);
		Materia matematicaFlor = new Materia("Matematica", 10);
		
		materiasJuan.add(lengua);
		materiasJuan.add(historia);
		materiasJuan.add(matematica);
		
		materiasFlor.add(matematicaFlor);
		materiasFlor.add(lenguaFlor);
		materiasFlor.add(historiaFlor);
		
		//Un alumno tiene nombre, anio en curso y una lista de materias
		Alumno juan = new Alumno("Juan","6to4ta", materiasJuan);
		Alumno flor = new Alumno("moises","6to4ta", materiasFlor);
		
		alumnos.add(flor);
		alumnos.add(juan);
		
		//Imprimo solamente el nombre de la materia
		System.out.println("Materias Juan:");
		
		for (int i = 0; i < materiasJuan.size(); i++) {
			System.out.println(materiasJuan.get(i).getNombre());
		}
		
		//Imprimo el nombre de la materia y la nota
		System.out.println("");
		System.out.println("Notas por materia Juan:");
		
		for (int i = 0; i < materiasJuan.size(); i++) {
			System.out.println(materiasJuan.get(i).getNombre() + " - " + materiasJuan.get(i).getNota());
		}
		
		System.out.println("");	//Salto de línea
		System.out.println("Materias Flor:");
		
		for (int i = 0; i < materiasFlor.size(); i++) {
			System.out.println(materiasFlor.get(i).getNombre());
		}
	}

}
