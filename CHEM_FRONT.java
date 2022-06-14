import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CHEM_FRONT {

	private JFrame FRAME;
	private JButton LOGINB;
	private JButton BACKB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CHEM_FRONT window = new CHEM_FRONT();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public CHEM_FRONT() {
		initialize();
	}

	
	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("CHEMICAL ENGINEERING");
		FRAME.setBounds(100, 100, 561, 300);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO CHEMICAL ENGINEERING");
		lblNewLabel.setForeground(new Color(148, 0, 211));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel.setBounds(111, 38, 314, 36);
		FRAME.getContentPane().add(lblNewLabel);
		
		LOGINB = new JButton("LOGIN");
		LOGINB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRAME.dispose();
				CHEM_LOGIN.main(null);
			}
		});
		LOGINB.setBounds(56, 148, 97, 25);
		FRAME.getContentPane().add(LOGINB);
		
		BACKB = new JButton("BACK");
		BACKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRAME.dispose();
				BRANCH_CHOICE.main(null);
			}
		});
		BACKB.setBounds(347, 148, 97, 25);
		FRAME.getContentPane().add(BACKB);
	}

}
