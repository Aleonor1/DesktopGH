package com.ghversionare.swing;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.UnsupportedLookAndFeelException;

import org.kohsuke.github.GHAuthorization;
import org.kohsuke.github.GitHub;
import javax.swing.JPasswordField;

public class LogIn {

	private JFrame frame;
	private JTextField usernameField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogIn() {
		initialize();
	}

	private void openMain(GitHub gh) {
		getFrame().dispose();
		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			if ("Windows".equals(info.getName())) {
				try {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
				} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
						| UnsupportedLookAndFeelException e1) {
					e1.printStackTrace();
				}
				break;
			}
		}
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Home(gh).setVisible(true);
			}
		});
	}

	private void initialize() {
		setFrame(new JFrame());
		getFrame().getContentPane().setBackground(SystemColor.textHighlight);

		JLabel lblUsername = new JLabel("Username");

		usernameField = new JTextField();
		usernameField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");

		JButton btnNewButton = new JButton("Log IN!");
		GitHub a=null;
		try {
			a = GitHub.connectAnonymously();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		try {
			GHAuthorization gh = a.createToken(null, null, null);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
			}
		});

		JLabel lblNewLabel = new JLabel("");
		BufferedImage img = null;
		try {
			img = ImageIO.read(new File("img/logo.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image dimg = img.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
		ImageIcon icon = new ImageIcon(dimg);
		lblNewLabel.setIcon(icon);

		JButton btnAnonymous = new JButton("Anonymous");
		btnAnonymous.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				GitHub gh = null;
				try {
					gh = GitHub.connectAnonymously();
				} catch (IOException e) {
					e.printStackTrace();
				}
				openMain(gh);
			}
		});

		passwordField = new JPasswordField();

		GroupLayout groupLayout = new GroupLayout(getFrame().getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.TRAILING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup().addGap(217).addComponent(lblNewLabel))
								.addGroup(groupLayout.createSequentialGroup().addGap(194).addComponent(lblPassword))
								.addGroup(groupLayout.createSequentialGroup().addGap(174)
										.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
												.addComponent(passwordField, 130, 130, Short.MAX_VALUE)
												.addComponent(usernameField)))
								.addGroup(groupLayout.createSequentialGroup().addGap(174).addComponent(btnAnonymous,
										GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup().addGap(182).addComponent(btnNewButton))
						.addGroup(groupLayout.createSequentialGroup().addGap(195).addComponent(lblUsername)))
				.addContainerGap(148, Short.MAX_VALUE)));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addGap(29).addComponent(lblNewLabel).addGap(41)
						.addComponent(lblUsername).addPreferredGap(ComponentPlacement.RELATED)
						.addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
						.addGap(11).addComponent(lblPassword).addGap(5)
						.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE,
								GroupLayout.PREFERRED_SIZE)
						.addGap(12)
						.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(btnAnonymous)
						.addContainerGap(157, Short.MAX_VALUE)));
		getFrame().getContentPane().setLayout(groupLayout);
		getFrame().setBounds(100, 100, 452, 419);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
}
