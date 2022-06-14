import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ELEC_FRONT {

	private JFrame FRAME;
	private JButton LOGINB;
	private JButton BACKB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ELEC_FRONT window = new ELEC_FRONT();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ELEC_FRONT() {
		initialize();
	}

	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("ELECTRICAL ENGINEERING");
		FRAME.setBounds(100, 100, 533, 300);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("WELCOME TO ELECTRICAL ENGINEERING");
		lblNewLabel.setForeground(new Color(210, 105, 30));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel.setBounds(81, 51, 341, 33);
		FRAME.getContentPane().add(lblNewLabel);
		
		LOGINB = new JButton("LOGIN");
		LOGINB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRAME.dispose();
				ELEC_LOGIN.main(null);
			}
		});
		LOGINB.setBounds(55, 150, 97, 25);
		FRAME.getContentPane().add(LOGINB);
		
		BACKB = new JButton("BACK");
		BACKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FRAME.dispose();
				BRANCH_CHOICE.main(null);
			}
		});
		BACKB.setBounds(325, 150, 97, 25);
		FRAME.getContentPane().add(BACKB);
	}

}
