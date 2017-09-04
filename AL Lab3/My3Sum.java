package hw2;
import java.util.Arrays;
import loader.Algorithm3SumFastest;
public class My3Sum extends Algorithm3SumFastest {
	public static void main(String[] args) {
		
	}
	public  int count(int[] array){
		int result = 0;	 
		if (array.length < 3) return result;		
		Arrays.sort(array); 
		for (int i = 0; i < array.length - 2; i++) {
			// //avoid duplicate solutions
			if (i == 0 || array[i] > array[i - 1]) { 
				int negativeNumber = -array[i]; 
				int start = i + 1;
				int end = array.length - 1;
				while (start < end) {
					//case 1
					if (array[start] + array[end] == negativeNumber) {
	                    result++;  
						start++;
						end--;
						
						while (start < end && array[end] == array[end + 1])
							end--;
	 
						while (start < end && array[start] == array[start - 1])
							start++;
					//case 2
					} else if (array[start] + array[end] < negativeNumber) {
						start++;
					//case 3
					} else {
						end--;
					}
				}
	 
			}
		}
	 
		return result;
	}
}
	



