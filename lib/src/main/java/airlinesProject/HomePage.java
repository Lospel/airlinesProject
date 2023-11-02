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
		setLocation(0,0);
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
		JMenuItem ment6 = new JMenuItem("여행 일정");
		JMenuItem ment7 = new JMenuItem("탑승 번호");
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
		
		setJMenuBar(m1);
		add(l1);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		
	}
	
	public static void main(String[] args) 
	{
		new HomePage().setVisible(true);
	}
}
