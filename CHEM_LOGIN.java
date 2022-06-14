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

public class CHEM_LOGIN {

	private JFrame FRAME;
	private JTextField UNTF;
	private JPasswordField PWTF;
	private JButton LOGINB;
	private JButton RESETB;
	private JButton EXITB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CHEM_LOGIN window = new CHEM_LOGIN();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CHEM_LOGIN() {
		initialize();
	}

	
	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("CHEMICAL ENGINEERING");
		FRAME.setBounds(100, 100, 474, 345);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN SYSTEM");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(167, 24, 119, 33);
		FRAME.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 70, 425, 22);
		FRAME.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 208, 425, 22);
		FRAME.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(60, 93, 95, 16);
		FRAME.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD:");
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1_1.setBounds(60, 135, 95, 16);
		FRAME.getContentPane().add(lblNewLabel_1_1);
		
		UNTF = new JTextField();
		UNTF.setBounds(167, 91, 155, 22);
		FRAME.getContentPane().add(UNTF);
		UNTF.setColumns(10);
		
		PWTF = new JPasswordField();
		PWTF.setBounds(167, 133, 155, 22);
		FRAME.getContentPane().add(PWTF);
		
		LOGINB = new JButton("LOGIN");
		LOGINB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UN = UNTF.getText();
				String PW = PWTF.getText();
				
				if(UN.contains("CHEMICALENGINEERING") && PW.contains("0123456789"))
				{
					JOptionPane.showMessageDialog(null, "LOGIN SUCCESSFULLY");
					FRAME.dispose();
					STUDENT_TABLE.main(null);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "ACCESS DENIED");
				}
			}
		});
		LOGINB.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		LOGINB.setForeground(new Color(46, 139, 87));
		LOGINB.setBounds(60, 243, 97, 25);
		FRAME.getContentPane().add(LOGINB);
		
		RESETB = new JButton("RESET");
		RESETB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				UNTF.setText(null);
				PWTF.setText(null);
			}
		});
		RESETB.setForeground(new Color(30, 144, 255));
		RESETB.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		RESETB.setBounds(181, 243, 97, 25);
		FRAME.getContentPane().add(RESETB);
		
		EXITB = new JButton("EXIT");
		EXITB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FRAME.dispose();
				CHEM_FRONT.main(null);
			}
		});
		EXITB.setForeground(new Color(220, 20, 60));
		EXITB.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		EXITB.setBounds(290, 243, 97, 25);
		FRAME.getContentPane().add(EXITB);
	}
}
