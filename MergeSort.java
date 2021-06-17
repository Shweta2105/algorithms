package AlgorithmProb;

public class MergeSort {
	public static void main(String[] args) {
		MergeSort obj = new MergeSort();
		int[] arr = { 54, 86, 12, 69, 2, 98, 10 };

		System.out.println("array to b sorted :");
		obj.print(arr);
		obj.mergesort(arr, 0, arr.length - 1);
		System.out.println("\nsorted array :\n");
		obj.print(arr);

	}

	private void print(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private void mergesort(int[] arr, int l, int r) {
		if (l < r) {
			int mid = l + (r - l) / 2;

			mergesort(arr, l, mid);
			mergesort(arr, mid + 1, r);

			merge(arr, l, mid, r);
		}

	}

	private void merge(int[] arr, int l, int mid, int r) {
		int n1 = mid - l + 1;
		int n2 = r - mid;
		// create temp arrays
		int L[] = new int[n1];
		int R[] = new int[n2];

		for (int i = 0; i < n1; i++) {
			L[i] = arr[l + i];
		}
		for (int j = 0; j < n2; j++) {
			R[j] = arr[mid + 1 + j];
		}
		// merge the temp arrays

		int i = 0, j = 0; // Initial index of subarray
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		// copy remaining elements L[i]
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		// copy remaining elements R[j]
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;

		}
	}

}
