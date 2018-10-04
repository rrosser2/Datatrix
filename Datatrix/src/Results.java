import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import java.sql.*;
import java.util.Vector;

public class Results{

	private JFrame result = new JFrame("Query Results");
	JPanel panel = new JPanel();
	
	
	
	ResultSet rs = null;

	
	public Results(Connection conn, Statement stmt2) throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		
		result.setBounds(400, 400, 450, 364);
		result.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		rs = stmt2.executeQuery("SELECT first_name, last_name, skills FROM employee");
		JTable table = new JTable(buildTableModel(rs));
		JScrollPane tableContain = new JScrollPane(table);
		panel.add(tableContain, BorderLayout.CENTER);
		result.getContentPane().add(panel);
		result.pack();
		result.setVisible(true);
	}
	
	public static DefaultTableModel buildTableModel(ResultSet rs)
	        throws SQLException {

	    ResultSetMetaData metaData = rs.getMetaData();

	    // names of columns
	    Vector<String> columnNames = new Vector<String>();
	    int columnCount = metaData.getColumnCount();
	    for (int column = 1; column <= columnCount; column++) {
	        columnNames.add(metaData.getColumnName(column));
	    }

	    // data of the table
	    Vector<Vector<Object>> data = new Vector<Vector<Object>>();
	    while (rs.next()) {
	        Vector<Object> vector = new Vector<Object>();
	        for (int columnIndex = 1; columnIndex <= columnCount; columnIndex++) {
	            vector.add(rs.getObject(columnIndex));
	        }
	        data.add(vector);
	    }

	    return new DefaultTableModel(data, columnNames);

	}
}

