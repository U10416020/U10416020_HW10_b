//U10416020

import java.util.*;

public class TestBubbleSort{
	//Main method
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		//Ask user to input the numbers of integers
		System.out.println("Enter how many integers to sort: ");
		int number = input.nextInt();		
		int[] array = new int[number];
		
		//Ask user to input the integers
		System.out.println("Enter integers: ");
		for(int i = 0; i < number; i++){
			array[i] = input.nextInt();
		}
		
		//Create a object of BubbleSort
		BubbleSort bubble = new BubbleSort(array);
		
		//Diaplay the result
		System.out.println("Bubble sort:");
		for(int i = 0;i<number;i++){
			System.out.print(bubble.getBubble(i) + " ");
		}
	}
}