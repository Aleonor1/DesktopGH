package com.ghversionare.swing;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;

public class MainWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1000, 900);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 143, 145, 139);
		panel_1.setBackground(new Color(0, 0, 255));
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 280, 145, 145);
		panel_3.setBackground(new Color(0, 51, 255));
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(panel_1);
		frame.getContentPane().add(panel_3);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(51, 0, 255));
		panel.setBounds(0, 0, 145, 145);
		frame.getContentPane().add(panel);
		
		JLabel lblHome = new JLabel("Home");
		panel.add(lblHome);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(new Color(0, 102, 255));
		panel_4.setBounds(0, 423, 145, 145);
		frame.getContentPane().add(panel_4);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(0, 204, 255));
		panel_5.setBounds(0, 566, 145, 145);
		frame.getContentPane().add(panel_5);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(new Color(0, 255, 255));
		panel_6.setBounds(0, 707, 145, 154);
		frame.getContentPane().add(panel_6);
	}
}
