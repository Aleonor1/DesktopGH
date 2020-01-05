/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author anyikit
 */
public class HomeView extends javax.swing.JFrame { // NO_UCD (use default)

	private static final long serialVersionUID = 2230288104893640642L;
	private java.awt.Button button10;
	private Button button3;
	private java.awt.Button button11;
	private java.awt.Button button12;
	private java.awt.Button button13;
	private java.awt.Button button14;
	private java.awt.Button button15;
	private java.awt.Button button16;
	private java.awt.Button button17;
	private java.awt.Button button18;
	private java.awt.Button button19;
	private java.awt.Button button2;
	private java.awt.Button button20;
	private java.awt.Button button21;
	private java.awt.Button button22;
	private java.awt.Button button23;
	private java.awt.Button button24;
	private java.awt.Button button25;
	private java.awt.Button button26;
	private java.awt.Button button27;
	private java.awt.Button button28;
	private java.awt.Button button29;
	private java.awt.Button button4;
	private java.awt.Button button5;
	private java.awt.Button button6;
	private java.awt.Button button7;
	private java.awt.Button button8;
	private java.awt.Button button9;
	private javax.swing.JPanel jPanel6;

	public HomeView(JPanel jPanel6) { // NO_UCD (use default)
		this.jPanel6 = jPanel6;
		jPanel6.removeAll();
		button3 = new java.awt.Button();
		button5 = new java.awt.Button();
		button9 = new java.awt.Button();
		button11 = new java.awt.Button();
		button7 = new java.awt.Button();
		button2 = new java.awt.Button();
		button4 = new java.awt.Button();
		button8 = new java.awt.Button();
		button12 = new java.awt.Button();
		button10 = new java.awt.Button();
		button6 = new java.awt.Button();
		button13 = new java.awt.Button();
		button14 = new java.awt.Button();
		button16 = new java.awt.Button();
		button15 = new java.awt.Button();
		button17 = new java.awt.Button();
		button18 = new java.awt.Button();
		button19 = new java.awt.Button();
		button22 = new java.awt.Button();
		button23 = new java.awt.Button();
		button20 = new java.awt.Button();
		button21 = new java.awt.Button();
		button24 = new java.awt.Button();
		button25 = new java.awt.Button();
		button26 = new java.awt.Button();
		button27 = new java.awt.Button();
		button28 = new java.awt.Button();
		button29 = new java.awt.Button();

		button3.setBackground(new java.awt.Color(71, 120, 197));
		button3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button3.setForeground(new java.awt.Color(255, 255, 255));
		button3.setLabel("#3D");
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				RepoView(jPanel6);

			}

			private void RepoView(JPanel jPanel6) {
				RepositoriesView r = new RepositoriesView(jPanel6);
				jPanel6 = r.getJPanel6();
			}
		});

		button5.setBackground(new java.awt.Color(71, 120, 197));
		button5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button5.setForeground(new java.awt.Color(255, 255, 255));
		button5.setLabel("Algorithm");

		button9.setBackground(new java.awt.Color(71, 120, 197));
		button9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button9.setForeground(new java.awt.Color(255, 255, 255));
		button9.setLabel("Android");

		button11.setBackground(new java.awt.Color(71, 120, 197));
		button11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button11.setForeground(new java.awt.Color(255, 255, 255));
		button11.setLabel("Angular");

		button7.setBackground(new java.awt.Color(71, 120, 197));
		button7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button7.setForeground(new java.awt.Color(255, 255, 255));
		button7.setLabel("Ansible");

		button2.setBackground(new java.awt.Color(71, 120, 197));
		button2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button2.setForeground(new java.awt.Color(255, 255, 255));
		button2.setLabel("API");

		button4.setBackground(new java.awt.Color(71, 120, 197));
		button4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button4.setForeground(new java.awt.Color(255, 255, 255));
		button4.setLabel("Arduino");

		button8.setBackground(new java.awt.Color(71, 120, 197));
		button8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button8.setForeground(new java.awt.Color(255, 255, 255));
		button8.setLabel("ASP.NET");

		button12.setBackground(new java.awt.Color(71, 120, 197));
		button12.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button12.setForeground(new java.awt.Color(255, 255, 255));
		button12.setLabel("Atom");

		button10.setBackground(new java.awt.Color(71, 120, 197));
		button10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button10.setForeground(new java.awt.Color(255, 255, 255));
		button10.setLabel("Amazon");

		button6.setBackground(new java.awt.Color(71, 120, 197));
		button6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button6.setForeground(new java.awt.Color(255, 255, 255));
		button6.setLabel("Azure");

		button13.setBackground(new java.awt.Color(71, 120, 197));
		button13.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button13.setForeground(new java.awt.Color(255, 255, 255));
		button13.setLabel("Babel");

		button14.setBackground(new java.awt.Color(71, 120, 197));
		button14.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button14.setForeground(new java.awt.Color(255, 255, 255));
		button14.setLabel("Bash");

		button16.setBackground(new java.awt.Color(71, 120, 197));
		button16.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button16.setForeground(new java.awt.Color(255, 255, 255));
		button16.setLabel("Bitcoin");

		button15.setBackground(new java.awt.Color(71, 120, 197));
		button15.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button15.setForeground(new java.awt.Color(255, 255, 255));
		button15.setLabel("Bottstrap");

		button17.setBackground(new java.awt.Color(71, 120, 197));
		button17.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button17.setForeground(new java.awt.Color(255, 255, 255));
		button17.setLabel("Bot");

		button18.setBackground(new java.awt.Color(71, 120, 197));
		button18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button18.setForeground(new java.awt.Color(255, 255, 255));
		button18.setLabel("C");

		button19.setBackground(new java.awt.Color(71, 120, 197));
		button19.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button19.setForeground(new java.awt.Color(255, 255, 255));
		button19.setLabel("Chrome");

		button22.setBackground(new java.awt.Color(71, 120, 197));
		button22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button22.setForeground(new java.awt.Color(255, 255, 255));
		button22.setLabel("C++");

		button23.setBackground(new java.awt.Color(71, 120, 197));
		button23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button23.setForeground(new java.awt.Color(255, 255, 255));
		button23.setLabel("Python");

		button20.setBackground(new java.awt.Color(71, 120, 197));
		button20.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button20.setForeground(new java.awt.Color(255, 255, 255));
		button20.setLabel("C#");

		button21.setBackground(new java.awt.Color(71, 120, 197));
		button21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button21.setForeground(new java.awt.Color(255, 255, 255));
		button21.setLabel("CSS");

		button24.setBackground(new java.awt.Color(71, 120, 197));
		button24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button24.setForeground(new java.awt.Color(255, 255, 255));
		button24.setLabel("Java");

		button25.setBackground(new java.awt.Color(71, 120, 197));
		button25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button25.setForeground(new java.awt.Color(255, 255, 255));
		button25.setLabel("Gradle");

		button26.setBackground(new java.awt.Color(71, 120, 197));
		button26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button26.setForeground(new java.awt.Color(255, 255, 255));
		button26.setLabel("HTML");

		button27.setBackground(new java.awt.Color(71, 120, 197));
		button27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button27.setForeground(new java.awt.Color(255, 255, 255));
		button27.setLabel("iOS");

		button28.setBackground(new java.awt.Color(71, 120, 197));
		button28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button28.setForeground(new java.awt.Color(255, 255, 255));
		button28.setLabel("JavaScript");

		button29.setBackground(new java.awt.Color(71, 120, 197));
		button29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		button29.setForeground(new java.awt.Color(255, 255, 255));
		button29.setLabel("JSON");

		javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);

		jPanel6.setLayout(jPanel6Layout);

		jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addGap(14, 14, 14)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(button25, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button26, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button28, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button27, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button29, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGroup(jPanel6Layout.createSequentialGroup()
												.addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, 148,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addContainerGap(14, Short.MAX_VALUE)));
		jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel6Layout.createSequentialGroup().addGap(62, 62, 62)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button3, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button13, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button4, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button2, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button5, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button6, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button8, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button7, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button9, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button10, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button12, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button11, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button25, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button28, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button26, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button24, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button20, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button29, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button27, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button21, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button17, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button14, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button16, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button15, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(20, 20, 20)
						.addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addComponent(button18, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button23, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button22, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(button19, javax.swing.GroupLayout.PREFERRED_SIZE, 45,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(62, 62, 62)));

	}

	public JPanel getjPanel() {
		return this.jPanel6;
	}
}
