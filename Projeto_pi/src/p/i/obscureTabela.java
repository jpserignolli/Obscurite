package p.i;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class obscureTabela extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					obscureTabela frame = new obscureTabela();
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
	public obscureTabela() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 560);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 47, 48));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painelCarrinho = new JPanel();
		painelCarrinho.setBorder(new LineBorder(new Color(0, 0, 0)));
		painelCarrinho.setBackground(Color.LIGHT_GRAY);
		painelCarrinho.setBounds(0, 0, 744, 80);
		contentPane.add(painelCarrinho);
		
		JLabel vendas2Obs = new JLabel("Carrinho");
		vendas2Obs.setForeground(Color.BLACK);
		vendas2Obs.setFont(new Font("Libian TC", Font.PLAIN, 48));
		painelCarrinho.add(vendas2Obs);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(48, 47, 48));
		panel.setBorder(null);
		panel.setBounds(10, 92, 728, 374);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBounds(0, 6, 728, 362);
		panel.add(table);
		
		JButton btnFinalizar = new JButton("Finalizar Compra");
		btnFinalizar.setForeground(new Color(50, 205, 50));
		btnFinalizar.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnFinalizar.setBounds(531, 480, 187, 46);
		contentPane.add(btnFinalizar);
		
		JButton btnCancelarCompra = new JButton("Cancelar Compra");
		btnCancelarCompra.setForeground(new Color(255, 0, 0));
		btnCancelarCompra.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnCancelarCompra.setBounds(20, 478, 187, 46);
		contentPane.add(btnCancelarCompra);
	}
}
