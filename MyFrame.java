import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class MyFrame extends JFrame {

	Calendar calender; //Importing calender
	SimpleDateFormat timeFormat;  //importing for date formate
	SimpleDateFormat dayFormat;
	SimpleDateFormat dateFormat;
	JLabel timeLabel;
	JLabel dayLabel;
	JLabel dateLabel;
	
	String time;
	String day;
	String date;
			//create constructor
		MyFrame(){
			
			this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// close on clicking cross button
			
			this.setTitle("MY CLOCK");
			this.setLayout(new FlowLayout());//set in line 
			this.setSize(370, 200);// width and hieght
			this.setResizable(true);
			
/* For Time format*/	timeFormat=new SimpleDateFormat("hh : mm : ss  a"); //(a-> AM/PM)
/* For Day format*/     dayFormat=new SimpleDateFormat("EEEE");
/* For Date format*/    dateFormat=new SimpleDateFormat("dd/MM/yyyy");
			
			
			timeLabel=new JLabel(); //
			timeLabel.setFont(new Font("Copperplate",Font.BOLD, 50));
			timeLabel.setForeground(Color.red);
			timeLabel.setBackground(Color.black);
			timeLabel.setOpaque(true);
			
			// FOR DAY LABEL
			dayLabel=new JLabel();
			dayLabel.setFont(new Font("Lucida Handwriting",Font.BOLD, 30));
			dayLabel.setForeground(Color.blue);
			//dayLabel.setBackground(Color.white);
			dayLabel.setOpaque(true);
			
			//FOR DATE LABEL
			dateLabel=new JLabel();
			System.out.println("\n");
			dateLabel.setFont(new Font("Lucida Handwriting",Font.BOLD, 30));
			
			dateLabel.setOpaque(true);
			
			
			
			
			this.add(timeLabel);
			this.add(dayLabel);
			this.add(dateLabel);
			this.setVisible(true);
			//System.out.println("----------------------------------------");
			
			SetTime();
			
			
			
		}
			private void SetTime() {
				while(true) {
				time=timeFormat.format(Calendar.getInstance().getTime());
				timeLabel.setText(time);//print the time in string
				
				day=dayFormat.format(Calendar.getInstance().getTime());
				dayLabel.setText(day);
				
				date=dateFormat.format(Calendar.getInstance().getTime());
				dateLabel.setText(date);
				
				
				
				try {
					Thread.sleep(1000);  //change per mili second 
				}
				catch(InterruptedException  e){
					e.printStackTrace();
					
				}
				
				
			}

}}

 class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame();
}}