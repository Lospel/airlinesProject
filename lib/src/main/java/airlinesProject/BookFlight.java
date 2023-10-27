package airlinesProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Random;

public class BookFlight extends JFrame implements ActionListener
{
	JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13;
	JButton bt1, bt2;
	JPanel p1, p2, p3;
	JTextField tf1, tf2, tf3, tf4, tf5;
	Font f, f1;
	Choice ch1, ch2, ch3, ch4, ch5, ch6;
	
	BookFlight()
	{
		super("한국 항공의 항공권 예매");
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
			String q = "Select username from passenger";
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
		
		l1 = new JLabel("항공권 예매");
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
		
		bt1 = new JButton("예매하기");
		bt2 = new JButton("돌아가기");
		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		
		l1.setHorizontalAlignment(JLabel.CENTER);
		l1.setForeground(new java.awt.Color(0, 128, 255));
		
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
		
		l2.setForeground(new java.awt.Color(20, 102, 184));
		l3.setForeground(new java.awt.Color(20, 102, 184));
		l4.setForeground(new java.awt.Color(20, 102, 184));
		l5.setForeground(new java.awt.Color(20, 102, 184));
		l6.setForeground(new java.awt.Color(20, 102, 184));
		l7.setForeground(new java.awt.Color(20, 102, 184));
		l8.setForeground(new java.awt.Color(20, 102, 184));
		l9.setForeground(new java.awt.Color(20, 102, 184));
		l10.setForeground(new java.awt.Color(20, 102, 184));
		l11.setForeground(new java.awt.Color(20, 102, 184));
		l12.setForeground(new java.awt.Color(20, 102, 184));
		
		bt1.setBackground(new java.awt.Color(0, 128, 255));
		bt2.setBackground(Color.black);
		
		bt1.setForeground(Color.WHITE);
		bt2.setForeground(new java.awt.Color(0, 128, 255));
		
		p1 = new JPanel();
		p1.setLayout(new GridLayout(1, 1, 10, 10));
		p1.add(l1);
		
		p2 = new JPanel();
		p2.setLayout(new GridLayout(12, 2, 10, 10));
		
		p2.add(l2);
		p2.add(tf1);
		p2.add(l3);
		p2.add(ch1);
		p2.add(l4);
		p2.add(ch6);
		p2.add(l5);
		p2.add(ch3);
		p2.add(l6);
		p2.add(ch4);
		p2.add(l7);
		p2.add(ch5);
		p2.add(l8);
		p2.add(tf2);
		p2.add(l9);
		p2.add(tf3);
		p2.add(l10);
		p2.add(tf4);
		p2.add(l11);
		p2.add(ch2);
		p2.add(l12);
		p2.add(tf5);
		p2.add(bt1);
		p2.add(bt2);
		
		p3 = new JPanel();
		p3.setLayout(new GridLayout(1, 1, 10, 10));
		
		ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("airlinesProject/icons/f1.png"));
		Image img1 = img.getImage().getScaledInstance(620, 470, Image.SCALE_SMOOTH);
		ImageIcon ic1 = new ImageIcon(img1);
		l13 = new JLabel(ic1);
		p3.add(l13);
		
		setLayout(new BorderLayout(10, 10));
		add(p1, "North");
		add(p2, "Center");
		add(p3, "West");
		
		ch2.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseClicked(MouseEvent arg0) 
					{
						try 
						{
							ConnectionClass obj = new ConnectionClass();
							String username = ch2.getSelectedItem();
							String ql = "Select name from passenger where username = '"+username+"'";
							ResultSet rest1 = obj.stm.executeQuery(ql);
							while(rest1.next())
							{
								tf5.setText(rest1.getString("name"));
							}
							rest1.close();
						} 
						catch (Exception ex) 
						{
							System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
						}
					}
				});
		
		ch1.addMouseListener(new MouseAdapter()
				{
					@Override
					public void mouseClicked(MouseEvent arg0) 
					{
						ch6.removeAll();
						
						try 
						{
							ConnectionClass obj = new ConnectionClass();
							String source = ch1.getSelectedItem();
							String q1 = "Select distinct destination from flight where source='"+source+"'";
							ResultSet rest1 = obj.stm.executeQuery(q1);
							while(rest1.next())
							{
								ch6.add(rest1.getString("destination"));
							}
							rest1.close();
						} 
						catch (Exception ex) 
						{
							System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
						}
					}
				});
		
		ch6.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				ch3.removeAll();
				
				try 
				{
					ConnectionClass obj = new ConnectionClass();
					String source = ch1.getSelectedItem();
					String destination = ch6.getSelectedItem();
					String q1 = "Select distinct class_name from flight where source='"+source+"' and destination='"+destination+"'";
					ResultSet rest1 = obj.stm.executeQuery(q1);
					while(rest1.next())
					{
						ch3.add(rest1.getString("class_name"));
					}
					rest1.close();
				} 
				catch (Exception ex) 
				{
					System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
				}
			}
		});
		
		ch3.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				ch4.removeAll();
				
				try 
				{
					ConnectionClass obj = new ConnectionClass();
					String source = ch1.getSelectedItem();
					String destination = ch6.getSelectedItem();
					String class_name = ch3.getSelectedItem();
					String q1 = "Select distinct price from flight where source='"+source+"' and destination='"
							+destination+"' and class_name='"+class_name+"'";
					ResultSet rest1 = obj.stm.executeQuery(q1);
					while(rest1.next())
					{
						ch4.add(rest1.getString("price"));
					}
					rest1.close();
				} 
				catch (Exception ex) 
				{
					System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
				}
			}
		});
		
		ch4.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				ch5.removeAll();
				
				try 
				{
					ConnectionClass obj = new ConnectionClass();
					String source = ch1.getSelectedItem();
					String destination = ch6.getSelectedItem();
					String class_name = ch3.getSelectedItem();
					String price = ch4.getSelectedItem();
					String q1 = "Select distinct f_code from flight where source='"+source+"' and destination='"
							+destination+"' and class_name='"+class_name+"' and price='"+price+"'";
					ResultSet rest1 = obj.stm.executeQuery(q1);
					while(rest1.next())
					{
						ch5.add(rest1.getString("f_code"));
					}
					rest1.close();
				} 
				catch (Exception ex) 
				{
					System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
				}
			}
		});
		
		ch5.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent arg0) 
			{
				
				try 
				{
					ConnectionClass obj = new ConnectionClass();
					String source = ch1.getSelectedItem();
					String destination = ch6.getSelectedItem();
					String class_name = ch3.getSelectedItem();
					String price = ch4.getSelectedItem();
					String f_code = ch5.getSelectedItem();
					String q1 = "Select distinct f_name from flight where source='"+source+"' and destination='"
							+destination+"' and class_name='"+class_name+"' and price='"+price+"' and f_code='"+f_code+"'";
					ResultSet rest1 = obj.stm.executeQuery(q1);
					while(rest1.next())
					{
						tf2.setText(rest1.getString("f_name"));
					}
					rest1.close();
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
			String tid = tf1.getText();
			String source = ch1.getSelectedItem();
			String destination = ch6.getSelectedItem();
			String classname = ch3.getSelectedItem();
			String price = ch4.getSelectedItem();
			String fcode = ch5.getSelectedItem();
			String fname = tf2.getText();
			String jdate = tf3.getText();
			String jtime = tf4.getText();
			String username = ch2.getSelectedItem();
			String name = tf5.getText();
			String status = "Success";
			
			try 
			{
				ConnectionClass obj = new ConnectionClass();
				String q1 = "insert into bookedFlight values('"+tid+"','"+source+"','"+destination+"','"+classname+"','"
						+price+"','"+fcode+"','"+fname+"','"+jdate+"','"+jtime+"','"+username+"','"+name+"','"+status+"')";
				int aa = obj.stm.executeUpdate(q1);
				if (aa == 1)
				{
					JOptionPane.showMessageDialog(null, "당신의 항공기는 성공적으로 예매되었습니다.");
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
		if (e.getSource() == bt2) 
		{
			JOptionPane.showMessageDialog(null, "돌아가시겠습니까?");
			this.setVisible(false);
		}
	}
	
	public static void main(String[] args) 
	{
		new BookFlight().setVisible(true);
	}
}
