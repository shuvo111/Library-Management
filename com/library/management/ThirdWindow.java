package com.library.management;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JFrame;

public class ThirdWindow extends JFrame {
	private JButton backbutton;
	private JButton updatebutton;
	
	private Font font;
	private JPanel jpanel;
	private Container container;
	
	public ThirdWindow() {
		super("3nd page");
		background();
		button();
		panel();
	}

	
	public void background() {
		font = new Font("Arial", Font.CENTER_BASELINE, 18);

		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.BLUE);
	}
	

	public void panel() {
		font = new Font("Arial", Font.CENTER_BASELINE, 18);
		
		jpanel=new JPanel();
		jpanel.setBounds(20, 20, 770, 680);
		jpanel.setBackground(Color.BLACK);
		jpanel.setOpaque(true);
		jpanel.setForeground(Color.ORANGE);
		jpanel.setFont(font);
		add(jpanel);
		
	}
	
	public void button() {
		font = new Font("Arial", Font.CENTER_BASELINE, 18);

		backbutton = new JButton("Back");
		backbutton.setBounds(800, 630, 150, 50);
		backbutton.setBackground(Color.GREEN);
		backbutton.setForeground(Color.black);
		backbutton.setFont(font);
		add(backbutton);
		
		updatebutton = new JButton("Update");
		updatebutton.setBounds(800, 570, 150, 50);
		updatebutton.setBackground(Color.green);
		updatebutton.setForeground(Color.black);
		updatebutton.setFont(font);
		add(updatebutton);

		backbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				dispose();
				HomeWindow f = new HomeWindow();
				f.setBounds(20, 20, 1000, 750);
				f.setVisible(true);
				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

			}
		});
		
		
		updatebutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {


			}
		});
		
	}
	
	
	public static void main(String[] args) {
		ThirdWindow t = new ThirdWindow();
		t.setBounds(20, 20, 1000, 750);
		t.setVisible(true);
		t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

 }
