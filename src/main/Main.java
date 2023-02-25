package main;

import java.awt.Rectangle;
import java.util.Timer;
import java.util.TimerTask;
import backend.Backend;
import frontend.presenta;

@SuppressWarnings("serial")
public class Main  extends Backend{

	public static void main(String args []) {
		
	       presenta pre= new presenta();
	       Timer tiempo= new Timer();
	       TimerTask t= new TimerTask() {
			
	    	 public void run() {
				   
				    Main frame = new Main();	
			 		frame.setLayout(null);
					frame.setBounds(new Rectangle(80, 60, 1200, 500));
					frame.setVisible(true);
					frame.setResizable(false);
					//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
					frame.cerrar();
				}};
		     tiempo.schedule(t, 6000);	   		
	}	
}
