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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToggleButton;
import javax.swing.table.DefaultTableModel;



public class SixthWindow extends JFrame {
	
	public JButton journalbookbutton;
	public JButton anthologybookbutton;
	public JButton mathbookbutton;
	public JButton religiousbookbutton;
	public JButton lawbookbutton;
	public JButton Pharmacybookbutton;
	public JButton Accountingbookbutton;
	public JButton Biologybookbutton;
	public JButton AIbookbutton;
	public JButton Medicinebookbutton;
	public JButton computerbookbutton;
	public JButton Agriculturebookbutton;
	
	public JButton Hidebutton;
	public JButton previousSubjecybutton;
	public JButton Exitbutton;
	public JButton Backbutton;
	
	public  ImageIcon journalbookimage;
	public  ImageIcon anthologybookimage;
	public  ImageIcon mathbookimage;
	public  ImageIcon religiousbookimage;
	public  ImageIcon lawbookimage;
	public  ImageIcon parmabookimage;
	public  ImageIcon accountingbookimage;
	public  ImageIcon Biologybookimage;
	public  ImageIcon AIbookimage;
	public  ImageIcon computerbookimage;
	public  ImageIcon agriculturalbookimage;
	
	public Container container;
	private Font f;
	private Cursor cursor;
	public GridLayout gridlayout;
	private JPanel jpanel;
	private JToggleButton togglebutton;
	public String[] columnNames= {"Book","Writer","Shelf","Row","Price"};

	
	
	
	public SixthWindow() {
		super("4th page");
		background();
		button();
	}

	public void background() {
		container = this.getContentPane();
		container.setLayout(null);
		container.setBackground(Color.BLUE);
	}
	
	
	public void button() {
		f = new Font("Arial", Font.CENTER_BASELINE, 18);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		journalbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/journal.jpg"));
		anthologybookimage = new ImageIcon(getClass().getResource("/res/com/library/management/anthology.jpg"));
		mathbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/math.jpg"));
		religiousbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/religious.jpg"));
		lawbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/law.jpg"));
		parmabookimage = new ImageIcon(getClass().getResource("/res/com/library/management/parma.jpg"));
		accountingbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/accounting.jpg"));
		Biologybookimage = new ImageIcon(getClass().getResource("/res/com/library/management/biology.jpg"));
		AIbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/AI.jpg"));
		computerbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/computer.jpg"));
		agriculturalbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/agricultural.jpg"));
		gridlayout = new GridLayout(3, 4, 20, 20);
		container.setLayout(gridlayout);

		journalbookbutton = new JButton(journalbookimage);
		journalbookbutton.setToolTipText("Journal");
		journalbookbutton.setBackground(Color.ORANGE);
		journalbookbutton.setForeground(Color.BLACK);
		journalbookbutton.setFont(f);
		journalbookbutton.setCursor(cursor);
		journalbookbutton.addActionListener(e->{
			showTableData("Journal");
		});
		add(journalbookbutton);

		anthologybookbutton = new JButton(anthologybookimage);
		anthologybookbutton.setToolTipText("Anthology");
		anthologybookbutton.setBackground(Color.ORANGE);
		anthologybookbutton.setForeground(Color.BLACK);
		anthologybookbutton.setFont(f);
		anthologybookbutton.setCursor(cursor);
		anthologybookbutton.addActionListener(e->{
			showTableData("Anthology");
		});
		add(anthologybookbutton);

		mathbookbutton = new JButton(mathbookimage);
		mathbookbutton.setToolTipText("Mathematics");
		mathbookbutton.setBackground(Color.ORANGE);
		mathbookbutton.setForeground(Color.BLACK);
		mathbookbutton.setFont(f);
		mathbookbutton.setCursor(cursor);
		mathbookbutton.addActionListener(e->{
			showTableData("Mathematics");
		});
		add(mathbookbutton);

		religiousbookbutton = new JButton(religiousbookimage);
		religiousbookbutton.setToolTipText("Religion");
		religiousbookbutton.setBackground(Color.ORANGE);
		religiousbookbutton.setForeground(Color.BLACK);
		religiousbookbutton.setFont(f);
		religiousbookbutton.setCursor(cursor);
		religiousbookbutton.addActionListener(e->{
			showTableData("Religion");
		});
		add(religiousbookbutton);

		lawbookbutton = new JButton(lawbookimage);
		lawbookbutton.setToolTipText("Law");
		lawbookbutton.setBackground(Color.ORANGE);
		lawbookbutton.setForeground(Color.BLACK);
		lawbookbutton.setFont(f);
		lawbookbutton.setCursor(cursor);
		lawbookbutton.addActionListener(e->{
			showTableData("Law");
		});
		add(lawbookbutton);

		Pharmacybookbutton = new JButton(parmabookimage);
		Pharmacybookbutton.setToolTipText("Pharmacy");
		Pharmacybookbutton.setBackground(Color.ORANGE);
		Pharmacybookbutton.setForeground(Color.BLACK);
		Pharmacybookbutton.setFont(f);
		Pharmacybookbutton.setCursor(cursor);
		Pharmacybookbutton.addActionListener(e->{
			showTableData("Pharmacy");
		});
		add(Pharmacybookbutton);

		Accountingbookbutton = new JButton(accountingbookimage);
		Accountingbookbutton.setToolTipText("Accounting");
		Accountingbookbutton.setBackground(Color.ORANGE);
		Accountingbookbutton.setForeground(Color.BLACK);
		Accountingbookbutton.setFont(f);
		Accountingbookbutton.setCursor(cursor);
		Accountingbookbutton.addActionListener(e->{
			showTableData("Accounting");
		});
		add(Accountingbookbutton);

		Biologybookbutton= new JButton(Biologybookimage);
		Biologybookbutton.setToolTipText("Biology");
		Biologybookbutton.setBackground(Color.ORANGE);
		Biologybookbutton.setForeground(Color.BLACK);
		Biologybookbutton.setFont(f);
		Biologybookbutton.setCursor(cursor);
		Biologybookbutton.addActionListener(e->{
			showTableData("Biology");
		});
		add(Biologybookbutton);

		AIbookbutton = new JButton(AIbookimage);
		AIbookbutton.setToolTipText("Artificial Intelligence ");
		AIbookbutton.setBackground(Color.ORANGE);
		AIbookbutton.setForeground(Color.BLACK);
		AIbookbutton.setFont(f);
		AIbookbutton.setCursor(cursor);
		AIbookbutton.addActionListener(e->{
			showTableData("Artificial Intelligence");
		});
		add(AIbookbutton);

		computerbookbutton = new JButton(computerbookimage);
		computerbookbutton.setToolTipText("Computer Science");
		computerbookbutton.setBackground(Color.ORANGE);
		computerbookbutton.setForeground(Color.BLACK);
		computerbookbutton.setFont(f);
		computerbookbutton.setCursor(cursor);
		computerbookbutton.addActionListener(e->{
			showTableData("Computer Science");
		});
		add(computerbookbutton);

		Agriculturebookbutton = new JButton(agriculturalbookimage);
		Agriculturebookbutton.setToolTipText("Agriculture");
		Agriculturebookbutton.setBackground(Color.ORANGE);
		Agriculturebookbutton.setForeground(Color.BLACK);
		Agriculturebookbutton.setFont(f);
		Agriculturebookbutton.setCursor(cursor);
		Agriculturebookbutton.addActionListener(e->{
			showTableData("Agriculture");
		});
		add(Agriculturebookbutton);

		jpanel = new JPanel();
		jpanel.setBackground(Color.blue);
		jpanel.setCursor(cursor);
		jpanel.setLayout(new GridLayout(0, 1, 0, 5));
		add(jpanel);

		Hidebutton = new JButton();
		previousSubjecybutton = new JButton();
		Exitbutton = new JButton();

		Backbutton = new JButton("More");
		Backbutton.setBackground(Color.orange);
		Backbutton.setForeground(Color.BLACK);
		Backbutton.setFont(f);
		Backbutton.setCursor(cursor);

		Hidebutton.setVisible(false);
		previousSubjecybutton.setVisible(false);
		Exitbutton.setVisible(false);
		Backbutton.setVisible(false);

		jpanel.add(Hidebutton);
		jpanel.add(previousSubjecybutton);
		jpanel.add(Exitbutton);
		jpanel.add(Backbutton);

		togglebutton = new JToggleButton("More ");
		togglebutton.setBackground(Color.orange);
		togglebutton.setForeground(Color.BLACK);
		togglebutton.setCursor(cursor);
		togglebutton.setFont(f);
		jpanel.add(togglebutton);

		togglebutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				togglebutton.setVisible(false);
				Hidebutton.setVisible(true);
				Hidebutton.setText("Hide ");
				Hidebutton.setBackground(Color.green);
				Hidebutton.setForeground(Color.BLACK);
				Hidebutton.setFont(f);
				Hidebutton.setCursor(cursor);

				previousSubjecybutton.setVisible(true);
				previousSubjecybutton.setText("Previous");
				previousSubjecybutton.setBackground(Color.GREEN);
				previousSubjecybutton.setForeground(Color.BLACK);
				previousSubjecybutton.setFont(f);
				previousSubjecybutton.setCursor(cursor);

				Exitbutton.setVisible(true);
				Exitbutton.setText("Exit ");
				Exitbutton.setBackground(Color.red);
				Exitbutton.setForeground(Color.BLACK);
				Exitbutton.setFont(f);
				Exitbutton.setCursor(cursor);

				Backbutton.setVisible(true);
				Backbutton.setText("Back ");
				Backbutton.setBackground(Color.CYAN);
				Backbutton.setForeground(Color.BLACK);
				Backbutton.setFont(f);
				Backbutton.setCursor(cursor);
				
				
				previousSubjecybutton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						dispose();
						FourthWindow a = new FourthWindow();
						a.setVisible(true);
						a.setBounds(20, 20, 1000, 750);
						a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					}
				});
				
				

				Backbutton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {

						dispose();
						HomeWindow a = new HomeWindow();
						a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
						a.setBounds(20, 20, 1000, 750);
						a.setVisible(true);
					}
				});
				
				
				Exitbutton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						dispose();
					}
			});
				
				Hidebutton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						Hidebutton.setVisible(false);
						previousSubjecybutton.setVisible(false);
						Exitbutton.setVisible(false);
						Backbutton.setVisible(false);
						togglebutton.setVisible(true);
						
					}
				});
			}
		});
	}
	
	
	public static void main(String[] args) {
		SixthWindow a = new SixthWindow();
		a.setVisible(true);
		a.setBounds(20, 20, 1000, 750);
		a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void showTableData(String sub) {

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
        ResultSet rs =db.subject(sub);
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
