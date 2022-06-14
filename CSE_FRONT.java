import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CSE_FRONT {

	private JFrame FRAME;
	private JButton LOGINB;
	private JButton BACKB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CSE_FRONT window = new CSE_FRONT();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CSE_FRONT() {
		initialize();
	}

	
	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("COMPUTER SCIENCE ENGINEERING");
		FRAME.setBounds(100, 100, 589, 300);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO COMPUTER SCIENCE ENGINEERING");
		lblNewLabel.setForeground(new Color(0, 0, 205));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel.setBounds(82, 27, 396, 29);
		FRAME.getContentPane().add(lblNewLabel);
		
		LOGINB = new JButton("LOGIN");
		LOGINB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRAME.dispose();
				CSE_LOGIN.main(null);
			}
		});
		LOGINB.setBounds(111, 157, 97, 25);
		FRAME.getContentPane().add(LOGINB);
		
		BACKB = new JButton("BACK");
		BACKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRAME.dispose();
				BRANCH_CHOICE.main(null);
			}
		});
		BACKB.setBounds(349, 157, 97, 25);
		FRAME.getContentPane().add(BACKB);
	}

}
