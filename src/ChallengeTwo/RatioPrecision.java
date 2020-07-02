package ChallengeTwo;

public class RatioPrecision {
	
	
	public void plusMinus(int[] arr) {
		float denominator = arr.length;
        float pos = 0;
        float neg = 0;
        float zero = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > 0){
                pos++;
            }
            if(arr[i] == 0){
                zero++;
            }
            if(arr[i] < 0){
                neg++;
            }

        }
       
        float posFraction = pos/denominator;
        float negFraction = neg/denominator;
        float zeroFraction = zero/denominator;
        
        System.out.println("Results: " + arr.length);
        System.out.println(posFraction);
        System.out.println(negFraction);
        System.out.println(zeroFraction);
	}
	
	
	public static void main(String args[]) {
		DataSample sample = new DataSample();
		int[] data = sample.dataGenerate();
		/*
		for(int i = 0; i < data.length; i++) {
			System.out.println("Data: " + data[i]);
		}*/
		RatioPrecision funcpre = new RatioPrecision();
		funcpre.plusMinus(data);
		
	}

}
