import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MECH_FRONT {

	private JFrame FRAME;
	private JButton LOGINB;
	private JButton BACKB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MECH_FRONT window = new MECH_FRONT();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public MECH_FRONT() {
		initialize();
	}


	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("MECHANICAL ENGINEERING");
		FRAME.setBounds(100, 100, 521, 300);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO MECHANICAL ENGINEERING");
		lblNewLabel.setForeground(new Color(34, 139, 34));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel.setBounds(85, 48, 334, 32);
		FRAME.getContentPane().add(lblNewLabel);
		
		LOGINB = new JButton("LOGIN");
		LOGINB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRAME.dispose();
				MECH_LOGIN.main(null);
			}
		});
		LOGINB.setBounds(74, 143, 97, 25);
		FRAME.getContentPane().add(LOGINB);
		
		BACKB = new JButton("BACK");
		BACKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRAME.dispose();
				BRANCH_CHOICE.main(null);
			}
		});
		BACKB.setBounds(324, 143, 97, 25);
		FRAME.getContentPane().add(BACKB);
	}

}
