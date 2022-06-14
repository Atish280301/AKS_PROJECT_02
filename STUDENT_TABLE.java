import java.awt.EventQueue;
import java.sql.*;
import net.proteanit.*;
import net.proteanit.sql.DbUtils;
import net.proteanit.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class STUDENT_TABLE {

	private JFrame FRAME;
	private JTextField NAMETF;
	private JTextField BRANCHTF;
	private JTextField PHONETF;
	private JTextField ROLLTF;
	private JTable table;
	DefaultTableModel MODEL;
	private JScrollPane scrollPane;
	private JButton ADDB;
	private JButton UPDATEB;
	private JButton DELETEB;
	private JButton SEARCHB;
	private JButton EXITB;
	private JButton FETCHB;
	
	private static final String url = "jdbc:mysql://127.0.0.1:3306/FIFTHINTERNSHIPPROJECT";
	private static final String user = "root";
	private static final String pass = "";

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					STUDENT_TABLE window = new STUDENT_TABLE();
					window.FRAME.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private void clearfield()
	{
		NAMETF.setText(null);
		ROLLTF.setText(null);
		BRANCHTF.setText(null);
		PHONETF.setText(null);
	}

	public STUDENT_TABLE() {
		initialize();
	}

	private void initialize() {
		FRAME = new JFrame();
		FRAME.setTitle("STUDENT TABLE");
		FRAME.setBounds(100, 100, 703, 465);
		FRAME.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FRAME.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STUDENT DATABASE");
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
		lblNewLabel.setBounds(12, 23, 199, 32);
		FRAME.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("SROLL:");
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_1.setBounds(12, 90, 56, 16);
		FRAME.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("SNAME:");
		lblNewLabel_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(12, 130, 56, 16);
		FRAME.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("SBRANCH:");
		lblNewLabel_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(12, 170, 73, 16);
		FRAME.getContentPane().add(lblNewLabel_1_1_1);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("SPHNO:");
		lblNewLabel_1_1_1_1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(12, 210, 56, 16);
		FRAME.getContentPane().add(lblNewLabel_1_1_1_1);
		
		ROLLTF = new JTextField();
		ROLLTF.setBounds(95, 87, 166, 22);
		FRAME.getContentPane().add(ROLLTF);
		ROLLTF.setColumns(10);
		
		NAMETF = new JTextField();
		NAMETF.setColumns(10);
		NAMETF.setBounds(95, 127, 166, 22);
		FRAME.getContentPane().add(NAMETF);
		
		BRANCHTF = new JTextField();
		BRANCHTF.setColumns(10);
		BRANCHTF.setBounds(95, 167, 166, 22);
		FRAME.getContentPane().add(BRANCHTF);
		
		PHONETF = new JTextField();
		PHONETF.setColumns(10);
		PHONETF.setBounds(95, 207, 166, 22);
		FRAME.getContentPane().add(PHONETF);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(269, 23, 396, 372);
		FRAME.getContentPane().add(scrollPane);
		
		table = new JTable();
		MODEL = new DefaultTableModel();
		Object [] Column = {"Roll" , "Name" , "Branch" , "Phone"};
		Object [] Row = new Object[4];
		MODEL.setColumnIdentifiers(Column);
		table.setModel(MODEL);
		scrollPane.setViewportView(table);
		
		ADDB = new JButton("ADD");
		ADDB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement st = con.createStatement();
					
					PreparedStatement pst = con.prepareStatement("insert into Studentdbb values(? , ? , ? ,?)");
					pst.setString(1, ROLLTF.getText());
					pst.setString(2, NAMETF.getText());
					pst.setString(3, BRANCHTF.getText());
					pst.setString(4, PHONETF.getText());
					
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null , "INFORMATION STORED SUCESSFULLY");
					
					NAMETF.setText(null);
					ROLLTF.setText(null);
					BRANCHTF.setText(null);
					PHONETF.setText(null);
					
					clearfield();
					con.close();
					}
				catch(Exception E1)
				{
					JOptionPane.showMessageDialog(null , "ENTER COMPLETE INFORMATION");
				}
			}
		});
		ADDB.setBounds(12, 270, 97, 25);
		FRAME.getContentPane().add(ADDB);
		
		UPDATEB = new JButton("UPDATE");
		UPDATEB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement st = con.createStatement();
					
					PreparedStatement pst = con.prepareStatement("update Studentdbb set SName = '"+NAMETF.getText()+"' , SBranch = '"+BRANCHTF.getText()+"' , SPhone = '"+PHONETF.getText()+"' where SRoll = '"+ROLLTF.getText()+"' ; ");
					pst.executeUpdate();
					
					JOptionPane.showMessageDialog(null , "DATA UPDATED SUCCESSFULLY");
					
					NAMETF.setText(null);
					ROLLTF.setText(null);
					BRANCHTF.setText(null);
					PHONETF.setText(null);
					
					pst.close();
					con.close();
				}
				catch(Exception E2)
				{
					JOptionPane.showMessageDialog(null , "ENTER COMPLETE INFORMATION");
				}
			}
		});
		UPDATEB.setBounds(164, 270, 97, 25);
		FRAME.getContentPane().add(UPDATEB);
		
		SEARCHB = new JButton("SEARCH");
		SEARCHB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement st = con.createStatement();
					
					PreparedStatement pst = con.prepareStatement("select * from Studentdbb where SRoll = ? ;");
					pst.setString(1, ROLLTF.getText());
					
					ResultSet rs = pst.executeQuery();
					
					if(rs.next())
					{
						NAMETF.setText(rs.getString("SName"));
						BRANCHTF.setText(rs.getString("SBranch"));
						PHONETF.setText(rs.getString("SPhone"));
						JOptionPane.showMessageDialog(null , "RECORD FOUNDED SUCCESSFULLY");
					}
					else
					{
						JOptionPane.showMessageDialog(null , "RECORD NOT FOUNDED");
						NAMETF.setText(null);
						ROLLTF.setText(null);
						BRANCHTF.setText(null);
						PHONETF.setText(null);
					}
					
					con.close();
				}
				catch(Exception E3)
				{
					JOptionPane.showMessageDialog(null , "ENTER CORRECT VALUE");
				}
				
			}
		});
		SEARCHB.setBounds(164, 320, 97, 25);
		FRAME.getContentPane().add(SEARCHB);
		
		DELETEB = new JButton("DELETE");
		DELETEB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement st = con.createStatement();
					
					PreparedStatement pst = con.prepareStatement("delete from Studentdbb where SRoll = ? ;");
					pst.setString(1, ROLLTF.getText());
					pst.execute();
					
					JOptionPane.showMessageDialog(null , "DATA DELETED SUCCESSFULLY");
					NAMETF.setText(null);
					ROLLTF.setText(null);
					BRANCHTF.setText(null);
					PHONETF.setText(null);
					
					con.close();
				}
				catch(Exception E4)
				{
					JOptionPane.showMessageDialog(null , "SELECTE A RECORD FOR DELETE");
				}
			}
		});
		DELETEB.setBounds(12, 320, 97, 25);
		FRAME.getContentPane().add(DELETEB);
		
		FETCHB = new JButton("FETCH");
		FETCHB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try
				{
					Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
					Connection con = DriverManager.getConnection(url, user, pass);
					Statement st = con.createStatement();
					
					PreparedStatement ps = con.prepareStatement("select * from Studentdbb ;");
					ResultSet rs = ps.executeQuery();
					
					table.setModel(DbUtils.resultSetToTableModel(rs));
					con.close();
				}
				catch(Exception E5)
				{
					JOptionPane.showMessageDialog(null , "ACCESS DENIED");
				}
				
			}
		});
		FETCHB.setBounds(164, 370, 97, 25);
		FRAME.getContentPane().add(FETCHB);
		
		EXITB = new JButton("EXIT");
		EXITB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		EXITB.setBounds(12, 370, 97, 25);
		FRAME.getContentPane().add(EXITB);
	}
}
