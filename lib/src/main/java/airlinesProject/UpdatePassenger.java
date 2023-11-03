package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class UpdatePassenger extends JFrame implements ActionListener
{
	Font f, f1;
	Choice ch;
	JLabel l1, l2, l3, l4, l5 ,l6 ,l7, l8, l9, l10, l11, l12;
	JButton bt1, bt2;
	JTextField tf1, tf2, tf3, tf4, tf5, tf6, tf7, tf8, tf9;
	JPanel p1, p2, p3;
	
	UpdatePassenger()
	{
		super("승객 정보 수정하기");
		setLocation(450, 10);
		setSize(740, 600);
		
		f = new Font("궁서체", Font.BOLD, 25);
		f1 = new Font("궁서체", Font.BOLD, 18);
		
		ch = new Choice();
		
		try 
		{
			ConnectionClass ojb = new ConnectionClass();
			String q = "Select username From passenger";
			ResultSet rest = ojb.stm.executeQuery(q);
			while(rest.next())
			{
				ch.add(rest.getString("username"));
			}
		} 
		catch (Exception ex) 
		{
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}
		
		l1 = new JLabel("승객 상세정보 수정하기");
		l2 = new JLabel("아이디");
		l3 = new JLabel("이름");
		l4 = new JLabel("나이");
		l5 = new JLabel("생년월일");
		l6 = new JLabel("주소");
		l7 = new JLabel("연락처");
		l8 = new JLabel("이메일");
		l9 = new JLabel("국적");
		l10 = new JLabel("성별");
		l11 = new JLabel("여권");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		new UpdatePassenger().setVisible(true);
	}
}
