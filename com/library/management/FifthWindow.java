package com.library.management;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class FifthWindow extends JFrame {
	private Container container;
	private Font font;
	private Cursor cursor;
	public String[] columnNames= {"Name","Contact","Id","Email","Date/Time"};
	
	private JButton Backbutton;
	private JButton Submitbutton;
	private JButton showuerbutton;
	
	private JLabel booknamelabel;
	private JLabel subjectlabel;
	private JLabel writernamelabel;
	private JLabel additionlabel;
	private JLabel shelflabel;
	private JLabel rowlabel;
	private JLabel pricelabel;
	
	
	public JTextField booknametextfield;
	public JTextField subjecttextfield;
	public JTextField writernametextfield;
	public JTextField additiontextfield;
	public JTextField shelftextfield;
	public JTextField rowtextfield;
	public JTextField pricetextfield;

	
	
	
   public FifthWindow() {
		super("5th page");
		background();
		label();
		textfield();
		button();
	}
	
	
	public void background() {
		container= this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.BLUE);
	}
	
	
	
	public void label() {
		font = new Font("Arial", Font.CENTER_BASELINE,18);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
		booknamelabel=new JLabel("Book Number :");
		booknamelabel.setBounds(30, 30, 150, 50);
		booknamelabel.setBackground(Color.ORANGE);
		booknamelabel.setForeground(Color.BLACK);
		booknamelabel.setFont(font);
		booknamelabel.setOpaque(true);
		booknamelabel.setHorizontalAlignment(JTextField.CENTER);
		add(booknamelabel);
		
		
		subjectlabel=new JLabel("Subject :");
		subjectlabel.setBounds(30, 170, 150, 50);
		subjectlabel.setBackground(Color.ORANGE);
		subjectlabel.setOpaque(true);
		subjectlabel.setForeground(Color.BLACK);
		subjectlabel.setFont(font);
		subjectlabel.setHorizontalAlignment(JTextField.CENTER);
		add(subjectlabel);
		
		
		writernamelabel=new JLabel("Writer Name :");
		writernamelabel.setBounds(30, 100, 150, 50);
		writernamelabel.setBackground(Color.ORANGE);
		writernamelabel.setOpaque(true);
		writernamelabel.setForeground(Color.BLACK);
		writernamelabel.setFont(font);
		writernamelabel.setHorizontalAlignment(JTextField.CENTER);
		add(writernamelabel);
		
		
		additionlabel=new JLabel("Row :");
		additionlabel.setBounds(30, 310, 150, 50);
		additionlabel.setBackground(Color.ORANGE);
		additionlabel.setForeground(Color.BLACK);
		additionlabel.setOpaque(true);
		additionlabel.setFont(font);
		additionlabel.setHorizontalAlignment(JTextField.CENTER);
		add(additionlabel);
		
		
		shelflabel=new JLabel("Shelf :");
		shelflabel.setBounds(30, 380, 150, 50);
		shelflabel.setBackground(Color.ORANGE);
		shelflabel.setForeground(Color.BLACK);
		shelflabel.setOpaque(true);
		shelflabel.setFont(font);
		shelflabel.setHorizontalAlignment(JTextField.CENTER);
		add(shelflabel);
		
		
		rowlabel=new JLabel("Price :");
		rowlabel.setBounds(30, 450, 150, 50);
		rowlabel.setBackground(Color.ORANGE);
		rowlabel.setForeground(Color.BLACK);
		rowlabel.setOpaque(true);
		rowlabel.setFont(font);
		rowlabel.setHorizontalAlignment(JTextField.CENTER);
		add(rowlabel);
		
		
		pricelabel=new JLabel("Edition:");
		pricelabel.setBounds(30, 240, 150, 50);
		pricelabel.setBackground(Color.ORANGE);
		pricelabel.setForeground(Color.BLACK);
		pricelabel.setOpaque(true);
		pricelabel.setFont(font);
		pricelabel.setHorizontalAlignment(JLabel.CENTER);
		add(pricelabel);		
	}
	
	public void textfield() {
		font = new Font("Arial", Font.ITALIC,18);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		
		
		booknametextfield=new JTextField();
		booknametextfield.setBounds(200, 30, 350,50);
		booknametextfield.setBackground(Color.WHITE);
		booknametextfield.setForeground(Color.BLACK);
		booknametextfield.setFont(font);
		booknametextfield.setCursor(cursor);
		booknametextfield.setHorizontalAlignment(JTextField.CENTER);
		add(booknametextfield);
		
		writernametextfield=new JTextField();
		writernametextfield.setBounds(200, 100, 350,50);
		writernametextfield.setBackground(Color.WHITE);
		writernametextfield.setForeground(Color.BLACK);
		writernametextfield.setFont(font);
		writernametextfield.setCursor(cursor);
		writernametextfield.setHorizontalAlignment(JTextField.CENTER);
		add(writernametextfield);
		
		subjecttextfield=new JTextField();
		subjecttextfield.setBounds(200, 170, 350,50);
		subjecttextfield.setBackground(Color.WHITE);
		subjecttextfield.setForeground(Color.BLACK);
		subjecttextfield.setFont(font);
		subjecttextfield.setCursor(cursor);
		subjecttextfield.setHorizontalAlignment(JTextField.CENTER);
		add(subjecttextfield);
		
		additiontextfield=new JTextField();
		additiontextfield.setBounds(200, 240, 350,50);
		additiontextfield.setBackground(Color.WHITE);
		additiontextfield.setForeground(Color.BLACK);
		additiontextfield.setFont(font);
		additiontextfield.setCursor(cursor);
		additiontextfield.setHorizontalAlignment(JTextField.CENTER);
		add(additiontextfield);
		
		rowtextfield=new JTextField();
		rowtextfield.setBounds(200, 310, 350,50);
		rowtextfield.setBackground(Color.WHITE);
		rowtextfield.setForeground(Color.BLACK);
		rowtextfield.setFont(font);
		rowtextfield.setCursor(cursor);
		rowtextfield.setHorizontalAlignment(JTextField.CENTER);
		add(rowtextfield);
		
		shelftextfield=new JTextField();
		shelftextfield.setBounds(200, 380, 350,50);
		shelftextfield.setBackground(Color.WHITE);
		shelftextfield.setForeground(Color.BLACK);
		shelftextfield.setFont(font);
		shelftextfield.setCursor(cursor);
		shelftextfield.setHorizontalAlignment(JTextField.CENTER);
		add(shelftextfield);
		
		pricetextfield=new JTextField();
		pricetextfield.setBounds(200, 450, 350,50);
		pricetextfield.setBackground(Color.WHITE);
		pricetextfield.setForeground(Color.BLACK);
		pricetextfield.setFont(font);
		pricetextfield.setCursor(cursor);
		pricetextfield.setHorizontalAlignment(JTextField.CENTER);
		add(pricetextfield);
		
	}
	
	public void button() {
		font = new Font("Arial", Font.CENTER_BASELINE,18);

		Backbutton=new JButton("Back");
		Backbutton.setBounds(800, 630, 150, 50);
		Backbutton.setBackground(Color.GREEN);
		Backbutton.setForeground(Color.black);
		Backbutton.setFont(font);
		add(Backbutton);
		
		showuerbutton = new JButton("Users info");
		showuerbutton.setBounds(800, 530, 150, 50);
		showuerbutton.setBackground(Color.green);
		showuerbutton.setForeground(Color.black);
		showuerbutton.setCursor(cursor);
		showuerbutton.setHorizontalAlignment(JTextField.CENTER);
		showuerbutton.setFont(font);
		showuerbutton.setVisible(true);
		showuerbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {
				showTableData();
			}	
		});	
		add(showuerbutton);
		
		
		Submitbutton=new JButton("Submit");
		Submitbutton.setBounds(630, 630, 150, 50);
		Submitbutton.setBackground(Color.green);
		Submitbutton.setForeground(Color.black);
		Submitbutton.setFont(font);
		add(Submitbutton);


		Backbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

					dispose();
					HomeWindow f=new HomeWindow();
					f.setBounds(20,20,1000, 750);
					f.setVisible(true);
					f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			}
		});
		
		
		Submitbutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

					dispose();
					FifthWindow a=new FifthWindow();
					a.setVisible(true);
					a.setBounds(20,20,1000, 750);
					a.setLayout(null);
					a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					String book=booknametextfield.getText();
					String writer=writernametextfield.getText();
					String subject=subjecttextfield.getText();
					int shelf=Integer.parseInt(shelftextfield.getText());
					int row=Integer.parseInt(rowtextfield.getText());
					int price=Integer.parseInt(pricetextfield.getText());
					dbcon d = new dbcon();
					d.insert(book, writer, subject, row, shelf, price);
//					System.out.println(book);
//					System.out.println(writer);
//					System.out.println(subject);
//					System.out.println(shelf);
//					System.out.println(row);
//					System.out.println(price);
			}
		});
	}
	
	
	
	
	public static void main(String[] args) {
		FifthWindow a=new FifthWindow();
		a.setVisible(true);
		a.setBounds(20,20,1000, 750);
		a.setLayout(null);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
	

	public void showTableData() {

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

        String name = "";
        String contact = "";
        String id = "";
        String email = "";
        String date = "";
        
        dbcon db=new dbcon();
        ResultSet rs =db.Alluser();
        try {
			while(rs.next()) {
				name = rs.getString("Name");
				contact = rs.getString("Contact");
			    id= rs.getString("Id");
			    email= rs.getString("Email");
			    date= rs.getString("Date");
			    model.addRow(new Object[]{name, contact, id, email,date});
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
