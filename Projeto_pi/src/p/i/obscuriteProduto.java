package p.i;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
	private String obterIdProduto(String nomeProduto) {
        String idProduto = null;
        if (nomeProduto.equals("Camiseta Lisa")) {
            idProduto = "001";
        } else if (nomeProduto.equals("Bermuda Jeans")) {
            idProduto = "002";
        } else if (nomeProduto.equals("Bermuda Cargo")) {
            idProduto = "003";
        } else if (nomeProduto.equals("Calça de moletom")) {
            idProduto = "004";
        } else if (nomeProduto.equals("Calça Jeans ")) {
            idProduto = "005";
        } else if (nomeProduto.equals("Calça cargo ")) {
            idProduto = "006";
        } else if (nomeProduto.equals("Boné NewEra")) {
            idProduto = "101";
        } else if (nomeProduto.equals("Boné Nike")) {
            idProduto = "102";
        } else if (nomeProduto.equals("Boné Lacoste")) {
            idProduto = "103";
        } else if (nomeProduto.equals("Boné Adidas")) {
            idProduto = "104";
        }
        return idProduto;
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
		btnRegistro2.setBounds(257, 301, 187, 46);
		panel.add(btnRegistro2);
		
		JComboBox comboBoxProdutos = new JComboBox();
		comboBoxProdutos.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		comboBoxProdutos.setBounds(257, 35, 187, 46);
		comboBoxProdutos.addItem("Roupa");
        comboBoxProdutos.addItem("Acessórios");
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
		
		comboBoxProdutos.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                comboBoxProdutos_1.removeAllItems();

                String categoriaSelecionada = (String) comboBoxProdutos.getSelectedItem();

                if (categoriaSelecionada.equals("Roupa")) {
                	comboBoxProdutos_1.addItem("Camiseta Lisa");
                    comboBoxProdutos_1.addItem("Bermuda Jeans");
                    comboBoxProdutos_1.addItem("Bermuda Cargo");
                    comboBoxProdutos_1.addItem("Calça de moletom");
                    comboBoxProdutos_1.addItem("Calça Jeans ");
                    comboBoxProdutos_1.addItem("Calça cargo ");
                } else if (categoriaSelecionada.equals("Acessórios")) {
                    comboBoxProdutos_1.addItem("Boné NewEra");
                    comboBoxProdutos_1.addItem("Boné Nike");
                    comboBoxProdutos_1.addItem("Boné Lacoste");
                    comboBoxProdutos_1.addItem("Boné Adidas");
                }
            }
        });
		
		JLabel lblIdProduto = new JLabel("ID");
		lblIdProduto.setForeground(new Color(50, 205, 50));
		lblIdProduto.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblIdProduto.setBounds(325, 160, 160, 16);
		panel.add(lblIdProduto);
		
		
		
		JLabel lblPreco = new JLabel("Preço");
		lblPreco.setForeground(new Color(50, 205, 50));
		lblPreco.setFont(new Font("Lao MN", Font.PLAIN, 16));
		lblPreco.setBounds(330, 180, 187, 46);
		panel.add(lblPreco);
		
		textField = new JTextField();
		textField.setBounds(257, 220, 187, 26);
		panel.add(textField);
		textField.setColumns(10);
		
		
		
		comboBoxProdutos_1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String produtoSelecionado = (String) comboBoxProdutos_1.getSelectedItem();

                String idProduto = obterIdProduto(produtoSelecionado);
                lblIdProduto.setText("ID: " + idProduto);
            }
        });
	}
}
