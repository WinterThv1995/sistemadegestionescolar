package src.proyecto_verano;

public class Estudiante extends Persona {
    private String grado;
    private int nota;  // Nuevo atributo nota

    public Estudiante(String grado, String nombre, int ci, int edad, int nota) {
        super(nombre, ci, edad);
        this.grado = grado;
        this.nota = nota;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("CI: " + getCi());
        System.out.println("Edad: " + getEdad());
        System.out.println("Grado: " + grado);
        System.out.println("Nota: " + nota);
    }

    public boolean esMenorDeEdad() {
        return getEdad() < 18;
    }
}
