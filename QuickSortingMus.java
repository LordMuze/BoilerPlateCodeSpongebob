/*IT IS STILL IN IMPLEMENTATION! Apparently there is a problem regarding with recursion, I am fixing on that!
I bet the code sucks. Once I'm done, feel free to provide suggestions and criticism so that I can improve :) */


package Computer_Science;
import java.util.*;
public class QuickSortingMus {
	int arrayDigits = 10;
	//int[] randomArraySample = {8, 55, 52, 4, 89, 47, 93, 28, 56, 35};
	int[] randomArraySample;
	public void generateRandomArray() {
		randomArraySample = new int[arrayDigits];
		Random r = new Random();
		for(int i = 0; i < randomArraySample.length; i++) {
			randomArraySample[i] = r.nextInt(99);
		}
		System.out.println("Random array generated!");
	}
	public int partitioningMus(int[] randomArray, int j, int lastPivot) {
		int i = j - 1;
		System.out.println("Pivot is " + randomArray[randomArray.length - 1]);
		while(j < lastPivot) {
			System.out.println("J is : " + j);
			System.out.println("i is " + i);
			if(randomArray[j] < randomArray[lastPivot]) {
				i++;
				swapValues(randomArray, j, i);
				displayArray();
			}
			if(j == lastPivot - 1) {
				i++;
				swapValues(randomArray, i, lastPivot);
				displayArray();
				System.out.println("Pivot value is " + randomArray[i] + "----");
				
			}
			j++;
		}
		return i;
	}
	public static void main(String[] args) {
		QuickSortingMus sort = new QuickSortingMus();
		sort.generateRandomArray();
		sort.displayArray();
		sort.quickSort(sort.randomArraySample, 0, sort.randomArraySample.length - 1);
		//sort.partitioningMus(sort.randomArraySample, 0, sort.randomArraySample.length - 1);
		sort.displayArray();
		//System.out.println("QuickSorting is completed!");
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
	//function modifies the mainPointer and end according to the side of the pivot
	// L character is for when the main array is split into two(for left array only);
	// and for array at the left most of the node
	// R character is when the array is in between two pivots
	public void quickSortR_L(int[] sampleArray, int mainPointer, int end, char side) {
		if(side == 'R') {
			end = end - 1;
			mainPointer = mainPointer + 1;
		}else if(side == 'L') {
			end = end - 1;
		}else{
			//throws error in the application, or in the console..
			System.err.println("Side Invalid. Please check quickSortR_L() parameters again!");
		}
		//QuickSorting loop
		int prevEnd = end;
		/*while(end - mainPointer > 1) {
			int prevEnd = end;
			end = partitioningMus(sampleArray, mainPointer, end);
			if(end - mainPointer > 1) {
				quickSortR_L(sampleArray, mainPointer, end, 'L');
			}
			if(prevEnd - (end + 1) > 1) {
				quickSortR_L(sampleArray, end, prevEnd, 'R');
			}
		}*/
		end = partitioningMus(sampleArray, mainPointer, end);
		if(end - mainPointer > 1) {
			quickSortR_L(sampleArray, mainPointer, end, 'L');
		}
		if(prevEnd - (end + 1) > 1) {
			quickSortR_L(sampleArray, end, prevEnd, 'R');
		}
		
	}
	// prerequisite end variable must be subtracted by one in order for the function to work properly
	protected void quickSort(int[] sampleArray, int start, int end) {
		int prevEnd = end;
		end = partitioningMus(sampleArray, start, end);
		System.out.println("Partitioning complete!");
		// QuickSorting
		if(end - 1 - start > 1) {
			quickSortR_L(sampleArray, start, end, 'L');
		}
		System.out.println("Recursion for left is completed!");
		if(prevEnd - (end + 1) > 1) {
			quickSortR_L(sampleArray, end,  prevEnd + 1, 'R');
		}

	}

}
