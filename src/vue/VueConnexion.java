package vue;

import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import controleur.Gestion;
import controleur.Profil;
import modele.Modele;

public class VueConnexion extends JPanel implements ActionListener{
	
	private JButton btAnnuler = new JButton("");
	private JButton btSeConnecter = new JButton("");
	private JTextField txtLogin = new JTextField();
	private JPasswordField txtMdp = new JPasswordField();
	
	public VueConnexion(){
		
		this.setBounds(150,100,240,150);
		this.setLayout(new GridLayout(3, 2));
		this.setBackground(Color.YELLOW);
		
		this.add(new JLabel("Login: "));
		this.add(this.txtLogin);
		
		this.add(new JLabel("Mot de Passe: "));
		this.add(this.txtMdp);
		
		this.add(this.btAnnuler);
		this.add(this.btSeConnecter);
		
		//definir une police
		ImageIcon imgThisImg = new ImageIcon("src/images/disabled.png");
		this.btAnnuler.setIcon(imgThisImg);
		
		ImageIcon imgThisImg2 = new ImageIcon("src/images/login.png");
		this.btSeConnecter.setIcon(imgThisImg2);
		
		//Font police = new Font("",Font.ITALIC,16);
		//this.btAnnuler.setFont(police);
		//this.btAnnuler.setText("Annuler");
		
		this.btAnnuler.addActionListener(this);
		this.btSeConnecter.addActionListener(this);
		
		this.setVisible(true);
			
	}
	
	public void actionPerformed(ActionEvent e) {

		if(e.getSource()==this.btAnnuler){
			
			this.txtLogin.setText("");
			this.txtMdp.setText("");
		}
		else if (e.getSource() == this.btSeConnecter){
			
			String login = this.txtLogin.getText();
			String mdp = new String (this.txtMdp.getPassword());
			Profil unProfil = Modele.selectWhere(login, mdp);
			if (unProfil == null){
				
				JOptionPane.showMessageDialog(this, "Veuillez vérifier vos identifiants!");
			}
			else{
				
				JOptionPane.showMessageDialog(this, "Connexion réussie \n"+"Bienvenue M."
				+unProfil.getNom()+" "+unProfil.getPrenom());
				
				new General(unProfil);
				this.txtLogin.setText("");
				this.txtMdp.setText("");
				Gestion.rendreVisible(false);
			}
		}
		
	}
	
	
}
