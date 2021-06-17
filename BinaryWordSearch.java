package AlgorithmProb;

import java.util.Scanner;

public class BinaryWordSearch {

	public static void main(String[] args) {
		String[] arr = { "dog", "Fish", "deer", "orchid", "chair","man" };
		System.out.println("List of words:");
		print(arr);
		System.out.println("\nEnter word to b searched : ");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int result = binarysearch(arr, word);
		if (result == -1)
			System.out.println(word + " is not present");
		else
			System.out.println(word + " is at " + result + " position");

	}

	private static int binarysearch(String[] arr, String word) {
		for (int i = 0; i <= arr.length - 1; i++) {
			int mid = i + (arr.length - 1) / 2;
			int result = word.compareTo(arr[mid]);

			// Check if string is present at mid
			if (result == 0)
				return mid;

			// If result is greater, then ignore left half
			if (result > 0)
				i = mid + 1;

			// If result is smaller, then ignore right half
			else
				result = mid - 1;
		}
		return -1;

	}

	private static void print(String[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
