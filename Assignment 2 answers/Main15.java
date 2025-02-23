public class Main15 {
	public static void main(String[] args) {
		int num1 = 10;
		double num2 = 5.5;
		int result = num1 + num2;
		System.out.println(result);
	}
}

/* Error message:
incompatible types: possible lossy conversion from double to int
                int result = num1 + num2;
                                  ^
Explanation:
When you add an "int" variable and a "double" type variable, there is data loss taking place. Since java enforces data type safety, the program terminates at compile time itself.

Fix:
public class Main15 {
	public static void main(String[] args) {
		double num1 = 10.0;
		double num2 = 5.5;
		double result = num1 + num2;
		System.out.println(result);
	}
} */