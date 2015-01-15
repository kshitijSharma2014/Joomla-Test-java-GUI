import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTree;
import java.awt.Color;


public class frame3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		try{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");		
			}
		catch(Exception e){
			e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame3 frame = new frame3();
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
	public frame3() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 350);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/*JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(106, 14, 345, 286);
		contentPane.add(scrollPane);
		
		JTextArea textArea1 = new JTextArea();
		scrollPane.setViewportView(textArea1);
		*/
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(10, 30, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PHPUnit");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(10, 110, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Open");
		btnNewButton_4.setBounds(10, 144, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("Run");
		btnNewButton_2.setBounds(10, 179, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Report");
		btnNewButton_3.setBounds(10, 214, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Test Log");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_5.setBounds(10, 249, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Selenium");
		btnNewButton_6.setBounds(463, 30, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("Xampp");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_7.setBounds(463, 65, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("Test");
		btnNewButton_8.setBounds(463, 100, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JTree tree = new JTree();
		tree.setBackground(UIManager.getColor("ArrowButton.background"));
		tree.setBounds(105, 30, 353, 275);
		contentPane.add(tree);
		
		
	}
}
