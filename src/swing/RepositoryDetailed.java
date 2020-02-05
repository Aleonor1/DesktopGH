package swing;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author anyikit
 */
public class RepositoryDetailed extends JPanel {

	private static final long serialVersionUID = 1120803797549237556L;
	private JPanel jPanel6;
	private javax.swing.JTable jTable1;
	private javax.swing.JScrollPane jScrollPane1;

	public JPanel getJPanel() {
		return this.jPanel6;
	}

	public RepositoryDetailed(JPanel jPanel6) throws MalformedURLException, IOException {
		this.jPanel6 = jPanel6;
		this.jPanel6.removeAll();
		jTable1 = new JTable();
		jScrollPane1 = new JScrollPane();

		HttpURLConnection httpcon = (HttpURLConnection) new URL(
				"https://api.github.com/repos/goxr3plus/XR3Player/releases").openConnection();
		httpcon.addRequestProperty("User-Agent", "Mozilla/5.0");
		StringBuilder responseSB;
		try (BufferedReader in = new BufferedReader(new InputStreamReader(httpcon.getInputStream()))) {
			responseSB = new StringBuilder();
			String line;
			while ((line = in.readLine()) != null) {
				responseSB.append("\n").append(line);
			}
		}
		ArrayList<Integer> downloads = new ArrayList<>();
		Arrays.stream(responseSB.toString().split("\"download_count\":")).skip(1).map(l -> l.split(",")[0])
				.forEach(l -> downloads.add(Integer.parseInt(l)));

		int total = Arrays.stream(responseSB.toString().split("\"download_count\":")).skip(1)
				.mapToInt(l -> Integer.parseInt(l.split(",")[0])).sum();
		DefaultTableModel model;
		model = new javax.swing.table.DefaultTableModel(new Object[][] {},
				new String[] { "Name of information", "Information" }) {
			private static final long serialVersionUID = -583667639884598068L;

			@Override
			public boolean isCellEditable(int row, int column) {
				return false;
			}

		};
		jTable1.setModel(model);

		int count = 0;
		for (int i = 0; i < downloads.size(); i++) {
			Object[] row = new Object[2];
			row[0] = "Release number " + i;
			row[1] = downloads.get(count++);
			model.addRow(row);
		}
		Object[] row = new Object[2];
		row[0] = "Total downloads";
		row[1] = total;
		model.addRow(row);

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
		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
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
				}
			}
		});
	}
}
