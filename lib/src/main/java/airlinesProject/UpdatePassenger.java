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
		
		l1 = new JLabel("승객 상세정보");
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
		
		tf1 = new JTextField();
		tf2 = new JTextField();
		tf3 = new JTextField();
		tf4 = new JTextField();
		tf5 = new JTextField();
		tf6 = new JTextField();
		tf7 = new JTextField();
		tf8 = new JTextField();
		tf9 = new JTextField();
		
		bt1 = new JButton("수정하기");
		bt2 = new JButton("나가기");
		
		l1.setHorizontalAlignment(JLabel.CENTER);
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
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
		ch.setFont(f1);
		
		tf1.setFont(f1);
		tf2.setFont(f1);
		tf3.setFont(f1);
		tf4.setFont(f1);
		tf5.setFont(f1);
		tf6.setFont(f1);
		tf7.setFont(f1);
		tf8.setFont(f1);
		tf9.setFont(f1);
		
		bt1.setFont(f1);
		bt2.setFont(f1);
		
		bt1.setBackground(Color.blue);
		bt2.setBackground(Color.red);
		
		bt1.setForeground(Color.white);
		bt2.setForeground(Color.white);
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1, 10, 10));
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(11, 2, 10, 10));
		p2.add(l2);
		p2.add(ch);
		p2.add(l3);
		p2.add(tf1);
		p2.add(l4);
		p2.add(tf2);
		p2.add(l5);
		p2.add(tf3);
		p2.add(l6);
		p2.add(tf4);
		p2.add(l7);
		p2.add(tf5);
		p2.add(l8);
		p2.add(tf6);
		p2.add(l9);
		p2.add(tf7);
		p2.add(l10);
		p2.add(tf8);
		p2.add(l11);
		p2.add(tf9);
		p2.add(bt1);
		p2.add(bt2);
		
		p3 = new JPanel();
		p3.setLayout(new GridLayout(1, 1, 10, 10));
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("airlinesProject/icons/update.png"));
		Image img1 = img.getImage().getScaledInstance(300, 500, Image.SCALE_SMOOTH);
		ImageIcon ic1 = new ImageIcon(img1);
		l12 = new JLabel(ic1);
		
		p3.add(l12);
		
		setLayout(new BorderLayout(10, 10));
		add(p1, "North");
		add(p2, "Center");
		add(p3, "West");
		
		ch.addMouseListener(new MouseAdapter() 
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try 
				{
					ConnectionClass obj2 = new ConnectionClass();
					String username = ch.getSelectedItem();
				} 
				catch (Exception e) 
				{
					// TODO: handle exception
				}
			}
		});
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
