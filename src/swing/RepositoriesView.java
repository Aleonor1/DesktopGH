/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import api.ApiConnector;

/**
 *
 * @author anyikit
 */
public class RepositoriesView extends javax.swing.JPanel { // NO_UCD (use default)

	private static final long serialVersionUID = 8710002865155991895L;
	private javax.swing.JTable jTable1;
	private javax.swing.JScrollPane jScrollPane1;
	private JPanel jPanel6;

	public JPanel getJPanel6() {
		MainApplication.repositoryButtonPressed();
		return this.jPanel6;
	}

	public RepositoriesView(JPanel jPanel6, Map<String, String> results) {
		this.jPanel6 = jPanel6;
		this.jPanel6.removeAll();
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
		Object[][] a = new Object[results.size()][4];
		ArrayList<String> keys = new ArrayList<String>(results.keySet());
		for (int i = 0; i < keys.size(); i++) {
			String st = keys.get(i);
			a[i][0] = (i + 1) + ".";
			a[i][1] = st;
			a[i][2] = results.get(st);
			a[i][3] = ApiConnector.getTopics(st, results.get(st));
		}
		DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
		for (int i = 0; i < a.length; i++) {
			model.addRow(a[i]);
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
		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(this.jPanel6);
		this.jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
						.addContainerGap()));
		jTable1.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent mouseEvent) {
				JTable table = (JTable) mouseEvent.getSource();
				if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
					String user = table.getValueAt(table.getSelectedRow(), 1).toString();
					String data = table.getValueAt(table.getSelectedRow(), 2).toString();
					RepositoryDetailed detailedRepo = new RepositoryDetailed(user, data, jPanel6);
					
				}
			}

		});
		resizeColumnWidth(jTable1);
	}

	public RepositoriesView(JPanel jPanel6) {
		this.jPanel6 = jPanel6;
		this.jPanel6.removeAll();
		jTable1 = new JTable();
		jScrollPane1 = new JScrollPane();
		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } },
				new String[] { "Number", "Repository Name", "Owner", "Topic", "Total Downloads" }) {
			private static final long serialVersionUID = -1094020803823916174L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		});
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
		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(this.jPanel6);
		this.jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 630, Short.MAX_VALUE)
						.addContainerGap()));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addContainerGap()
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
						.addContainerGap()));

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
