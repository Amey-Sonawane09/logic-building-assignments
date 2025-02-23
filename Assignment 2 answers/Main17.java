public class Main17 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = a ** b;
		System.out.println(result);
	}
}

/* Error message: 
illegal start of expression
                int result = a ** b;
                                ^
Explanation:
"**" is not a valid operator in java. It does not exist because there is another way to do so, Math.pow(num1, num2).

Fix:
public class Main17 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		double result = Math.pow(a, b);
		System.out.println(result);
	}
} */