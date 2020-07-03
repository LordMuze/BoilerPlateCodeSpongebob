package csExamples;

public class RecursionExample {

	public RecursionExample() {
		// TODO Auto-generated constructor stub
	}
	//In this case, the recursion has one universal variable to stop the looping once a process is completed
	//By I mean universal variable, the variable should retain its memory, one by declaring outside the recursion
	
	
	int v = 0;
	public void recursOne() {
		System.out.println(v);
		v++;
		if(v < 10) {
			recursOne();
		}
		/*
		 * Output will be
		 * 1
		 * 2
		 * 3
		 * 4
		 * 5
		 * 6
		 * 7
		 * 8
		 * 9
		 * Good alternative to while loop
		 * Source from implementing QuickSorting algorithm
		 * */
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RecursionExample re = new RecursionExample();
		re.recursOne();

	}

}
