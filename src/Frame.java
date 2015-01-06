import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;

import javax.swing.JTextArea;

import java.awt.ScrollPane;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JScrollPane;


public class Frame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Frame frame = new Frame();
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
	public Frame() {
		JTextArea textArea = new JTextArea();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 277);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton btnPhpunit = new JButton("PHPUnit");
		btnPhpunit.setBounds(10, 11, 136, 23);
		btnPhpunit.setMinimumSize(new Dimension(51, 31));
		btnPhpunit.setMaximumSize(new Dimension(51, 41));
		btnPhpunit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Process p = Runtime.getRuntime().exec("cmd /c phpunit");
					p.waitFor();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
					textArea.setText("");
					String line = reader.readLine();
					while (line != null) {
//						System.out.println(line);
						textArea.append(line+"\n");
						line = reader.readLine();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					textArea.setText("ERROR !!");
				}
			}
		});
		contentPane.setLayout(null);
		contentPane.add(btnPhpunit);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(156, 11, 358, 216);
		contentPane.add(scrollPane);
		
//		JTextArea textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		
		JButton btnTag = new JButton("Tag0001");
		btnTag.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
//					Process p = Runtime.getRuntime().exec("cmd /c phpunit \"C:\\xampp\\htdocs\\gsoc\\tests\\system\\webdriver\\tests\\components\\TagManager0001Test.php\"");
					Process p = Runtime.getRuntime().exec("cmd /c cd");
					p = Runtime.getRuntime().exec("cmd /c phpunit \"components\\TagManager0001Test.php\"");
					p.waitFor();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
					textArea.setText("");
					String line = reader.readLine();
					while (line != null) {
//						System.out.println(line);
						textArea.append(line+"\n");
						line = reader.readLine();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnTag.setBounds(12, 45, 134, 23);
		contentPane.add(btnTag);
		
		JButton btnNewButton = new JButton("Article0001");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
//					Process p = Runtime.getRuntime().exec("cmd /c phpunit \"C:\\xampp\\htdocs\\gsoc\\tests\\system\\webdriver\\tests\\components\\TagManager0001Test.php\"");
					Process p = Runtime.getRuntime().exec("cmd /c cd");
					p = Runtime.getRuntime().exec("cmd /c phpunit \"content\\ArticleManager0001Test.php\"");
					p.waitFor();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
					textArea.setText("");
					String line = reader.readLine();
					while (line != null) {
//						System.out.println(line);
						textArea.append(line+"\n");
						line = reader.readLine();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setBounds(10, 79, 136, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Module0001");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
//					Process p = Runtime.getRuntime().exec("cmd /c phpunit \"C:\\xampp\\htdocs\\gsoc\\tests\\system\\webdriver\\tests\\components\\TagManager0001Test.php\"");
					Process p = Runtime.getRuntime().exec("cmd /c cd");
					p = Runtime.getRuntime().exec("cmd /c phpunit \"extensions\\ModuleManager0001Test.php\"");
					p.waitFor();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
					textArea.setText("");
					String line = reader.readLine();
					while (line != null) {
//						System.out.println(line);
						textArea.append(line+"\n");
						line = reader.readLine();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setBounds(10, 113, 136, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("MenuItem0001");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
//					Process p = Runtime.getRuntime().exec("cmd /c phpunit \"C:\\xampp\\htdocs\\gsoc\\tests\\system\\webdriver\\tests\\components\\TagManager0001Test.php\"");
					Process p = Runtime.getRuntime().exec("cmd /c cd");
					p = Runtime.getRuntime().exec("cmd /c phpunit \"menus\\MenuItemsManager0001Test.php\"");
					p.waitFor();
					BufferedReader reader = new BufferedReader(
							new InputStreamReader(p.getInputStream()));
					textArea.setText("");
					String line = reader.readLine();
					while (line != null) {
//						System.out.println(line);
						textArea.append(line+"\n");
						line = reader.readLine();
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setBounds(12, 147, 134, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
			}
		});
		btnExit.setBounds(10, 181, 136, 23);
		contentPane.add(btnExit);
	}
}
