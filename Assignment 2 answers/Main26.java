public class Main26 {
	public static void main(String[] args) {
		int number = 5;
		switch(number) {
			case 5:
			System.out.println("Number is 5");
			break;
			case 5:
			System.out.println("This is another case 5");
			break;
			default:
			System.out.println("This is the default case");
		}
	}
}

/* Error message:
duplicate case label
                        case 5:
                        ^

Explanation:
The cases are all numbered "5", which means all the cases match the given number = 5. Thus the switch case throws a compilation error. The cases must be unique for the switch case to work.

Fix:
public class Main26 {
	public static void main(String[] args) {
		int number = 5;
		switch(number) {
			case 5:
			System.out.println("Number is 5");
			break;
			default:
			System.out.println("This is the default case");
		}
	}
} */