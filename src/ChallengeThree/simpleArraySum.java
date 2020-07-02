/**
 * 
 */
package ChallengeThree;

/**
 * @author musli
 *
 */
public class simpleArraySum {
	
	
	public int calculatorArraySum(int[] data) {
		int sum = 0;
		int i = data.length;
		int count = 0;
		
		while (count < i) {
			sum += data[count];
			count++;
		}
		return sum;
	}
	
	/**
	 * 
	 */
	public simpleArraySum() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sampleData = {1, 2, 3, 4, 10, 11};
		simpleArraySum sumCal = new simpleArraySum();
		
		int i = sumCal.calculatorArraySum(sampleData);
		
		System.out.println(i);
		
		
	}

}
