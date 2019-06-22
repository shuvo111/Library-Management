package com.library.management;

import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class LoginWindow extends JFrame {
	private JLabel namelabel;
	private JLabel contactlabel;
	private JLabel emaillabel;
	private JLabel idlabel;
	
	
	private JTextField nametextfield;
	private JTextField contacttextfield;
	private JTextField emailtextfield;
	private JTextField idtextfield;
	
	private JButton loginbutton,resisterbutton,resister1button;
	private Container c;
	private Font font;
	private Cursor cursor;
	private String name,contact,id,email, time;
	

	public LoginWindow() {
		super("Resiter as user");
		pack();
		backgroundcolour();
		label();
		textfield();
		button();
		namelabel.setVisible(false);
		nametextfield.setVisible(false);
		contactlabel.setVisible(false);
		contacttextfield.setVisible(false);
		resisterbutton.setVisible(false);
	}
	
	
	
	private void button() {
		font = new Font("Arial", Font.BOLD, 16);
		
		resisterbutton = new JButton("Resister");
		resisterbutton.setBounds(230, 250, 100, 30);
		resisterbutton.setBackground(Color.orange);
		resisterbutton.setForeground(Color.BLACK);
		resisterbutton.setHorizontalAlignment(JTextField.CENTER);
		resisterbutton.setFont(font);
		resisterbutton.addActionListener(e->{
				name = nametextfield.getText();
				contact = contacttextfield.getText();
				id = idtextfield.getText();
				email = emailtextfield.getText();
				time = ZonedDateTime.now().format(DateTimeFormatter.RFC_1123_DATE_TIME);
				//System.out.println(time);
				if(name.isEmpty()||contact.isEmpty()||id.isEmpty()||email.isEmpty()) {
					JOptionPane.showMessageDialog(null, "Textbox is Empty!");
				}
				else {
					dbcon DB = new dbcon();
					DB.insert1(name, contact, id,email,time);
					dispose();
					HomeWindow  a=new HomeWindow();
					a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					a.setBounds(20,20,1000, 750);
					a.setVisible(true);
				}
		});
		add(resisterbutton);
		loginbutton =new JButton("Log in");
		loginbutton.setBounds(230, 250, 100, 30);
		loginbutton.setBackground(Color.orange);
		loginbutton.setForeground(Color.BLACK);
		loginbutton.setHorizontalAlignment(JTextField.CENTER);
		loginbutton.setFont(font);
		loginbutton.addActionListener(e->
		{
			email = emailtextfield.getText();
			dbcon a= new dbcon();
			
			ResultSet user=a.checkuser(email);
			try {
				id = idtextfield.getText();
				if(user.next()) {
					
					if(user.getString("Id").equals(id)) {
						
						HomeWindow  home=new HomeWindow();
						home.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						home.setBounds(20,20,1000, 750);
						home.setVisible(true);
						dispose();
					}
					else {
						JOptionPane.showMessageDialog(null, "Invalid password");
					}
				}
				else {
					JOptionPane.showMessageDialog(null, "user not found");
				}
				
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
				);
		add(loginbutton);
		resister1button =new JButton("Resister");
		resister1button.setBounds(120, 250, 100, 30);
		resister1button.setBackground(Color.orange);     
		resister1button.setForeground(Color.BLACK);
		resister1button.setHorizontalAlignment(JTextField.CENTER);
		resister1button.setFont(font);
		resister1button.addActionListener(e->
		{
			namelabel.setVisible(true);
			nametextfield.setVisible(true);
			contactlabel.setVisible(true);
			contacttextfield.setVisible(true);
			resisterbutton.setVisible(true);
			resister1button.setVisible(false);
		});
		add(resister1button);
		
	}



	private void textfield() {
		cursor = new Cursor(Cursor.TEXT_CURSOR);
		font = new Font("Arial", Font.ITALIC, 16);

		nametextfield = new JTextField();
		nametextfield.setBounds(125, 40, 220, 25);
		nametextfield.setFont(font);
		nametextfield.setCursor(cursor);
		nametextfield.setForeground(Color.BLACK);
		nametextfield.setBackground(Color.WHITE);
		nametextfield.setHorizontalAlignment(JTextField.CENTER);
		add(nametextfield);
		
		contacttextfield = new JTextField();
		contacttextfield.setBounds(125, 90, 220, 25);
		contacttextfield.setFont(font);
		contacttextfield.setCursor(cursor);
		contacttextfield.setForeground(Color.MAGENTA);
		contacttextfield.setBackground(Color.WHITE);
		contacttextfield.setHorizontalAlignment(JTextField.CENTER);
		add(contacttextfield);
		

		idtextfield = new JTextField();
		idtextfield.setBounds(125, 190, 220, 25);
		idtextfield.setFont(font);
		idtextfield.setCursor(cursor);
		idtextfield.setForeground(Color.MAGENTA);
		idtextfield.setBackground(Color.WHITE);
		idtextfield.setHorizontalAlignment(JTextField.CENTER);
		add(idtextfield);
		
		emailtextfield = new JTextField();
		emailtextfield.setBounds(125, 140, 220, 25);
		emailtextfield.setFont(font);
		emailtextfield.setCursor(cursor);
		emailtextfield.setForeground(Color.MAGENTA);
		emailtextfield.setBackground(Color.WHITE);
		emailtextfield.setHorizontalAlignment(JTextField.CENTER);
		add(emailtextfield);
	}



	private void label() {
		font = new Font("Arial", Font.CENTER_BASELINE, 16);

		namelabel = new JLabel("Name :");
		setLayout(null);
		namelabel.setBounds(20, 40, 100, 25);
		namelabel.setFont(font);
		namelabel.setForeground(Color.WHITE);
		namelabel.setBackground(Color.BLACK);
		namelabel.setOpaque(true);
		namelabel.setHorizontalAlignment(JLabel.CENTER);
		add(namelabel);
		
		contactlabel = new JLabel("Contact No :");
		setLayout(null);
		contactlabel.setBounds(20, 90, 100, 25);
		contactlabel.setFont(font);
		contactlabel.setForeground(Color.WHITE);
		contactlabel.setBackground(Color.BLACK);
		contactlabel.setOpaque(true);
		contactlabel.setHorizontalAlignment(JLabel.CENTER);
		add(contactlabel);
		
		idlabel = new JLabel("password :");
		setLayout(null);
		idlabel.setBounds(20, 190, 100, 25);
		idlabel.setFont(font);
		idlabel.setForeground(Color.WHITE);
		idlabel.setBackground(Color.BLACK);
		idlabel.setOpaque(true);
		idlabel.setHorizontalAlignment(JLabel.CENTER);
		add(idlabel);
		
		emaillabel = new JLabel("Email :");
		setLayout(null);
		emaillabel.setBounds(20, 140, 100, 25);
		emaillabel.setFont(font);
		emaillabel.setForeground(Color.WHITE);
		emaillabel.setBackground(Color.BLACK);
		emaillabel.setOpaque(true);
		emaillabel.setHorizontalAlignment(JLabel.CENTER);
		add(emaillabel);
		
	}

	public void backgroundcolour() {
		c = this.getContentPane();
		c.setBackground(Color.blue);
	}
	
	

	public static void main(String[] args) {
		LoginWindow a= new LoginWindow();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(0,0,400,350);
		a.setLocationRelativeTo(null);
		a.setVisible(true);

	}

}
