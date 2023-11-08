package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class CancelFlight extends JFrame implements ActionListener
{
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
	JButton bt1, bt2;
	JPanel p1, p2, p3;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6,tf7,tf8,tf9,tf10,tf11;
	Font f, f1;
	Choice ch1;
	
	CancelFlight()
	{
		super("한국항공의 공항 취소하기");
		setLocation(50,10);
		setSize(1100,650);
		
		f = new Font("궁서체",Font.BOLD,25);
		f1 = new Font("궁서체",Font.BOLD,18);
		
		ch1 = new Choice();
		
		try 
		{
			ConnectionClass obj = new ConnectionClass();
			String q = "Select distinct tid From bookedflight where status='Success'";
			ResultSet rest = obj.stm.executeQuery(q);
			while(rest.next())
			{
				ch1.add(rest.getString("tid"));
			}
			rest.close();
		} 
		catch (Exception ex) 
		{
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}
		
		l1 = new JLabel("티켓 취소하기");
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
		l13 = new JLabel("이유");
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		tf5 = new JTextField();
		tf6 = new JTextField();
		tf7 = new JTextField();
		tf8 = new JTextField();
		tf9 = new JTextField();
		tf10 = new JTextField();
		tf11 = new JTextField();
		
		tf1.setEditable(false);
		tf2.setEditable(false);
		tf3.setEditable(false);
		tf4.setEditable(false);
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);
		tf8.setEditable(false);
		tf9.setEditable(false);
		tf10.setEditable(false);
		
		bt1 = new JButton("취소하기");
		bt2 = new JButton("돌아가기");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setForeground(new java.awt.Color(176,4,21));
		
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
		l13.setFont(f1);
		
		ch1.setFont(f1);
		
		tf1.setFont(f1);
		tf2.setFont(f1);
		tf3.setFont(f1);
		tf4.setFont(f1);
		tf5.setFont(f1);
		tf6.setFont(f1);
		tf7.setFont(f1);
		tf8.setFont(f1);
		tf9.setFont(f1);
		tf10.setFont(f1);
		tf11.setFont(f1);
		
		bt1.setFont(f1);
		bt2.setFont(f1);
		
		l2.setForeground(new java.awt.Color(20,2,117));
		l3.setForeground(new java.awt.Color(20,2,117));
		l4.setForeground(new java.awt.Color(20,2,117));
		l5.setForeground(new java.awt.Color(20,2,117));
		l6.setForeground(new java.awt.Color(20,2,117));
		l7.setForeground(new java.awt.Color(20,2,117));
		l8.setForeground(new java.awt.Color(20,2,117));
		l9.setForeground(new java.awt.Color(20,2,117));
		l10.setForeground(new java.awt.Color(20,2,117));
		l11.setForeground(new java.awt.Color(20,2,117));
		l12.setForeground(new java.awt.Color(20,2,117));
		
		bt1.setBackground(new java.awt.Color(176,4,21));
		bt2.setBackground(Color.black);
		
		bt1.setForeground(Color.WHITE);
		bt2.setForeground(new java.awt.Color(230,225,225));
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		new CancelFlight().setVisible(true);
	}

}
