package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class FlightZone extends JFrame
{
	private JTable table;
	private JTextField t;
	Choice ch1;
	
	FlightZone()
	{
		getContentPane().setBackground(new java.awt.Color(77,157,227));
		getContentPane().setFont(new Font("궁서체", Font.BOLD, 18));
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(860,523);
		setLayout(null);
		setVisible(true);
		
		JLabel flightCode = new JLabel("항공기 번호");
		flightCode.setFont(new Font("궁서체",Font.BOLD,18));
		flightCode.setBounds(100,100,150,30);
		flightCode.setForeground(new Color(15,11,1));
		add(flightCode);
		
		JLabel flgihtDetails = new JLabel("한국공항 항공 정보");
		flgihtDetails.setFont(new Font("궁서체", Font.BOLD, 33));
		flgihtDetails.setForeground(new Color(15,11,1));
		flgihtDetails.setBounds(250,20,570,35);
		add(flgihtDetails);
		
		JButton bt = new JButton("상세정보 보기");
		bt.setFont(new Font("궁서체", Font.BOLD, 20));
		bt.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					
				} 
				catch (Exception ex) 
				{
					System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
				}
			}
			
		});
		bt.setBounds(560,100,220,30);
		add(bt);
		
		table = new JTable();
		table.setBackground(Color.white);
		table.setBounds(23,250,800,300);
		table.setFont(new Font("궁서체", Font.BOLD, 14));
		add(table);
		
		ch1 = new Choice();
		ch1.setBounds(290,103,200,35);
		ch1.setFont(new Font("궁서체", Font.BOLD, 18));
		try 
		{
			ConnectionClass obj = new ConnectionClass();
			String q = "Select distinct f_code from flight";
			ResultSet rest = obj.stm.executeQuery(q);
			while(rest.next())
			{
				ch1.add(rest.getString("f_code"));
				
			}
		} 
		catch (Exception ex) 
		{
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}
		
		add(ch1);
	}
	public static void main(String[] args) 
	{
		new FlightZone().setVisible(true);
	}
}
