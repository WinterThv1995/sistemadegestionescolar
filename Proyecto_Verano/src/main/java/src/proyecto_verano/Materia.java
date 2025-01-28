package src.proyecto_verano;

import java.util.ArrayList;

public class Materia {
    private String nombreMateria;
    private Profesor profesor; 
    private ArrayList<Estudiante> estudiantes;

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Materia(String nombreMateria, Profesor profesor) {
        this.nombreMateria = nombreMateria;
        this.profesor = profesor;
        this.estudiantes = new ArrayList<>();
    }

    public void mostrar() {
        
        System.out.println("Nombre de la materia: " + nombreMateria);
        System.out.println("Profesor:");
        profesor.mostrar();
        System.out.println("Lista de estudiantes:");
        for (Estudiante estudiante : estudiantes) {
            System.out.println(" - " + estudiante.getNombre() + ", Nota: " + estudiante.getNota());
        }
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Profesor getProfesor() {
        return profesor;
    }
}
