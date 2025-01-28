package src.proyecto_verano;

public class Director extends Persona {
    private String formacionAcademica;
    private int añosServicio;

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = formacionAcademica;
    }

    public int getAñosServicio() {
        return añosServicio;
    }

    public void setAñosServicio(int añosServicio) {
        this.añosServicio = añosServicio;
    }

    public Director(String nombre, int ci, int edad, String formacionAcademica, int añosServicio) {
        super(nombre, ci, edad);
        this.formacionAcademica = formacionAcademica;
        this.añosServicio = añosServicio;
    }

    public void mostrar()
    {
        System.out.println("Nombre: " + getNombre());
        System.out.println("CI: " + getCi());
        System.out.println("Edad: " + getEdad());
        System.out.println("Formacion academica: "+formacionAcademica+", Anios de Servicio: "+añosServicio);
    }
}
