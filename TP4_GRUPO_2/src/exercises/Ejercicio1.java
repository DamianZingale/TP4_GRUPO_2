package exercises;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;

public class Ejercicio1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNacimiento;
	private JTextField txtTelefono;
	private JTextField txtApellido;
	private JLabel lblMostrar;


	public Ejercicio1() {
		setTitle("Contactos");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 550, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtNombre = new JTextField();
		txtNombre.setColumns(10);
		
		txtNacimiento = new JTextField();
		txtNacimiento.setColumns(10);
		
		txtTelefono = new JTextField();
		txtTelefono.setColumns(10);
		
		txtApellido = new JTextField();
		txtApellido.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre");
        JLabel lblApellido = new JLabel("Apellido");
        JLabel lblTelefono = new JLabel("Teléfono");
        JLabel lblNacimiento = new JLabel("Fecha Nac.");

        JButton btnMostrar = new JButton("Mostrar");
			
		lblMostrar = new JLabel("lblMostrar");
		lblMostrar.setForeground(Color.BLACK);
		 

	        btnMostrar.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                boolean camposCompletos = true;

	                // Resetear colores de fondo
	                txtNombre.setBackground(Color.WHITE);
	                txtApellido.setBackground(Color.WHITE);
	                txtTelefono.setBackground(Color.WHITE);
	                txtNacimiento.setBackground(Color.WHITE);

	                // Validar si los campos estan vacios
	                if (txtNombre.getText().isEmpty()) {
	                    txtNombre.setBackground(Color.RED);
	                    camposCompletos = false;
	                }
	                if (txtApellido.getText().isEmpty()) {
	                    txtApellido.setBackground(Color.RED);
	                    camposCompletos = false;
	                }
	                if (txtTelefono.getText().isEmpty()) {
	                    txtTelefono.setBackground(Color.RED);
	                    camposCompletos = false;
	                }
	                if (txtNacimiento.getText().isEmpty()) {
	                    txtNacimiento.setBackground(Color.RED);
	                    camposCompletos = false;
	                }

	                if (camposCompletos) {
	                    // Mostrar los datos en el JLabel
	                    lblMostrar.setText(
	                        " Nombre: " + txtNombre.getText() + 
	                        ", Apellido: " + txtApellido.getText() + 
	                        ", Telefono: " + txtTelefono.getText() + 
	                        ", Fecha de Nac.: " + txtNacimiento.getText()
	                    );

	                    // Limpiar los campos
	                    txtNombre.setText("");
	                    txtApellido.setText("");
	                    txtTelefono.setText("");
	                    txtNacimiento.setText("");
	                } else {
	                    lblMostrar.setText("Por favor, complete todos los campos.");
	                }
	            }
	        });
	        GroupLayout gl_contentPane = new GroupLayout(contentPane);
	        gl_contentPane.setHorizontalGroup(
	        	gl_contentPane.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_contentPane.createSequentialGroup()
	        			.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
	        				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
	        					.addGap(20)
	        					.addComponent(lblMostrar, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
	        				.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
	        					.addGap(43)
	        					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
	        						.addComponent(lblNombre)
	        						.addComponent(lblTelefono)
	        						.addComponent(lblApellido)
	        						.addComponent(lblNacimiento))
	        					.addGap(24)
	        					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
	        						.addGroup(gl_contentPane.createSequentialGroup()
	        							.addGap(97)
	        							.addComponent(btnMostrar))
	        						.addComponent(txtNacimiento, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
	        						.addGroup(gl_contentPane.createSequentialGroup()
	        							.addGap(1)
	        							.addComponent(txtTelefono))
	        						.addComponent(txtApellido)
	        						.addComponent(txtNombre))))
	        			.addContainerGap(92, Short.MAX_VALUE))
	        );
	        gl_contentPane.setVerticalGroup(
	        	gl_contentPane.createParallelGroup(Alignment.LEADING)
	        		.addGroup(gl_contentPane.createSequentialGroup()
	        			.addGap(20)
	        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lblNombre)
	        				.addComponent(txtNombre, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lblApellido)
	        				.addComponent(txtApellido, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lblTelefono)
	        				.addComponent(txtTelefono, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
	        				.addComponent(lblNacimiento)
	        				.addComponent(txtNacimiento, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
	        			.addGap(18)
	        			.addComponent(btnMostrar)
	        			.addGap(18)
	        			.addComponent(lblMostrar, GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
	        );
	        contentPane.setLayout(gl_contentPane);
	
	}
}
