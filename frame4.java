import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;

import net.miginfocom.swing.MigLayout;

import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JTextArea;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class frame4 extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					
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
	public frame4(frame3 frame3_temp) {
		frame4 frame4_temp = this;
		//gsetDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
			
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 318, 239);
		contentPane.add(scrollPane);
		
		JTextArea textArea1 = new JTextArea();
		scrollPane.setViewportView(textArea1);
		
		try {
			Process p = Runtime.getRuntime().exec("cmd /c cd");
			p.waitFor();
			
			BufferedReader reader = new BufferedReader(
					new InputStreamReader(p.getInputStream()));
			textArea1.setText("");
			
			JButton btnNewButton = new JButton("Copy");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					
				}
			});
			btnNewButton.setBounds(338, 13, 89, 23);
			contentPane.add(btnNewButton);
			
			JButton btnNewButton_1 = new JButton("Clear");
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textArea1.setText("");
				}
			});
			btnNewButton_1.setBounds(338, 47, 89, 23);
			contentPane.add(btnNewButton_1);
			
			JButton btnClose = new JButton("Close");
			btnClose.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					frame4_temp.setVisible(false);
				}
			});
			btnClose.setBounds(338, 81, 89, 23);
			contentPane.add(btnClose);
			String line = reader.readLine();
			while (line != null) {
//				System.out.println(line);
				textArea1.append(line+"\n");
				line = reader.readLine();
			}
		} 
		catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
}
