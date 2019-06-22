package com.library.management;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;


public class SplashScreen extends JFrame  {
	public ImageIcon image;
	public Container c;
	public JLabel labelImage, label1,label2;
	public Font font;
	public int r;

	public SplashScreen() {
		super("Splash Screen");
		image();
	}
	
	public void image() {
		font = new Font("Arial", Font.ITALIC+ Font.BOLD, 25);
		
		label1 = new JLabel();
		setLayout(null);
		label1.setBounds(330, 615, 370, 50);
		label1.setFont(font);
		label1.setForeground(Color.black);
		label1.setBackground(Color.cyan);
		label1.setOpaque(true);
		label1.setHorizontalAlignment(JLabel.LEFT); 
		add(label1);
		
		
		label2=new JLabel("Loading...");
		setLayout(null);
		label2.setBounds(0, 615, 330,50 );
		label2.setFont(font);
		label2.setForeground(Color.black);
		label2.setBackground(Color.CYAN);
		label2.setOpaque(true);
		label2.setHorizontalAlignment(JLabel.RIGHT);
		add(label2);
		

		image= new ImageIcon(getClass().getResource("/res/com/library/management/ss.jpg"));
		labelImage = new JLabel(image);
		labelImage.setBounds(0, 0, 700, 700);
		add(labelImage);
	}


	public static void main(String[] args) {
		
		SplashScreen splash = new SplashScreen();
		splash.setVisible(true);
		splash.setBounds(0, 0, 700, 700);
		splash.setLocationRelativeTo(null);
		splash.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		LoginWindow a = new LoginWindow();
		try {
			for (int i = 0; i <= 100; i++) {
				Thread.sleep(10000);
				splash.label1.setText(Integer.toString(i) + "%");
				if (i == 100) {
					splash.setVisible(false);
					a.setBounds(0,0,400,350);
					a.setVisible(true);
					a.setLocationRelativeTo(null);
					a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					
				}
			}
		} 
		catch (Exception e) {
		}
	}
}

