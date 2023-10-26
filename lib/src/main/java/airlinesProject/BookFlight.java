package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class BookFlight extends JFrame implements ActionListener
{
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12;
	JButton bt1, bt2;
	JPanel p1, p2, p3;
	JTextField tf1, tf2, tf3, tf4, tf5;
	Font f, f1;
	Choice ch1, ch2, ch3, ch4, ch5, ch6;
	
	BookFlight()
	{
		super("한국 항공의 항공권 예메");
		setLocation(50, 20);
		setSize(1100, 650);
		
		f = new Font("궁서체", Font.BOLD, 25);
		f1 = new Font("궁서체", Font.BOLD, 18);
		
		ch1 = new Choice();
		ch2 = new Choice();
		ch3 = new Choice();
		ch4 = new Choice();
		ch5 = new Choice();
		ch6 = new Choice();
		
		try 
		{
			ConnectionClass obj = new ConnectionClass();
			String q = "Select distinct Source from flight";
			ResultSet rest = obj.stm.executeQuery(q);
			while(rest.next())
			{
				ch1.add(rest.getString("source"));
			}
			rest.close();
		}
		catch (Exception ex) 
		{
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}
		
		try 
		{
			ConnectionClass obj = new ConnectionClass();
			String q = "Select username from flight";
			ResultSet rest = obj.stm.executeQuery(q);
			while(rest.next())
			{
				ch2.add(rest.getString("username"));
			}
			rest.close();
		}
		catch (Exception ex) 
		{
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}
		
		l1 = new JLabel("한국 항공의 항공권 예매");
		l2 = new JLabel("티켓 번호");
		l3 = new JLabel("출발지");
		l4 = new JLabel("목적지");
		l5 = new JLabel("등급");
		l6 = new JLabel("가격");
		l7 = new JLabel("항공기 번호");
		l8 = new JLabel("항공기 이름");
		l9 = new JLabel("출발 날짜");
		l10 = new JLabel("출발 시간");
		l11 = new JLabel("아이디");
		l12 = new JLabel("이름");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		tf5 = new JTextField();
		
		tf1.setEditable(false);
		tf2.setEditable(false);
		tf5.setEditable(false);
		
		Random r = new Random();
		tf1.setText("" + Math.abs(r.nextInt() % 100000));
		tf1.setForeground(Color.red);
		
		bt1 = new JButton("항공권 예매");
		bt2 = new JButton("돌아가기");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setForeground(new java.awt.Color(232, 2, 125));
		
		l1.setFont(f);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		l10.setFont(f1);
		l11.setFont(f1);
		l12.setFont(f1);
		
		ch1.setFont(f1);
		ch2.setFont(f1);
		ch3.setFont(f1);
		ch4.setFont(f1);
		ch5.setFont(f1);
		ch6.setFont(f1);
		
		tf1.setFont(f1);
		tf2.setFont(f1);
		tf3.setFont(f1);
		tf4.setFont(f1);
		tf5.setFont(f1);
		
		bt1.setFont(f1);
		bt2.setFont(f1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		new BookFlight().setVisible(true);
	}
}
