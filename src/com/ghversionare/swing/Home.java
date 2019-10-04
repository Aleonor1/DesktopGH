package com.ghversionare.swing;
import java.awt.Color;
import javax.swing.JPanel;

public class Home extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public Home() {
		initComponents();
		setColor(btn1);
		panel1.setOpaque(true);
		resetColor(new JPanel[] { btn2, btn3, btn4 }, new JPanel[] { panel2, panel3, panel4 });

	}

	private void initComponents() {
		sidepane = new javax.swing.JPanel();
		btn1 = new javax.swing.JPanel();
		panel1 = new javax.swing.JPanel();
		jLabel8 = new javax.swing.JLabel();
		btn2 = new javax.swing.JPanel();
		panel2 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		btn3 = new javax.swing.JPanel();
		panel3 = new javax.swing.JPanel();
		jlabel100 = new javax.swing.JLabel();
		btn4 = new javax.swing.JPanel();
		panel4 = new javax.swing.JPanel();
		jLabel11 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jTextField1 = new javax.swing.JTextField();
		jLabel7 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jPanel4 = new javax.swing.JPanel();
		btnExit = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel12 = new javax.swing.JLabel();
		jPanel6 = new javax.swing.JPanel();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));
		setLocationByPlatform(true);
		setUndecorated(true);
		getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		sidepane.setBackground(new java.awt.Color(23, 35, 51));
		sidepane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		btn1.setBackground(new java.awt.Color(23, 35, 51));
		btn1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btn_1MousePressed(evt);
			}
		});

		panel1.setOpaque(false);
		panel1.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind_1Layout = new javax.swing.GroupLayout(panel1);
		panel1.setLayout(ind_1Layout);
		ind_1Layout.setHorizontalGroup(ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind_1Layout.setVerticalGroup(ind_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("Home");

		javax.swing.GroupLayout btn_1Layout = new javax.swing.GroupLayout(btn1);
		btn1.setLayout(btn_1Layout);
		btn_1Layout.setHorizontalGroup(btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_1Layout.createSequentialGroup()
						.addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel8).addGap(0, 0, Short.MAX_VALUE)));
		btn_1Layout.setVerticalGroup(btn_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_1Layout.createSequentialGroup()
						.addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn_1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel8,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		sidepane.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

		btn2.setBackground(new java.awt.Color(23, 35, 51));
		btn2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				btn_2MouseReleased(evt);
			}
		});

		panel2.setOpaque(false);
		panel2.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind_2Layout = new javax.swing.GroupLayout(panel2);
		panel2.setLayout(ind_2Layout);
		ind_2Layout.setHorizontalGroup(ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind_2Layout.setVerticalGroup(ind_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("Settings");

		javax.swing.GroupLayout btn_2Layout = new javax.swing.GroupLayout(btn2);
		btn2.setLayout(btn_2Layout);
		btn_2Layout.setHorizontalGroup(btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_2Layout.createSequentialGroup()
						.addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel9).addGap(0, 40, Short.MAX_VALUE)));
		btn_2Layout.setVerticalGroup(btn_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_2Layout.createSequentialGroup()
						.addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn_2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel9,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		sidepane.add(btn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 120, -1));

		btn3.setBackground(new java.awt.Color(23, 35, 51));
		btn3.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btn_3MousePressed(evt);
			}
		});

		panel3.setOpaque(false);
		panel3.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind_3Layout = new javax.swing.GroupLayout(panel3);
		panel3.setLayout(ind_3Layout);
		ind_3Layout.setHorizontalGroup(ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind_3Layout.setVerticalGroup(ind_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jlabel100.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jlabel100.setForeground(new java.awt.Color(255, 255, 255));
		jlabel100.setText("Users");

		javax.swing.GroupLayout btn_3Layout = new javax.swing.GroupLayout(btn3);
		btn3.setLayout(btn_3Layout);
		btn_3Layout.setHorizontalGroup(btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_3Layout.createSequentialGroup()
						.addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jlabel100).addGap(0, 0, Short.MAX_VALUE)));
		btn_3Layout.setVerticalGroup(btn_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_3Layout.createSequentialGroup()
						.addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn_3Layout.createSequentialGroup().addContainerGap().addComponent(jlabel100,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		sidepane.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

		btn4.setBackground(new java.awt.Color(23, 35, 51));
		btn4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btn_4MousePressed(evt);
			}
		});

		panel4.setOpaque(false);
		panel4.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind_4Layout = new javax.swing.GroupLayout(panel4);
		panel4.setLayout(ind_4Layout);
		ind_4Layout.setHorizontalGroup(ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind_4Layout.setVerticalGroup(ind_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));
		jLabel11.setText("Profile");

		javax.swing.GroupLayout btn_4Layout = new javax.swing.GroupLayout(btn4);
		btn4.setLayout(btn_4Layout);
		btn_4Layout.setHorizontalGroup(btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_4Layout.createSequentialGroup()
						.addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel11).addGap(0, 48, Short.MAX_VALUE)));
		btn_4Layout.setVerticalGroup(btn_4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn_4Layout.createSequentialGroup()
						.addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn_4Layout.createSequentialGroup().addContainerGap().addComponent(jLabel11,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		sidepane.add(btn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 120, -1));

		getContentPane().add(sidepane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 120, 590));

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

		jPanel4.setBackground(new java.awt.Color(120, 168, 252));
		jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
		btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btn_exitMousePressed(evt);
			}
		});
		jPanel4.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 24, -1, 46));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/github-sign.png"))); // NOI18N
		jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 86, -1));

		jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		jLabel12.setText("GitHub username");
		jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(
				jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jPanel4,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
						.addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(466, Short.MAX_VALUE)));

		getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 300, 540));

		jPanel6.setBackground(new java.awt.Color(255, 255, 255));

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
		jPanel6.setLayout(jPanel6Layout);
		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 650, Short.MAX_VALUE));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 540, Short.MAX_VALUE));

		getContentPane().add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 50, 650, 540));

		pack();
	}

	private void btn_1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_1MousePressed
		setColor(btn1);
		panel1.setOpaque(true);
		resetColor(new JPanel[] { btn2, btn3, btn4 }, new JPanel[] { panel2, panel3, panel4 });
	}

	private void btn_3MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_3MousePressed
		setColor(btn3);
		panel3.setOpaque(true);
		resetColor(new JPanel[] { btn2, btn1, btn4 }, new JPanel[] { panel2, panel1, panel4 });
	}

	private void btn_4MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_4MousePressed
		setColor(btn4);
		panel4.setOpaque(true);
		resetColor(new JPanel[] { btn2, btn3, btn1 }, new JPanel[] { panel2, panel3, panel1 });
	}

	int xx, xy;

	private void jPanel2MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MousePressed
		xx = evt.getX();
		xy = evt.getY();
	}

	private void jPanel2MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseDragged
		int x = evt.getXOnScreen();
		int y = evt.getYOnScreen();
		this.setLocation(x - xx, y - xy);
	}

	private void btn_exitMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_exitMousePressed
		System.exit(0);
	}

	private void btn_2MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_2MouseReleased
		setColor(btn2);
		panel2.setOpaque(true);
		resetColor(new JPanel[] { btn1, btn3, btn4 }, new JPanel[] { panel1, panel3, panel4 });
	}
	private void setColor(JPanel pane) {
		pane.setBackground(new Color(41, 57, 80));
	}

	private void resetColor(JPanel[] pane, JPanel[] indicators) {
		for (int i = 0; i < pane.length; i++) {
			pane[i].setBackground(new Color(23, 35, 51));

		}
		for (int i = 0; i < indicators.length; i++) {
			indicators[i].setOpaque(false);
		}
	}

	private javax.swing.JPanel btn1;
	private javax.swing.JPanel btn2;
	private javax.swing.JPanel btn3;
	private javax.swing.JPanel btn4;
	private javax.swing.JLabel btnExit;
	private javax.swing.JPanel panel1;
	private javax.swing.JPanel panel2;
	private javax.swing.JPanel panel3;
	private javax.swing.JPanel panel4;
	private javax.swing.JLabel jlabel100;
	private javax.swing.JLabel jLabel11;
	private javax.swing.JLabel jLabel12;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPanel jPanel6;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JPanel sidepane;
	// End of variables declaration//GEN-END:variables
}
