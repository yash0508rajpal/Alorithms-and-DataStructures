/*Use formula differece = max - min / n-1
 * Sum = n* (  min+max)/2
 * each arr[i] - min % diff should be multiple of difference
 * 
 * 
 * 
 * 
 */


public class ArithmeticSequence {
	public static void main(String[] args){
		double[] arr = new double[]{1,5,9,13};
		if(checkArithmeticSequence(arr))
		System.out.println("is in Arithmetic sequence");
		else
			System.out.println("Not an Arithmetic sequence");	
	}
	
	
	public static boolean checkArithmeticSequence(double[] arr){
		double min = arr[0];
		double max = arr[0];
		for(int i=1;i< arr.length;i++){
			if(arr[i] < min){
				min = arr[i];	
				
			}
			if(arr[i] > max){
				max = arr[i];
			}		
		}
		
		double diff = (max -min)/(arr.length-1);
		boolean isArithmetic = true;
		double sum = arr.length*(min + max)/2;
		double sum2 = 0;
		for(int j=0;j<arr.length;j++){
			double num = arr[j]-min;
			if(num % diff != 0){
				isArithmetic  = false;
				break;
			} 
			sum2 = sum2 + arr[j];
		}
		if(sum2 == sum){
			return isArithmetic;
		}
		return false;


	}
	
}
