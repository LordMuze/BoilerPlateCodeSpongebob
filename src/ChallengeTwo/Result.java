package ChallengeTwo;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Result {
	public static int diagonalDifference(List<List<Integer>> arr) {
	    // Write your code here
	    int n = arr.size();
	    int x= 0;
	    int y = 0;
	    int sum1 = 0;
	    int sum2 = 0;
	    int result = 0;
	    while(y < n){
	        if(x < n){
	            sum1 = sum1 + arr.get(y).get(x);
	        }
	        x++;
	        y++;
	    }
	    x = 0;
	    while(y >= 0){
	    	y--;
	        if(x < arr.size()){
	            sum2 = sum2 + arr.get(y).get(x);
	        }
	        x++;
	                
	    }
	    result = sum1 - sum2;
	    if(result < 0) {
	    	result = result * -1;
	    }
	    System.out.println(sum1);
		System.out.println(sum2);
	    return result;

	    }
	
	public static void main(String[] args) {
		Result result = new Result();
		DataSampleOne data = new DataSampleOne();
		List<List<Integer>> testData = new ArrayList();
		int end = 0;
		testData = data.sampleData();
		
		System.out.println("Sample Data: " + testData);
		System.out.println("Results: ");
		
		end = result.diagonalDifference(testData);
		System.out.println(end);
		
		
	}

}
