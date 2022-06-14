import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LOGIN_SYSTEM {

	private JFrame FRAME;
	private JTextField UNTF;
	private JPasswordField PWTF;
	private JButton LOGINB;
	private JButton RESETB;
	private JButton BACKB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LOGIN_SYSTEM window = new LOGIN_SYSTEM();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LOGIN_SYSTEM() {
		initialize();
	}

	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("LOGIN");
		FRAME.setBounds(100, 100, 465, 348);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN SYSTEM");
		lblNewLabel.setForeground(new Color(220, 20, 60));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(184, 23, 137, 27);
		FRAME.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 70, 423, 16);
		FRAME.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 210, 423, 16);
		FRAME.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(57, 99, 99, 16);
		FRAME.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD:");
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(57, 136, 99, 16);
		FRAME.getContentPane().add(lblNewLabel_1_1);
		
		UNTF = new JTextField();
		UNTF.setBounds(164, 97, 170, 22);
		FRAME.getContentPane().add(UNTF);
		UNTF.setColumns(10);
		
		PWTF = new JPasswordField();
		PWTF.setBounds(164, 134, 170, 22);
		FRAME.getContentPane().add(PWTF);
		
		LOGINB = new JButton("LOGIN");
		LOGINB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UN = UNTF.getText() ;
				String PW = PWTF.getText() ;
				
				if(UN.contains("ATISHKUMARSAHU") && PW.contains("0123456789"))
				{
					JOptionPane.showMessageDialog(null , "LOGIN SUCCESSFULLY");
					BRANCH_CHOICE.main(null);
					FRAME.dispose();
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ACCESS DENIED");
				}
			}
		});
		LOGINB.setForeground(new Color(46, 139, 87));
		LOGINB.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		LOGINB.setBounds(45, 239, 97, 25);
		FRAME.getContentPane().add(LOGINB);
		
		RESETB = new JButton("RESET");
		RESETB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				UNTF.setText(null);
				PWTF.setText(null);
			}
		});
		RESETB.setForeground(new Color(0, 0, 205));
		RESETB.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		RESETB.setBounds(178, 239, 97, 25);
		FRAME.getContentPane().add(RESETB);
		
		BACKB = new JButton("BACK");
		BACKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRONT.main(null);
				FRAME.dispose();
			}
		});
		BACKB.setForeground(new Color(178, 34, 34));
		BACKB.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		BACKB.setBounds(310, 239, 97, 25);
		FRAME.getContentPane().add(BACKB);
	}
}
