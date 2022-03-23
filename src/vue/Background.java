	package vue;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Background extends JPanel {
	
	protected void paintComponent(Graphics g){
		
		super.paintComponent(g);
		Image image =new ImageIcon("src/images/fond.png").getImage();
		int baslangicX = 0;
		int baslangicY = 0;
		
		g.drawImage(image, baslangicX, baslangicY, null);
	
	}
	

}
