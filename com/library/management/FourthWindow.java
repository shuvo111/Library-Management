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

public class FourthWindow extends JFrame {
	
	public JButton engineeringbookbutton;
	public JButton Chemistrybookbutton;
	public JButton Economicsbookbutton;
	public JButton Geographybookbutton;
	public JButton Historybookbutton;
	public JButton Physicsbookbutton;
	public JButton Botanybookbutton;
	public JButton Novelbookbutton;
	public JButton Humanitiesbookbutton;
	public JButton Medicinebookbutton;
	public JButton MaritimeStudiesbookbutton;
	public JButton Hidebutton;
	public JButton Moresubjectbutton;
	public JButton Exitbutton;
	public JButton Backbutton;
	
	public String[] columnNames= {"Book","Writer","Shelf","Row","Price"};
	public Container container;
	private Font font;
	private Cursor cursor;
	public GridLayout gridlayout;
	private JPanel jpanel;
	private JToggleButton togglebutton;
	
	public  ImageIcon engineeringbookimage;
	public  ImageIcon chemistrybookimage;
	public  ImageIcon economibookimage;
	public  ImageIcon geomatrybookimage;
	public  ImageIcon histtorybookimage;
	public  ImageIcon phybookimage;
	public  ImageIcon botanybookimage;
	public  ImageIcon novelbookimage;
	public  ImageIcon huminitiesbookimage;
	public  ImageIcon madicinebookimage;
	public  ImageIcon maritimebookimage;
	
	
	
	public FourthWindow() {
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
		font = new Font("Arial", Font.CENTER_BASELINE, 18);
		cursor = new Cursor(Cursor.HAND_CURSOR);
		engineeringbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/engineering.jpg"));
		chemistrybookimage = new ImageIcon(getClass().getResource("/res/com/library/management/chemistry.jpg"));
		economibookimage = new ImageIcon(getClass().getResource("/res/com/library/management/economi.jpg"));
		geomatrybookimage = new ImageIcon(getClass().getResource("/res/com/library/management/geomatry.jpg"));
		histtorybookimage = new ImageIcon(getClass().getResource("/res/com/library/management/histtorry.jpg"));
		phybookimage = new ImageIcon(getClass().getResource("/res/com/library/management/phy.jpg"));
		botanybookimage = new ImageIcon(getClass().getResource("/res/com/library/management/botany.jpg"));
		novelbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/novel.jpg"));
		huminitiesbookimage = new ImageIcon(getClass().getResource("/res/com/library/management/huminities.jpg"));
		madicinebookimage = new ImageIcon(getClass().getResource("/res/com/library/management/madicine.jpg"));
		maritimebookimage = new ImageIcon(getClass().getResource("/res/com/library/management/maritime.jpg"));
		
		gridlayout = new GridLayout(3, 4, 20, 20);
		container.setLayout(gridlayout);

		engineeringbookbutton = new JButton(engineeringbookimage);
		engineeringbookbutton.setToolTipText("Engineering");
		engineeringbookbutton.setBackground(Color.ORANGE);
		engineeringbookbutton.setForeground(Color.BLACK);
		engineeringbookbutton.setFont(font);
		engineeringbookbutton.setCursor(cursor);
		engineeringbookbutton.addActionListener(e->{
			showTableData("Engineering");
		});
		add(engineeringbookbutton);

		Chemistrybookbutton = new JButton(chemistrybookimage);
		Chemistrybookbutton.setToolTipText("Chemistry");
		Chemistrybookbutton.setBackground(Color.ORANGE);
		Chemistrybookbutton.setForeground(Color.BLACK);
		Chemistrybookbutton.setFont(font);
		Chemistrybookbutton.setCursor(cursor);
		Chemistrybookbutton.addActionListener(e->{
			showTableData("Chemistry");
		});
		add(Chemistrybookbutton);

		Economicsbookbutton = new JButton(economibookimage);
		Economicsbookbutton.setToolTipText("Economics");
		Economicsbookbutton.setBackground(Color.ORANGE);
		Economicsbookbutton.setForeground(Color.BLACK);
		Economicsbookbutton.setFont(font);
		Economicsbookbutton.setCursor(cursor);
		Economicsbookbutton.addActionListener(e->{
			showTableData("Economics");
		});
		add(Economicsbookbutton);

		Geographybookbutton = new JButton(geomatrybookimage);
		Geographybookbutton.setToolTipText("Geography");
		Geographybookbutton.setBackground(Color.ORANGE);
		Geographybookbutton.setForeground(Color.BLACK);
		Geographybookbutton.setFont(font);
		Geographybookbutton.setCursor(cursor);
		Geographybookbutton.addActionListener(e->{
			showTableData("Geography");
		});
		add(Geographybookbutton);

		Historybookbutton = new JButton(histtorybookimage);
		Historybookbutton.setToolTipText("History");
		Historybookbutton.setBackground(Color.ORANGE);
		Historybookbutton.setForeground(Color.BLACK);
		Historybookbutton.setFont(font);
		Historybookbutton.setCursor(cursor);
		Historybookbutton.addActionListener(e->{
			showTableData("History");
		});
		add(Historybookbutton);

		Physicsbookbutton = new JButton(phybookimage);
		Physicsbookbutton.setToolTipText("Physics");
		Physicsbookbutton.setBackground(Color.ORANGE);
		Physicsbookbutton.setForeground(Color.BLACK);
		Physicsbookbutton.setFont(font);
		Physicsbookbutton.setCursor(cursor);
		Physicsbookbutton.addActionListener(e->{
			showTableData("Physics");
		});
		add(Physicsbookbutton);

		Botanybookbutton = new JButton(botanybookimage);
		Botanybookbutton.setToolTipText("Botany");
		Botanybookbutton.setBackground(Color.ORANGE);
		Botanybookbutton.setForeground(Color.BLACK);
		Botanybookbutton.setFont(font);
		Botanybookbutton.setCursor(cursor);
		Botanybookbutton.addActionListener(e->{
			showTableData("Botany");
		});
		add(Botanybookbutton);

		Novelbookbutton = new JButton(novelbookimage);
		Novelbookbutton.setToolTipText("Novel");
		Novelbookbutton.setBackground(Color.ORANGE);
		Novelbookbutton.setForeground(Color.BLACK);
		Novelbookbutton.setFont(font);
		Novelbookbutton.setCursor(cursor);
		Novelbookbutton.addActionListener(e->{
			showTableData("Novel");
		});
		add(Novelbookbutton);

		Humanitiesbookbutton = new JButton(huminitiesbookimage);
		Humanitiesbookbutton.setToolTipText("Humanities");
		Humanitiesbookbutton.setBackground(Color.ORANGE);
		Humanitiesbookbutton.setForeground(Color.BLACK);
		Humanitiesbookbutton.setFont(font);
		Humanitiesbookbutton.setCursor(cursor);
		Humanitiesbookbutton.addActionListener(e->{
			showTableData("Humanities");
		});
		add(Humanitiesbookbutton);

		Medicinebookbutton = new JButton(madicinebookimage);
		Medicinebookbutton.setToolTipText("Medicine");
		Medicinebookbutton.setBackground(Color.ORANGE);
		Medicinebookbutton.setForeground(Color.BLACK);
		Medicinebookbutton.setFont(font);
		Medicinebookbutton.setCursor(cursor);
		Medicinebookbutton.addActionListener(e->{
			showTableData("Medicine");
		});
		add(Medicinebookbutton);

		MaritimeStudiesbookbutton = new JButton(maritimebookimage);
		MaritimeStudiesbookbutton.setToolTipText("Maritime Studies");
		MaritimeStudiesbookbutton.setBackground(Color.ORANGE);
		MaritimeStudiesbookbutton.setForeground(Color.BLACK);
		MaritimeStudiesbookbutton.setFont(font);
		MaritimeStudiesbookbutton.setCursor(cursor);
		MaritimeStudiesbookbutton.addActionListener(e->{
			showTableData("Maritime Science");
		});
		add(MaritimeStudiesbookbutton);

		jpanel = new JPanel();
		jpanel.setBackground(Color.blue);
		jpanel.setCursor(cursor);
		jpanel.setLayout(new GridLayout(0, 1, 0, 5));
		add(jpanel);

		Hidebutton = new JButton();
		Moresubjectbutton = new JButton();
		Exitbutton = new JButton();

		Backbutton = new JButton("More");
		Backbutton.setBackground(Color.orange);
		Backbutton.setForeground(Color.BLACK);
		Backbutton.setFont(font);
		Backbutton.setCursor(cursor);

		Hidebutton.setVisible(false);
		Moresubjectbutton.setVisible(false);
		Exitbutton.setVisible(false);
		Backbutton.setVisible(false);

		jpanel.add(Hidebutton);
		jpanel.add(Moresubjectbutton);
		jpanel.add(Exitbutton);
		jpanel.add(Backbutton);

		togglebutton = new JToggleButton("More ");
		togglebutton.setBackground(Color.orange);
		togglebutton.setForeground(Color.BLACK);
		togglebutton.setCursor(cursor);
		togglebutton.setFont(font);
		jpanel.add(togglebutton);

		togglebutton.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				togglebutton.setVisible(false);
				Hidebutton.setVisible(true);
				Hidebutton.setText("Hide ");
				Hidebutton.setBackground(Color.green);
				Hidebutton.setForeground(Color.BLACK);
				Hidebutton.setFont(font);
				Hidebutton.setCursor(cursor);

				Moresubjectbutton.setVisible(true);
				Moresubjectbutton.setText("More Subject");
				Moresubjectbutton.setBackground(Color.GREEN);
				Moresubjectbutton.setForeground(Color.BLACK);
				Moresubjectbutton.setFont(font);
				Moresubjectbutton.setCursor(cursor);

				Exitbutton.setVisible(true);
				Exitbutton.setText("Exit ");
				Exitbutton.setBackground(Color.red);
				Exitbutton.setForeground(Color.BLACK);
				Exitbutton.setFont(font);
				Exitbutton.setCursor(cursor);

				Backbutton.setVisible(true);
				Backbutton.setText("Back ");
				Backbutton.setBackground(Color.CYAN);
				Backbutton.setForeground(Color.BLACK);
				Backbutton.setFont(font);
				Backbutton.setCursor(cursor);
				
				
				Moresubjectbutton.addActionListener(new ActionListener() {

					public void actionPerformed(ActionEvent e) {
						dispose();
						SixthWindow a = new SixthWindow();
						a.setVisible(true);
						a.setBounds(20, 20, 1000, 750);
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
						Moresubjectbutton.setVisible(false);
						Exitbutton.setVisible(false);
						Backbutton.setVisible(false);
					    togglebutton.setVisible(true);
						
					}
				});
			}
		});
	}
	
	
	
	

	public static void main(String[] args) {
		
		FourthWindow a = new FourthWindow();
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
