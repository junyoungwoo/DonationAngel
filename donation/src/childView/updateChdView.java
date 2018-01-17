package childView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class updateChdView extends JFrame implements ActionListener{
	
	private JLabel titleLb;     	// viewTitle
	
	private JLabel nameLb;
	private JLabel countryLb;
	private JLabel ageLb;
	private JLabel genderLb;
	private JLabel sTitleLb;
	private JLabel storyLb;
	private JLabel levelLb;
	private JLabel expLb;
	
	private JTextField nameTf;
	private JTextField countryTf;
	private JTextField ageTf;
	private JRadioButton manBtn;
	private JRadioButton womanBtn;
	
	private JTextField sTitleTf;
	private JTextArea storyArea;
	private JTextField levelTf;
	private JTextField expTf;
	
	
	private JButton backBtn;		// 돌아가기 버튼
	private JButton updateBtn;			// 추가버튼
	
	
	public updateChdView() {
		super("아이정보 수정");		
		setLayout(null);
		
		//라벨
		
		titleLb = new JLabel("아이정보 수정");
		titleLb.setBounds(20, 10, 120, 15);
		add(titleLb);
		
		nameLb = new JLabel("이름");
		nameLb.setBounds(50, 50, 120, 15);
		add(nameLb);
		
		countryLb = new JLabel("국적");
		countryLb.setBounds(50, 100, 120, 15);
		add(countryLb);
		
		ageLb = new JLabel("나이");
		ageLb.setBounds(50, 150, 120, 15);
		add(ageLb);
		
		genderLb = new JLabel("성별");
		genderLb.setBounds(50, 200, 120, 15);
		add(genderLb);
		
		sTitleLb = new JLabel("제목");
		sTitleLb.setBounds(50, 250, 120, 15);
		add(sTitleLb);
		
		storyLb = new JLabel("스토리");
		storyLb.setBounds(50, 300, 120, 15);
		add(storyLb);
		
		//텍스트필드
		
		nameTf = new JTextField();
		nameTf.setBounds(100, 50, 200, 20);
		add(nameTf);
		
		countryTf = new JTextField();
		countryTf.setBounds(100, 100, 200, 20);
		add(countryTf);
		
		ageTf = new JTextField();
		ageTf.setBounds(100, 150, 200, 20);
		add(ageTf);
		
		manBtn = new JRadioButton("남자");
		manBtn.setBounds(100, 200, 80, 20);
		add(manBtn);
		
		womanBtn = new JRadioButton("여자");
		womanBtn.setBounds(200, 200, 80, 20);
		add(womanBtn);
		
		ButtonGroup genderGr = new ButtonGroup();
		genderGr.add(manBtn);
		genderGr.add(womanBtn);
		
		sTitleTf = new JTextField();
		sTitleTf.setBounds(100, 250, 400, 25);
		add(sTitleTf);
		
		storyArea = new JTextArea();
		storyArea.setLineWrap(true);	
		
		JScrollPane scrPane = new JScrollPane(storyArea);
		scrPane.setPreferredSize(new Dimension(200, 120));
		scrPane.setBounds(100, 280, 400, 350);
		add(scrPane);
		
		backBtn = new JButton("뒤로");
		backBtn.setBounds(200, 650, 100, 50);
		add(backBtn);
		
		updateBtn = new JButton("수정하기");
		updateBtn.setBounds(300, 650, 100, 50);
		add(updateBtn);
		
	
		getContentPane().setBackground(Color.green);
		setBounds(100, 50, 600, 800);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton btn = (JButton)e.getSource();
		
		if(btn == backBtn) {
			
		}
		else if(btn == updateBtn) {
			
		}
		
	}

	
	
	
}
