public class Main21 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	// Missing closing brace here
}

/* Error:
reached end of file while parsing
}
 ^

Explanation: The main function opened at the 2nd line was never closed, hence the program threw an error.

Fix:
public class Main21 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
} */
