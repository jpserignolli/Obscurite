package p.i;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class obscuriteUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textEmail;
	private JTextField textSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					obscuriteUser frame = new obscuriteUser();
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
	public obscuriteUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 47, 48));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painelUsers = new JPanel();
		painelUsers.setBorder(new LineBorder(new Color(0, 0, 0)));
		painelUsers.setBackground(Color.LIGHT_GRAY);
		painelUsers.setBounds(0, 0, 744, 80);
		contentPane.add(painelUsers);
		
		JLabel logoObscurite = new JLabel("Usuários");
		logoObscurite.setForeground(Color.BLACK);
		logoObscurite.setFont(new Font("Libian TC", Font.PLAIN, 48));
		painelUsers.add(logoObscurite);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(48, 47, 48));
		panel.setBorder(null);
		panel.setBounds(10, 92, 728, 363);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setForeground(new Color(50, 205, 50));
		lblNome.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblNome.setBounds(326, 45, 61, 16);
		panel.add(lblNome);
		
		textNome = new JTextField();
		textNome.setBounds(203, 68, 290, 26);
		textNome.setBackground(Color.LIGHT_GRAY);
		panel.add(textNome);
		textNome.setColumns(10);
		
		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setForeground(new Color(50, 205, 50));
		lblCPF.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblCPF.setBounds(336, 106, 61, 16);
		panel.add(lblCPF);
		
		textCPF = new JTextField();
		textCPF.setColumns(10);
		textCPF.setBounds(203, 127, 290, 26);
		textCPF.setBackground(Color.LIGHT_GRAY);
		panel.add(textCPF);
		
		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setForeground(new Color(50, 205, 50));
		lblEmail.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblEmail.setBounds(326, 165, 61, 16);
		panel.add(lblEmail);
		
		textEmail = new JTextField();
		textEmail.setColumns(10);
		textEmail.setBounds(203, 186, 290, 26);
		textEmail.setBackground(Color.LIGHT_GRAY);
		panel.add(textEmail);
		
		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setForeground(new Color(50, 205, 50));
		lblSenha.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblSenha.setBounds(326, 224, 61, 16);
		panel.add(lblSenha);
		
		textSenha = new JTextField();
		textSenha.setColumns(10);
		textSenha.setBounds(203, 245, 290, 26);
		textSenha.setBackground(Color.LIGHT_GRAY);
		panel.add(textSenha);
	}

}
