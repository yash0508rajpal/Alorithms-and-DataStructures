public class Main {
	public static void main(String[] args){
		int[] arr = new int[]{11,3,45,10,44,4};
		HeapSort heap = new HeapSort();
		heap.buildHeap(arr);
		heap.heapSort(arr);
		HeapSort.display(arr);
	}
}
