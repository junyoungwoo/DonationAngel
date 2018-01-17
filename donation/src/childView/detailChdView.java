package childView;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class detailChdView extends JFrame implements ActionListener {

		
	private JLabel titleLb;     	// viewTitle
	private JLabel myPointLB;		// "my point"
	private JLabel pointLB;         // 포인트표시
	private JLabel myPoint1LB;		// "point"
		
	private JPanel imagePn;
	private JLabel nameLb;
	private JLabel countryLb;
	private JLabel ageLb;
	private JLabel genderLb;
	private JLabel sTitleLb;
	private JLabel storyLb;
	private JLabel levelLb;
	private JLabel expLb;
	private JLabel conLb; //상태설명
	
	private JPanel levImage;    //레벨이미지 변수
	private JPanel expImage;    //경험치이미지 변수
	private JTextArea condition;  //상태설명변수
	private JScrollPane conScr;
	private JLabel name;
	private JLabel country;
	private JLabel age;
	private JLabel gender;
	private JLabel sTitle;
	private JTextArea storyArea;	
	
	
	
	private JButton backBtn;		// 돌아가기 버튼
	private JButton payBtn;			// 후원하기버튼
	
	public detailChdView() {
		super("아이정보추가");		
		setLayout(null);
		
		//라벨
		
		titleLb = new JLabel("세부정보");
		titleLb.setBounds(20, 10, 120, 15);
		add(titleLb);
		
		imagePn = new JPanel();
		imagePn.setLayout(null);
		imagePn.setBackground(Color.white);
		imagePn.setBounds(20, 60, 300, 300);
		add(imagePn);
		
		levelLb = new JLabel("레벨");
		levelLb.setBounds(350, 60, 120, 15);
		add(levelLb);
		
		expLb = new JLabel("경험치");
		expLb.setBounds(340, 100, 120, 15);
		add(expLb);
		
		conLb = new JLabel("상태");
		conLb.setBounds(350, 140, 120, 15);
		add(conLb);
		
		nameLb = new JLabel("이름");
		nameLb.setBounds(350, 220, 120, 15);
		add(nameLb);
		
		countryLb = new JLabel("국적");
		countryLb.setBounds(350, 260, 120, 15);
		add(countryLb);
		
		ageLb = new JLabel("나이");
		ageLb.setBounds(350, 300, 120, 15);
		add(ageLb);
		
		genderLb = new JLabel("성별");
		genderLb.setBounds(350, 340, 120, 15);
		add(genderLb);
		
		sTitleLb = new JLabel("제목");
		sTitleLb.setBounds(50, 380, 120, 15);
		add(sTitleLb);
		
		storyLb = new JLabel("스토리");
		storyLb.setBounds(40, 410, 120, 15);
		add(storyLb);
		
		//레벨(level)이미지
		levImage = new JPanel();
		levImage.setLayout(null);
		levImage.setBackground(Color.black);
		levImage.setBounds(400, 30, 50, 50);
		add(levImage);
		
		//exp 게이지
		
		
		//상태설명(예시 수정필요)
		condition = new JTextArea();
		condition.setLineWrap(true);	
		
		JScrollPane conScr = new JScrollPane(condition);
		conScr.setPreferredSize(new Dimension(200, 120));
		conScr.setBounds(400, 140, 150, 60);
		add(conScr);
		
		
		
		
		//이름 이하 dto로부터...수정필요
		name = new JLabel("aaa");
		name.setBounds(400, 220, 120, 15);
		add(name);
		
		countryLb = new JLabel("aaa");
		countryLb.setBounds(400, 260, 120, 15);
		add(countryLb);
		
		ageLb = new JLabel("aaa");
		ageLb.setBounds(400, 300, 120, 15);
		add(ageLb);
		
		genderLb = new JLabel("aaa");
		genderLb.setBounds(400, 340, 120, 15);
		add(genderLb);
		
		sTitle = new JLabel("aaa");
		sTitle.setBounds(100, 380, 120, 15);
		add(sTitle);
		
		storyArea = new JTextArea();
		storyArea.setLineWrap(true);	
		
		JScrollPane scrPane = new JScrollPane(storyArea);
		scrPane.setPreferredSize(new Dimension(200, 120));
		scrPane.setBounds(40, 440, 500, 250);
		add(scrPane);
		
		//버튼설정
		backBtn = new JButton("뒤로가기");
		backBtn.setBounds(180, 700, 100, 50);
		add(backBtn);
		
		
		payBtn = new JButton("후원하기");
		payBtn.setBounds(300, 700, 100, 50);
		add(payBtn);
				
		
		getContentPane().setBackground(Color.green);
		setBounds(100, 50, 600, 800);
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
	
	
	
	
}
