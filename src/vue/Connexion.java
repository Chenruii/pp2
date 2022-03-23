package vue;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Connexion extends JFrame {
	
	
	public Connexion (){
		
		Background background = new Background();
		
		JFrame Connexion = new JFrame();
		
		this.add(background);
		this.setSize(400, 300);
		
		this.setTitle("Connexion au PPE");
		this.setLayout(null);
		this.setBounds(200,200,400,300);
		this.setResizable(false);
		
		this.getContentPane().setBackground(new Color(255,255,255));
		/*background = getImage("src/images/logo1.png");*/
		
		
		ImageIcon uneImage = new ImageIcon("src/images/logo1.png");
		JLabel monIcon = new JLabel(uneImage);
		monIcon.setBounds(100, 0, 300, 100);
		this.add(monIcon);
		
		setIconImage(new ImageIcon("src/images/logo.PNG").getImage());
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		JLabel titre = new JLabel("Bienvenue");
		titre.setBounds(20,70,100,20);
		
		this.add(titre);
		this.add(new VueConnexion());
		this.setVisible(true);
		
	}
	
	public void rendreVisible(boolean valeur){
		
		this.setVisible(valeur);
	}
	
	/*public static void main(String[] args){
		
		Background background = new Background();
		
		JFrame f = new JFrame();
		f.add(background);
		f.setSize(400, 300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
		
	}*/
}
