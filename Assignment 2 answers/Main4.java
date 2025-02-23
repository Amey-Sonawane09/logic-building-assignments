public class Main4 {
	public static void main() {
		System.out.println("Hello, World!");
	}
}

/* Error message displayed:
Main method not found in class Main4, please define the main method as:
   public static void main(String[] args).

Explanation:
"String[] args" arguments are missing in the function declaration. It is required in case there is a requirement of passing of command line arguments. 

Fix:
public class Main4 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
} */