import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Panel;
import javax.swing.JTable;
import java.sql.*;

public class DatatrixGUI {

	
	private JFrame frame;



	public static void main(String[] args) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DatatrixGUI window = new DatatrixGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public DatatrixGUI() throws InstantiationException, IllegalAccessException, ClassNotFoundException, SQLException  {
		Connection conn = null;
		Statement stmt = null;
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		String connectionURL = "jdbc:mysql://localhost:3306/"; //insert DB name after the /
		String connectionUser = "xxxxx"; //username from when you set up MySQL
		String connectionPassword = "xxxxx"; //password from when you set up MySQL
		conn = DriverManager.getConnection(connectionURL, connectionUser, connectionPassword);
		stmt = conn.createStatement();
		initialize(conn, stmt);
	
	}


	/**
	 * Initialize the contents of the frame.
	 * @param stmt 
	 * @param conn 
	 */
	private void initialize(Connection conn, Statement stmt) {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 364);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnSearchSkills = new JButton("Search skills");
		btnSearchSkills.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					new Results(conn, stmt);
				} catch (InstantiationException | IllegalAccessException | ClassNotFoundException | SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		frame.getContentPane().add(btnSearchSkills, BorderLayout.SOUTH);
	}

	
	
}



