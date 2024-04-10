package p.i;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import java.awt.SystemColor;
import javax.swing.JCheckBox;

public class obscuriteRelatorio extends JFrame {

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
					obscuriteRelatorio frame = new obscuriteRelatorio();
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
	public obscuriteRelatorio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 978, 775);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(48, 47, 48));
		contentPane.setForeground(new Color(0, 0, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel painelUsers = new JPanel();
		painelUsers.setBorder(new LineBorder(new Color(0, 0, 0)));
		painelUsers.setBackground(Color.LIGHT_GRAY);
		painelUsers.setBounds(0, 0, 978, 80);
		contentPane.add(painelUsers);
		
		JLabel relatorioObs = new JLabel("Relatorios");
		relatorioObs.setForeground(Color.BLACK);
		relatorioObs.setFont(new Font("Libian TC", Font.PLAIN, 48));
		painelUsers.add(relatorioObs);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(48, 47, 48));
		panel.setBorder(null);
		panel.setBounds(10, 92, 728, 627);
		
		contentPane.add(panel);
		panel.setLayout(null);
		
		table = new JTable();
		table.setBackground(new Color(128, 128, 128));
		table.setBounds(6, 6, 716, 615);
		panel.add(table);
		
		JComboBox comboBoxProdutos_1 = new JComboBox();
		comboBoxProdutos_1.setBounds(761, 165, 187, 46);
		contentPane.add(comboBoxProdutos_1);
		comboBoxProdutos_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setBounds(836, 151, 75, 16);
		contentPane.add(lblMes);
		lblMes.setForeground(new Color(50, 205, 50));
		lblMes.setFont(new Font("Lao MN", Font.PLAIN, 16));
		
		JButton btnRegistroVenda = new JButton("Gerar Relatorio");
		btnRegistroVenda.setBounds(761, 213, 187, 46);
		contentPane.add(btnRegistroVenda);
		btnRegistroVenda.setForeground(new Color(50, 205, 50));
		btnRegistroVenda.setFont(new Font("Libian TC", Font.PLAIN, 18));
	}
}
