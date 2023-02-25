package frontend;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class presenta extends JPanel {
	
	private int numero= 0;
	private JFrame frame=null;
	
	public presenta() {
		
		frame= new JFrame(); 
		logo();
		frame.setLayout(null);
		frame.setUndecorated(true);
		frame.setBounds(80,60,1200,500);
		frame.setVisible(true);
		frame.setResizable(false);
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(this);
		diseño();
	}
	private void logo() {
		
		Image imagen= new ImageIcon(getClass().getResource("/imagenes/logo.png")).getImage();
	    frame.setIconImage(imagen);
	}
	private void diseño() {
		
		this.setLayout(null);
		this.setBounds(0,0,1200,500);
		this.setVisible(true);
		this.setBackground(new Color(49,178,240));
	}
	public void paint(Graphics g) {
		
		super.paint(g);
		BufferedImage imagen= imagen("src/imagenes/circulo2.png");
		
		AffineTransform at= AffineTransform.getTranslateInstance(0, -100);
		at.rotate(Math.toRadians(numero++),imagen.getWidth()/2,imagen.getHeight()/2);
		at.scale(1, 1);
		
		Graphics2D G2D= (Graphics2D) g;
		G2D.drawImage(imagen, at, this);
		repaint();
	}
	private BufferedImage imagen(String imagen) {
		
		BufferedImage ima= null;
		try {
			      ima= ImageIO.read(new File(imagen));
		    }catch(Exception ex) {
			      System.out.println("No se puede girar");
		    }
		return ima;
	}
}
