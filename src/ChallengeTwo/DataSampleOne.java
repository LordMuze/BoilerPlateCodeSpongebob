package ChallengeTwo;

import java.util.ArrayList;
import java.util.List;

public class DataSampleOne {
	public List<List<Integer>> sampleData() {
		List<List<Integer>> testData = new ArrayList();
		List<Integer> childOne = new ArrayList();
		childOne.add(11);
		childOne.add(2);
		childOne.add(4);
		
		testData.add(childOne);
		
		List<Integer> childTwo = new ArrayList();
		childTwo.add(4);
		childTwo.add(5);
		childTwo.add(6);
		
		
		testData.add(childTwo);
		
		
		List<Integer> childThree = new ArrayList();
		childThree.add(10);
		childThree.add(8);
		childThree.add(-12);
		
		
		testData.add(childThree);
		return testData;
	}
}
