public class Main22 {
	public static void main(String[] args) {
		static void displayMessage() {
			System.out.println("Message");
		}
	}
}

/* Error:
illegal start of expression
                static void displayMessage() {
                ^
Main22.java:7: error: class, interface, enum, or record expected
}
^

Explanation: Methods are not allowed to be declared inside another method in java.

Fix:
public class Main22 {
	public static void displayMessage() { 
		System.out.println("Message");
	}

	public static void main(String[] args) {
		displayMessage(); 
	}
} */

