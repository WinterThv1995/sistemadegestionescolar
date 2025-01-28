package src.proyecto_verano;

import javax.swing.SwingUtilities;
import java.util.ArrayList;
public class Proyecto_Verano {

    public static void main(String[] args) {
        Director director = new Director("Marcelo Aruquipa", 418262, 55, "Lic.", 20);
        Profesor prof1 = new Profesor("Menfy Morales", 12828713, 40, "Licenciado");
        Profesor prof2 = new Profesor("Gladys Vargas", 12828713, 35, "Licenciada");
        Profesor prof3 = new Profesor("Jesus Burgoa", 12828713, 50, "Magister");
        Profesor prof4 = new Profesor("Maria Tellez", 12828713, 38, "Licenciada");
        Profesor prof5 = new Profesor("Rudy Mayta", 12828713, 42, "Licenciado");
        
        Estudiante est1 = new Estudiante("Primero", "Miguel Choque", 12828713, 8, 80);
        Estudiante est2 = new Estudiante("Segundo", "Cristian Choque", 12828713, 9, 90);
        Estudiante est3 = new Estudiante("Tercero", "Lorena Rojas", 12858713, 9, 85);
        Estudiante est4 = new Estudiante("Cuarto", "Nicol Miranda", 12888713, 6, 75);
        Estudiante est5 = new Estudiante("Quinto", "Paola Estrada", 12898713, 5, 70);
        Estudiante est6 = new Estudiante("Primero", "Alejandro Mallcu", 2828713, 8, 80);
        Estudiante est7 = new Estudiante("Segundo", "Jose Martinez", 12928713, 9, 85);
        Estudiante est8 = new Estudiante("Tercero", "Sofia Vargas", 12858713, 10, 95);
        Estudiante est9 = new Estudiante("Cuarto", "Jesus Navas", 12828113, 11, 88);
        Estudiante est10 = new Estudiante("Quinto", "Vinicius Jr", 12823713, 17, 92);

        Materia mat1 = new Materia("Matemáticas", prof1);
        Materia mat2 = new Materia("Física", prof2);
        Materia mat3 = new Materia("Lengua y Literatura", prof3);
        Materia mat4 = new Materia("Ed Fisica", prof4);
        Materia mat5 = new Materia("Biología", prof5);

        mat1.agregarEstudiante(est1);
        mat1.agregarEstudiante(est2);
        mat1.agregarEstudiante(est3);

        mat2.agregarEstudiante(est4);
        mat2.agregarEstudiante(est5);
        mat2.agregarEstudiante(est6);

        mat3.agregarEstudiante(est7);
        mat3.agregarEstudiante(est8);
        mat3.agregarEstudiante(est9);

        mat4.agregarEstudiante(est10);
        mat4.agregarEstudiante(est2);
        mat4.agregarEstudiante(est3);

        mat5.agregarEstudiante(est1);
        mat5.agregarEstudiante(est6);
        mat5.agregarEstudiante(est10);
        
        
        Aula aula1 = new Aula("SSA1", 30, mat1);
        Aula aula2 = new Aula("PBA1", 25, mat2);
        Aula aula3 = new Aula("P6A2", 35, mat3);
        Aula aula4 = new Aula("P5", 20, mat4);
        Aula aula5 = new Aula("A5", 40, mat5);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula1);
        aulas.add(aula2);
        aulas.add(aula3);
        aulas.add(aula4);
        aulas.add(aula5);

        Colegio colegio = new Colegio("Don Bosco", "Miraflores", director, aulas);

        colegio.mostrar();
        
        System.out.println("\n");
        System.out.println("Grado Academico del Profesor");
        prof4.tieneExperiencia();
        
        System.out.println("\n");
        System.out.println("Buscar aula por ID");
        String idAulaABuscar = "SSA1";
        Aula aulaEncontrada = colegio.buscarAulaPorId(idAulaABuscar);
        if (aulaEncontrada != null) {
            System.out.println("\nAula encontrada:");
            aulaEncontrada.mostrar();
        } else {
            System.out.println("No se encontró el aula con ID: " + idAulaABuscar);
        }
        
        System.out.println("\n");
        System.out.println("Mostrar estudiantes menores");
        colegio.mostrarEstMen();
        
        System.out.println("\n");
        System.out.println("Verificar si el estudiante x esta en la materia y");
        System.out.println(colegio.estaEstudianteEnMateria("Miguel Choque", "Matemáticas"));
        
        System.out.println("\n");
        System.out.println("Para MYSQL Estudiantes");
        EstudianteArc estudianteDAO = new EstudianteArc();
        
        Estudiante estudiante = new Estudiante("1 secundaria", "Cristian", 12828613, 17, 55);
        
        estudianteDAO.agregarEstudiante(estudiante);
        System.out.println("Para MYSQL Materias");
        Profesor profesor = new Profesor("Negro jose", 18549878, 50, "parvulario");

        Materia materia = new Materia("Matemáticas", profesor);
        MateriaArc materiaDAO = new MateriaArc();
        materiaDAO.agregarMateria(materia);
        
        ArrayList<Materia> materias = new ArrayList<>();
        materias.add(mat1);
        materias.add(mat2);
        materias.add(mat3);
        materias.add(mat4);
        materias.add(mat5);

        SwingUtilities.invokeLater(() -> {
            InterfazListaMaterias ventana = new InterfazListaMaterias(materias);
            ventana.setVisible(true);
        });
    }
}
