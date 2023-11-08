package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class ViewCanceledTicket extends JFrame
{
	JTable t;
	String x[] = {"티켓 ID", "출발지", "도착지", "등급", "가격", "항공기 번호", "항공기명", "여행 날짜", "여행 시간", "아이디", "이름", "이유"};
	String y[][] = new String[20][12];
	int i, j = 0;
	Font f;
	
	ViewCanceledTicket() 
	{
		super("모든 취소된 공항 상세정보");
		setSize(1300, 400);
		setLocation(0, 10);
		f = new Font("궁서체", Font.BOLD, 16);
		
		try 
		{
			ConnectionClass obj = new ConnectionClass();
			String q = "select * from cancelFlight";
			ResultSet rest = obj.stm.executeQuery(q);
			while(rest.next())
			{
				y[i][j++] = rest.getString("tid");
				y[i][j++] = rest.getString("source");
				y[i][j++] = rest.getString("destination");
				y[i][j++] = rest.getString("class_name");
				y[i][j++] = rest.getString("price");
				y[i][j++] = rest.getString("fcode");
				y[i][j++] = rest.getString("fname");
				y[i][j++] = rest.getString("journey_date");
				y[i][j++] = rest.getString("journey_time");
				y[i][j++] = rest.getString("username");
				y[i][j++] = rest.getString("name");
				y[i][j++] = rest.getString("reason");
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
		new ViewCanceledTicket().setVisible(true);
	}

}
