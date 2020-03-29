package Lista02;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;

public class InterfaceNameGenerator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceNameGenerator frame = new InterfaceNameGenerator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public InterfaceNameGenerator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 190);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(125, 11, 299, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Nome completo:");
		lblNewLabel.setBounds(10, 14, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sobrenome da m\u00E3e:");
		lblNewLabel_1.setBounds(10, 39, 113, 14);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(125, 36, 299, 20);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_2 = new JLabel("Cidade de nascimento:");
		lblNewLabel_2.setBounds(10, 64, 113, 14);
		contentPane.add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(125, 61, 299, 20);
		contentPane.add(textField_2);
		
		JButton btnNewButton = new JButton("Gerar nome Star Wars");
		btnNewButton.setBounds(150, 92, 145, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_3 = new JLabel("Seu nome Star Wars \u00E9:");
		lblNewLabel_3.setBounds(10, 129, 125, 14);
		contentPane.add(lblNewLabel_3);
		
		textField_3 = new JTextField();
		textField_3.setBounds(125, 126, 299, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
	}
}
