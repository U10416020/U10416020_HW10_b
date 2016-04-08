//U10416020 
import java.util.*;
public class BubbleSort{
	int number;
	int[] array = new int[number];
	
	BubbleSort(int newArray[]){
		number = newArray.length;
		array = newArray;		
		setBubble();
	}
	
	void setBubble(){
		int swap;
		for(int j=0;j<number;j++){
			for(int i = 0; i < number-1;i++){
				if(array[i] > array[i+1]){
					swap = array[i];
					array[i] = array[i+1];
					array[i+1] = swap;
				}
			}
		}
		
	}
	
	int getBubble(int i){
		return array[i];
	}
	
}