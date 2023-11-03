package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class ViewPassenger extends JFrame 
{
	JTable t;
	String x[] = {"아이디", "이름", "나이", "생년월일", "주소", "연락처", "이메일", "국적", "성별", "여권"};
	String y[][] = new String[20][10];
	int i = 0, j = 0;
	Font f;
	
	ViewPassenger()
	{
		super("모든 승객의 상세정보");
		setSize(1600, 400);
		setLocation(200, 300);
		f = new Font("궁서체", Font.BOLD, 16);
		
		try 
		{
			ConnectionClass obj = new ConnectionClass();
			String q = "select * from passenger";
			ResultSet rest = obj.stm.executeQuery(q);
			while(rest.next())
			{
				y[i][j++] = rest.getString("username");
				y[i][j++] = rest.getString("name");
				y[i][j++] = rest.getString("age");
				y[i][j++] = rest.getString("dob");
				y[i][j++] = rest.getString("address");
				y[i][j++] = rest.getString("phone");
				y[i][j++] = rest.getString("Email");
				y[i][j++] = rest.getString("nationality");
				y[i][j++] = rest.getString("gender");
				y[i][j++] = rest.getString("passport");
				i++;
				j = 0;
			}
			t = new JTable(y, x);
		} 
		catch (Exception ex) 
		{
			System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
		}
		t.setFont(f);
		t.setBackground(Color.black);
		t.setForeground(Color.white);
		JScrollPane js = new JScrollPane(t);
		add(js);
	}
	public static void main(String[] args) 
	{
		new ViewPassenger().setVisible(true);
	}
}
