package com.library.management;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JFrame;


public class SecondWindow extends JFrame {
	private Font font;
	private Container container;
	
	private JLabel bookandwriternamelabel;
	private JLabel shelfnolabel;
	private JLabel rownolabel;
	private JLabel discuentlabel;
	private JLabel preicelabel;
	
	private JButton shelfbutton;
	private JButton rowbutton;
	private JButton dicuentbutton;
	private JButton pricebutton;
	private JButton backbutton;
	

	
	public SecondWindow(String a,String b) {
		super("2nd page");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(20, 20,1000, 750);
		label(a,b);
		backgroundcolour();
		button();
		
	}
	public void backgroundcolour() {
		container = this.getContentPane();
		container.setBackground(Color.BLUE);

	}
	
	public void label(String a,String b) {
		font = new Font("Arial", Font.BOLD + Font.ITALIC, 35);
		
		bookandwriternamelabel=new JLabel(a+" by "+b);
		setLayout(null);
		bookandwriternamelabel.setBounds(20, 20, 850, 100);
		bookandwriternamelabel.setFont(font);
		bookandwriternamelabel.setHorizontalAlignment(JLabel.CENTER);
		bookandwriternamelabel.setForeground(Color.WHITE);
		bookandwriternamelabel.setBackground(Color.gray);
		bookandwriternamelabel.setOpaque(true);
		add(bookandwriternamelabel);
		
		
		shelfnolabel=new JLabel("00");
		setLayout(null);
		shelfnolabel.setBounds(245, 140, 80, 60);
		shelfnolabel.setFont(font);
		shelfnolabel.setHorizontalAlignment(JLabel.CENTER);
		shelfnolabel.setForeground(Color.BLACK);
		shelfnolabel.setBackground(Color.WHITE);
		shelfnolabel.setOpaque(true);
		add(shelfnolabel);
		

		rownolabel=new JLabel("00");
		setLayout(null);
		rownolabel.setBounds(245, 220, 80, 60);
		rownolabel.setFont(font);
		rownolabel.setHorizontalAlignment(JLabel.CENTER);
		rownolabel.setForeground(Color.black);
		rownolabel.setBackground(Color.WHITE);
		rownolabel.setOpaque(true);
		add(rownolabel);
		
		

		discuentlabel=new JLabel("0%");
		setLayout(null);
		discuentlabel.setBounds(245, 300, 80, 60);
		discuentlabel.setFont(font);
		discuentlabel.setHorizontalAlignment(JLabel.CENTER);
		discuentlabel.setForeground(Color.black);
		discuentlabel.setBackground(Color.WHITE);
		discuentlabel.setOpaque(true);
		add(discuentlabel);
		
		preicelabel=new JLabel("00");
		setLayout(null);
		preicelabel.setBounds(245, 380, 80, 60);
		preicelabel.setFont(font);
		preicelabel.setHorizontalAlignment(JLabel.CENTER);
		preicelabel.setForeground(Color.BLACK);
		preicelabel.setBackground(Color.WHITE);
		preicelabel.setOpaque(true);
		add(preicelabel);
	}
	
	public void button() {
		font = new Font("Arial", Font.CENTER_BASELINE,18);
		
		shelfbutton=new JButton("Shelf No : ");
		shelfbutton.setBounds(20, 140, 200, 60);
		shelfbutton.setBackground(Color.orange);
		shelfbutton.setForeground(Color.black);
		shelfbutton.setFont(font);
		add(shelfbutton);
		
		
		rowbutton=new JButton("Row No : ");
		rowbutton.setBounds(20, 220, 200, 60);
		rowbutton.setBackground(Color.orange);
		rowbutton.setForeground(Color.BLACK);
		rowbutton.setFont(font);
		add(rowbutton);
		
		dicuentbutton=new JButton("Discuent : ");
		dicuentbutton.setBounds(20, 300, 200, 60);
		dicuentbutton.setBackground(Color.orange);
		dicuentbutton.setForeground(Color.black);
		dicuentbutton.setFont(font);
		add(dicuentbutton);
		
		pricebutton=new JButton("Price : ");
		pricebutton.setBounds(20, 380, 200, 60);
		pricebutton.setBackground(Color.orange);
		pricebutton.setForeground(Color.BLACK);
		pricebutton.setFont(font);
		add(pricebutton);
		
		backbutton=new JButton("Back");
		backbutton.setBounds(700, 580, 150, 50);
		backbutton.setBackground(Color.orange);
		backbutton.setForeground(Color.BLACK);
		backbutton.setFont(font);
		add(backbutton);
		
		backbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				
					dispose();
					HomeWindow a=new HomeWindow();
					a.setBounds(20,20,1000, 750);
					a.setVisible(true);
					a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
			}
		});
		
	}
	
	
	public static void main(String[] args) {
		SecondWindow s=new SecondWindow(null,null);
		s.setVisible(true);

	}

}
