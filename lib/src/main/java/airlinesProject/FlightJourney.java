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
		Image img1 = img.getImage().getScaledInstance(700, 370, Image.SCALE_DEFAULT);
		ImageIcon ic1 = new ImageIcon(img1);
		l1.setIcon(ic1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		new FlightJourney().setVisible(true);
	}



}
