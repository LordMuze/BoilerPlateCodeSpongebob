package Computer_Science;

import java.util.Random;

public class QuickSort {
	int[] randomArraySample;
	//int[] randomArraySample = {57, 57, 59, 83, 12, 23, 54, 60, 59, 36};
	int arrayDigits = 1000;
	public void generateRandomArray() {
		randomArraySample = new int[arrayDigits];
		Random r = new Random();
		for(int i = 0; i < randomArraySample.length; i++) {
			randomArraySample[i] = r.nextInt(99);
		}
		System.out.println("Random array generated!");
	}
	public void swapValues(int[] randomArray, int iSort, int jpSort) {
		int tempValue = randomArray[jpSort];                                      
		randomArray[jpSort] = randomArray[iSort];
		randomArray[iSort] = tempValue;
	}
	public void displayArray() {
		System.out.print("[ ");
		for(int i = 0; i < randomArraySample.length; i++) {
			System.out.print(randomArraySample[i] + ", ");
			if(i == randomArraySample.length - 1) {
				System.out.println(" ]");
			}
		}
	}
	//Partitioning algorithm
	// Please please please do subtract the endpoint from the previous pivot 
	public int partitioning(int[] randomArray, int j, int pivot) {
		int i = j - 1;
		System.out.println("Pivot is " + randomArray[pivot]);
		while(j < pivot) {
			System.out.println("J is : " + j);
			System.out.println("i is " + i);
			if(randomArray[j] < randomArray[pivot]) {
				i++;
				swapValues(randomArray, j, i);
				displayArray();
			}
			if(j == pivot - 1) {
				i++;
				swapValues(randomArray, i, pivot);
				displayArray();
				System.out.println("Pivot value is " + randomArray[i] + "----");
				
			}
			j++;
		}
		return i;
	}
	public void quickSort(int[] randomArray, int j, int pivot){
		int prevPivot = pivot;
		//Partitioning 
		pivot = partitioning(randomArray, j, pivot - 1);
		//left sort
		if(pivot - 1 - j > 1) {
			quickSort(randomArray, j, pivot);
		}
		//right sort
		if(prevPivot - 1 - (pivot + 1) > 1) {
			quickSort(randomArray, pivot + 1, prevPivot);
		}
	}
	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		sort.generateRandomArray();
		sort.displayArray();
		sort.quickSort(sort.randomArraySample, 0, sort.randomArraySample.length);
		sort.displayArray();
		System.out.println("Quicksorting completed!");
	}
}
