package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import api.ApiConnector;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anyikit
 */
public class RepositoryDetailed extends JFrame {

	private static final long serialVersionUID = 1120803797549237556L;
	private JPanel jPanel6;
	private javax.swing.JTable jTable1;
	private javax.swing.JScrollPane jScrollPane1;

	public JPanel getJPanel() {
		return this.jPanel6;
	}

	public RepositoryDetailed(String user, String data, JPanel jPanel62) {
		super("Details of:" + data);
		JPanel panel = new JPanel(new GridLayout(2, 1));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		HashMap<String, String> details = ApiConnector.getDetailsOfRepo(user, data);

		jTable1 = new JTable();
		jScrollPane1 = new JScrollPane();
		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "Number", "Repository Name", "Owner", "Topics" }) {
			private static final long serialVersionUID = -1094020803823916174L;
			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}
		});
		Object[][] values = new Object[details.keySet().size()][2];
		ArrayList<String> keys = new ArrayList<String>(details.keySet());
		for (int i = 0; i < keys.size(); i++) {
			String key = keys.get(i);
			values[i][0] = key;
			values[i][1] = details.get(key);
		}
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		for (int i = 0; i < values.length; i++) {
			model.addRow(values[i]);
		}

		jTable1.setAutoCreateRowSorter(true);
		jTable1.setFocusable(false);
		jTable1.setRowSelectionAllowed(true);

		jTable1.setIntercellSpacing(new java.awt.Dimension(0, 0));
		jTable1.setRowHeight(25);
		jTable1.setSelectionBackground(new java.awt.Color(232, 57, 96));
		jTable1.setShowVerticalLines(false);
		jTable1.getTableHeader().setReorderingAllowed(false);
		jScrollPane1.setViewportView(jTable1);
		jTable1.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 12));
		jTable1.getTableHeader().setOpaque(false);
		jTable1.getTableHeader().setBackground(new Color(32, 136, 203));
		jTable1.getTableHeader().setForeground(new Color(255, 255, 255));
		jTable1.setRowHeight(25);

		JButton backButton = new JButton("Close");
		backButton.setBackground(new java.awt.Color(71, 120, 197));
		backButton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		backButton.setForeground(new java.awt.Color(255, 255, 255));
		backButton.setPreferredSize(new Dimension(40, 40));
		backButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				setVisible(false);
				dispose();
			}
		});
		resizeColumnWidth(jTable1);
//		add(backButton);
		add(jTable1);
		this.setTitle("Details of " + data);
		this.pack();
		this.setVisible(true);
	}

	public void resizeColumnWidth(JTable table) {
		final TableColumnModel columnModel = table.getColumnModel();
		for (int column = 0; column < table.getColumnCount(); column++) {
			int width = 15;
			for (int row = 0; row < table.getRowCount(); row++) {
				TableCellRenderer renderer = table.getCellRenderer(row, column);
				Component comp = table.prepareRenderer(renderer, row, column);
				width = Math.max(comp.getPreferredSize().width + 1, width);
			}
			if (width > 300)
				width = 300;
			columnModel.getColumn(column).setPreferredWidth(width);
		}
	}
}
