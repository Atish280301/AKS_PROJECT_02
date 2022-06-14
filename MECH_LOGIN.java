import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MECH_LOGIN {

	private JFrame FRAME;
	private JButton RESETB;
	private JButton LOGINB;
	private JButton EXITB;
	private JTextField UNTF;
	private JPasswordField PWTF;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MECH_LOGIN window = new MECH_LOGIN();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public MECH_LOGIN() {
		initialize();
	}

	
	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("MECHANICAL ENGINEERING");
		FRAME.setBounds(100, 100, 529, 348);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN SYSTEM");
		lblNewLabel.setForeground(new Color(0, 0, 255));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(172, 27, 108, 26);
		FRAME.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 61, 487, 19);
		FRAME.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 209, 487, 19);
		FRAME.getContentPane().add(separator_1);
		
		JLabel lblNewLabel_1 = new JLabel("USERNAME:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1.setBounds(71, 93, 88, 16);
		FRAME.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("PASSWORD:");
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		lblNewLabel_1_1.setBounds(71, 141, 88, 16);
		FRAME.getContentPane().add(lblNewLabel_1_1);
		
		UNTF = new JTextField();
		UNTF.setBounds(172, 93, 188, 22);
		FRAME.getContentPane().add(UNTF);
		UNTF.setColumns(10);
		
		PWTF = new JPasswordField();
		PWTF.setBounds(172, 139, 188, 22);
		FRAME.getContentPane().add(PWTF);
		
		LOGINB = new JButton("LOGIN");
		LOGINB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String UN = UNTF.getText();
				String PW = PWTF.getText();
				
				if(UN.contains("MECHANICALENGINEERING") && PW.contains("0123456789"))
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
		LOGINB.setForeground(new Color(34, 139, 34));
		LOGINB.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		LOGINB.setBounds(49, 233, 97, 25);
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
		RESETB.setBounds(183, 234, 97, 25);
		FRAME.getContentPane().add(RESETB);
		
		EXITB = new JButton("EXIT");
		EXITB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				FRAME.dispose();
				MECH_FRONT.main(null);
			}
		});
		EXITB.setForeground(new Color(220, 20, 60));
		EXITB.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
		EXITB.setBounds(315, 234, 97, 25);
		FRAME.getContentPane().add(EXITB);
		
		
	}

}
