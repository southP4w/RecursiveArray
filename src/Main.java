public class Main
{
	public static void main(String[] args) {
		int[] a = {1, 1, 1}, b = {2, 2, 2};
		int[][] c = new int[][]{a, b};
		System.out.println(calculateSum2D(c));

//		System.out.println("Recursive sum of 'a' (1D):");
//		System.out.println(calculateSumRecursively(a, a.length));

		System.out.println("Recursive sum of 'c' (2D):");
		System.out.println(calculateSum2DRecursively(c, a.length-2, b.length-2));
	}

	static int calculateSum2DRecursively(int[][] arr, int rows, int cols) {
		if (cols<=0 || cols!=rows)
			return 0;

		return calculateSum2DRecursively(arr, rows, cols - 1) + arr[rows][cols]
				+ calculateSum2DRecursively(arr, rows - 1, cols) + arr[rows][cols];
	}

	static int calculateSumRecursively(int[] arr, int cols) {
		if (cols<=0)
			return 0;

		return calculateSumRecursively(arr, cols - 1) + arr[cols - 1];
	}

	static int calculateSum2D(int[][] arr) {
		int sum = 0, i;
		for (int[] ints: arr) {
			for (i = 0; i<arr.length; i++)
				sum += ints[i];
			sum += ints[i];
		}

		return sum;
	}

	static int calculateSum(int[] arr) {
		int sum = 0;
		for (int i: arr) sum += i;

		return sum;
	}
}