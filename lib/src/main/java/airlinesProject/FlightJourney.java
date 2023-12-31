package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class FlightJourney extends JFrame implements ActionListener
{
	JFrame f;
	JLabel l1,l2,l3;
	JButton b1,b2;
	Choice ch1,ch2;
	
	FlightJourney() 
	{
		f = new JFrame("출발지와 도착지를 선택해주세요.");
		f.setBackground(Color.green);
		f.setLayout(null);
		
		l1 = new JLabel();
		l1.setBounds(0,0,500,270);
		l1.setLayout(null);
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("airlinesProject/icons/3.png"));
		Image img1 = img.getImage().getScaledInstance(700, 370, Image.SCALE_SMOOTH);
		ImageIcon ic1 = new ImageIcon(img1);
		l1.setIcon(ic1);
		
		l2 = new JLabel("출발지");
		l2.setVisible(true);
		l2.setBounds(40,60,150,30);
		l2.setForeground(Color.white);
		Font f1 = new Font("궁서체", Font.BOLD, 21);
		l2.setFont(f1);
		l1.add(l2);
		f.add(l1);
		
		l3 = new JLabel("도착지");
		l3.setVisible(true);
		l3.setBounds(40,120,150,30);
		l3.setForeground(Color.white);
		l3.setFont(f1);
		l1.add(l3);
		
		ch1 = new Choice();
		ch1.setBounds(240,60,190,25);
		
		try 
		{
			ConnectionClass obj = new ConnectionClass();
			String q1 = "Select distinct source from bookedflight";
			ResultSet rest = obj.stm.executeQuery(q1);
			while(rest.next())
			{
				ch1.add(rest.getString("source"));
			}

		} 
		catch (Exception ex) 
		{
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}

		
		ch2 = new Choice();
		ch2.setBounds(240,120,190,25);
		
		try 
		{
			ConnectionClass obj = new ConnectionClass();
			String q = "Select distinct destination from bookedflight";
			ResultSet rest = obj.stm.executeQuery(q);
			while(rest.next())
			{
				ch2.add(rest.getString("destination"));
			}
			rest.close();
		} 
		catch (Exception ex) 
		{
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}
		
		l1.add(ch1);
		l1.add(ch2);
		ch1.setFont(f1);
		ch2.setFont(f1);
		
		b1 = new JButton("검색");
		b1.setBounds(140,185,100,30);
		b1.addActionListener(this);
		l1.add(b1);
		
		b2 = new JButton("닫기");
		b2.setBounds(260,185,100,30);
		b2.addActionListener(this);
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		l1.add(b2);
		
		f.setSize(500,270);
		f.setLocation(600,300);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == b1)
		{
			f.setVisible(false);
			new FlightJourneyDetails(ch1.getSelectedItem(), ch2.getSelectedItem()).setVisible(true);
		}
		else if(e.getSource() == b2)
		{
			f.setVisible(false);
		}
	}
	
	public static void main(String[] args) 
	{
		new FlightJourney();
	}



}
