package airlinesProject;

import java.awt.*;
import javax.swing.*;

import org.checkerframework.checker.initialization.qual.Initialized;

import java.awt.event.*;
import java.sql.*;

public class CheckPaymentDetails extends JFrame
{
	JTextField textField;
	JTable table;
	JLabel Sector, FlightCode, CapaCity, ClassCode, ClassName, Label;
	Font f;
	
	CheckPaymentDetails() 
	{
		initialize();
	}
	
	private void initialize()
	{
		f = new Font("궁서체", Font.BOLD, 14);
		
		setTitle("상세비용 보기");
		getContentPane().setBackground(Color.white);
		setSize(860, 486);
		setLayout(null);
		
		JLabel Fcode = new JLabel("아이디");
		Fcode.setFont(new Font("궁서체",Font.BOLD,16));
		Fcode.setBounds(190,160,150,26);
		add(Fcode);
		
		textField = new JTextField();
		textField.setBounds(300,160,150,26);
		textField.setFont(f);
		add(textField);
		
		table = new JTable();
		table.setBounds(93,297,766,87);
		add(table);
		
		JButton Show = new JButton("보기");
		Show.setFont(f);
		Show.setBackground(Color.black);
		Show.setForeground(Color.white);
		Show.setBounds(500,160,150,26);
		add(Show);
		
		Sector = new JLabel("상세비용 확인하기");
		Sector.setForeground(Color.blue);
		Sector.setFont(new Font("궁서체", Font.BOLD, 33));
		Sector.setBounds(291, 17, 800, 39);
		add(Sector);
		
		FlightCode = new JLabel("티켓 ID");
		FlightCode.setFont(f);
		FlightCode.setBounds(117,262,108,26);
		add(FlightCode);
		
		CapaCity = new JLabel("가격");
		CapaCity.setFont(f);
		CapaCity.setBounds(237,268,38,14);
		add(CapaCity);
		
		ClassCode = new JLabel("여행 날짜");
		ClassCode.setFont(f);
		ClassCode.setBounds(362,264,101,24);
		add(ClassCode);
		
		ClassName = new JLabel("여행 시간");
		
	}
	
	public static void main(String[] args) 
	{
		new CheckPaymentDetails();
	}

}
