import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.miginfocom.swing.MigLayout;

import javax.swing.JButton;

import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import com.jgoodies.forms.factories.FormFactory;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.CardLayout;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JMenu;
import javax.swing.JComboBox;
import javax.swing.JLabel;

import com.jgoodies.forms.factories.DefaultComponentFactory;

import javax.swing.Box;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JTree;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JScrollPane;


public class frame2 extends JFrame {

	private JPanel contentPane;
	/**
	 * Launch the application.
	 */
//	JFrame mainFrame;
	
	
	
	public static void main(String[] args) {
		try{
			UIManager.setLookAndFeel("javax.swing.plaf.nimbus.NimbusLookAndFeel");		
			}
		catch(Exception e){
			e.printStackTrace();
		}
		frame2 frame_2 = new frame2();
//		frame_2
//		frame_2.runFrame(frame_2);
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					frame2 frame = new frame2();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
	}

//	public void runFrame(frame2 frame_2){
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
////					frame2 frame = new frame2();
//					frame_2.setVisible(true);
//					
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	/**
	 * Create the frame.
	 */
	public frame2() {
		frame2 frame2_temp = this;
		this.setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(144, 11, 280, 239);
		contentPane.add(scrollPane);
		
		JTextArea textArea1 = new JTextArea();
		scrollPane.setViewportView(textArea1);
		
		JButton btnNewButton = new JButton("Start Selenium");
		btnNewButton.setToolTipText("Starting selenium server");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
			        Runtime.getRuntime().exec("cmd /c start \"C:\\selenium\\selenium.bat\"");
			        System.out.println("Selenium started");
			    } catch (IOException ex) {
			    	ex.printStackTrace();
			    }
				textArea1.append("Selenium is running successfully \n");
			}
		});
		btnNewButton.setBounds(16, 46, 122, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Start Xampp");
		btnNewButton_1.setToolTipText("Starting the Xampp server");
		btnNewButton_1.setBounds(16, 72, 122, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if(btnNewButton_1.getText() == "Start Xampp"){
					textArea1.append("Xampp has started successfully \n");
					btnNewButton_1.setText("Stop Xampp     ");
					String command = "C:\\xampp\\xampp_start.exe";
					Process p = null;
	            	  try {
	            		  p = Runtime.getRuntime().exec("cmd /c "+command);
						//System.out.println("running xampp");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
	            	  BufferedReader reader = new BufferedReader(
								new InputStreamReader(p.getInputStream()));
						textArea1.setText("");
						String line = null;
						try {
							line = reader.readLine();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						while (line != null) {
//							System.out.println(line);
							textArea1.append(line+"\n");
							try {
								line = reader.readLine();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
							}
						}
	            	
				}
				else{ 
					textArea1.append("Xampp is stopped successfully \n");
					btnNewButton_1.setText("Start Xampp");
					String command = "C:\\xampp\\xampp_stop.exe";
	            	  try {
						Runtime.getRuntime().exec("cmd /c "+command);
						System.out.println("stopping xampp");
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
			}
		});
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Go Testing");
		btnNewButton_2.setToolTipText("Go to testing pannel");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//frame3 newFrame = new frame3();
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							frame3 frame_3 = new frame3(frame2_temp);
							frame_3.setVisible(true);
							frame2_temp.setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		btnNewButton_2.setBounds(16, 98, 122, 23);
		contentPane.add(btnNewButton_2);
		
		
	}
}
