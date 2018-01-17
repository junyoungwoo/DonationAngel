package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


// 메인틀
public class main_SponsorView extends JFrame implements ActionListener {

		// 내정보를 보여주는 ID label 
		// 로그아웃 버튼
		// 나의 후원 
		// 개인정보
		// 문의안내
		private JLabel idLabel;		// 로그인한 id정보를 label로 표시
		private JButton myChild;	// 내가 후원하는 아이의 정보 보여주기 위한 버튼
		private JButton myPF;		// 내 정보를 볼 수 있는 버튼
		private JButton support;		// 문의하기 버튼
		
		JPanel leftPanel;
		JPanel rightPanel;
	
		/**
		 * 
		 */
		public main_SponsorView() {
		
			////////////////////////////////////////////////////////
			setLayout(null);
			
			
			leftPanel = new JPanel();
			leftPanel.setLayout(null);
			leftPanel.setBounds(10, 10, 180, 420);			
			add(leftPanel);
			
				idLabel = new JLabel("ID정보 불러옴");
				idLabel.setHorizontalAlignment(SwingConstants.CENTER);	// label중앙으로
				idLabel.setVerticalAlignment(SwingConstants.CENTER);
				idLabel.setBounds(15, 30, 150, 30);				
				leftPanel.add(idLabel);
				
				myChild = new JButton("내아이정보");
				myChild.setBounds(15, 80, 150, 50);
				myChild.addActionListener(this);
				leftPanel.add(myChild);
				
				myPF = new JButton("내 정보");
				myPF.setBounds(15, 150, 150, 50);
				leftPanel.add(myPF);
				
				support = new JButton("문의하기");
				support.setBounds(15, 220, 150, 50);
				leftPanel.add(support);
				
			rightPanel = new JPanel();
			rightPanel.setLayout(null);
			rightPanel.setBounds(200, 10, 400, 420);
			add(rightPanel);
	//////////////////////////////////////////////////////////////		
			
			
			
			
			
	//////////////////////////////////////////////////////////////		
			setBounds(300, 100, 640, 480);
			setVisible(true);
			getContentPane().setBackground(Color.GRAY);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
			// mouse 좌표 구하는 함수
			JLabel label = new JLabel("pos:");
			label.setBounds(10, 10, 200, 30);
			add(label);
			addMouseMotionListener(new MouseMotionListener() {			
				@Override
				public void mouseMoved(java.awt.event.MouseEvent e) {
					label.setText("x:" + e.getX() + " y:" + e.getY());		
				}
				
				@Override
				public void mouseDragged(java.awt.event.MouseEvent e) {
					
				}
			});		
	
			
		}
		
		
	@Override
	public void actionPerformed(ActionEvent e) {
		Object btn = e.getSource();
		
		if(btn == myChild) {
			
		}
		

	}

}
