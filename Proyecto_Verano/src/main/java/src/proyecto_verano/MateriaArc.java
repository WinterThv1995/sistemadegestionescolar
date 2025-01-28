package src.proyecto_verano;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MateriaArc {

    public void agregarMateria(Materia materia) {
        String query = "INSERT INTO materias (nombre_materia, profesor_nombre) VALUES (?, ?)";

        try (Connection connection = Conexion.getConnection();
             PreparedStatement ps = connection.prepareStatement(query)) {

            ps.setString(1, materia.getNombreMateria());
            ps.setString(2, materia.getProfesor().getNombre());

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                System.out.println("Materia agregada correctamente.");
            }
        } catch (SQLException e) {
            System.out.println("Error al agregar la materia: " + e.getMessage());
        }
    }
}

