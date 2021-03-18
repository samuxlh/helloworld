package loja;

import java.sql.*;
import java.awt.*;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField2;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Microsoft Himalaya", Font.PLAIN, 26));
		lblNewLabel.setBounds(0, 11, 434, 25);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Nome");
		lblNewLabel_1.setBounds(10, 47, 81, 25);
		contentPane.add(lblNewLabel_1);
		
		textField = new JTextField();
		textField.setBounds(63, 49, 312, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblValor = new JLabel("Valor");
		lblValor.setBounds(10, 83, 81, 25);
		contentPane.add(lblValor);
		
		textField2 = new JTextField();
		textField2.setText("");
		textField2.setBounds(63, 85, 312, 20);
		contentPane.add(textField2);
		textField2.setColumns(10);
		
		JButton btnNewButton = new JButton("Confirma");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Class.forName("com.mysql.cj.jdbc.Driver");
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
					Statement stmt = con.createStatement();
					String sql = "Select * from produtos where nomeprod ='"+textField.getText()+"' and Preço ='"+textField2.getText().toString()+"'";
					ResultSet rs = stmt.executeQuery(sql);
					if(rs.next())
						JOptionPane.showMessageDialog(null, "Encontrado");
					else
						JOptionPane.showMessageDialog(null, "Error");
					con.close(); 
				}catch(Exception e) {
					System.out.print(e);
				}
			}
		});
		btnNewButton.setBounds(63, 142, 89, 23);
		contentPane.add(btnNewButton);
	}
}
