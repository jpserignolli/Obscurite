package p.i;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.*;
import javax.swing.text.AbstractDocument;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.DocumentFilter;
import java.awt.*;

public class obscuriteUser extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textNome;
	private JTextField textCPF;
	private JTextField textEmail;


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
		
		textCPF = new JTextField(11);
		((AbstractDocument)textCPF.getDocument()).setDocumentFilter(new DocumentFilter() {
            public void replace(FilterBypass fb, int offset, int length, String text, AttributeSet attrs) throws BadLocationException {
                String newText = fb.getDocument().getText(0, fb.getDocument().getLength()) + text;
                if (newText.length() <= 11 && newText.matches("[0-9]*")) {
                    super.replace(fb, offset, length, text, attrs);
                } 
            }
        });
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
		
		JButton btnRegistro2 = new JButton("Registrar");
		btnRegistro2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = textNome.getText();
                String cpf = textCPF.getText();
                String email = textEmail.getText();

                if (nome.isEmpty() || cpf.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                } else {
                    User newUser = new User(nome, cpf, email);
                    if (isUserRegistered(newUser)) {
                        JOptionPane.showMessageDialog(null, "CPF já cadastrado no sistema.");
                    } else {
                        ObsUser.getInstance().addUser(newUser);
                        JOptionPane.showMessageDialog(null, "Usuário registrado:\n\nNome: " + newUser.getNome() + "\nCPF: " + newUser.getCpf() + "\nE-mail: " + newUser.getEmail(), "Usuário Registrado", JOptionPane.PLAIN_MESSAGE);
                    }
                 }
		        
				
				
			}
		});
		btnRegistro2.setForeground(new Color(50, 205, 50));
		btnRegistro2.setFont(new Font("Libian TC", Font.PLAIN, 18));
		btnRegistro2.setBounds(260, 224, 187, 46);
		panel.add(btnRegistro2);
				
	}
	private boolean isUserRegistered(User user) {
        ArrayList<User> userList = ObsUser.getInstance().getUsers();
        for (User existingUser : userList) {
            if (existingUser.equals(user)) {
                return true;
            }
        }
        return false;
    }

}

class ObsUser {
    private static ObsUser instance;
    private ArrayList<User> users;

    private ObsUser() {
        users = new ArrayList<>();
    }

    public static ObsUser getInstance() {
        if (instance == null) {
            instance = new ObsUser();
        }
        return instance;
    }

    public void addUser(User user) {
        users.add(user);
    }

    public ArrayList<User> getUsers() {
        return users;
    }
}
class User {
    private String nome;
    private String cpf;
    private String email;

    public User(String nome, String cpf, String email) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }
    
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return cpf.equals(user.cpf);
    }
}
