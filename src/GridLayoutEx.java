import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class GridLayoutEx extends JFrame {

	private JPanel contentPane;
	private JTextField tfName;
	private JTextField tfNo;
	private JTextField tfMajor;
	private JTextField tfSubj;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutEx frame = new GridLayoutEx();
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
	public GridLayoutEx() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 5));

		JLabel lblName = new JLabel("이름");
		contentPane.add(lblName);

		tfName = new JTextField();
		contentPane.add(tfName);
		tfName.setColumns(10);

		JLabel lblNo = new JLabel("학번");
		contentPane.add(lblNo);

		tfNo = new JTextField();
		contentPane.add(tfNo);
		tfNo.setColumns(10);

		JLabel lblMajor = new JLabel("전공");
		contentPane.add(lblMajor);

		tfMajor = new JTextField();
		contentPane.add(tfMajor);
		tfMajor.setColumns(10);

		JLabel lblSubj = new JLabel("과목");
		contentPane.add(lblSubj);

		tfSubj = new JTextField();
		contentPane.add(tfSubj);
		tfSubj.setColumns(10);
	}

}
