package src.proyecto_verano;

public class Aula {
    private String idAula;
    private int capacidad;
    private Materia mat;

    public String getIdAula() {
        return idAula;
    }

    public void setIdAula(String idAula) {
        this.idAula = idAula;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Materia getMat() {
        return mat;
    }

    public void setMat(Materia mat) {
        this.mat = mat;
    }

    public Aula(String idAula, int capacidad, Materia mat) {
        this.idAula = idAula;
        this.capacidad = capacidad;
        this.mat = mat;
    }

    public void mostrar(){
        System.out.println("-----------------------------------------------------");
        System.out.println("Id Aula: " + idAula + ", Capacidad: " + capacidad);
        mat.mostrar();
    }

    public boolean esCapacidadSuficiente(int numEstudiantes) {
        return numEstudiantes <= capacidad;
    }

}
