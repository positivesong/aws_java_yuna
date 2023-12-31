package ch25_gui;

import java.awt.CardLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIMain1 extends JFrame {
	
	private CardLayout mainCardLayout;
	
	private final String ADMIN_USERNAME = "admin";  // 바뀔 일 또는 바껴서도 안되므로 final 사용
	private final String ADMIN_PASSWORD = "1234";
	
	private JPanel mainCardPanel;
	private JPanel loginPanel;
	private JPanel homePanel;
	private JTextField usernameTextField;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		GUIMain1 frame = new GUIMain1();
		frame.setVisible(true);
	}

	/**
	 * Create the frame.
	 */
	public GUIMain1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		mainCardPanel = new JPanel();
		mainCardLayout = new CardLayout();
		mainCardPanel.setLayout(mainCardLayout);
		setContentPane(mainCardPanel);
		
		loginPanel = new JPanel();
		loginPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		loginPanel.setLayout(null);
		mainCardPanel.add(loginPanel, "loginPanel");
		
		usernameTextField = new JTextField();
		usernameTextField.setBounds(115, 39, 203, 39);
		loginPanel.add(usernameTextField);
		usernameTextField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setEchoChar('*');
		loginPanel.add(passwordField);
		passwordField.setBounds(115, 88, 203, 39);
		
		JButton signinBtn = new JButton("Login");
		signinBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String username = usernameTextField.getText();
				String password = passwordField.getText();
				
				if(!username.equals(ADMIN_USERNAME) || !password.equals(ADMIN_PASSWORD)) {
					JOptionPane.showMessageDialog(loginPanel, "사용자 정보가 일치하지 않습니다.", "로그인 실패", JOptionPane.ERROR_MESSAGE);
					// contentPane -> null 표기 시 화면 중앙에 뜸
					return;
				}
				
				JOptionPane.showMessageDialog(loginPanel, "환영합니다.", "로그인 성공", JOptionPane.PLAIN_MESSAGE);
				mainCardLayout.show(mainCardPanel, "homePanel");
			}
		});
		signinBtn.setFont(new Font("맑은 고딕", Font.BOLD, 12));
		signinBtn.setBounds(115, 167, 203, 39);
		loginPanel.add(signinBtn);
		
		homePanel = new JPanel();
		homePanel.setLayout(null);
		mainCardPanel.add(homePanel, "homePanel");
	}
}
