package childView;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

import singleton.singleton;

public class chdListView extends JFrame implements ActionListener, MouseListener{

	private JLabel titleLb;     	// viewTitle
	private JLabel myPointLB;			// "my point"
	private JLabel pointLB;         // 포인트표시
	private JLabel myPoint1LB;         // 포인트뒤표시
	
	
	private JLabel expLB;			// list설명
	private JButton homeBtn;		// main으로 돌아가기 버튼
	private JButton myBtn;			// mypage로 가는 버튼
	
	private JTextField selectTf; 	//검색입력창
	private JButton selectBtn;		//검색버튼
	private JButton addBtn;			//추가버튼
	private JButton updateBtn;		//수정버튼
	private JButton deleteBtn;		//삭제버튼

	private JTable jTable;			//list table
	private JScrollPane jScrPane;	//list scrbar
	
	String columnNames[] = {
			"이름","국적","성별","나이","스토리","레벨","다음레벨까지 필요포인트","마감일"
	};
		
	Object rowData[][];
	
	
	
	
	public chdListView() {
		super("후원 할 아이보기");		
		setLayout(null);
		
		//타이틀라벨설정
		titleLb = new JLabel("후원할 아이 보기");
		titleLb.setBounds(100, 10, 120, 15);
		add(titleLb);
		
		//메인으로 돌아가기
		homeBtn = new JButton("home"); 
		homeBtn.setBounds(10, 10, 30, 30);
		add(homeBtn);
		
		//"my point" 프론트
		myPointLB = new JLabel("my point:"); 
		myPointLB.setBounds(490, 10, 60, 15);
		add(myPointLB);
		
		//포인트 표시-> point연동 필요
		pointLB = new JLabel("0"); 
		pointLB.setBounds(560, 10, 50, 15);
		add(pointLB);
		
		//"my point" 리어("point")
		myPoint1LB = new JLabel("point"); 
		myPoint1LB.setBounds(580, 10, 50, 15);
		add(myPoint1LB);
		
		//mypage버튼
		myBtn = new JButton("my page"); 
		myBtn.setBounds(380, 10, 100, 20);
		add(myBtn);
		
		//list
		rowData = new Object[10][8];
		
		DefaultTableModel model;
		
		model = new DefaultTableModel(columnNames, 0);
		
		model.setDataVector(rowData, columnNames);
		
		jTable = new JTable(model);
		jTable.addMouseListener(this);
		
		jTable.getColumnModel().getColumn(0).setMaxWidth(200);
		jTable.getColumnModel().getColumn(1).setMaxWidth(200);
		jTable.getColumnModel().getColumn(2).setMaxWidth(50);
		jTable.getColumnModel().getColumn(3).setMaxWidth(50);
		jTable.getColumnModel().getColumn(4).setMaxWidth(2000);
		jTable.getColumnModel().getColumn(5).setMaxWidth(200);
		jTable.getColumnModel().getColumn(6).setMaxWidth(1500);
		jTable.getColumnModel().getColumn(7).setMaxWidth(500);
		
		DefaultTableCellRenderer celAlignCenter = new DefaultTableCellRenderer();
		celAlignCenter.setHorizontalAlignment(JLabel.CENTER);
		
		jTable.getColumn("이름").setCellRenderer(celAlignCenter);
		jTable.getColumn("국적").setCellRenderer(celAlignCenter);
		jTable.getColumn("성별").setCellRenderer(celAlignCenter);
		jTable.getColumn("나이").setCellRenderer(celAlignCenter);
		jTable.getColumn("스토리").setCellRenderer(celAlignCenter);
		jTable.getColumn("레벨").setCellRenderer(celAlignCenter);
		jTable.getColumn("다음레벨까지 필요포인트").setCellRenderer(celAlignCenter);
		jTable.getColumn("마감일").setCellRenderer(celAlignCenter);
				
		
		jScrPane = new JScrollPane(jTable);
		
		jScrPane.setBounds(10, 50, 850, 500);
		add(jScrPane);
		
		//검색창
		selectTf = new JTextField();
		selectTf.setBounds(200, 580, 200, 30);
		add(selectTf);
		//검색버튼
		selectBtn = new JButton("검색");
		selectBtn.setBounds(400, 580, 100, 30);
		add(selectBtn);
		
		//추가버튼(관리자)
		addBtn = new JButton("추가");
		addBtn.setBounds(550, 580, 100, 30);
		addBtn.addActionListener(this);
		add(addBtn);
		
		//수정버튼(관리자)
		updateBtn = new JButton("수정");
		updateBtn.setBounds(550, 610, 100, 30);
		updateBtn.addActionListener(this);
		add(updateBtn);
		
		//삭제버튼(관리자)
		deleteBtn = new JButton("삭제");
		deleteBtn.setBounds(550, 640, 100, 30);
		add(deleteBtn);
		
	
		
		getContentPane().setBackground(Color.green);
		setBounds(100, 100, 900, 750);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		singleton s = singleton.getInstance();
		JButton btn = (JButton)e.getSource();
		
		if(btn == addBtn) {
			s.chdCtrl.addChd();
		}
		else if(btn == updateBtn) {
			s.chdCtrl.update();
		}
		else if(btn == deleteBtn) {
			
		}
		else if(btn == selectBtn) {
			
		}
		else if(btn == homeBtn) {
			
		}
		else if(btn == myBtn) {
			
		}
	}



	@Override
	public void mouseClicked(MouseEvent e) {
		
		
	}



	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	


	
}
