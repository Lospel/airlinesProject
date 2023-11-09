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
	
	CheckPaymentDetails() 
	{
		initialize();
	}
	
	private void initialize()
	{
		setTitle("비용 상세보기");
		getContentPane().setBackground(Color.white);
		setSize(860, 486);
		setLayout(null);
		
		JLabel Fcode = new JLabel("아이디");
		Fcode.setFont(new Font("궁서체",Font.BOLD,16));
		Fcode.setBounds(190,160,150,26);
		add(Fcode);
	}
	
	public static void main(String[] args) 
	{
		new CheckPaymentDetails();
	}

}
