import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;


@SuppressWarnings("serial")
public class MyApp extends JFrame {
	
	//Member Field --------------------------------------------
	private JTextField msgTField;
	private JButton btnLeft, btnRight, btnOk;
	private Container con;
	private ActionListener	actionLST;
	private JButton btnSave;
	private String IMG_PATH = "C:\\Users\\3P003\\eclipse-workspace\\Hustar\\img\\";
	
	private List<String> list = new ArrayList<String>();
	
	
	// Constructor Method -------------------------------------
	public MyApp() {
		
		// Listener 생성
		actionLST = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String command = e.getActionCommand();
				System.out.println("Command : " + command);
				
				if(command.equals("RIGHT")) {
					// contents 배경색을 노랑색
					con.setBackground(Color.yellow);
				}else if(command.equals("LEFT")) {
					// contents 배경색을 핑크색
					con.setBackground(Color.pink);
				}else if(command.equals("OK")) {
					// JTextField 위의 글자를 읽어서 OK버튼위에 출력하기
					list.add(msgTField.getText());
					msgTField.setText("");
					System.out.println(list);
				}
			}
		};
		
		// Component 생성
		msgTField = new JTextField();
		msgTField.setText("Enter message...");
		msgTField.setBackground(Color.lightGray);
		
		btnLeft = new JButton("LEFT");
		btnLeft.addActionListener(actionLST);
		
		btnRight = new JButton("RIGHT");
		btnRight.addActionListener(actionLST);
		
		btnOk = new JButton("OK");
		btnOk.addActionListener(actionLST);
		
		// Listener 생성
		
		
		
		// Listerner 생성
		
		
		btnSave = new JButton(new ImageIcon(IMG_PATH+"download (1).png"));
		btnSave.setRolloverIcon(new ImageIcon(IMG_PATH + "download.png"));
		btnSave.setBorderPainted(false);
		btnSave.setContentAreaFilled(false);
		
		
		
		// Contents 구성
		con = this.getContentPane();
		con.setLayout(new BorderLayout(30,30));
		
		con.add(msgTField, BorderLayout.NORTH);
		con.add(btnLeft, BorderLayout.WEST);
		con.add(btnRight, BorderLayout.EAST);
		con.add(btnOk, BorderLayout.SOUTH);
		con.add(btnSave, BorderLayout.CENTER);
		
		
		// JFrame 설정
		this.setTitle("MY APP");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(300, 300);
		this.setResizable(false);
		this.setVisible(true);
		
	}
	
	
	// Entry Point Method -------------------------------------
	public static void main(String[] args) {
		MyApp app = new MyApp();
		
	}
}
