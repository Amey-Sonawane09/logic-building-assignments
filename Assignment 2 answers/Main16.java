public class Main16 {
	public static void main(String[] args) {
		int num = 10;
		double result = num / 4;
		System.out.println(result);
	}
}

/* Error message: None

Explanation:
The code goes the compilation and runs as well, because there is a logical error in the code. Since num is int and 4 is also int, the result is calculated based on integer division. The result is declared as double, but the division is carried out first and the declaration of the data type of result is done later. Thats's why output is 2.0 instead of just 2. Whereas the actual output must be 2.5.

Fix:
public class Main16 {
	public static void main(String[] args) {
		int num = 10;
		double result = num / 4.0;
		System.out.println(result);
	}
} */