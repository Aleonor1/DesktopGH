/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Color;
import java.awt.Container;
import java.io.IOException;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;

/**
 *
 * @author anyikit
 */
public class MainApplication extends javax.swing.JFrame {

	private static final long serialVersionUID = -5233284588613718266L;
	public static AllViews views = AllViews.getInstances();

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Windows".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(MainApplication.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}

		java.awt.EventQueue.invokeLater(() -> {
			new MainApplication().setVisible(true);
		});

	}

	public MainApplication() {
		initComponents();
		setColor(btn_1);
		ind_1.setOpaque(true);
		resetColor(new JPanel[] { btn_2, btn_3, btn_4 }, new JPanel[] { ind_2, ind_3, ind_4 });
		HomeView homeView = new HomeView(jPanel6);
		views.setHomeView(homeView);
		this.jPanel6 = homeView.getjPanel();
	}

	public Container getPanel() {
		return this.getContentPane();
	}

	private void initComponents() {
		side_pane = new javax.swing.JPanel();
		btn_1 = new javax.swing.JPanel();
		ind_1 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		btn_2 = new javax.swing.JPanel();
		ind_2 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		btn_3 = new javax.swing.JPanel();
		ind_3 = new javax.swing.JPanel();
		jLabel10 = new javax.swing.JLabel();
		btn_4 = new javax.swing.JPanel();
		ind_4 = new javax.swing.JPanel();
		jLabel11 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		button1 = new java.awt.Button();
		jLabel13 = new javax.swing.JLabel();
		jLabel16 = new javax.swing.JLabel();
		jLabel19 = new javax.swing.JLabel();
		jPanel4 = new javax.swing.JPanel();
		btn_exit = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));
		setLocationByPlatform(true);
		setUndecorated(true);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		side_pane.setBackground(new java.awt.Color(23, 35, 51));
		side_pane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		btn_1.setBackground(new java.awt.Color(23, 35, 51));
		btn_1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btn_1MousePressed(evt);
				RepositoriesView view = AllViews.getInstances().getRepositoryView();
				jPanel6 = view.getJPanel6();
			}
		});

		ind_1.setOpaque(false);
		ind_1.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(ind_1);
		ind_1.setLayout(ind_1Layout);
		ind_1Layout.setHorizontalGroup(ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind_1Layout.setVerticalGroup(ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("Home");

		javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn_1);
		btn_1.setLayout(btn_1Layout);
		btn_1Layout.setHorizontalGroup(btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_1Layout.createSequentialGroup()
						.addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel8).addGap(0, 0, Short.MAX_VALUE)));
		btn_1Layout.setVerticalGroup(btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_1Layout.createSequentialGroup()
						.addComponent(ind_1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn_1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel8,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		side_pane.add(btn_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

		btn_2.setBackground(new java.awt.Color(23, 35, 51));
		btn_2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				btn_2MouseReleased(evt);
			}
		});

		ind_2.setOpaque(false);
		ind_2.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(ind_2);
		ind_2.setLayout(ind_2Layout);
		ind_2Layout.setHorizontalGroup(ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind_2Layout.setVerticalGroup(ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("Detailed Search");

		javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn_2);
		btn_2.setLayout(btn_2Layout);
		btn_2Layout.setHorizontalGroup(btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_2Layout.createSequentialGroup()
						.addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel9).addGap(0, 40, Short.MAX_VALUE)));
		btn_2Layout.setVerticalGroup(btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_2Layout.createSequentialGroup()
						.addComponent(ind_2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn_2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel9,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		side_pane.add(btn_2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, -1));

		btn_3.setBackground(new java.awt.Color(23, 35, 51));
		btn_3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btn_3MousePressed();
			}
		});

		ind_3.setOpaque(false);
		ind_3.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(ind_3);
		ind_3.setLayout(ind_3Layout);
		ind_3Layout.setHorizontalGroup(ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind_3Layout.setVerticalGroup(ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel10.setForeground(new java.awt.Color(255, 255, 255));
		jLabel10.setText("Repositories");

		javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn_3);
		btn_3.setLayout(btn_3Layout);
		btn_3Layout.setHorizontalGroup(btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_3Layout.createSequentialGroup()
						.addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel10).addGap(0, 0, Short.MAX_VALUE)));
		btn_3Layout.setVerticalGroup(btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_3Layout.createSequentialGroup()
						.addComponent(ind_3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn_3Layout.createSequentialGroup().addContainerGap().addComponent(jLabel10,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		side_pane.add(btn_3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

		btn_4.setBackground(new java.awt.Color(23, 35, 51));
		btn_4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				try {
					btn_4MousePressed(evt);
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});

		ind_4.setOpaque(false);
		ind_4.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(ind_4);
		ind_4.setLayout(ind_4Layout);
		ind_4Layout.setHorizontalGroup(ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind_4Layout.setVerticalGroup(ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));
		jLabel11.setText("Details");

		javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn_4);
		btn_4.setLayout(btn_4Layout);
		btn_4Layout.setHorizontalGroup(btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_4Layout.createSequentialGroup()
						.addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel11).addGap(0, 0, Short.MAX_VALUE)));
		btn_4Layout.setVerticalGroup(btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_4Layout.createSequentialGroup()
						.addComponent(ind_4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn_4Layout.createSequentialGroup().addContainerGap().addComponent(jLabel11,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		side_pane.add(btn_4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, -1));

		getContentPane().add(side_pane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 590));

		jPanel2.setBackground(new java.awt.Color(71, 120, 197));
		jPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
			public void mouseDragged(java.awt.event.MouseEvent evt) {
				jPanel2MouseDragged(evt);
			}
		});
		jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				jPanel2MousePressed(evt);
			}
		});

		jTextField1.setBackground(new java.awt.Color(123, 156, 225));
		jTextField1.setForeground(new java.awt.Color(255, 255, 255));
		jTextField1.setBorder(null);
		jTextField1.setCaretColor(new java.awt.Color(255, 255, 255));
		jTextField1.setPreferredSize(new java.awt.Dimension(2, 20));

		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png"))); // NOI18N

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
						jPanel2Layout.createSequentialGroup().addContainerGap(747, Short.MAX_VALUE)
								.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 141,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addComponent(jLabel7).addGap(34, 34, 34)));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
						.addContainerGap(19, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
								.addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
						.addContainerGap()));

		getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 950, 50));

		jPanel3.setBackground(new java.awt.Color(71, 120, 197));

		jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 52)); // NOI18N
		jLabel6.setForeground(new java.awt.Color(255, 255, 255));
		jLabel6.setText("04");

		button1.setBackground(new java.awt.Color(71, 120, 197));
		button1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button1.setForeground(new java.awt.Color(255, 255, 255));
		button1.setLabel("Book");

		jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel13.setForeground(new java.awt.Color(255, 255, 255));
		jLabel13.setText("May 2018");

		jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel16.setForeground(new java.awt.Color(255, 255, 255));
		jLabel16.setText("Friday 23 Feb ");

		jPanel4.setBackground(new java.awt.Color(120, 168, 252));
		jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
		btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btn_exitMousePressed(evt);
			}
		});
		jPanel4.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, -1, 46));
		jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 86, -1));

		jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText("GitHub");
		jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, 30));

		jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/github-sign.png"))); // NOI18N
		jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 86, 80));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(jLabel13))
								.addGroup(jPanel3Layout.createSequentialGroup()
										.addGroup(jPanel3Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addGroup(jPanel3Layout.createSequentialGroup().addGap(112, 112, 112)
														.addComponent(jLabel6))
												.addGroup(jPanel3Layout.createSequentialGroup().addGap(73, 73, 73)
														.addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE,
																148, javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(0, 69, Short.MAX_VALUE)))
						.addContainerGap())
				.addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE,
						300, Short.MAX_VALUE)
				.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(jPanel3Layout.createSequentialGroup().addGap(33, 33, 33).addComponent(jLabel16)
								.addContainerGap(195, Short.MAX_VALUE)))
				.addGroup(
						jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 86,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(31, 31, 31)
						.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
						.addGap(48, 48, 48).addComponent(jLabel6).addGap(25, 25, 25)
						.addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(150, Short.MAX_VALUE))
				.addGroup(
						jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(236, 236, 236)
										.addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, 19,
												Short.MAX_VALUE)
										.addGap(285, 285, 285)))
				.addGroup(
						jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE)
										.addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 64,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(0, 0, Short.MAX_VALUE))));

		getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 300, 540));

		jPanel6.setBackground(new java.awt.Color(255, 255, 255));

		lblSarmale = new JLabel("sarmale");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout
				.createSequentialGroup().addGap(119).addComponent(lblSarmale).addContainerGap(485, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(Alignment.LEADING).addGroup(jPanel6Layout
				.createSequentialGroup().addGap(173).addComponent(lblSarmale).addContainerGap(353, Short.MAX_VALUE)));
		jPanel6.setLayout(jPanel6Layout);

		getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void btn_1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_1MousePressed
		setColor(btn_1);
		ind_1.setOpaque(true);
		resetColor(new JPanel[] { btn_2, btn_3, btn_4 }, new JPanel[] { ind_2, ind_3, ind_4 });
		HomeView repo = new HomeView(jPanel6);
		views.setHomeView(repo);
		this.jPanel6 = repo.getjPanel();
	}

	private void btn_4MousePressed(java.awt.event.MouseEvent evt) throws IOException {// GEN-FIRST:event_btn_4MousePressed
		setColor(btn_4);
		ind_4.setOpaque(true);
		resetColor(new JPanel[] { btn_2, btn_3, btn_1 }, new JPanel[] { ind_2, ind_3, ind_1 });
//			RepositoryDetailed repos = new RepositoryDetailed();
	}

	private void btn_2MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_2MouseReleased
		// TODO add your handling code here:
		setColor(btn_2);
		ind_2.setOpaque(true);
		resetColor(new JPanel[] { btn_1, btn_3, btn_4 }, new JPanel[] { ind_1, ind_3, ind_4 });
		SearchView search = new SearchView(this.jPanel6);
		this.jPanel6 = search.getjPanel();

	}// GEN-LAST:event_btn_2MouseReleased

	private int xx, xy;

	private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MousePressed
		xx = evt.getX();
		xy = evt.getY();
	}

	private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseDragged
		// TODO add your handling code here:

		// source to drag
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xx, y - xy);
	}// GEN-LAST:event_jPanel2MouseDragged

	private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_exitMousePressed
		// TODO add your handling code here:
		System.exit(0);
	}// GEN-LAST:event_btn_exitMousePressed

	private static void setColor(JPanel pane) {
		pane.setBackground(new Color(41, 57, 80));
	}

	private static void resetColor(JPanel[] pane, JPanel[] indicators) {
		for (JPanel pane1 : pane) {
			pane1.setBackground(new Color(23, 35, 51));
		}
		for (JPanel indicator : indicators) {
			indicator.setOpaque(false);
		}
	}

	public static void repositoryButtonPressed() {
		setColor(btn_3);
		ind_3.setOpaque(true);
		resetColor(new JPanel[] { btn_2, btn_1, btn_4 }, new JPanel[] { ind_2, ind_1, ind_4 });
	}

	private void btn_3MousePressed() {
		setColor(btn_3);
		System.out.println("hatz");
		ind_3.setOpaque(true);
		resetColor(new JPanel[] { btn_2, btn_1, btn_4 }, new JPanel[] { ind_2, ind_1, ind_4 });
		RepositoriesView repo = AllViews.getInstances().getRepositoryView();
		this.jPanel6 = repo.getJPanel6();
	}

	private static javax.swing.JPanel btn_1;
	private static javax.swing.JPanel btn_2;
	private static javax.swing.JPanel btn_3;
	private static javax.swing.JPanel btn_4;
	private javax.swing.JLabel btn_exit;
	private java.awt.Button button1;
	private static javax.swing.JPanel ind_1;
	private static javax.swing.JPanel ind_2;
	private static javax.swing.JPanel ind_3;
	private static javax.swing.JPanel ind_4;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel13;
	private javax.swing.JLabel jLabel16;
	private javax.swing.JLabel jLabel19;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JPanel side_pane;
	private JLabel lblSarmale;

}
