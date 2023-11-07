package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class FlightZone extends JFrame
{
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
		
		
	}
	public static void main(String[] args) 
	{
		new FlightZone().setVisible(true);
	}
}
