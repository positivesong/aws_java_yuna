package ch25_gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class GUIMain2 extends JFrame {

	private JPanel mainCardPane;
	private CardLayout mainCardLayout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIMain2 frame = new GUIMain2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUIMain2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		/* <<< mainCardPane >>> */
		mainCardPane = new JPanel();
		mainCardLayout = new CardLayout(0, 0);  // mainCardLayout 생성
		
		mainCardPane.setBorder(new EmptyBorder(5, 5, 5, 5));  // 테두리
		mainCardPane.setLayout(mainCardLayout);  // 여기서 mainCardLayout set 해줌
		
		setContentPane(mainCardPane);
		
		
		/* <<< subPanel1 >>> */
		JPanel subPanel1 = new JPanel();
		mainCardPane.add(subPanel1, "subPanel1");
		subPanel1.setLayout(null);
		
		JButton subPaner2ShowBtn = new JButton("2번 페이지");
		subPaner2ShowBtn.setBounds(315, 111, 97, 23);
		subPanel1.add(subPaner2ShowBtn);  // subPanel1에 subPaner2ShowBtn(버튼)을 추가했음
		
		subPaner2ShowBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCardLayout.show(mainCardPane, "subPanel2");
			}
		});
		
		/* <<< subPanel2 >>> */
		JPanel subPanel2 = new JPanel();
		mainCardPane.add(subPanel2, "subPanel2");
		subPanel2.setLayout(null);
		
		JButton subPaner1ShowBtn = new JButton("1번 페이지");
		subPaner1ShowBtn.setBounds(45, 111, 97, 23);
		subPanel2.add(subPaner1ShowBtn);
		
		subPaner1ShowBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCardLayout.show(mainCardPane, "subPanel1");
			}
		});
		
		JButton subPaner3ShowBtn = new JButton("3번 페이지");
		subPaner3ShowBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCardLayout.show(mainCardPane, "subPanel3");
			}
		});
		subPaner3ShowBtn.setBounds(283, 111, 97, 23);
		subPanel2.add(subPaner3ShowBtn);
		
		/* <<< subPanel3 >>> */
		JPanel subPanel3 = new JPanel();
		mainCardPane.add(subPanel3, "subPanel3");
		subPanel3.setLayout(null);
		
		JButton subPaner2ShowBtn2 = new JButton("2번 페이지");
		subPaner2ShowBtn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				mainCardLayout.show(mainCardPane, "subPanel2");
			}
		});
		subPaner2ShowBtn2.setBounds(12, 111, 97, 23);
		subPanel3.add(subPaner2ShowBtn2);
		
	}

}
