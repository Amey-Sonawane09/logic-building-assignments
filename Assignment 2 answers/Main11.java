public class Main11 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arr[5]);
	}
}

/* Error message:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 3
        at Main11.main(Main11.java:4)

Explanation:
The array arr[] only has three elements in it. The print functions tries to access the 6th element in the array, which does not exist so the out of bounds exception.

Fix:
public class Main11 {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3};
		System.out.println(arr[0]);
	}
} */