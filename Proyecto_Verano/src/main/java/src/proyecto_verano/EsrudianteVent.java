package src.proyecto_verano;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EsrudianteVent extends JFrame {
    private JTextField nombreField, ciField, edadField, gradoField, notaField;
    private JButton guardarButton, finalizarButton;

    public EsrudianteVent() {
        setTitle("Formulario de Estudiante");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(7, 2));  // Cambié a 7 filas para agregar el botón adicional

        // Campos del formulario
        panel.add(new JLabel("Nombre:"));
        nombreField = new JTextField();
        panel.add(nombreField);

        panel.add(new JLabel("CI:"));
        ciField = new JTextField();
        panel.add(ciField);

        panel.add(new JLabel("Edad:"));
        edadField = new JTextField();
        panel.add(edadField);

        panel.add(new JLabel("Grado:"));
        gradoField = new JTextField();
        panel.add(gradoField);

        panel.add(new JLabel("Nota:"));
        notaField = new JTextField();
        panel.add(notaField);

        // Botón
        guardarButton = new JButton("Guardar Estudiante");
        panel.add(guardarButton);

        // Botón
        finalizarButton = new JButton("Finalizar operación");
        panel.add(finalizarButton);

        add(panel);
        
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = nombreField.getText();
                int ci = Integer.parseInt(ciField.getText());
                int edad = Integer.parseInt(edadField.getText());
                String grado = gradoField.getText();
                int nota = Integer.parseInt(notaField.getText());

                Estudiante estudiante = new Estudiante(grado, nombre, ci, edad, nota);
                EstudianteArc estudianteDAO = new EstudianteArc();
                estudianteDAO.agregarEstudiante(estudiante);

                JOptionPane.showMessageDialog(null, "Estudiante guardado correctamente.");
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
            EsrudianteVent ventana = new EsrudianteVent();
            ventana.setVisible(true);
        });
    }
}