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
		l9 = new JLabel("여행 날짜");
		l10 = new JLabel("여행 시간");
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
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1, 10, 10));
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(13, 2, 10, 10));
		
		p2.add(l2);
		p2.add(ch1);
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
		p2.add(l12);
		p2.add(tf10);
		p2.add(l13);
		p2.add(tf11);
		p2.add(bt1);
		p2.add(bt2);
		
		p3 = new JPanel();
		p3.setLayout(new GridLayout(1, 1, 10, 10));
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("airlinesProject/icons/f2.png"));
		Image img1 = img.getImage().getScaledInstance(600, 350, Image.SCALE_SMOOTH);
		ImageIcon ic1 = new ImageIcon(img1);
		l12 = new JLabel(ic1);
		p3.add(l12);
		
		setLayout(new BorderLayout(10, 10));
		add(p1, "North");
		add(p2, "Center");
		add(p3, "West");
		
		ch1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				try 
				{
					ConnectionClass obj2 = new ConnectionClass();
					String tid = ch1.getSelectedItem();
					String q1 = "Select * From bookedflight where tid='"+tid+"'";
					ResultSet rest1 = obj2.stm.executeQuery(q1);
					while(rest1.next())
					{
						tf1.setText(rest1.getString("source"));
						tf2.setText(rest1.getString("destination"));
						tf3.setText(rest1.getString("class_name"));
						tf4.setText(rest1.getString("price"));
						tf5.setText(rest1.getString("fcode"));
						tf6.setText(rest1.getString("fname"));
						tf7.setText(rest1.getString("journey_date"));
						tf8.setText(rest1.getString("journey_time"));
						tf9.setText(rest1.getString("username"));
						tf10.setText(rest1.getString("name"));
					}
//					rest1.close();
				} 
				catch (Exception ex) 
				{
					System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
				}
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(e.getSource() == bt1)
		{
			String tid = ch1.getSelectedItem();
			String source = tf1.getText();
			String destination = tf2.getText();
			String classname = tf3.getText();
			String price = tf4.getText();
			String fcode = tf5.getText();
			String fname = tf6.getText();
			String jdate = tf7.getText();
			String jtime = tf8.getText();
			String username = tf9.getText();
			String name = tf10.getText();
			String reason = tf11.getText();
			String status = "Cancel";
			
			try 
			{
				ConnectionClass obj3 = new ConnectionClass();
				String q2 = "insert into cancelFlight values('"+tid+"','"+source+"','"+destination+"','"+classname+"','"
						+price+"','"+fcode+"','"+fname+"','"+jdate+"','"+jtime+"','"+username+"','"+name+"','"+reason+"')";
				String q3 = "Update bookedflight set status='"+status+"' where tid='"+tid+"'";
				int aa = obj3.stm.executeUpdate(q2);
				if (aa == 1)
				{
					JOptionPane.showMessageDialog(null, "당신의 항공기는 취소되었습니다.");
					obj3.stm.executeUpdate(q3);
					this.setVisible(false);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "모든 칸을 채워주세요.");
				}
			} 
			catch (Exception ex) 
			{
				System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
			}
		}
		else if(e.getSource() == bt2)
		{
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) 
	{
		new CancelFlight().setVisible(true);
	}

}
