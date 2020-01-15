/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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

	public RepositoriesView(JPanel jPanel6, ArrayList<Repository> results) {
		this.jPanel6 = jPanel6;
		this.jPanel6.removeAll();
		jTable1 = new JTable();
		jScrollPane1 = new JScrollPane();
		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "Repository Name", "Owner"}) {
			private static final long serialVersionUID = -1094020803823916174L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		});
		Object[][] a = new Object[results.size()][2];
		for (int i = 0; i < results.size(); i++) {
			a[i][0] = results.get(i).getName();
			a[i][1] = results.get(i).getLogin();
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
					try {
						System.out.println(table.getValueAt(table.getSelectedRow(), table.getSelectedColumn()));
						String data = table.getValueAt(table.getSelectedRow(),0).toString();
						data += table.getValueAt(table.getSelectedRow(),1).toString();
						System.out.println(data);
						RepositoryDetailed detailedRepo = new RepositoryDetailed(jPanel6);
					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		});
	}

	public RepositoriesView(JPanel jPanel6) {
		this.jPanel6 = jPanel6;
		this.jPanel6.removeAll();
		jTable1 = new JTable();
		jScrollPane1 = new JScrollPane();

		jTable1.setModel(new javax.swing.table.DefaultTableModel(
				new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
						{ null, null, null, null } },
				new String[] { "Repository Name", "Owner", "Topic", "Total Downloads" }) {
			/**
			 * 
			 */
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
}
