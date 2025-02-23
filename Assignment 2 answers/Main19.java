public class Main19 {
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		int result = a / b;
		System.out.println(result);
	}
}

/* Error:
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main19.main(Main19.java:5)

Explanation:
Dividing any number by zero, results to infinity. Thus this another logical error showing up as an "exception".

Fix:
public class Main19 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = a / b;
		System.out.println(result);
	}
} */