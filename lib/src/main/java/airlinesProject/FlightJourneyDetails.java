package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class FlightJourneyDetails extends JFrame
{
	JTable t;
	String x[] = {"티켓 ID", "출발지", "도착지", "등급", "가격", "항공기 번호", "항공기명", "여행 날짜", "여행 시간", "아이디", "이름", "상태"};
	String y[][] = new String[20][12];
	int i, j = 0;
	Font f;
	
	FlightJourneyDetails(String src, String dst) 
	{
		super("공항 이용 고객의 상세정보");
		setSize(1300,400);
		setLocation(0,10);
		f = new Font("궁서체", Font.BOLD, 17);
		
	}
}
