package AlgorithmProb;

public class InsertionSort {
	public static void main(String[] args) {
		InsertionSort sort = new InsertionSort();
		
		int arr[] = {54,86,12,69,2,98,10};
		sort.insertionsort(arr);
		System.out.println("Element after sorted using insertion sort :");
		sort.print(arr);
		
		
	}

	private void print(int[] arr) {
		int n= arr.length;
		for(int i = 0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

	private void insertionsort(int[] arr) {
		int n = arr.length;
		for (int i = 1; i < n; ++i) {
			int key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}

		
	}

}
