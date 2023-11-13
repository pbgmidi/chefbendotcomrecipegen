package chefbendotcomrecipegen;

import javax.swing.*;
import java.awt.*;

public class ChefFrame extends JFrame{

	public ChefFrame() {
		
		ImageIcon frameicon = new ImageIcon("src/chefbendotcomrecipegen/graphics/cheficon.png");
		this.setIconImage(frameicon.getImage());
		ChefPanel panel1 = new ChefPanel();
		this.setTitle("chefben.com Recipe Generator");
		this.setSize(800,720);
		this.add(panel1);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setResizable(false);
		this.setVisible(true);
	}
	
}
