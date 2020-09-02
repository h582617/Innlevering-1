package innlevering;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Trinnskatt {

	public static void main(String[] args) {

	double tall = parseDouble(showInputDialog("Tast inn bruttoinntekt"));
	
	double Trinn0 = tall;
	double Trinn1 = (tall-180_800) * 0.019;
	double Trinn2 = (254_500-180_800) * 0.019 + (tall - 254_500) * 0.042;
	double Trinn3 = (254_500-180_800) * 0.019 + (639_750 - 254_500) * 0.042 + (tall - 639_750) * 0.132;
	double Trinn4 = (254_500-180_800) * 0.019 + (639_750 - 254_500) * 0.042 + (990_550 - 639_750) * 0.132 + (tall - 990_750) * 0.162;
	
	//Trinn0
	if (tall > 0 && tall <= 180_800) {
		showInputDialog(null,"Eg har ingen trinnskatt, summen blir" + Trinn0 + "kr");
	}
	
	//Trinn1
	else if (tall > 180_800 && tall <= 254_500) {
		showInputDialog(null,"Eg har 1,9% trinnskatt, summen blir" + Trinn1 + "kr");
		}
		
	//Trinn2
	else if (tall > 254_500 && tall <= 639_750) {	
	    showInputDialog(null,"Eg har 4,2% trinnskatt, summen blir" + Trinn2 + "kr");
		}
	    
	//Trinn3
	else if (tall > 639_750 && tall <= 990_550) {
		showInputDialog(null,"Eg har 13,2% trinnskatt, summen blir" + Trinn3 + "kr");
	    }
	    
	//Trinn4
	else if (tall > 990_550) {
	    showInputDialog(null,"Eg har 16,2% trinnskatt" + Trinn4);
	    }
	
	}
}