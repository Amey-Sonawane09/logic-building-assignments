public class Main8 {
	public static void main(String[] args) {
		System.out.println("Hello, World!"
	}
}

/* Error message:
error: ')' or ',' expected
                System.out.println("Hello, World!"

Explanation:
The SOP statement is missing a parenthesis and a semicolon at the end of the line, resulting a syntax error. The syntax of the sop statement is like grammar for english. It helps make the code machine readable. A simple ";" signifies the end of the line of code, while a ")" signifies the end of arguments passed in the println function.

Fix:
public class Main8 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
} */
