import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FRONT {

	private JFrame FRAME;
	private JButton LOGINB;
	private JButton EXITB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FRONT window = new FRONT();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public FRONT() {
		initialize();
	}

	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("WELCOME");
		FRAME.setBounds(100, 100, 517, 265);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Parala Maharaja Engineering College");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
		lblNewLabel.setBounds(69, 53, 321, 27);
		FRAME.getContentPane().add(lblNewLabel);
		
		LOGINB = new JButton("LOGIN");
		LOGINB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				LOGIN_SYSTEM.main(null);
				FRAME.dispose();
			}
		});
		LOGINB.setBounds(86, 148, 97, 25);
		FRAME.getContentPane().add(LOGINB);
		
		EXITB = new JButton("EXIT");
		EXITB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		EXITB.setBounds(282, 148, 97, 25);
		FRAME.getContentPane().add(EXITB);
	}
}
