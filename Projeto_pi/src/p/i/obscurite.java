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
		
		JButton btnDestravar = new JButton("Destravar");
		btnDestravar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDestravar.setForeground(new Color(50, 205, 50));
		btnDestravar.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnDestravar.setBounds(283, 199, 166, 29);
		contentPane.add(btnDestravar);
		
		JLabel lblNewLabel = new JLabel("Copyright Obscurite - 2024. Todos os direitos reservados.");
		lblNewLabel.setFont(new Font("Libian TC", Font.PLAIN, 12));
		lblNewLabel.setForeground(new Color(50, 205, 50));
		lblNewLabel.setBounds(6, 450, 259, 16);
		contentPane.add(lblNewLabel);
		
		JButton btnDestravarRegistro = new JButton("Registro");
		btnDestravarRegistro.setForeground(new Color(50, 205, 50));
		btnDestravarRegistro.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnDestravarRegistro.setBounds(283, 240, 166, 29);
		contentPane.add(btnDestravarRegistro);
	}
}
