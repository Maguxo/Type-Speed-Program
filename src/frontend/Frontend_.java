package frontend;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class Frontend_ extends JFrame {

	private JPanel contentPane;
	private JTextField escribe;
	private JLabel cerrar; 
	private JButton go;
	private JButton parar;
	private JLabel texto, enunciado;
	private JLabel imagen;
	private JLabel decora;
	private JLabel cronometro;
    
	public Frontend_() {

		setUndecorated(true);
		contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBackground(Color.PINK);
		this.setContentPane(contentPane);
		
		cerrar = new JLabel("X");
		cerrar.setOpaque(true);
		cerrar.setForeground(new Color(30, 144, 255));
		cerrar.setHorizontalTextPosition(SwingConstants.CENTER);
		cerrar.setHorizontalAlignment(SwingConstants.CENTER);
		cerrar.setFont(new Font("Segoe Script", Font.BOLD, 26));
		cerrar.setBackground(new Color(250, 235, 215));
		cerrar.setBounds(0, 0, 50, 50);
		contentPane.add(cerrar);
		
		go = new JButton("Go");
		go.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 20));
		go.setForeground(new Color(250, 235, 215));
		go.setBackground(new Color(50, 205, 50));
		go.setBorderPainted(false);
		go.setBounds(100, 400, 100, 50);
		contentPane.add(go);
		
		parar = new JButton("Stop");
		parar.setForeground(new Color(250, 235,215));
		parar.setFont(new Font("Yu Gothic UI Semilight", Font.ITALIC, 26));
		parar.setBorderPainted(false);
		parar.setBackground(new Color(255, 0, 0));
		parar.setBounds(950, 400, 150, 50);
		contentPane.add(parar);
		
		texto = new JLabel("");
		texto.setBorder(null);
		texto.setHorizontalAlignment(SwingConstants.CENTER);
		texto.setFont(new Font("Yu Gothic UI Semilight", Font.BOLD | Font.ITALIC, 26));
		texto.setOpaque(true);
		texto.setBackground(new Color(245, 222, 179));
		texto.setBounds(355, 100, 550, 50);
		contentPane.add(texto);
		
		escribe = new JTextField();
		escribe.setBorder(null);
		escribe.setBackground(new Color(245, 222, 179));
		escribe.setFont(new Font("AR ESSENCE", Font.PLAIN, 26));
		escribe.setBounds(410, 400, 400, 50);
		contentPane.add(escribe);
		escribe.setColumns(10);
		
		imagen = new JLabel();
		imagen.setBackground(Color.PINK);
		imagen.setOpaque(true);
		imagen.setBounds(516, 194, 200, 150);
		contentPane.add(imagen);
		
	    enunciado = new JLabel("");
		enunciado.setForeground(new Color(255, 102, 0));
		enunciado.setHorizontalAlignment(SwingConstants.CENTER);
		enunciado.setFont(new Font("Yu Gothic UI Semibold", Font.ITALIC, 20));
		enunciado.setBounds(516, 355, 200, 34);
		contentPane.add(enunciado);
		
		decora = new JLabel("New label");
		decora.setIcon(logo2());
		decora.setBounds(1150, 0, 50, 50);
		contentPane.add(decora);
		
		cronometro = new JLabel("00:00:00:00");
		cronometro.setHorizontalAlignment(SwingConstants.CENTER);
		cronometro.setFont(new Font("Tahoma", Font.BOLD, 20));
		cronometro.setBounds(56, 213, 179, 34);
		contentPane.add(cronometro);
		
	    logo();
	}
    private ImageIcon logo2() {
		
		ImageIcon like3= new ImageIcon(getClass().getResource("/imagenes/logo.png"));
		ImageIcon like4= new ImageIcon(like3.getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH));
		return like4;
	}
	private void logo() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(Frontend_.class.getResource("/imagenes/logo.png")));
	}
	public JLabel getCronometro() {
		return cronometro;
	}
    public JTextField getEscribe() {
		return escribe;
	}
	public JButton getGo() {
		return go;
	}
	public JButton getParar() {
		return parar;
	}
	public JLabel getEnunciado() {
		return enunciado;
	}
	public JLabel getTexto() {
		return texto;
	}
	public void setTExto(JLabel texto) {
		this.texto = texto;
	}
	public void setCerrar(JLabel cerrar) {
		this.cerrar = cerrar;
	}
	public JLabel getCerrar() {
		return cerrar;
	}
	public JLabel getImagen() {
		return imagen;
	}
}
