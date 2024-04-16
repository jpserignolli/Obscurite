package p.i;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

public class obscuriteVendas extends JFrame {

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
	public obscuriteVendas() {
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

        JLabel vendasObs = new JLabel("Vendas");
        vendasObs.setForeground(Color.BLACK);
        vendasObs.setFont(new Font("Libian TC", Font.PLAIN, 48));
        painelUsers.add(vendasObs);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(48, 47, 48));
        panel.setBorder(null);
        panel.setBounds(10, 92, 728, 363);

        contentPane.add(panel);
        panel.setLayout(null);

      

        JLabel lblCpf = new JLabel("CPF");
        lblCpf.setForeground(new Color(50, 205, 50));
        lblCpf.setFont(new Font("Lao MN", Font.PLAIN, 16));
        lblCpf.setBounds(339, 22, 93, 16);
        panel.add(lblCpf);

        JLabel lblProdutoVenda = new JLabel("Produto");
        lblProdutoVenda.setForeground(new Color(50, 205, 50));
        lblProdutoVenda.setFont(new Font("Lao MN", Font.PLAIN, 16));
        lblProdutoVenda.setBounds(325, 79, 129, 16);
        panel.add(lblProdutoVenda);

        JComboBox comboBoxProdutos_1 = new JComboBox();
        comboBoxProdutos_1.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
        comboBoxProdutos_1.setBounds(257, 93, 187, 46);
        panel.add(comboBoxProdutos_1);

        JLabel lblQuantidade = new JLabel("Quantidade");
        lblQuantidade.setForeground(new Color(50, 205, 50));
        lblQuantidade.setFont(new Font("Lao MN", Font.PLAIN, 16));
        lblQuantidade.setBounds(307, 138, 129, 16);
        panel.add(lblQuantidade);

        JSpinner spinner = new JSpinner();
        spinner.setBounds(283, 161, 135, 26);
        panel.add(spinner);

        textField = new JTextField(11);
        textField.setColumns(10);
        textField.setBackground(Color.LIGHT_GRAY);
        textField.setBounds(257, 41, 193, 26);
        panel.add(textField);

        JButton btnVerCarrinho = new JButton("Ver Carrinho");
        btnVerCarrinho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);

                obscureTabela nextPage = new obscureTabela();
                nextPage.setVisible(true);
            }
        });

        btnVerCarrinho.setForeground(new Color(50, 205, 50));
        btnVerCarrinho.setFont(new Font("Libian TC", Font.PLAIN, 18));
        btnVerCarrinho.setBounds(145, 233, 187, 46);
        panel.add(btnVerCarrinho);
        
        JButton btnRegistroVenda = new JButton("Registrar Venda");
        btnRegistroVenda.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String cpf = textField.getText();
                String produto = (String)comboBoxProdutos_1.getSelectedItem();
                int quantidade = (int) spinner.getValue();

                if (cpf.isEmpty() || produto == null || produto.isEmpty() || quantidade == 0) {
                	JOptionPane.showMessageDialog(null, "Preencha todos os campos");
                }
            }
        });
        btnRegistroVenda.setForeground(new Color(50, 205, 50));
        btnRegistroVenda.setFont(new Font("Libian TC", Font.PLAIN, 18));
        btnRegistroVenda.setBounds(364, 233, 187, 46);
        panel.add(btnRegistroVenda);

    }
}
