public class Main3 {
	public static int main(String[] args) {
		System.out.println("Hello, World!");
		return 0;
	}
}

/* Error message displayed:
Main method not found in class Main3, please define the main method as:
   public static void main(String[] args).

Explanation:
main function is declared with a "int" return type, which is a wrong way to declare the main function. It should always be "void", because the main method is not supposed to return any value. 

Fix:
public class Main3 {
	public static void main(String[] args) {
		System.out.println("Hello, World!");
	}
} */