package calculator ;

import calculator.Model;
import calculator.View;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.*;

public class Controller implements ActionListener {
	
	Model model;
	View view;
	
	
	public Controller(View v , Model m) {
		
		model = m;
		view = v;
		
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == view.add) {
			
			view.label1.setText("+"); 
			view.result.setText(""+ model.add(Double.parseDouble(view.firstN.getText()) , Double.parseDouble(view.secondN.getText())));
		}
		
		else if(e.getSource() == view.sub) {
			
			view.label1.setText("-"); 
			view.result.setText(""+ model.sub(Double.parseDouble(view.firstN.getText()) , Double.parseDouble(view.secondN.getText())));
		}
		
        else if(e.getSource() == view.mul) {
			
			view.label1.setText("*"); 
			view.result.setText(""+ model.mul(Double.parseDouble(view.firstN.getText()) , Double.parseDouble(view.secondN.getText())));
		}
		
        else if(e.getSource() == view.div) {
			
			view.label1.setText("/"); 
			view.result.setText(""+ model.div(Double.parseDouble(view.firstN.getText()) , Double.parseDouble(view.secondN.getText())));
		}
		
        else if(e.getSource() == view.mod) {
			
			view.label1.setText("%"); 
			view.result.setText(""+ model.mod(Double.parseDouble(view.firstN.getText()) , Double.parseDouble(view.secondN.getText())));
		}
		
        else if(e.getSource() == view.sqr) {
			
			view.label1.setText("√"); 
			view.secondN.setVisible(false);
			view.result.setText(""+ model.sqrot(Double.parseDouble(view.firstN.getText())));
		}
		
        else if(e.getSource() == view.delete) {
			
        	view.secondN.setVisible(true);;
			view.label1.setText(""); 
			view.firstN.setText("");
			view.secondN.setText("");
			view.result.setText("");
		}
		
	}
}