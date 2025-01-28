package src.proyecto_verano;

import java.util.ArrayList;

public class Colegio {
    private String nombre;
    private String ubicacion;
    private Director direc;
    private ArrayList<Aula> A;

    public Colegio(String nombre, String ubicacion, Director direc, ArrayList<Aula> A) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.direc = direc;
        this.A = A;
    }

    public void mostrar(){
        System.out.println("Nombre Colegio: " + nombre + ", Ubicación: " + ubicacion);
        System.out.println("Director: ");
        direc.mostrar();
        System.out.println("Lista de Aulas:");
        for (Aula aula : A) {
            aula.mostrar();
        }
    }

    public void agregarAula(Aula aula) {
        A.add(aula);
    }

    public Aula buscarAulaPorId(String id) {
        for (Aula aula : A) {
            if (aula.getIdAula().equals(id)) {
                return aula;
            }
        }
        return null;
    }

    
    public void mostrarEstMen() {
        for (Aula aula : A) {
            for (Estudiante estudiante : aula.getMat().getEstudiantes()) {
                if (estudiante.esMenorDeEdad()) {
                    System.out.println(estudiante.getNombre() + " es menor de edad.");
                }
            }
        }
    }

    public String estaEstudianteEnMateria(String nombreEstudiante, String nombreMateria) {
        for (Aula aula : A) {
            if (aula.getMat().getNombreMateria().equalsIgnoreCase(nombreMateria)) {
                for (Estudiante estudiante : aula.getMat().getEstudiantes()) {
                    if (estudiante.getNombre().equalsIgnoreCase(nombreEstudiante)) {
                        return nombreEstudiante + " está en la materia " + nombreMateria;
                    }
                }
            }
        }
        return nombreEstudiante + " no está en la materia " + nombreMateria;
    }


}
