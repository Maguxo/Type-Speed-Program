package type_speed_program;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class principal extends presentacion{

	public static void main(String args[]) {
		
		principal  p= new principal();
		
		p.setLayout(null);
		p.setSize(1200,500);
		p.setUndecorated(true);
		p.setVisible(true);
		p.setLocation(100,50);
		p.setTitle("Type speed prgram");
		p.setResizable(false);
		p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
