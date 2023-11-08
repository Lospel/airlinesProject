package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class HomePage extends JFrame implements ActionListener
{
	JLabel l1, l2;
	Font f, f1, f2;
	
	HomePage()
	{
		super("한국 항공 홈페이지");
		setLocation(150, 100);
		setSize(1550, 800);
		
		f = new Font("궁서체", Font.BOLD, 20);
		f1 = new Font("Serif", Font.BOLD, 18);
		f2 = new Font("SanSerif", Font.BOLD, 35);
		
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("airlinesProject/icons/Home1.png"));
		Image img = ic.getImage().getScaledInstance(1550, 800, Image.SCALE_SMOOTH);
		ImageIcon ic1 = new ImageIcon(img);
		l1 = new JLabel(ic1);
		
		JMenuBar m1 = new JMenuBar();
		JMenu men1 = new JMenu("승객 정보");
		JMenuItem ment1 = new JMenuItem("승객 정보 추가하기");
		JMenuItem ment2 = new JMenuItem("승객 정보 보기");
		men1.add(ment1);
		men1.add(ment2);
		m1.add(men1);
		
		JMenu men2 = new JMenu("승객 관리");
		JMenuItem ment3 = new JMenuItem("승객 정보 수정하기");
		men2.add(ment3);
		m1.add(men2);
		
		JMenu men3 = new JMenu("이용중인 항공");
		JMenuItem ment4 = new JMenuItem("항공 예약하기");
		JMenuItem ment5 = new JMenuItem("예약된 항공 확인하기");
		men3.add(ment4);
		men3.add(ment5);
		m1.add(men3);
		
		JMenu men4 = new JMenu("항공 상세정보");
		JMenuItem ment6 = new JMenuItem("여행일정");
		JMenuItem ment7 = new JMenuItem("탑승번호");
		men4.add(ment6);
		men4.add(ment7);
		m1.add(men4);
		
		JMenu men5 = new JMenu("취소");
		JMenuItem ment8 = new JMenuItem("티켓 취소하기");
		JMenuItem ment9 = new JMenuItem("취소된 티켓 확인하기");
		men5.add(ment8);
		men5.add(ment9);
		m1.add(men5);
		
		JMenu men6 = new JMenu("결제서");
		JMenuItem ment10 = new JMenuItem("금액 확인하기");
		men6.add(ment10);
		m1.add(men6);
		
		JMenu men7 = new JMenu("로그아웃");
		JMenuItem ment11 = new JMenuItem("나가기");
		men7.add(ment11);
		m1.add(men7);
		
		men1.setFont(f);
		men2.setFont(f);
		men3.setFont(f);
		men4.setFont(f);
		men5.setFont(f);
		men6.setFont(f);
		men7.setFont(f);
		
		ment1.setFont(f1);
		ment2.setFont(f1);
		ment3.setFont(f1);
		ment4.setFont(f1);
		ment5.setFont(f1);
		ment6.setFont(f1);
		ment7.setFont(f1);
		ment8.setFont(f1);
		ment9.setFont(f1);
		ment10.setFont(f1);
		ment11.setFont(f1);
		
		m1.setBackground(new java.awt.Color(4, 1, 54));
		
		men1.setForeground(Color.GRAY);
		men2.setForeground(Color.GRAY);
		men3.setForeground(Color.GRAY);
		men4.setForeground(Color.GRAY);
		men5.setForeground(Color.GRAY);
		men6.setForeground(Color.GRAY);
		men7.setForeground(Color.RED);
		
		ment1.setBackground(Color.BLACK);
		ment2.setBackground(Color.BLACK);
		ment3.setBackground(Color.BLACK);
		ment4.setBackground(Color.BLACK);
		ment5.setBackground(Color.BLACK);
		ment6.setBackground(Color.BLACK);
		ment7.setBackground(Color.BLACK);
		ment8.setBackground(Color.BLACK);
		ment9.setBackground(Color.BLACK);
		ment10.setBackground(Color.BLACK);
		ment11.setBackground(Color.BLACK);
		
		ment1.setForeground(Color.YELLOW);
		ment2.setForeground(Color.YELLOW);
		ment3.setForeground(Color.YELLOW);
		ment4.setForeground(Color.YELLOW);
		ment5.setForeground(Color.YELLOW);
		ment6.setForeground(Color.YELLOW);
		ment7.setForeground(Color.YELLOW);
		ment8.setForeground(Color.YELLOW);
		ment9.setForeground(Color.YELLOW);
		ment10.setForeground(Color.YELLOW);
		ment11.setForeground(Color.RED);
		
		ment1.addActionListener(this);
		ment2.addActionListener(this);
		ment3.addActionListener(this);
		ment4.addActionListener(this);
		ment5.addActionListener(this);
		ment6.addActionListener(this);
		ment7.addActionListener(this);
		ment8.addActionListener(this);
		ment9.addActionListener(this);
		ment10.addActionListener(this);
		ment11.addActionListener(this);
		
		setJMenuBar(m1);
		add(l1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String cmd = e.getActionCommand();
		if(cmd.equals("승객 정보 추가하기"))
		{
			new AddPassengerDetails();
		}
		else if(cmd.equals("승객 정보 보기")) 
		{
			new ViewPassenger().setVisible(true);
		}
		else if(cmd.equals("승객 정보 수정하기")) 
		{
			new UpdatePassenger().setVisible(true);
		}
		else if(cmd.equals("항공 예약하기")) 
		{
			new BookFlight().setVisible(true);
		}
		else if(cmd.equals("예약된 항공 확인하기")) 
		{
			new ViewBookedFlight().setVisible(true);
		}
		else if(cmd.equals("여행일정")) 
		{
			new FlightJourney();
		}
		else if(cmd.equals("탑승번호")) 
		{
			new FlightZone().setVisible(true);
		}
		else if(cmd.equals("티켓 취소하기")) 
		{
			new CancelFlight().setVisible(true);
		}
		else if(cmd.equals("취소된 티켓 확인하기")) 
		{
			new ViewCanceledTicket().setVisible(true);
		}
//		else if(cmd.equals("금액 확인하기")) 
//		{
//			new CheckPaymentDetails().setVisible(true);
//		}
		else if(cmd.equals("나가기")) 
		{
			System.exit(0);
		}
	}
	
	public static void main(String[] args) 
	{
		new HomePage().setVisible(true);
	}
}
