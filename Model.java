package calculator;

import calculator.View;
import calculator.Controller;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Model extends java.util.Observable {
	
	public Model() {
		
	}
	
	public double add(double x , double y) {
	
	 return (x + y);
	 
	}
	
	public double sub(double x , double y) {
		
		 return (x - y);
		 
	}
	
	public double div(double x , double y) {
		
		 return (x / y);
		 
	}
	
	public double mul(double x , double y) {
		
		 return (x * y);
		 
	}
	
	public double mod(double x , double y) {
		
		 return (x % y);
		 
	}
	
	public double sqrot(double x) {
		
		 return (Math.sqrt(x));
		 
		}
	

}
