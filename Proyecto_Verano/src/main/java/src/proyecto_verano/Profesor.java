package src.proyecto_verano;

class Profesor extends Persona {
    private String gradoAcademico;
    
    
    

    public Profesor(String nombre, int ci, int edad, String gradoAcademico) {
        super(nombre, ci, edad);
        this.gradoAcademico = gradoAcademico;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("CI: " + getCi());
        System.out.println("Edad: " + getEdad());
        System.out.println("Grado Académico: " + gradoAcademico);
    }
    
    

    public void tieneExperiencia() {
        System.out.println(getNombre()+" es "+gradoAcademico);
    }
}
