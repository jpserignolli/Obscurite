package p.i;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class obscurite extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					obscurite frame = new obscurite();
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
	public obscurite() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 500);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 47, 48));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painelObscurite = new JPanel();
		painelObscurite.setBorder(new LineBorder(new Color(0, 0, 0)));
		painelObscurite.setBackground(new Color(192, 192, 192));
		painelObscurite.setBounds(0, 0, 744, 80);
		contentPane.add(painelObscurite);
		
		JLabel logoObscurite = new JLabel("Obscurite");
		logoObscurite.setForeground(new Color(0, 0, 0));
		logoObscurite.setFont(new Font("Libian TC", Font.PLAIN, 48));
		painelObscurite.add(logoObscurite);
		
		JButton btnRegistro1 = new JButton("Registrar Membro");
		btnRegistro1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
		        
		        obscuriteUser nextPage = new obscuriteUser();
		        nextPage.setVisible(true);
			}
		});
		btnRegistro1.setForeground(new Color(50, 205, 50));
		btnRegistro1.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnRegistro1.setBounds(165, 155, 187, 46);
		contentPane.add(btnRegistro1);
		
		JLabel lblNewLabel = new JLabel("Copyright Obscurite - 2024. Todos os direitos reservados.");
		lblNewLabel.setFont(new Font("Libian TC", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(50, 205, 50));
		lblNewLabel.setBounds(6, 450, 259, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnMembros = new JButton("Membros Obscurite");
		btnMembros.setForeground(new Color(50, 205, 50));
		btnMembros.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnMembros.setBounds(364, 155, 187, 46);
		contentPane.add(btnMembros);
		
		JButton btnProdutos = new JButton("Produtos Obscurite");
		btnProdutos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);	        
		        obscuriteProduto nextPage = new obscuriteProduto();
		        nextPage.setVisible(true);
			}
		});
		btnProdutos.setForeground(new Color(50, 205, 50));
		btnProdutos.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnProdutos.setBounds(165, 213, 187, 46);
		contentPane.add(btnProdutos);
		
		JButton btnVendas = new JButton("Vendas Obscurite");
		btnVendas.setForeground(new Color(50, 205, 50));
		btnVendas.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnVendas.setBounds(364, 213, 187, 46);
		contentPane.add(btnVendas);
		
		JButton btnRelatorio = new JButton("Relatorio Obscurite");
		btnRelatorio.setForeground(new Color(50, 205, 50));
		btnRelatorio.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnRelatorio.setBounds(262, 271, 187, 46);
		contentPane.add(btnRelatorio);
	}
}
