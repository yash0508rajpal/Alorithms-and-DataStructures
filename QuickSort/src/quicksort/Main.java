package quicksort;

public class Main {
	public static void main(String[] args){
		int[] arr = new int[]{99,985,1,2,5,7,7};
		QuickSort s = new QuickSort();
		s.sort(arr,0,arr.length-1);
		QuickSort.display(arr);
	}
}
