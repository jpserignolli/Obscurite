package p.i;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JToolBar;
import javax.swing.JComboBox;

public class obscuriteProduto extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					obscuriteProduto frame = new obscuriteProduto();
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
	public obscuriteProduto() {
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
		
		JLabel produtosObs = new JLabel("Produtos");
		produtosObs.setForeground(Color.BLACK);
		produtosObs.setFont(new Font("Libian TC", Font.PLAIN, 48));
		painelUsers.add(produtosObs);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(48, 47, 48));
		panel.setBorder(null);
		panel.setBounds(10, 92, 728, 363);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btnRegistro2 = new JButton("Registrar");
		btnRegistro2.setForeground(new Color(50, 205, 50));
		btnRegistro2.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnRegistro2.setBounds(257, 201, 187, 46);
		panel.add(btnRegistro2);
		
		JComboBox comboBoxProdutos = new JComboBox();
		comboBoxProdutos.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		comboBoxProdutos.setBounds(257, 35, 187, 46);
		panel.add(comboBoxProdutos);
		
		JLabel lblCategoria = new JLabel("Categoria");
		lblCategoria.setForeground(new Color(50, 205, 50));
		lblCategoria.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblCategoria.setBounds(315, 21, 93, 16);
		panel.add(lblCategoria);
		
		JLabel lblModelo = new JLabel("Modelo");
		lblModelo.setForeground(new Color(50, 205, 50));
		lblModelo.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblModelo.setBounds(325, 79, 129, 16);
		panel.add(lblModelo);
		
		JComboBox comboBoxProdutos_1 = new JComboBox();
		comboBoxProdutos_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		comboBoxProdutos_1.setBounds(257, 93, 187, 46);
		panel.add(comboBoxProdutos_1);
		
		JLabel lblIdProduto = new JLabel("ID PRODUTO");
		lblIdProduto.setForeground(new Color(50, 205, 50));
		lblIdProduto.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblIdProduto.setBounds(303, 137, 129, 16);
		panel.add(lblIdProduto);
		
		textField = new JTextField();
		textField.setBounds(257, 163, 187, 26);
		panel.add(textField);
		textField.setColumns(10);
	}
}
