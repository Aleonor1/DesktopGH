/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import java.awt.Button;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import swing.ApiConnector;

import javax.swing.JPanel;

/**
 *
 * @author anyikit
 */
public class HomeView extends javax.swing.JFrame { // NO_UCD (use default)

	private static final long serialVersionUID = 2230288104893640642L;
	private Button button10;
	private Button button3;
	private Button button11;
	private Button button12;
	private Button button13;
	private Button button14;
	private Button button15;
	private Button button16;
	private Button button17;
	private Button button18;
	private Button button19;
	private Button button2;
	private Button button20;
	private Button button21;
	private Button button22;
	private Button button23;
	private Button button24;
	private Button button25;
	private Button button26;
	private Button button27;
	private Button button28;
	private Button button29;
	private Button button4;
	private Button button5;
	private Button button6;
	private Button button7;
	private Button button8;
	private Button button9;
	private javax.swing.JPanel jPanel6;

	public HomeView(JPanel jPanel6) { // NO_UCD (use default)
		this.jPanel6 = jPanel6;
		jPanel6.removeAll();
		button2 = new Button();
		button3 = new Button();
		button4 = new Button();
		button5 = new Button();
		button6 = new Button();
		button7 = new Button();
		button8 = new Button();
		button9 = new Button();
		button10 = new Button();
		button11 = new Button();
		button12 = new Button();
		button13 = new Button();
		button14 = new Button();
		button16 = new Button();
		button15 = new Button();
		button17 = new Button();
		button18 = new Button();
		button19 = new Button();
		button22 = new Button();
		button23 = new Button();
		button20 = new Button();
		button21 = new Button();
		button24 = new Button();
		button25 = new Button();
		button26 = new Button();
		button27 = new Button();
		button28 = new Button();
		button29 = new Button();

		button3.setLabel("3D");
		button5.setLabel("Algorithm");
		button9.setLabel("Android");
		button11.setLabel("Angular");
		button7.setLabel("Ansible");
		button2.setLabel("API");
		button4.setLabel("Arduino");
		button8.setLabel("ASP.NET");
		button12.setLabel("Atom");
		button10.setLabel("Amazon");
		button6.setLabel("Azure");
		button13.setLabel("Babel");
		button14.setLabel("Bash");
		button16.setLabel("Bitcoin");
		button15.setLabel("Bottstrap");
		button17.setLabel("Bot");
		button18.setLabel("C");
		button19.setLabel("Chrome");
		button22.setLabel("C++");
		button23.setLabel("Python");
		button20.setLabel("C#");
		button21.setLabel("CSS");
		button24.setLabel("Java");
		button25.setLabel("Gradle");
		button26.setLabel("HTML");
		button27.setLabel("iOS");
		button28.setLabel("JavaScript");
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

		for (Component component : jPanel6.getComponents()) {
			if (component instanceof Button) {
				Button button = (Button) component;
				button.setBackground(new java.awt.Color(71, 120, 197));
				button.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
				button.setForeground(new java.awt.Color(255, 255, 255));
				button.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						RepoView(jPanel6);

					}

					private void RepoView(JPanel jPanel6) {
						Map<String, String> results = ApiConnector.searchRepos(button.getLabel(), null);
						RepositoriesView r = new RepositoriesView(jPanel6, results);
						jPanel6 = r.getJPanel6();
					}
				});

			}
		}
	}

	public JPanel getjPanel() {
		return this.jPanel6;
	}
}
