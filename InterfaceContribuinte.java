package Lista02;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InterfaceContribuinte {

	private JFrame frame;
	private JTextField tfNome;
	private JTextField tfEstado;
	private JTextField tfCPF;
	private JTextField tfRenda;
	private Contribuinte[] vetor = new Contribuinte[20];
	private int indice = 0;
	private JLabel lblValorAConsultar;
	private JTextField tfValorConsulta;
	private JButton btnConsultar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceContribuinte window = new InterfaceContribuinte();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceContribuinte() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 367, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNomeDoContribuinte = new JLabel("Nome do contribuinte:");
		lblNomeDoContribuinte.setBounds(10, 23, 115, 14);
		frame.getContentPane().add(lblNomeDoContribuinte);
		
		tfNome = new JTextField();
		tfNome.setBounds(122, 20, 222, 20);
		frame.getContentPane().add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lblEstado = new JLabel("Estado:");
		lblEstado.setBounds(10, 48, 46, 14);
		frame.getContentPane().add(lblEstado);
		
		tfEstado = new JTextField();
		tfEstado.setBounds(122, 45, 223, 20);
		frame.getContentPane().add(tfEstado);
		tfEstado.setColumns(10);
		
		JLabel lblCpf = new JLabel("CPF:");
		lblCpf.setBounds(10, 73, 46, 14);
		frame.getContentPane().add(lblCpf);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(122, 70, 222, 20);
		frame.getContentPane().add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lblRendaAnualR = new JLabel("Renda anual R$:");
		lblRendaAnualR.setBounds(10, 98, 101, 14);
		frame.getContentPane().add(lblRendaAnualR);
		
		tfRenda = new JTextField();
		tfRenda.setBounds(122, 95, 222, 20);
		frame.getContentPane().add(tfRenda);
		tfRenda.setColumns(10);
		
		JButton btnCadastrar = new JButton("Cadastrar");
		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Contribuinte c;
				c = new Contribuinte(tfNome.getText(),
												tfEstado.getText(),
												tfCPF.getText(),
							Float.parseFloat(tfRenda.getText()));
				/*
				 * ou crio o objeto pelo construtor com parâmetros
				 * ou crio o objeto pelo construtor padrão e uso os métodos set
				c = new Contribuinte();
				c.setNome(tfNome.getText());
				c.setCpf(tfCPF.getText());
				c.setUf(tfEstado.getText());
				c.setRendaAnual(Float.parseFloat(tfRenda.getText()));
				*/
				vetor[indice] = c;
				indice++;
				float imposto = c.getImpostoAPagar();
				JOptionPane.showMessageDialog(frame, 
									"Imposto a pagar:"+imposto);
			}
		});
		btnCadastrar.setBounds(132, 126, 89, 23);
		frame.getContentPane().add(btnCadastrar);
		
		lblValorAConsultar = new JLabel("Valor a consultar:");
		lblValorAConsultar.setBounds(10, 194, 115, 14);
		frame.getContentPane().add(lblValorAConsultar);
		
		tfValorConsulta = new JTextField();
		tfValorConsulta.setBounds(122, 191, 222, 20);
		frame.getContentPane().add(tfValorConsulta);
		tfValorConsulta.setColumns(10);
		
		btnConsultar = new JButton("Consultar");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float valor = Float.parseFloat(tfValorConsulta.getText());
				String resultado = "Contribuintes imposto acima de R$"+valor;
				for (int i=0; i < indice; i++) {
					if (vetor[i].getImpostoAPagar()>valor) {
						resultado += "\n"+vetor[i].getNome()+" - "+vetor[i].getImpostoAPagar();
					}
				}
				JOptionPane.showMessageDialog(frame, resultado);
			}
		});
		btnConsultar.setBounds(132, 227, 89, 23);
		frame.getContentPane().add(btnConsultar);
	}
}
