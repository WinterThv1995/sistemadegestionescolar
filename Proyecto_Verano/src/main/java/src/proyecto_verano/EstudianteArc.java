package src.proyecto_verano;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EstudianteArc{
    
    public void agregarEstudiante(Estudiante estudiante) {
        String query = "INSERT INTO estudiantes (ci, nombre, edad, grado, nota) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = Conexion.getConnection(); 
             PreparedStatement ps = connection.prepareStatement(query)) { 

            ps.setLong(1, estudiante.getCi());
            ps.setString(2, estudiante.getNombre());
            ps.setInt(3, estudiante.getEdad());
            ps.setString(4, estudiante.getGrado());
            ps.setInt(5, estudiante.getNota());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Estudiante agregado correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar el estudiante: " + e.getMessage());
        }
    }
}

