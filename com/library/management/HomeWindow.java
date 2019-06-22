package com.library.management;
import java.awt.Container;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Cursor.*;
import java.awt.Desktop;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;

import java.awt.image.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.sql.ResultSet;
import java.sql.SQLException;


public class HomeWindow extends JFrame {
	private JLabel addressimagelabel;
	private JLabel libraryimagelabel;
	private JLabel booknamelabel;
	private JLabel writernamelabel;
	
	public String[] columnNames= {"Book","Writer","Shelf","Row","Price"};
	
	private ImageIcon addressimage;
	private ImageIcon libraryimage;
	private ImageIcon developerimage;
	private ImageIcon mapsimage;
	private ImageIcon helpimage;
	private ImageIcon ownerimage;
	private ImageIcon image;
	
	private Font font;
	private Container c;
	private Cursor cursor;
	private Desktop D;
	
	private JTextField textfield;
	private JTextField textfield1;
	
	private JButton searchbutton;
	private JButton bookarenotherebutton;
	private JButton findbookbutton;
	private JButton loginbutton;
	private JButton backbutton;
	private JButton developerbutton;
	private JButton mapsbutton;
	private JButton helpbutton;
	private JButton ownerbutton;
	public JToggleButton adminentrybutton;

	private JPanel jpanel;
	public String string;
	public String string1;
	public String string2;
	public String string3;
	

	
	
	
	public HomeWindow() {
		super("1st page: ");
		pack();
		backgroundcolour();
		library();
		label();
		textfield();
		button();
		button1();
	}
	
	public void backgroundcolour() {
		c = this.getContentPane();
		c.setBackground(Color.blue);
	}
	
	public void library() {
		libraryimage = new ImageIcon(getClass().getResource("/res/com/library/management/library.jpg"));
		addressimagelabel = new JLabel();
		addressimagelabel.setBounds(0, 0, 1000, 250);
		addressimagelabel.setIcon(libraryimage);
		add(addressimagelabel);

		addressimage = new ImageIcon(getClass().getResource("/res/com/library/management/address.jpg"));
		addressimagelabel = new JLabel(addressimage);
		addressimagelabel.setBounds(650, 255, 330, 260);
		addressimagelabel.setForeground(Color.WHITE);
		addressimagelabel.setOpaque(true);
		add(addressimagelabel);
	}
	
	public void label() {
		font = new Font("Arial", Font.CENTER_BASELINE, 16);

		booknamelabel = new JLabel("Book Name :");
		setLayout(null);
		booknamelabel.setToolTipText("Search here");
		booknamelabel.setBounds(20, 270, 200, 50);
		booknamelabel.setFont(font);
		booknamelabel.setForeground(Color.WHITE);
		booknamelabel.setBackground(Color.BLACK);
		booknamelabel.setOpaque(true);
		booknamelabel.setHorizontalAlignment(JLabel.CENTER);
		add(booknamelabel);
		
		writernamelabel= new JLabel("Written By :");
		setLayout(null);
		writernamelabel.setToolTipText("Search here");
		writernamelabel.setBounds(20, 340, 200, 50);
		writernamelabel.setFont(font);
		writernamelabel.setForeground(Color.WHITE);
		writernamelabel.setBackground(Color.black);
		writernamelabel.setOpaque(true);
		writernamelabel.setHorizontalAlignment(JLabel.CENTER);
		add(writernamelabel);
	}
	
	public void textfield() {
		cursor = new Cursor(Cursor.TEXT_CURSOR);
		font = new Font("Arial", Font.ITALIC, 16);

		textfield = new JTextField("Book Name");
		textfield.setBounds(230, 270, 400, 50);
		textfield.setFont(font);
		textfield.setCursor(cursor);
		textfield.setForeground(Color.MAGENTA);
		textfield.setBackground(Color.WHITE);
		textfield.setHorizontalAlignment(JTextField.CENTER);
		textfield.addFocusListener(new FocusListener() {
	
			public void focusGained(FocusEvent e) {
				String username = textfield.getText();
			    if(username.equals("Book Name")){
			    	textfield.setCaretPosition(0);
			    }	
			}
			
			public void focusLost(FocusEvent e) {
				 String username = textfield.getText();
				    if(username.equals("")){
				    	textfield.setForeground(new java.awt.Color(86, 86, 86));
				    	textfield.setCaretPosition(0);
				    	textfield.setText("Book Name");
				    }	
			}	
		});
		textfield.addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent e) {
				 String username = textfield.getText();
				    if(username.equals("Book Name")){
				    	textfield.setText(null);
				    	textfield.setCaretPosition(0);
				    }	
			}
			
			public void keyReleased(KeyEvent e) {	
			}
		
			public void keyTyped(KeyEvent e) {	
			}	
		});
		add(textfield);
		
		
		textfield1 = new JTextField("Write Name");
		textfield1.setBounds(230, 340, 400, 50);
		textfield1.setFont(font);
		textfield1.setCursor(cursor);
		textfield1.setForeground(Color.MAGENTA);
		textfield1.setBackground(Color.WHITE);
		textfield1.setHorizontalAlignment(JTextField.CENTER);
		textfield.addFocusListener(new FocusListener() {
			
			public void focusGained(FocusEvent e) {
				String username = textfield1.getText();
			    if(username.equals("Write Name")){
			    	textfield1.setCaretPosition(0);
			    }	
			}
			
			public void focusLost(FocusEvent e) {
				 String username = textfield1.getText();
				    if(username.equals("")){
				    	textfield1.setForeground(new java.awt.Color(86, 86, 86));
				    	textfield1.setCaretPosition(0);
				    	textfield1.setText("Write Name");
				    }	
			}	
		});
		textfield1.addKeyListener(new KeyListener() {

			public void keyPressed(KeyEvent e) {
				 String username = textfield1.getText();
				    if(username.equals("Write Name")){
				    	textfield1.setText(null);
				    	textfield1.setCaretPosition(0);
				    }	
			}
			
			public void keyReleased(KeyEvent e) {	
			}
		
			public void keyTyped(KeyEvent e) {	
			}	
		});
		add(textfield1);
	}
	
	public void button() {
		cursor = new Cursor(Cursor.HAND_CURSOR);
		font = new Font("Arial", Font.ITALIC + Font.BOLD, 16);
		image = new ImageIcon(getClass().getResource(""));

		searchbutton = new JButton("Search");
		searchbutton.setBounds(220, 410, 150, 50);
		searchbutton.setBackground(Color.orange);
		searchbutton.setCursor(cursor);
		searchbutton.setHorizontalAlignment(JTextField.CENTER);
		searchbutton.setFont(font);
		add(searchbutton);

		bookarenotherebutton = new JButton("Books Are Not Here");
		bookarenotherebutton.setBounds(150, 475, 300, 50);
		bookarenotherebutton.setBackground(Color.orange);
		bookarenotherebutton.setCursor(cursor);
		bookarenotherebutton.setHorizontalAlignment(JTextField.CENTER);
		bookarenotherebutton.setFont(font);
		add(bookarenotherebutton);

		findbookbutton = new JButton("Find Books ");
		findbookbutton.setBounds(150, 545, 300, 50);
		findbookbutton.setBackground(Color.orange);
		findbookbutton.setCursor(cursor);
		findbookbutton.setFont(font);
		add(findbookbutton);
		
		
		loginbutton = new JButton("Log In");
		loginbutton.setBounds(220, 410, 150, 50);
		loginbutton.setBackground(Color.orange);
		loginbutton.setCursor(cursor);
		loginbutton.setHorizontalAlignment(JTextField.CENTER);
		loginbutton.setFont(font);
		loginbutton.setVisible(false);
		add(loginbutton);
		
		backbutton = new JButton("Back");
		backbutton.setBounds(800, 630, 150, 50);
		backbutton.setBackground(Color.orange);
		backbutton.setForeground(Color.black);
		backbutton.setFont(font);
		backbutton.setVisible(false);
		add(backbutton);

		

		adminentrybutton = new JToggleButton("Admins Entry ");
		adminentrybutton.setBounds(150, 615, 300, 50);
		adminentrybutton.setBackground(Color.orange);
		adminentrybutton.setCursor(cursor);
		adminentrybutton.setFont(font);
		add(adminentrybutton);
		
		
		searchbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				String bookname=textfield.getText();
				String writer=textfield1.getText();

				if(bookname.isEmpty()&&writer.isEmpty()) { 
				
					
					JOptionPane.showMessageDialog(null, "Invalid input");
					
				}
				else if(bookname.isEmpty())
				{
					showTableData1(bookname,writer);
				}
				else if(writer.isEmpty())
				{
					showTableData2(bookname);
				}
				else
				{
					//showTableData(bookname, writer);
				    showTableData2(bookname);
				}
				 
			}
		});

		
		bookarenotherebutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
	
					dispose();
					ThirdWindow a=new ThirdWindow();
					a.setBounds(20,20,1000, 750);
					a.setVisible(true);
					a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				}
		});
		

		findbookbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

    				dispose();
					FourthWindow a=new FourthWindow();
					a.setVisible(true);
				a.setBounds(20,20,1000, 750);
					a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
				}
		});
		

		adminentrybutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					if(adminentrybutton.isSelected()) {
						booknamelabel.setText("Admin Id :");
						writernamelabel.setText("Password :");
						loginbutton.setText("Log In");
						loginbutton.setBackground(Color.GREEN);
						loginbutton.setVisible(true);
					    bookarenotherebutton.setVisible(false);
						findbookbutton.setVisible(false);
						searchbutton.setVisible(false);
					    adminentrybutton.setVisible(false);
						jpanel.setVisible(false);
					    addressimagelabel.setVisible(false);
						backbutton.setVisible(true);
						backbutton.setBackground(Color.GREEN);
						
						
				loginbutton.addActionListener(new ActionListener() {

							public void actionPerformed(ActionEvent e) {

							 string = textfield.getText();
							 string1 =textfield1.getText();
							 string2="shuvo";
							 string3 = "rakib";
							 
								if (string.equals(string2)||string1.equals(string3)) {
									dispose();
									FifthWindow a=new FifthWindow();
									a.setVisible(true);
									a.setBounds(20,20,1000, 750);
									a.setLayout(null);
									a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
								}
								else {
									JOptionPane.showMessageDialog(null, "Invalid input!");
								}
							}
							
						});	
				
				
				backbutton.addActionListener(new ActionListener() {

							public void actionPerformed(ActionEvent e) {

									dispose();
									HomeWindow  a=new HomeWindow();
									a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
									a.setBounds(20,20,1000, 750);
									a.setVisible(true);	
								}
						});
					}
		}
	});
		}


	
	public void button1() {
		cursor =new Cursor(Cursor.HAND_CURSOR);
		font=new Font("Arial",Font.ITALIC + Font.BOLD ,15);
		developerimage=new ImageIcon(getClass().getResource("/res/com/library/management/developer.jpg"));
		mapsimage=new ImageIcon(getClass().getResource("/res/com/library/management/map.jpg"));
		helpimage=new ImageIcon(getClass().getResource("/res/com/library/management/help.jpg"));
		ownerimage=new ImageIcon(getClass().getResource("/res/com/library/management/owner.jpg"));
		
		
		jpanel=new JPanel();
		jpanel.setBounds(650, 520, 330, 200);
		jpanel.setBackground(Color.BLACK);
		jpanel.setCursor(cursor);
		jpanel.setLayout(new GridLayout(2,2,5,5));
		
		developerbutton=new JButton(developerimage);
		developerbutton.setToolTipText("Talk To Developer");
		developerbutton.setBackground(Color.orange);
		developerbutton.setForeground(Color.BLACK);
		developerbutton.setFont(font);
		
		mapsbutton=new JButton(mapsimage);
		mapsbutton.setToolTipText("Find Out The Map");
		mapsbutton.setBackground(Color.orange);
		mapsbutton.setForeground(Color.BLACK);
		mapsbutton.setFont(font);
		
		helpbutton=new JButton(helpimage);
		helpbutton.setToolTipText("Help");
		helpbutton.setBackground(Color.orange);
		helpbutton.setForeground(Color.BLACK);
		helpbutton.setFont(font);
		
		ownerbutton=new JButton(ownerimage);
		ownerbutton.setToolTipText("Talk To Owner");
		ownerbutton.setBackground(Color.orange);
		ownerbutton.setForeground(Color.BLACK);
		ownerbutton.setFont(font);
		
		jpanel.add(developerbutton);
		jpanel.add(mapsbutton);
		jpanel.add(helpbutton);
		jpanel.add(ownerbutton);
		add(jpanel);
		
		
		developerbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					 D = Desktop.getDesktop();
					 try {
						D.browse(new URI("https://www.facebook.com/mdkowsar.alam.3"));
					} catch (IOException | URISyntaxException e1) {
						e1.printStackTrace();
					}
				}
		});
		
		
		mapsbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					 D = Desktop.getDesktop();
					 try {
						D.browse(new URI("http://goo.gl/maps/Fb7YvK1842D2"));
					} catch (IOException | URISyntaxException e1) {
						e1.printStackTrace();
					}
				}
		});
		
		
		helpbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					 D = Desktop.getDesktop();
					 try {
						D.browse(new URI("http://www.google.com"));
					} catch (IOException | URISyntaxException e1) {
						e1.printStackTrace();
					}
					 
				}
			
		});
		
		
		ownerbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
					 D = Desktop.getDesktop();
					 try {
						D.browse(new URI("https://www.facebook.com/profile.php?id=100008482234586"));
					} catch (IOException | URISyntaxException e1) {
						e1.printStackTrace();
					}
				}
		});
		
	}
	

	public static void main(String[] args) {
		
		HomeWindow  a=new HomeWindow();
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		a.setBounds(20,20,1000, 750);
		a.setVisible(true);
	}
	 public void showTableData(String bookname,String writername) {

	        JFrame frame1 = new JFrame("Database Search Result");
	        frame1.setLayout(new BorderLayout());

	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columnNames);

	        JTable table = new JTable();
	        table.setModel(model);
	        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	        table.setFillsViewportHeight(true);
	        JScrollPane scroll = new JScrollPane(table);
	        scroll.setHorizontalScrollBarPolicy(

	                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	        scroll.setVerticalScrollBarPolicy(

	                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

	        String book = "";
	        String writer = "";
	        String self = "";
	        String row = "";
	        String price = "";
	        
	        dbcon db=new dbcon();
	        ResultSet rs =db.booksearch(bookname,writername);
	        try {
				while(rs.next()) {
					book = rs.getString("Book_Name");
					writer = rs.getString("Writer_Name");
				    self=String.valueOf(rs.getInt("Self"));
				    row=String.valueOf(rs.getInt("Row"));
				    price=String.valueOf(rs.getInt("Price"));
				    model.addRow(new Object[]{book, writer, self, row,price});
	   }
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        frame1.add(scroll);
			frame1.setVisible(true);
			frame1.setSize(700, 200);
			frame1.setLocation(300, 250);
	}
	 public void showTableData1(String bookname,String writername) {

	        JFrame frame1 = new JFrame("Database Search Result");
	        frame1.setLayout(new BorderLayout());

	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columnNames);

	        JTable table = new JTable();
	        table.setModel(model);
	        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	        table.setFillsViewportHeight(true);
	        JScrollPane scroll = new JScrollPane(table);
	        scroll.setHorizontalScrollBarPolicy(

	                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	        scroll.setVerticalScrollBarPolicy(

	                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

	        String book = "";
	        String writer = "";
	        String self = "";
	        String row = "";
	        String price = "";
	        
	        dbcon db=new dbcon();
	        ResultSet rs =db.booksearch1(bookname,writername);
	        try {
				while(rs.next()) {
					book = rs.getString("Book_Name");
					writer = rs.getString("Writer_Name");
				    self=String.valueOf(rs.getInt("Self"));
				    row=String.valueOf(rs.getInt("Row"));
				    price=String.valueOf(rs.getInt("Price"));
				    model.addRow(new Object[]{book, writer, self, row,price});
	   }
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        frame1.add(scroll);
			frame1.setVisible(true);
			frame1.setSize(700, 200);
			frame1.setLocation(300, 250);
	}
	 
	 public void showTableData2(String a) {

	        JFrame frame1 = new JFrame("Database Search Result");
	        frame1.setLayout(new BorderLayout());

	        DefaultTableModel model = new DefaultTableModel();
	        model.setColumnIdentifiers(columnNames);

	        JTable table = new JTable();
	        table.setModel(model);
	        table.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);
	        table.setFillsViewportHeight(true);
	        JScrollPane scroll = new JScrollPane(table);
	        scroll.setHorizontalScrollBarPolicy(

	                JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

	        scroll.setVerticalScrollBarPolicy(

	                JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

	        String book = "";
	        String writer = "";
	        String self = "";
	        String row = "";
	        String price = "";
	        
	        dbcon db=new dbcon();
	        ResultSet rs =db.likesrarch(a);
	        try {
				while(rs.next()) {
					book = rs.getString("Book_Name");
					writer = rs.getString("Writer_Name");
				    self=String.valueOf(rs.getInt("Self"));
				    row=String.valueOf(rs.getInt("Row"));
				    price=String.valueOf(rs.getInt("Price"));
				    model.addRow(new Object[]{book, writer, self, row,price});
	   }
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        frame1.add(scroll);
			frame1.setVisible(true);
			frame1.setSize(700, 200);
			frame1.setLocation(300, 250);
	}

	
}
