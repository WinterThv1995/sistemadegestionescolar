package src.proyecto_verano;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class InterfazListaMaterias extends JFrame {
    private JList<String> listaMaterias;
    private DefaultListModel<String> listModel;

    public InterfazListaMaterias(List<Materia> materias) {
        setTitle("Lista de Materias");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        listModel = new DefaultListModel<>();
        listaMaterias = new JList<>(listModel);
        JScrollPane scrollPane = new JScrollPane(listaMaterias);

        JButton btnMostrarMaterias = new JButton("Mostrar Materias");
        btnMostrarMaterias.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarMaterias(materias);
            }
        });

        JMenuBar menuBar = new JMenuBar();
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem menuSalir = new JMenuItem("Salir");
        menuSalir.addActionListener(e -> System.exit(0));
        menuArchivo.add(menuSalir);
        menuBar.add(menuArchivo);

        setJMenuBar(menuBar);


        setLayout(new BorderLayout());
        add(scrollPane, BorderLayout.CENTER);  
        add(btnMostrarMaterias, BorderLayout.LINE_START);  
    }


    private void mostrarMaterias(List<Materia> materias) {
        listModel.clear(); 
        for (Materia materia : materias) {
            listModel.addElement("Materia: " + materia.getNombreMateria() + " - Profesor: " + materia.getProfesor().getNombre());
            for (Estudiante estudiante : materia.getEstudiantes()) {
                listModel.addElement("  Estudiante: " + estudiante.getNombre() + " - Nota: " + estudiante.getNota());
            }
        }
    }

  

}