package src.proyecto_verano;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MateriaVent extends JFrame {
    private JTextField nombreMateriaField, profesorField;
    private JButton guardarButton, finalizarButton;

    public MateriaVent() {
        setTitle("Formulario de Materia");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5, 2));  // Cambié a 5 filas para agregar el botón adicional

        panel.add(new JLabel("Nombre Materia:"));
        nombreMateriaField = new JTextField();
        panel.add(nombreMateriaField);

        panel.add(new JLabel("Profesor:"));
        profesorField = new JTextField();
        panel.add(profesorField);

        guardarButton = new JButton("Guardar Materia");
        panel.add(guardarButton);

        finalizarButton = new JButton("Finalizar operación");
        panel.add(finalizarButton);

        add(panel);
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombreMateria = nombreMateriaField.getText();
                String nombreProfesor = profesorField.getText();

                Profesor profesor = new Profesor(nombreProfesor, 0, 0, "Licenciado");

                Materia materia = new Materia(nombreMateria, profesor);

                MateriaArc materiaDAO = new MateriaArc();
                materiaDAO.agregarMateria(materia);

                JOptionPane.showMessageDialog(null, "Materia guardada correctamente.");
            }
        });

        finalizarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación finalizada.");
                dispose(); 
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MateriaVent ventana = new MateriaVent();
            ventana.setVisible(true);
        });
    }
}