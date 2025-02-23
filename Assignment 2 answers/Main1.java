public class Main1 {
	public void main(String[] args) {
		System.out.println("Hello, World!");
	}
}

/*Error message diplayed: 
Main method not found in class Main1, please define the main method as:
   public static void main(String[] args).

Explanation: 
"static" keyword is missing, which makes the main function inaccessible in the Main class.

Fix:
public class Main1 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
} */

