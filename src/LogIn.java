
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

import org.kohsuke.github.GitHub;

public class LogIn {

	private JFrame frame;
	private JTextField usernameField;
	private JTextField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LogIn window = new LogIn();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public LogIn() {
		initialize();
	}

	private void openMain() {
		frame.dispose();
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
				new Home().setVisible(true);
			}
		});

	}

	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(SystemColor.textHighlight);

		JLabel lblUsername = new JLabel("Username");

		usernameField = new JTextField();
		usernameField.setColumns(10);

		JLabel lblPassword = new JLabel("Password");

		passwordField = new JTextField();
		passwordField.setColumns(10);

		JButton btnNewButton = new JButton("Log IN!");

		btnNewButton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				try {
					String user = usernameField.getText();
					String pass = passwordField.getText();
					GitHub gh = GitHub.connectUsingPassword(user, pass);
					if (!gh.isCredentialValid()) {
						JOptionPane.showMessageDialog(null, "Credentials are wrong! please try again");
					} else if (!gh.isAnonymous()) {
						openMain();
					} else {
						JOptionPane.showMessageDialog(null, "Login Failed! Please try again!");
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
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
				openMain();
			}
		});

		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(217)
							.addComponent(lblNewLabel))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(174)
							.addComponent(usernameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(194)
							.addComponent(lblPassword))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(193)
							.addComponent(lblUsername))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(174)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
								.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
								.addGroup(groupLayout.createSequentialGroup()
									.addGap(10)
									.addComponent(btnNewButton))
								.addComponent(btnAnonymous))))
					.addContainerGap(173, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(29)
					.addComponent(lblNewLabel)
					.addGap(41)
					.addComponent(lblUsername)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(usernameField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addGap(11)
					.addComponent(lblPassword)
					.addGap(11)
					.addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 20, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 23, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnAnonymous)
					.addContainerGap(151, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setBounds(100, 100, 452, 419);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
