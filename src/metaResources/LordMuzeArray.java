package metaResources;

public class LordMuzeArray {
	int[] arr;
	public LordMuzeArray(int[] arr) {
		// TODO Auto-generated constructor stub
		this.arr = arr;
	}
	
	public LordMuzeArray() {
		
	}
	
	public void displayArrayConsole() {
		System.out.print("{ ");
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			if(i == arr.length - 1) {
				System.out.print(" ");
			}else {
				System.out.print(" ,");
			}
		}
		System.out.print(" }");
	}

}
