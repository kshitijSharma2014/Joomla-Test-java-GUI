import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.geom.Ellipse2D;

import javax.swing.JTree;

import java.awt.Color;

import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.DefaultMutableTreeNode;

import java.awt.Canvas;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JProgressBar;


public class frame3 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		
//		try{
//			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");		
//			}
//		catch(Exception e){
//			e.printStackTrace();
//		}
//		
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame3 frame = new frame3();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	
	
	/**
	 * Create the frame.
	 */
	public frame3(frame2 frame2_temp) {
		frame3 frame3_temp = this;
		frame4 frame_4 = new frame4(frame3_temp);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 600, 384);
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
		btnNewButton.setToolTipText("Go back to the previous pannel");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame3_temp.setVisible(false);
				frame2_temp.setVisible(true);
			}
		});
		btnNewButton.setBounds(10, 30, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("PHPUnit");
		btnNewButton_1.setToolTipText("Run whole test suite");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Process p = Runtime.getRuntime().exec("cmd /c phpunit");
					p.waitFor();
					frame_4.setVisible(true);
//					BufferedReader reader = new BufferedReader(
//							new InputStreamReader(p.getInputStream()));
//					textArea.setText("");
//					String line = reader.readLine();
//					while (line != null) {
////						System.out.println(line);
//						textArea.append(line+"\n");
//						line = reader.readLine();
//					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(frame3_temp,
						    "Eggs are not supposed to be green.",
						    "Inane error",
						    JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		btnNewButton_1.setBounds(10, 110, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_4 = new JButton("Open");
		btnNewButton_4.setToolTipText("Open file or folder");
		btnNewButton_4.setBounds(10, 144, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_2 = new JButton("Run");
		btnNewButton_2.setToolTipText("To run a Test file");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton_2.setBounds(10, 179, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Report");
		btnNewButton_3.setToolTipText("Go to the Report webPage");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String URL = "http://localhost/gsoc/tests/system/webdriver/tests/report/";
				try {
					java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(frame3_temp, "Webpage not present");
				}
			}
		});
		btnNewButton_3.setBounds(10, 214, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_5 = new JButton("Test Log");
		btnNewButton_2.setToolTipText("View the Test log");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame_4.setVisible(true);
			}
		});
		btnNewButton_5.setBounds(10, 249, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("Selenium");
		btnNewButton_6.setBounds(463, 30, 89, 23);
		contentPane.add(btnNewButton_6);
		
//		Graphics g = null;
//		Graphics2D g2d = (Graphics2D) g;
//		g2d.setColor(Color.RED);
//		g2d.fillOval(521, 33, 92, 23);
//		
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
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBounds(105, 317, 353, 19);
		contentPane.add(progressBar);
		
		
	}
}
