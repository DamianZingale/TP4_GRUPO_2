package exercises;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class Ejercicio3 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;

    public Ejercicio3() {
        setTitle("Seleccion multiple");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 400, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        // Panel para sistema operativo
        JPanel panelSistema = new JPanel();
        panelSistema.setBounds(5, 88, 365, 90);
        contentPane.add(panelSistema);
        panelSistema.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Borde sin t�tulo
        panelSistema.setPreferredSize(new Dimension(250, 100));
        panelSistema.setLayout(null);

        // Agregar componentes al panel
        JLabel lblSistema = new JLabel("Elije un Sistema Operativo");
        lblSistema.setBounds(12, 32, 200, 26);
        panelSistema.add(lblSistema);

        // Panel para la especialidad
        JPanel panelEspecialidad = new JPanel();
        panelEspecialidad.setBounds(5, 13, 365, 62);
        contentPane.add(panelEspecialidad);
        panelEspecialidad.setBorder(BorderFactory.createLineBorder(Color.BLACK)); // Borde sin t�tulo
        panelEspecialidad.setPreferredSize(new Dimension(250, 150));
        panelEspecialidad.setLayout(null);

        // Agregar componentes al panel de notas
        JLabel lblEspecialidad = new JLabel("Elije una especialidad");
        lblEspecialidad.setBounds(6, 18, 200, 24);
        panelEspecialidad.add(lblEspecialidad);

        // Panel para horas
        JPanel panelHoras = new JPanel();
        panelHoras.setBounds(12, 191, 355, 36);
        panelHoras.setLayout(null);

        JLabel lblHoras = new JLabel("Cantidad de horas en el computador");
        lblHoras.setBounds(1, 1, 232, 34);
        panelHoras.add(lblHoras);

        JTextField txtHoras = new JTextField(5);
        txtHoras.setBounds(229, 1, 114, 34);
        panelHoras.add(txtHoras);

        // Bot�n Aceptar
        JButton btnAceptar = new JButton("Aceptar");
        btnAceptar.setBounds(255, 260, 100, 30);
        contentPane.add(btnAceptar);

        // Checkbox para sistemas
        JCheckBox checkBoxP = new JCheckBox("Programacion");
        checkBoxP.setBounds(177, 9, 113, 25);
        panelSistema.add(checkBoxP);

        JCheckBox checkBoxA = new JCheckBox("Administracion");
        checkBoxA.setBounds(177, 33, 113, 25);
        panelSistema.add(checkBoxA);

        JCheckBox checkBoxDG = new JCheckBox("Diseño Grafico");
        checkBoxDG.setBounds(177, 56, 113, 25);
        panelSistema.add(checkBoxDG);
        
        // RadioButton para especialidades
        JRadioButton RbtnW = new JRadioButton("Windows");
        RbtnW.setBounds(140, 18, 86, 25);
        panelEspecialidad.add(RbtnW);
        
        JRadioButton RbtnL = new JRadioButton("Linux");
        RbtnL.setBounds(290, 18, 67, 25);
        panelEspecialidad.add(RbtnL);
        
        JRadioButton RbtnM = new JRadioButton("Mac");
        RbtnM.setBounds(230, 18, 67, 25);
        panelEspecialidad.add(RbtnM);

        // Agrupar RadioButtons
        ButtonGroup group = new ButtonGroup();
        group.add(RbtnW);
        group.add(RbtnL);
        group.add(RbtnM);

        contentPane.add(panelHoras);
        contentPane.add(panelSistema);
        contentPane.add(panelEspecialidad);
        
        // ActionListener para el bot�n Aceptar
        btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String sistema = "";
                if (RbtnW.isSelected()) {
                    sistema = "Windows";
                } else if (RbtnL.isSelected()) {
                    sistema = "Linux";
                } else if (RbtnM.isSelected()) {
                    sistema = "Mac";
                }
                
                String especialidades = "";
                if (checkBoxP.isSelected()) {
                    especialidades += "Programacion ";
                }
                if (checkBoxA.isSelected()) {
                    especialidades += "Administracion ";
                }
                if (checkBoxDG.isSelected()) {
                    especialidades += "Disenio Grafico ";
                }
                
                String horas = txtHoras.getText();
                
                String mensaje = "Sistema Operativo: " + sistema + "\n"
                               + "Especialidades: " + especialidades + "\n"
                               + "Horas en Computador: " + horas;
                
                JOptionPane.showMessageDialog(contentPane, mensaje, "Informacion Seleccionada", JOptionPane.INFORMATION_MESSAGE);
                group.clearSelection();
                
            }
        });
    }
}