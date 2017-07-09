package Computer_Science;

public class BigONotation {
	/*
    private int[] theArray;
    private int arraySize;
    private int itemsInArray = 0;
    static long startTime;
    static long endTime;
    public BigONotation(int size) {
        this.arraySize = size;
        theArray = new int[size];
    }
    public static void main(String[] args) {
    	//using three sizes for each type of iteration..
        BigONotation testAlgo2 = new BigONotation(1000000);
        testAlgo2.generateRandomArray();
        //testAlgo2.linearSearchForValue(20);
        //testAlgo2.bubbleSort();
        //testAlgo2.binarySearchForValue(20);
        BigONotation testAlgo3 = new BigONotation(20000);
        testAlgo3.generateRandomArray();
        //testAlgo3.linearSearchForValue(20);
        //testAlgo3.bubbleSort();
        //testAlgo3.binarySearchForValue(20);
        BigONotation testAlgo4 = new BigONotation(300000);
        testAlgo4.generateRandomArray();
        //testAlgo4.linearSearchForValue(20);
        //testAlgo4.bubbleSort();
        //testAlgo4.binarySearchForValue(20);
        startTime = System.currentTimeMillis();
        testAlgo4.quickSort(0, testAlgo4.itemsInArray);
        //testAlgo3.quickSort(0, testAlgo3.itemsInArray);
        //testAlgo4.quickSort(0, testAlgo4.itemsInArray);
        endTime = System.currentTimeMillis();
        System.out.println("Time took to search " + (endTime - startTime));

    }
    //0(1)
    //perform in the same way.
    public void addItemArray(int newItem) {
        theArray[itemsInArray++] = newItem;
    }
    //0(n)
    //time to complete will grow directly proportional to the size of the data
    //like the linear search below(whole array must be searched...
    public void linearSearchForValue(int value) {
        boolean valueInArray = false;
        String indexWithValue = " ";
        startTime = System.currentTimeMillis();
        for(int i = 0; i < arraySize; i++) {
            if(theArray[i] == value) {
                valueInArray = true;
                indexWithValue += i + " ";
            }
        }
        System.out.println("Value Found: " + valueInArray);
        endTime = System.currentTimeMillis();
        System.out.println("Time took to search " + (endTime - startTime));
    }
    //O(n^2)
    public void bubbleSort() {
    	startTime = System.currentTimeMillis();
    	for(int i = arraySize - 1; i > 1; i--) {
    		for(int j = 0; j < i; j++) {
    			if(theArray[j] > theArray[j + 1]) {
    				swapValues(j, j+1);
    			}
    		}
    	}
    	
    	
    	
        endTime = System.currentTimeMillis();
        System.out.println("Time took to search " + (endTime - startTime));

    }
    //0(Log N)
    public void binarySearchForValue(int value) {
    	 startTime = System.currentTimeMillis();
    	 int lowIndex = 0;
    	 int highIndex = arraySize - 1;
    	 int timesThrough = 0;
    	 while(lowIndex <= highIndex) {
    		 int middleIndex = (highIndex + lowIndex) / 2;
    		 if(theArray[middleIndex] < value) {
    			 lowIndex = middleIndex + 1;
    		 }else if(theArray[middleIndex] > value) {
    			 highIndex = middleIndex - 1;
    		 }else {
    			 System.out.println("Found match in index " + middleIndex);
    			 lowIndex = highIndex + 1;
    		 }
    		 timesThrough++;
    	 }
         System.out.println("Time took to search " + (endTime - startTime));
         endTime = System.currentTimeMillis();
         System.out.println("Times Through "+  timesThrough);

    }
    public void quickSort(int left, int right) {
    	if(right - left <= 0) {
    		return;
    	}else {
    		int pivot = theArray[right];
    		int pivotLocation = partitionArray(left, right, pivot);
    		quickSort(left, pivotLocation - 1);
    		quickSort(pivotLocation + 1,right);
    	}
    }
    public int partitionArray(int left, int right, int pivot) {
    	int leftPointer = left - 1;
    	int rightPointer = right;
    	while(true){
    		while(theArray[++leftPointer] < pivot);
    		while(rightPointer > 0 && theArray[--rightPointer] > pivot);
    		if(leftPointer >= rightPointer) {
    			break;
    		}else {
    			swapValues(leftPointer, rightPointer);
    		}
    	}
    	swapValues(leftPointer, right);
    	return leftPointer;
    }
    public void generateRandomArray(){
        for(int i = 0; i < arraySize; i++) {
            theArray[i] = (int) (Math.random() * 1000) + 10;
        }
        itemsInArray = arraySize - 1;
    }
    public void swapValues(int start, int end) {
    	int endTemp = end;
    	theArray[end] = theArray[start];
    	theArray[start] = theArray[endTemp];
    }
    */
}