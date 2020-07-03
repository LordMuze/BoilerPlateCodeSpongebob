package challengeFive;

import metaResources.LordMuzeArray;

public class MiniMaxSum {
    
	
	public MiniMaxSum() {
		// TODO Auto-generated constructor stub
	}
	public void sumCalc(int[] arr) {
		int i = 0;
		int j = i + 1;
		int x = 0;
		long r = 0;
		int largerThanIt = 0;
		int smallerThanIt = 0;
		long minSum = 0;
		long maxSum = 0;
		
		
		while(i < arr.length) {
			largerThanIt = 0;
			while(j != i) {
				if(j == arr.length) {
					j = 0;
				}
				if(j == i) {
					break;
				}
				long z = arr[i];
				long y = arr[j];
				if(arr[i] < arr[j]) {
					largerThanIt++;
				}
				if(largerThanIt == 4) {
					r = arr[i];
					break;
				}
				j++;
			}
			i++;
			j = i + 1;
		}
		
		while(x < arr.length) {
			if(arr[x] != r) {
				maxSum+= arr[x];
			}
			x++;
		}
		
		
		
		
	
		
		
		
		i = 0;
		j = i + 1;
		r = 0;
		x = 0;
		
		
		
		while(i < arr.length) {
			smallerThanIt = 0;
			while(j != i) {
				if(j == arr.length) {
					j = 0;
				}
				if(j == i) {
					break;
				}
				if(arr[i] > arr[j]) {
					smallerThanIt++;
				}

				if(smallerThanIt == 4) {
					
					r = arr[i];
					break;
				}
				j++;
			}
			i++;
			j = i + 1;
		}
		
		while(x < arr.length) {
			if(arr[x] != r) {
				minSum+= arr[x];
			}
			x++;
		}
		System.out.println(minSum);
		System.out.println(maxSum);
		
		
	}


	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sampleData = {1, 2, 3, 4, 5};
		int[] sampleDataTwo = {7, 69, 2, 221, 8974};
		int[] sampleDataThree = {256741038, 623958417, 467905213, 714532089, 938071625};
		MiniMaxSum sumObj = new MiniMaxSum();
		int[] sampleDataFour ={769082435, 210437958, 673982045, 375809214, 380564127};
		sumObj.sumCalc(sampleData);
		System.out.println("Next Test: ");
		sumObj.sumCalc(sampleDataTwo);
		System.out.println("Next Test: ");
		sumObj.sumCalc(sampleDataThree);
		System.out.println("Next Test: ");
		sumObj.sumCalc(sampleDataFour);
		

	}

}
