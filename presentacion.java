package type_speed_program;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class presentacion extends JFrame{
	
	public presentacion() {
		
		cuerpo();
		logo();
	}

	public void  cuerpo() {
		
		JPanel pantalla= new JPanel();
		pantalla.setLayout(null);
		pantalla.setBounds(0,0,1200,500);
		pantalla.setBackground(Color.pink);
		this.getContentPane().add(pantalla);	
	}
	
	public void logo() {
		Image logo1= new ImageIcon(getClass().getResource("imagenp/speed.jpeg")).getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
		this.setIconImage(logo1);
	}
}
