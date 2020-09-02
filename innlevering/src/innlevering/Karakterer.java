package innlevering;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Karakterer {
	
	public static void main(String[] args) {

	for( int i = 0; i<=10;i++) {
		
		int poeng = parseInt(showInputDialog("Legg inn dine poenger"));
			
	if (poeng <= 100 && poeng >= 90) {
	  showMessageDialog(null,"Man får karakter A");
	  System.out.print("A");
	    }
	  
	else if  (poeng <= 89 && poeng >= 80) {
		showMessageDialog(null,"Man får karakter B"); 
		System.out.print("B");
	}
	
	else if (poeng <= 79 && poeng >= 60) {
		showMessageDialog(null,"Man får karakter C"); 
		System.out.print("C");
	}
	
	else if (poeng <= 59 && poeng >= 50) {
		showMessageDialog(null,"man får karakter D"); 
		System.out.print("D");
	}
	
	else if (poeng <= 49 && poeng >= 40)  {
		showMessageDialog(null,"Man får karakter E"); 
		System.out.print("E");
	}
	
	else if (poeng <= 39 && poeng >= 0) {
		showMessageDialog(null,"Man får karakter F"); 
		System.out.print("F");
	}
	
	else {
		showMessageDialog(null,"ikke valid prøv igjen!"); 
		i--;
	     
		
	   }
	 }
   }
 }