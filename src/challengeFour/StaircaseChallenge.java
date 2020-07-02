package challengeFour;

public class StaircaseChallenge {

	public StaircaseChallenge() {
		// TODO Auto-generated constructor stub
	}
	
	
	public void problemSolver(int n) {
		//prints four stacks
		for(int c = 1; c <= n; c++) {
			
			
			//Prints spaces
			for(int v = 0; v < (n - c); v++) {
				System.out.print(" ");
			}
			
			//Prints each step
			for(int b = 0; b < c; b++) {
				
				System.out.print("#");
				
			}
			
			//Prints new line
			System.out.println(" ");
			
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaircaseChallenge chal = new StaircaseChallenge();
		chal.problemSolver(20);
	}

}
