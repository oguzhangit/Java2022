package RecapDemo2;

import java.util.Iterator;

public class RecapDemo2 {

	public static void main(String[] args) {
		double[] myList = {1.2 , 1.3 , 1.5, 5,9.3};
		double total = 0 ;
		double max = myList[0];
		
		for(double number:myList) {
			if (number > max) {
				max = number;
			}
			
			total = total + number;
			System.out.println(number);
		}
		
		System.out.println("Topalm = " + total);
		System.out.println(max);
	}

}
