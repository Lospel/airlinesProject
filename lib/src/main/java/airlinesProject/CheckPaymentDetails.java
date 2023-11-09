package airlinesProject;

import java.awt.*;
import javax.swing.*;

import org.checkerframework.checker.initialization.qual.Initialized;

import net.proteanit.sql.DbUtils;

import java.awt.event.*;
import java.sql.*;

public class CheckPaymentDetails extends JFrame
{
	JTextField textField;
	JTable table;
	JLabel Sector, FlightCode, CapaCity, ClassCode, ClassName, Label;
	Font f;
	
	CheckPaymentDetails() 
	{
		initialize();
	}
	
	private void initialize()
	{
		f = new Font("궁서체", Font.BOLD, 14);
		
		setTitle("금액 확인하기");
		getContentPane().setBackground(Color.white);
		setSize(860, 486);
		setLayout(null);
		
		JLabel Fcode = new JLabel("아이디");
		Fcode.setFont(new Font("궁서체",Font.BOLD,16));
		Fcode.setBounds(190,160,150,26);
		add(Fcode);
		
		textField = new JTextField();
		textField.setBounds(300,160,150,26);
		textField.setFont(f);
		add(textField);
		
		table = new JTable();
		table.setBounds(93,297,766,87);
		add(table);
		
		JButton Show = new JButton("보기");
		Show.setFont(f);
		Show.setBackground(Color.black);
		Show.setForeground(Color.white);
		Show.setBounds(500,160,150,26);
		add(Show);
		
		Sector = new JLabel("상세 비용");
		Sector.setForeground(Color.black);
		Sector.setFont(new Font("궁서체", Font.BOLD, 33));
		Sector.setBounds(400, 17, 800, 39);
		add(Sector);
		
		FlightCode = new JLabel("티켓 ID");
		FlightCode.setFont(f);
		FlightCode.setBounds(117,262,108,26);
		add(FlightCode);
		
		CapaCity = new JLabel("가격");
		CapaCity.setFont(f);
		CapaCity.setBounds(237,268,38,14);
		add(CapaCity);
		
		ClassCode = new JLabel("여행 날짜");
		ClassCode.setFont(f);
		ClassCode.setBounds(362,264,101,24);
		add(ClassCode);
		
		ClassName = new JLabel("여행 시간");
		ClassName.setFont(f);
		ClassName.setBounds(485,269,114,14);
		add(ClassName);
		
		JLabel Cardno = new JLabel("아이디");
		Cardno.setFont(f);
		Cardno.setBounds(620,268,101,19);
		add(Cardno);
		
		JLabel Phoneno = new JLabel("상태");
		Phoneno.setFont(f);
		Phoneno.setBounds(752,264,86,24);
		add(Phoneno);
		
		Label = new JLabel("");
		ImageIcon ic = new ImageIcon(ClassLoader.getSystemResource("airlinesProject/icons/Home2.png"));
		Image img = ic.getImage().getScaledInstance(1550, 800, Image.SCALE_SMOOTH);
		ImageIcon ic1 = new ImageIcon(img);
		Label.setIcon(ic1);
		Label.setBounds(0,0,960,590);
		add(Label);
		setVisible(true);
		
		Show.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				try 
				{
					String usn = textField.getText();
					ConnectionClass obj = new ConnectionClass();
					String q = "select tid, price, journey_date, journey_time, username, status from bookedFlight where username='"
							+usn+"' and status='Success'";
					ResultSet rest = obj.stm.executeQuery(q);
					table.setModel(DbUtils.resultSetToTableModel(rest));
					table.setFont(f);
				}
				catch (Exception ex) 
				{
					System.out.printf("Exception [Err_Msg]: {%s}", ex.getMessage());
				}
			}
		});
		setSize(960,590);
		setLocation(40,20);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new CheckPaymentDetails();
	}

}
