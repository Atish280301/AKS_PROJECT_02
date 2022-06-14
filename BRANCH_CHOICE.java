import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JSeparator;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BRANCH_CHOICE {

	private JFrame FRAME;
	private JButton OKB;
	private JButton BACKB;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BRANCH_CHOICE window = new BRANCH_CHOICE();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public BRANCH_CHOICE() {
		initialize();
	}

	
	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("BRANCH CHOICE");
		FRAME.setBounds(100, 100, 531, 335);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A BRANCH NAME");
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		lblNewLabel.setBounds(142, 29, 208, 16);
		FRAME.getContentPane().add(lblNewLabel);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(12, 61, 489, 16);
		FRAME.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(12, 216, 489, 16);
		FRAME.getContentPane().add(separator_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.addItem("COMPUTER SCIENCE ENGINEERING");
		comboBox.addItem("ELECTRICAL ENGINEERING");
		comboBox.addItem("MECHANICAL ENGINEERING");
		comboBox.addItem("CHEMICAL ENGINEERING");
		comboBox.setSelectedItem(null);
		comboBox.setEditable(true);
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox.setBounds(109, 78, 282, 22);
		FRAME.getContentPane().add(comboBox);
		
		OKB = new JButton("OK");
		OKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String item = (String) comboBox.getSelectedItem();
				if(item == "COMPUTER SCIENCE ENGINEERING")
				{
					JOptionPane.showMessageDialog(null,"GO TO " + comboBox.getSelectedItem() + " BRANCH",null, JOptionPane.OK_CANCEL_OPTION, null);
					comboBox.setSelectedItem(null);
					CSE_FRONT.main(null);
					FRAME.dispose();
				}
				if(item == "ELECTRICAL ENGINEERING")
				{
					JOptionPane.showMessageDialog(null,"GO TO " + comboBox.getSelectedItem() + " BRANCH",null, JOptionPane.OK_CANCEL_OPTION, null);
					comboBox.setSelectedItem(null);
					ELEC_FRONT.main(null);
					FRAME.dispose();
				}
				if(item == "MECHANICAL ENGINEERING")
				{
					JOptionPane.showMessageDialog(null,"GO TO " + comboBox.getSelectedItem() + " BRANCH",null, JOptionPane.OK_CANCEL_OPTION, null);
					comboBox.setSelectedItem(null);
					MECH_FRONT.main(null);
					FRAME.dispose();
				}
				if(item == "CHEMICAL ENGINEERING")
				{
					JOptionPane.showMessageDialog(null,"GO TO " + comboBox.getSelectedItem() + " BRANCH",null, JOptionPane.OK_CANCEL_OPTION, null);
					comboBox.setSelectedItem(null);
					CHEM_FRONT.main(null);
					FRAME.dispose();
				}
			}
		});
		OKB.setBounds(92, 231, 97, 25);
		FRAME.getContentPane().add(OKB);
		
		BACKB = new JButton("BACK");
		BACKB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				LOGIN_SYSTEM.main(null);
				FRAME.dispose();
			}
		});
		BACKB.setBounds(294, 231, 97, 25);
		FRAME.getContentPane().add(BACKB);
	}
}
