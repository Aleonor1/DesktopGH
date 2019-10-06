package com.ghversionare.swing;

import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

import javax.swing.JPanel;

import org.kohsuke.github.GitHub;
import javax.swing.JButton;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.ImageIcon;
import java.awt.Dimension;
import java.awt.Font;

public class Home extends javax.swing.JFrame {

	private static final long serialVersionUID = 1L;

	public Home(GitHub gh) {
		initComponents(gh);
		setColor(btn1);
		panel1.setOpaque(true);
		resetColor(new JPanel[] { btn2, btn3, btn4 }, new JPanel[] { panel2, panel3, panel4 });

	}

	private void initComponents(GitHub gh) {
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
		btnLogOut = new javax.swing.JLabel();
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
				btn1MousePressed(evt);
			}
		});

		panel1.setOpaque(false);
		panel1.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind1Layout = new javax.swing.GroupLayout(panel1);
		panel1.setLayout(ind1Layout);
		ind1Layout.setHorizontalGroup(ind1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind1Layout.setVerticalGroup(ind1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel8.setForeground(new java.awt.Color(255, 255, 255));
		jLabel8.setText("Home");

		javax.swing.GroupLayout btn1Layout = new javax.swing.GroupLayout(btn1);
		btn1.setLayout(btn1Layout);
		btn1Layout.setHorizontalGroup(btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn1Layout.createSequentialGroup()
						.addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel8).addGap(0, 0, Short.MAX_VALUE)));
		btn1Layout.setVerticalGroup(btn1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn1Layout.createSequentialGroup()
						.addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn1Layout.createSequentialGroup().addContainerGap().addComponent(jLabel8,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		sidepane.add(btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 120, -1));

		btn2.setBackground(new java.awt.Color(23, 35, 51));
		btn2.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseReleased(java.awt.event.MouseEvent evt) {
				btn2MouseReleased(evt);
			}
		});

		panel2.setOpaque(false);
		panel2.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind2Layout = new javax.swing.GroupLayout(panel2);
		panel2.setLayout(ind2Layout);
		ind2Layout.setHorizontalGroup(ind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind2Layout.setVerticalGroup(ind2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel9.setForeground(new java.awt.Color(255, 255, 255));
		jLabel9.setText("Settings");

		javax.swing.GroupLayout btn2Layout = new javax.swing.GroupLayout(btn2);
		btn2.setLayout(btn2Layout);
		btn2Layout.setHorizontalGroup(btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn2Layout.createSequentialGroup()
						.addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel9).addGap(0, 40, Short.MAX_VALUE)));
		btn2Layout.setVerticalGroup(btn2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn2Layout.createSequentialGroup()
						.addComponent(panel2, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel9,
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

		javax.swing.GroupLayout ind3Layout = new javax.swing.GroupLayout(panel3);
		panel3.setLayout(ind3Layout);
		ind3Layout.setHorizontalGroup(ind3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind3Layout.setVerticalGroup(ind3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jlabel100.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jlabel100.setForeground(new java.awt.Color(255, 255, 255));
		jlabel100.setText("Users");

		javax.swing.GroupLayout btn3Layout = new javax.swing.GroupLayout(btn3);
		btn3.setLayout(btn3Layout);
		btn3Layout.setHorizontalGroup(btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn3Layout.createSequentialGroup()
						.addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jlabel100).addGap(0, 0, Short.MAX_VALUE)));
		btn3Layout.setVerticalGroup(btn3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn3Layout.createSequentialGroup()
						.addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn3Layout.createSequentialGroup().addContainerGap().addComponent(jlabel100,
						javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addContainerGap()));

		sidepane.add(btn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 120, -1));

		btn4.setBackground(new java.awt.Color(23, 35, 51));
		btn4.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btn4MousePressed(evt);
			}
		});

		panel4.setOpaque(false);
		panel4.setPreferredSize(new java.awt.Dimension(3, 43));

		javax.swing.GroupLayout ind4Layout = new javax.swing.GroupLayout(panel4);
		panel4.setLayout(ind4Layout);
		ind4Layout.setHorizontalGroup(ind4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 3, Short.MAX_VALUE));
		ind4Layout.setVerticalGroup(ind4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGap(0, 43, Short.MAX_VALUE));

		jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel11.setForeground(new java.awt.Color(255, 255, 255));
		jLabel11.setText("Profile");

		javax.swing.GroupLayout btn4Layout = new javax.swing.GroupLayout(btn4);
		btn4.setLayout(btn4Layout);
		btn4Layout.setHorizontalGroup(btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn4Layout.createSequentialGroup()
						.addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(35, 35, 35).addComponent(jLabel11).addGap(0, 48, Short.MAX_VALUE)));
		btn4Layout.setVerticalGroup(btn4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(btn4Layout.createSequentialGroup()
						.addComponent(panel4, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addGap(0, 0, Short.MAX_VALUE))
				.addGroup(btn4Layout.createSequentialGroup().addContainerGap().addComponent(jLabel11,
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

		jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/icons8_Search_18px.png")));
		
		JLabel btnExit = new JLabel();
		btnExit.setIcon(new ImageIcon(Home.class.getResource("/swing/images/icons8-close-window-48.png")));
		btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				btnExitMousePressed(evt);
			}
		});

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2Layout.setHorizontalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap(670, Short.MAX_VALUE)
					.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, 141, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(jLabel7)
					.addGap(55)
					.addComponent(btnExit, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE))
		);
		jPanel2Layout.setVerticalGroup(
			jPanel2Layout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, jPanel2Layout.createSequentialGroup()
					.addComponent(btnExit)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(jPanel2Layout.createSequentialGroup()
					.addContainerGap(26, Short.MAX_VALUE)
					.addGroup(jPanel2Layout.createParallelGroup(Alignment.TRAILING)
						.addComponent(jTextField1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jLabel7))
					.addGap(8))
		);
		jPanel2.setLayout(jPanel2Layout);

		getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 950, 50));

		jPanel3.setBackground(new java.awt.Color(71, 120, 197));

		jPanel4.setBackground(new java.awt.Color(120, 168, 252));
		jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

		btnLogOut.setIcon(new ImageIcon(Home.class.getResource("/swing/images/icons8_Exit_25px.png"))); // NOI18N
		btnLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				LogIn window = new LogIn();
				window.main(new String[] {});
				btnExitMousePressed(evt);
			}
		});
		jPanel4.add(btnLogOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 24, -1, 46));

		jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/swing/images/github-sign.png"))); // NOI18N
		jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 86, -1));

		jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
		jLabel12.setForeground(new java.awt.Color(255, 255, 255));
		try {
			if (gh.isAnonymous()) {
				jLabel12.setText("GitHub");
			} else {
				jLabel12.setText(gh.getMyself().getLogin());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 30));

		JLabel btnLinkedin = new JLabel();
		btnLinkedin.setIcon(new ImageIcon(Home.class.getResource("/swing/images/icons8_LinkedIn_96px.png")));
		btnLinkedin.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				openLink(evt, "https://www.linkedin.com/in/aleonor-nyikita-69a777161/");
			}
		});

		btnGitHub = new JLabel();
		btnGitHub.setIcon(new ImageIcon(Home.class.getResource("/swing/images/icons8-github-48.png")));
		btnGitHub.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				openLink(evt, "https://github.com/Aleonor1");

			}
		});

		bugButton = new JLabel();
		bugButton.setIcon(new ImageIcon(Home.class.getResource("/swing/images/icons8-bug-64.png")));
		bugButton.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mousePressed(java.awt.event.MouseEvent evt) {
				if (gh.isAnonymous()) {
					JOptionPane.showMessageDialog(null, "You must be logged in! ");
				} else {
					openLink(evt, "https://github.com/Aleonor1/DesktopGH/issues/new");
				}
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3Layout.setHorizontalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addComponent(jPanel4, GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addGap(6)
					.addComponent(btnLinkedin, GroupLayout.PREFERRED_SIZE, 79, GroupLayout.PREFERRED_SIZE)
					.addGap(44)
					.addComponent(btnGitHub, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(26)
					.addComponent(bugButton, GroupLayout.PREFERRED_SIZE, 57, GroupLayout.PREFERRED_SIZE)
					.addGap(31))
		);
		jPanel3Layout.setVerticalGroup(
			jPanel3Layout.createParallelGroup(Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup()
					.addComponent(jPanel4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(jPanel3Layout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnLinkedin, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(bugButton, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnGitHub, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(392, Short.MAX_VALUE))
		);
		jPanel3.setLayout(jPanel3Layout);

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

	private void btn1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_1MousePressed
		setColor(btn1);
		panel1.setOpaque(true);
		resetColor(new JPanel[] { btn2, btn3, btn4 }, new JPanel[] { panel2, panel3, panel4 });
	}

	private void btn_3MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_3MousePressed
		setColor(btn3);
		panel3.setOpaque(true);
		resetColor(new JPanel[] { btn2, btn1, btn4 }, new JPanel[] { panel2, panel1, panel4 });
	}

	private void btn4MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_4MousePressed
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

	private void btnExitMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_exitMousePressed
		System.exit(0);
	}

	private void openLink(java.awt.event.MouseEvent evt, String url) {
		try {
			Desktop desktop = java.awt.Desktop.getDesktop();
			URI oURL = new URI(url);
			desktop.browse(oURL);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void btn2MouseReleased(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_btn_2MouseReleased
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
	private javax.swing.JLabel btnLogOut;
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
	private JLabel btnGitHub;
	private JLabel bugButton;
}
