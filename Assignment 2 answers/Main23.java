public class Main23 {
	public static void main(String[] args) {
		int value = 2;
		switch(value) {
			case 1:
			System.out.println("Value is 1");
			case 2:
			System.out.println("Value is 2");
			case 3:
			System.out.println("Value is 3");
			default:
			System.out.println("Default case");
		}
	}
}

/* Error: None

Explanation: 
Another logical error here. The problem is the missing break statement after each switch case. So the program finds that "value" is 2, but prints the cases after as well, due to a condition called fall through behaviour.

Fix:
public class Main23 {
	public static void main(String[] args) {
		int value = 2;
		switch(value) {
			case 1:
			System.out.println("Value is 1");
			break;
			case 2:
			System.out.println("Value is 2");
			break;
			case 3:
			System.out.println("Value is 3");
			break;
			default:
			System.out.println("Default case");
			break;
		}
	}
} */