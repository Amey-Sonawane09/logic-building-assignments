public class Main9 {
	public static void main(String[] args) {
		int class = 10;
		System.out.println(class);
	}
}

/* Error message:
Main9.java:3: error: not a statement
                int class = 10;
                ^
Main9.java:3: error: ';' expected
                int class = 10;
                   ^
Main9.java:3: error: <identifier> expected
                int class = 10;
                         ^
Main9.java:4: error: illegal start of expression
                System.out.println(class);
                                   ^
Main9.java:4: error: <identifier> expected
                System.out.println(class);
                                        ^
Explanation:
The keyword "class" is reserved for declaring classes and cannot be used as an variable name. Keywords have predefined meanings in Java and, using them where they're not intended to be creates disambiguities in the code.

Fix:
public class Main9 {
	public static void main(String[] args) {
		int _class = 10;
		System.out.println(class);
	}
} */