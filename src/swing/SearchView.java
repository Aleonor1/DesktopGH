/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

import javax.swing.JPanel;

import java.awt.Color;
import java.awt.Component;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.JRadioButton;

import api.ApiConnector;

import java.awt.Button;
import java.awt.Font;

public class SearchView extends javax.swing.JFrame { // NO_UCD (use default)

	private static final long serialVersionUID = 2230288104893640642L;
	private javax.swing.JPanel jPanel6;
	private ButtonGroup buttons = new ButtonGroup();

	public SearchView(JPanel jPanel) { // NO_UCD (use default)
		this.jPanel6 = jPanel;
		this.jPanel6.setBackground(Color.WHITE);
		this.jPanel6.removeAll();
		jPanel.setBackground(new java.awt.Color(255, 255, 255));

		JLabel lblSarmale = new JLabel("Enter Topics to search");
		lblSarmale.setBounds(179, 5, 228, 22);
		lblSarmale.setForeground(Color.BLUE);
		lblSarmale.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
		TextField text = new TextField();
		text.setBounds(176, 33, 228, 37);
		jPanel6.setLayout(null);
		jPanel6.add(lblSarmale);
		jPanel6.add(text);

		JRadioButton rdbtnJava = new JRadioButton("Java");
		rdbtnJava.setBounds(25, 125, 54, 23);
		jPanel6.add(rdbtnJava);

		JRadioButton rdbtnPython = new JRadioButton("Python");
		rdbtnPython.setBounds(25, 222, 65, 23);
		jPanel6.add(rdbtnPython);

		JRadioButton rdbtnC = new JRadioButton("C++");
		rdbtnC.setBounds(25, 263, 54, 23);
		jPanel6.add(rdbtnC);

		JRadioButton rdbtnJavascript = new JRadioButton("JavaScript");
		rdbtnJavascript.setBounds(25, 309, 75, 23);
		jPanel6.add(rdbtnJavascript);

		JRadioButton rdbtnC_1 = new JRadioButton("C");
		rdbtnC_1.setBounds(371, 309, 65, 23);
		jPanel6.add(rdbtnC_1);

		JRadioButton rdbtnJupyterNotebook = new JRadioButton("Jupyter Notebook");
		rdbtnJupyterNotebook.setBounds(25, 168, 123, 23);
		jPanel6.add(rdbtnJupyterNotebook);

		JRadioButton rdbtnC_2 = new JRadioButton("C#");
		rdbtnC_2.setBounds(371, 125, 65, 23);
		jPanel6.add(rdbtnC_2);

		JRadioButton rdbtnMatlab = new JRadioButton("MATLAB");
		rdbtnMatlab.setBounds(371, 168, 109, 23);
		jPanel6.add(rdbtnMatlab);

		JRadioButton rdbtnHtml = new JRadioButton("HTML");
		rdbtnHtml.setBounds(371, 222, 109, 23);
		jPanel6.add(rdbtnHtml);

		JRadioButton rdbtnGo = new JRadioButton("GO");
		rdbtnGo.setBounds(371, 263, 109, 23);
		jPanel6.add(rdbtnGo);

		Button searchButton = new Button();
		searchButton.setLabel("Search!");
		searchButton.setFont(new Font("Segoe UI", Font.PLAIN, 14));
		searchButton.setForeground(Color.WHITE);
		searchButton.setBackground(new Color(71, 120, 197));
		searchButton.setBounds(216, 391, 148, 45);
		jPanel6.add(searchButton);

		for (Component component : this.jPanel6.getComponents()) {
			if (component instanceof JRadioButton) {

				JRadioButton jbutton = (JRadioButton) component;
				buttons.add(jbutton);
				jbutton.setActionCommand(jbutton.getText());
				jbutton.setBackground(Color.WHITE);
				jbutton.setForeground(Color.BLUE);
			}
		}
		searchButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				RepositoriesView repo = null;
				if (buttons.getSelection() == null) {
					Map<String, String> results = ApiConnector.searchRepos(text.getText(), null);
					repo = new RepositoriesView(getjPanel(), results);
				} else {
					Map<String, String> results = ApiConnector.searchRepos(text.getText(),
							buttons.getSelection().getActionCommand());
					repo = new RepositoriesView(getjPanel(), results);
				}
				jPanel6 = repo.getJPanel6();
			}

		});

	}

	public ButtonModel getSelectedButton() {
		return buttons.getSelection();
	}

	public JPanel getjPanel() {
		return this.jPanel6;
	}
}
