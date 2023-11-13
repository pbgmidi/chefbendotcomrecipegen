package chefbendotcomrecipegen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;

public class ChefPanel extends JPanel {

	public ChefPanel() {
		JTextArea directions = new JTextArea("Type Directions Here!");
		directions.setWrapStyleWord(true);
		directions.setLineWrap(true);
		
		JTextArea dishtitlebox = new JTextArea();
		JTextArea ingredientbox1 = new JTextArea();
		JTextArea ingredientbox2 = new JTextArea();
		JTextArea ingredientbox3 = new JTextArea();
		JTextArea ingredientbox4 = new JTextArea();
		JTextArea ingredientbox5 = new JTextArea();
		JTextArea ingredientbox6 = new JTextArea();
		JTextArea ingredientbox7 = new JTextArea();
		JTextArea ingredientbox8 = new JTextArea();
		JTextArea ingredientbox9 = new JTextArea();
		JTextArea ingredientbox10 = new JTextArea();
		JTextArea ingredientbox11 = new JTextArea();
		JTextArea ingredientbox12 = new JTextArea();
		JTextArea ingredientbox13 = new JTextArea();
		JTextArea ingredientbox14 = new JTextArea();
		JTextArea ingredientbox15 = new JTextArea();
		JTextArea ingredientbox16 = new JTextArea();
		JTextArea ingredientbox17 = new JTextArea();
		
		JTextArea amount1 = new JTextArea();
		JTextArea amount2 = new JTextArea();
		JTextArea amount3 = new JTextArea();
		JTextArea amount4 = new JTextArea();
		JTextArea amount5 = new JTextArea();
		JTextArea amount6 = new JTextArea();
		JTextArea amount7 = new JTextArea();
		JTextArea amount8 = new JTextArea();
		JTextArea amount9 = new JTextArea();
		JTextArea amount10 = new JTextArea();
		JTextArea amount11 = new JTextArea();
		JTextArea amount12 = new JTextArea();
		JTextArea amount13 = new JTextArea();
		JTextArea amount14 = new JTextArea();
		JTextArea amount15 = new JTextArea();
		JTextArea amount16 = new JTextArea();
		JTextArea amount17 = new JTextArea();
		
		JButton gen = new JButton("<html><b><h1 style'color:black;'>Generate</h1></b></html>");
		gen.setFocusable(false);
		gen.setBackground(Color.white);
		JLabel dishtitle = new JLabel("<html><b><h1 style='color:black;'>Dish Title:</h1></b></html>");
		JLabel ingreidentstitle = new JLabel("<html><b><h1 style='color:black;'>Ingredients:</h1></b></html>");
		JLabel amountstitle = new JLabel("<html><b><h1 style='color:black;'>Amounts:</h1></b></html>");
		ImageIcon logoimg = new ImageIcon("src/chefbendotcomrecipegen/graphics/logo.png");
		JLabel logo = new JLabel(logoimg);
		logo.setBounds(380,-20,407,88);
		gen.setBounds(570,600,200,70);
		dishtitle.setBounds(50,50,116,19);
		dishtitlebox.setBounds(170,52,180,19);
		ingreidentstitle.setBounds(50,100,135,29);
		ingredientbox1.setBounds(50,140,135,19);
		ingredientbox2.setBounds(50,170,135,19);
		ingredientbox3.setBounds(50,200,135,19);
		ingredientbox4.setBounds(50,230,135,19);
		ingredientbox5.setBounds(50,260,135,19);
		ingredientbox6.setBounds(50,290,135,19);
		ingredientbox7.setBounds(50,320,135,19);
		ingredientbox8.setBounds(50,350,135,19);
		ingredientbox9.setBounds(50,380,135,19);
		ingredientbox10.setBounds(50,410,135,19);
		ingredientbox11.setBounds(50,440,135,19);
		ingredientbox12.setBounds(50,470,135,19);
		ingredientbox13.setBounds(50,500,135,19);
		ingredientbox14.setBounds(50,530,135,19);
		ingredientbox15.setBounds(50,560,135,19);
		ingredientbox16.setBounds(50,590,135,19);
		ingredientbox17.setBounds(50,620,135,19);
		amountstitle.setBounds(200,100,135,29);
		amount1.setBounds(200,140,100,19);
		amount2.setBounds(200,170,100,19);
		amount3.setBounds(200,200,100,19);
		amount4.setBounds(200,230,100,19); 
		amount5.setBounds(200,260,100,19);
		amount6.setBounds(200,290,100,19);
		amount7.setBounds(200,320,100,19);
		amount8.setBounds(200,350,100,19);
		amount9.setBounds(200,380,100,19);
		amount10.setBounds(200,410,100,19);
		amount11.setBounds(200,440,100,19);
		amount12.setBounds(200,470,100,19);
		amount13.setBounds(200,500,100,19);
		amount14.setBounds(200,530,100,19);
		amount15.setBounds(200,560,100,19);
		amount16.setBounds(200,590,100,19);
		amount17.setBounds(200,620,100,19);
		
		directions.setBounds(350,140,350,300);
		
		gen.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent readrecipe) { 
				  try{ 
					   String dishtitleinput = dishtitlebox.getText();
					   
					   String ing1 = ingredientbox1.getText();
					   String ing2 = ingredientbox2.getText();
					   String ing3 = ingredientbox3.getText();
					   String ing4 = ingredientbox4.getText();
					   String ing5 = ingredientbox5.getText();
					   String ing6 = ingredientbox6.getText();
					   String ing7 = ingredientbox7.getText();
					   String ing8 = ingredientbox8.getText();
					   String ing9 = ingredientbox9.getText();
					   String ing10 = ingredientbox10.getText();
					   String ing11 = ingredientbox11.getText();
					   String ing12 = ingredientbox12.getText();
					   String ing13 = ingredientbox13.getText();
					   String ing14 = ingredientbox14.getText();
					   String ing15 = ingredientbox15.getText();
					   String ing16 = ingredientbox16.getText();
					   String ing17 = ingredientbox17.getText();
					   
					   String amount1input = amount1.getText();
					   String amount2input = amount2.getText();
					   String amount3input = amount3.getText();
					   String amount4input = amount4.getText();
					   String amount5input = amount5.getText();
					   String amount6input = amount6.getText();
					   String amount7input = amount7.getText();
					   String amount8input = amount8.getText();
					   String amount9input = amount9.getText();
					   String amount10input = amount10.getText();
					   String amount11input = amount11.getText();
					   String amount12input = amount12.getText();
					   String amount13input = amount13.getText();
					   String amount14input = amount14.getText();
					   String amount15input = amount15.getText();
					   String amount16input = amount16.getText();
					   String amount17input = amount17.getText();
					   String directionsinput = directions.getText();
					   
					   FileWriter recipewriter = new FileWriter("C://Users/Phillip Goldberg/Desktop/"+dishtitleinput+".html");    
			           recipewriter.write("<!DOCTYPE html><html><h1><center>"+dishtitleinput+"</center></h1><hr></html>");    
			           recipewriter.write("<label for=\"Ingredients\" style=\"font-size:16pt; font-weight:bold; \">Ingredients:</label>");
			           recipewriter.write("<!DOCTYPE html> <html>");
			           recipewriter.write("<table style='position:relative;left:-20px;' width='250px'>");
			           recipewriter.write("<tr><td align='right'>"+amount1input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing1+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount2input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing2+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount3input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing3+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount4input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing4+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount5input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing5+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount6input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing6+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount7input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing7+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount8input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing8+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount9input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing9+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount10input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing10+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount11input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing11+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount12input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing12+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount13input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing13+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount14input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing14+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount16input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing16+"</td>");
			           recipewriter.write("<tr><td align='right'>"+amount17input+"&nbsp;&nbsp;&nbsp;</td>");
			           recipewriter.write("<td align='left'>"+ing17+"</td></table></html>");
			           recipewriter.write("<hr><label for='Directions' style='font-size:16pt; font-weight:bold;'>Directions:</label>");
			           recipewriter.write("<br><br>"+directionsinput);
			           recipewriter.write("<hr><center style='font-size:18.75;'>This recipe furnished by the Chef Ben Website<br>written by Benjamin Goldberg<br>www.chefben.com</center>");
			           recipewriter.close();
			          } catch(Exception a){System.out.println(readrecipe);}    
		    
			     }    
			   
			} );
		this.add(gen);
		this.add(dishtitle);
		this.add(dishtitlebox);
		this.add(ingreidentstitle);
		this.add(ingredientbox1);
		this.add(ingredientbox2);
		this.add(ingredientbox3);
		this.add(ingredientbox4);
		this.add(ingredientbox5);
		this.add(ingredientbox6);
		this.add(ingredientbox7);
		this.add(ingredientbox8);
		this.add(ingredientbox9);
		this.add(ingredientbox10);
		this.add(ingredientbox11);
		this.add(ingredientbox12);
		this.add(ingredientbox13);
		this.add(ingredientbox14);
		this.add(ingredientbox15);
		this.add(ingredientbox16);
		this.add(ingredientbox17);
		this.add(amountstitle);
		this.add(amount1);
		this.add(amount2);
		this.add(amount3);
		this.add(amount4);
		this.add(amount5);
		this.add(amount6);
		this.add(amount7);
		this.add(amount8);
		this.add(amount9);
		this.add(amount10);
		this.add(amount11);
		this.add(amount12);
		this.add(amount13);
		this.add(amount14);
		this.add(amount15);
		this.add(amount16);
		this.add(amount17);
		this.add(directions);
		this.add(logo);
		this.setBackground(Color.decode("#cccc99"));
		this.setLayout(null);
		this.setVisible(true);
		
	}
}
