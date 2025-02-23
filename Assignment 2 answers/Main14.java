public class Main14 {
	public static void main(String[] args) {
		double num = "Hello";
		System.out.println(num);
	}
}

/* Error message:
incompatible types: String cannot be converted to double
                double num = "Hello";
                             ^

Explanation:
Inccorectly declared variable causes thise error. double data type expects a number, a decimal number as an input, whereas "Hello" is a string.

Fix:
public class Main14 {
	public static void main(String[] args) {
		double num = 1.00;
		System.out.println(num);
	}
} */
