package challengeFour;

public class TestSystemPrintLn {

	public TestSystemPrintLn() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 1; i <= 4; i++) {
			for(int v = 0; v < i; v++) {
				System.out.print("#");
			}
			System.out.println(" ");
		}
	}

}
