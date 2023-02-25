package backend;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import frontend.Frontend_;

@SuppressWarnings("serial")
public class Backend extends Frontend_ {
	
	protected ImageIcon like, like2, nolike, nolike2, likeso, likeso2;
	private Thread hilo;
	private int centesimaS= 0;
	private int segundo= 0;
	private int minutos=0;
	private int hora=0;
	
	public Backend() {
	
		getTexto().setText(textoIn());
		accionaBotones();
		acciona2();
	}
	public void cerrar() {
		
		MouseListener acciona= new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub	
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				getCerrar().setBackground(new Color(30, 144, 255));
				getCerrar().setForeground(new Color(250, 235, 215));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				getCerrar().setBackground(new Color(250, 235,215));
				getCerrar().setForeground(new Color(30, 144,255));
			}};
		        getCerrar().addMouseListener(acciona);	
	}
    private String textoIn() {
		
	  String resul="";
	  String [] oraciones= new String[13];
		       oraciones[0]= "Mis proyectos estan en GitHub.";
		       oraciones[1]= "Programador Java.";
		       oraciones[2]= "Developer fullStack.";
		       oraciones[3]= "Uso de ArrayList en Base de Datos.";
		       oraciones[4]= "MySQL como administracion Database.";
		       oraciones[5]= "Hi, mi name is Magucho and I'am developer.";
		       oraciones[6]= "Videos cada 6 de cada mes.";
		       oraciones[7]= "Java y javascript no son lo mismo.";
		       oraciones[8]= "I like programming.";
		       oraciones[9]= "Java como lenguaje de programacion.";
		       oraciones[10]= "Desarrollo de aplicaciones.";
		       oraciones[11]= "Sigamonos en GitHub.";
		       oraciones[12]= "Amigos programadores.";
		int ma= (int)(Math.random()*12);
		        for(int i=0; i<oraciones.length; i++) {
			       resul= oraciones[ma].toString();
      }
		            return resul;
	} 
    private void accionaBotones() {
    
    	ActionListener pulsa= new ActionListener() {
		    @Override
    		public void actionPerformed(ActionEvent e) {
			    if(e.getSource().equals(getGo())) {
    			     comparar();
  			         detenerTiempo();
			    }if(e.getSource().equals(getParar())) {
    			       reinicia();
    			       detenerTiempo2();
    		      }}};
		        getGo().addActionListener(pulsa);
		        getParar().addActionListener(pulsa);
		
		KeyListener hola= new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
			}
			@Override
			public void keyPressed(KeyEvent e) {
			}
			@Override
			public void keyReleased(KeyEvent e) {
				if(e.getKeyChar() == KeyEvent.VK_ENTER) {
			        comparar();
				}}};
			 getGo().addKeyListener(hola);
    }
	private void reinicia() {
        
      try {
    	  getEnunciado().setText("");
    	  getEscribe().setText("");
    	  getTexto().setText(textoIn());
    	  imagenLike().setImage(null);
    	  imagenNoLike().setImage(null);
          }catch(Exception e) { 
        	 System.out.println("Todo bien ");
         }}
	private void comparar() {
     
    	if(getTexto().getText().equals(getEscribe().getText())) {
    		imagenLike();
    		etiquetagreen();
    	   }if(!getTexto().getText().equals(getEscribe().getText())) {
    		    imagenNoLike();
    		    etiquetaRed();
    	       }if(getEscribe().getText().equals("")) {
		             imagenull();
		             etiquetaYellow();
    	}}
	protected void detenerTiempo() {
		
		try {
		    if(hilo.isAlive()) {
			    hilo.interrupt();
		}
		      JOptionPane.showMessageDialog(null,"Your time:\n"+ actualizaE(),"Type Speed",JOptionPane.INFORMATION_MESSAGE);
		    }catch(Exception e) {
		          System.out.print("detener tiempo");
	}}
    protected void detenerTiempo2() {
    	
    	if(hilo.isAlive()) {
			hilo.interrupt();
		}
          centesimaS= 0;
          segundo= 0;
          minutos=0;
          hora=0;
          actualizaE();    	
	}
	protected void acciona2() {
		
		MouseListener raton= new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {		
			}
			@Override
			public void mousePressed(MouseEvent e) {	
			}
			@Override
			public void mouseReleased(MouseEvent e) {
		    }
			@Override
			public void mouseEntered(MouseEvent e) {		
				acciona();	 	
			}
			@Override
			public void mouseExited(MouseEvent e) {
			}};
			getEscribe().addMouseListener(raton);
	}
	protected void acciona() {
		
		hilo = new Thread() {	
			public void run() {
			   try {
				   for(;;) {
					    sleep(10);
					    centesimaS ++;
					  if(centesimaS ==100) {
					      segundo++;
					      centesimaS=0;  
					    }if(segundo ==60) {
						    minutos++;
						    segundo=0;
					      }if(minutos ==60) {
						        hora++;
						        minutos=0;
					         }if(hora==24) {
				                  hora=0;
					             }
					             actualizaE();
					             }
				   }catch(Exception e) {
					       System.out.println("algo pasa");
				   }}};
		 hilo.start();
	}
	private String actualizaE() {
		  
		String dar= (hora <=9? "0": "")+ hora+":"+ (minutos <=9? "0":"")+minutos+":"+(segundo <=9?"0":"")+ segundo+":"+( centesimaS<=9?"0":"")+ centesimaS;
		getCronometro().setText(dar);
		return dar;
	}
    private void etiquetaYellow() {
		
		getEnunciado().setText("Campo Vacío...");
		getEnunciado().setForeground(new Color(255,102,0));
	}
	private void etiquetaRed() {
		
		getEnunciado().setText("¡ERROR!");
		getEnunciado().setForeground(Color.RED);
	}
	private void etiquetagreen() {
	
		getEnunciado().setText("¡Correcto!");
		getEnunciado().setForeground(Color.green);
	}
    private ImageIcon imagenLike() {
		
		like= new ImageIcon(getClass().getResource("/imagenes/pulgarl.gif"));
		like2= new ImageIcon(like.getImage().getScaledInstance(getImagen().getWidth(), getImagen().getHeight(), Image.SCALE_FAST));
		getImagen().setIcon(like2);
		return like2;
	}
    private ImageIcon imagenull() {
    	
    	likeso= new ImageIcon("src/imagenes/escribanull.gif");
    	likeso2= new ImageIcon(likeso.getImage().getScaledInstance(getImagen().getWidth(), getImagen().getHeight(),Image.SCALE_REPLICATE));
    	getImagen().setIcon(likeso2);
    	return likeso2;
    }
	private ImageIcon imagenNoLike() {
		
		nolike= new ImageIcon(getClass().getResource("/imagenes/benson.gif"));
		nolike2= new ImageIcon(nolike.getImage().getScaledInstance(getImagen().getWidth(), getImagen().getHeight(), Image.SCALE_FAST));
		getImagen().setIcon(nolike2);
		return nolike2;
	}
}