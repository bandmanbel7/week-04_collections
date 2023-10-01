package week04_Collections;

import java.util.ArrayList;

public class week04_assignment01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//This is my array list here named names. 
		
		ArrayList <String> names =  new ArrayList <> ();
		names.add("Sam");
		names.add("Tommy");
		names.add("Tim");
		names.add("Sally");
		names.add("Buck");
		names.add("Bob");
		
		int length = names.size();
		int sum = 0;
		String combination = "";
		
		for (int i = 0; i<length; i++) {
			sum = sum+names.get(i).length();
			combination = combination+names.get(i)+ " ";
		}
//	System.out.println(sum);
	float avg = (float)sum/length;
	System.out.println("The average of the Names is: " + avg);
	System.out.println("This is the combination of the strings: " + combination); 
	System.out.println("Using this formula we will get the last element of the array: " + "names.get(length-1)");
	System.out.println("Using this formula we will get the first element of the array: " + "names.get(0)");
	System.out.println("Solution for question number 5:");
	
	
	
	ArrayList <Integer> nameLengths = new ArrayList <> ();
	int nameLength = 0;
	
	for (int i=0; i<length; i++) {
		nameLength = names.get(i).length(); 
		nameLengths.add(nameLength);
		
	}
		System.out.println(nameLengths); 
		System.out.println("Solution for question number 6: "); 
		
		sum = 0;
		for (int i=0; i<length; i++) {
			sum = sum+nameLengths.get(i); 
			
		}
		System.out.println("This is the sum of the nameLengths: " + sum);
		System.out.println("Solution for number 7: ");
		
	
		concatination("word", 5);
		System.out.println("Solution for number 8: ");
		fullName("Robel", "Negatu");
		System.out.println("Solution for number 9: ");
		
		
		
		
		ArrayList <Integer> numsList1 = new ArrayList <> ();
		numsList1.add(93);
//		numsList1.add(55);
//		numsList1.add(33);
		boolean result = getAdditionnumsList(numsList1);
		System.out.println("result: "+result);
		
		System.out.println("Solution for number 10: ");
		double[] doubles = {550.4, 30, 1222, 74.3};
		System.out.println(calculateAverage(doubles));
	}
	
	public static void concatination (String word, int num) {
		
		String concat = "";
		for (int i=0; i<num; i++) {
			concat = concat+word; 
			
			
		}
		System.out.println("This is the concatinated String:" + concat); 
		
		
	}
		
	public static void fullName (String firstName, String lastName) {
		
		System.out.println("Full Name is: " + firstName + " " + lastName); 
		
		
	}

	public static boolean getAdditionnumsList (ArrayList <Integer> nums ) {
		int sum = 0;
		int length = nums.size();
		for (int i = 0; i<length; i++) {
			sum = sum+nums.get(i);
		}
		
		
		if (sum > 100) {
			//System.out.println(true); 
			return true;
		} else
		{
			//System.out.println(false);
			return false;
		}
	}
	
	public static double calculateAverage(double[] array) {
		double sum=0;
		for (double number: array) {
			sum += number;
			
		}
		return sum / array.length;
		
	}
	
	
}
