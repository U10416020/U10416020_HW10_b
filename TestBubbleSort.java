//U10416020

import java.util.*;

public class TestBubbleSort{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter how many integers to sort: ");
		int number = input.nextInt();
		
		int[] array = new int[number];
		System.out.println("Enter integers: ");
		for(int i = 0; i < number; i++){
			array[i] = input.nextInt();
		}
		BubbleSort bubble = new BubbleSort(array);
		System.out.println("Bubble sort:");
		for(int i = 0;i<number;i++){
			System.out.print(bubble.getBubble(i) + " ");
		}
	}
}