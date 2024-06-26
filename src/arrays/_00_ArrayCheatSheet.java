package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] dog_names = {"Milo", "Charlie", "Bella", "Chili", "Tux"};
		//2. print the third element in the array
		System.out.println(dog_names[2]);
		//3. set the third element to a different value
		dog_names[2] = "Pepper";
		//4. print the third element again
		System.out.println(dog_names[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for(int i=0; i<dog_names.length; i++) {
			System.out.println(dog_names[i]);
			
		}
		
		//6. make an array of 50 integers
		int[] numbers = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		
		for(int i =0; i<numbers.length; i++) {
			numbers[i] = ran.nextInt(300);	
			
		}
		//8. without printing the entire array, print only the smallest number in the array
		int min = numbers[0];
		int large = numbers[0];
		for(int k =1; k<numbers.length;k++) {
			if(numbers[k]<min) {
				min = numbers[k];
			}
			if(numbers[k]>large) {
				large = numbers[k];
			}
		}
		System.out.println("min number " + min);
		System.out.println("largest number " + large);
		//9 print the entire array to see if step 8 was correct
		
		//10. print the largest number in the array.
	}
}
