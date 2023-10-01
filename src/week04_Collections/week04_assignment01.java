package week04_Collections;

import java.util.ArrayList;

public class week04_assignment01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// This is my first Array with the initial 8 digits 
		
		
		ArrayList <Integer> ages = new ArrayList <> (); 
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);

	// I used this length variable to determine the size of the List. 
		
		
		int length = ages.size(); 
//		System.out.println(length);
		System.out.println(("This is the subtraction calculation: " + (ages.get(length-1)-ages.get(0))));
		
		ages = new ArrayList <> (); 
		ages.add(3);
		ages.add(9);
		ages.add(23);
		ages.add(64);
		ages.add(2);
		ages.add(8);
		ages.add(28);
		ages.add(93);
		ages.add(107);
		
		 length = ages.size(); 
//		System.out.println(length);
		System.out.println("This is the subtraction calculation: " + (ages.get(length-1)-ages.get(0)));
		ages.remove(length-1);
		length = ages.size(); 

		int sum = 0; 
		for (int i=0; i<length; i++) {
			sum = sum+ages.get(i);
		
		}
		float avg = (float)sum/length;
//		System.out.println(sum);
		System.out.println("Average is: " + avg);
	}
	
	

}
