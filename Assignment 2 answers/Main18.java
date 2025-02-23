public class Main18 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = a + b * 2;
		System.out.println(result);
	}
}

/* Error message: None

Explanation: 
Code runs because the error is logical. The expected result is 30, but the output comes as 20 because java follows BODMAS in operator precedence. The multiplication i.e. b * 2 is carried out before a + b, therefore the answer turns out to be 20.

Fix:
public class Main18 {
	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int result = (a + b) * 2;
		System.out.println(result);
	}
}
*/