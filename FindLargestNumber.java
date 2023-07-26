package practice11;

public class FindLargestNumber {
	static int array[] = { 205, 5498, 89, 46489, 4879856, 23, 94289421, 7 };

	public static void main(String[] args) {
		int maxNumber = findLargestNumber();
		System.out.println("Maximum number in array" + maxNumber);
	}

	private static int findLargestNumber() {
		int max = array[0];
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max)
				max = array[i];
		}
		return max;
	}

}
