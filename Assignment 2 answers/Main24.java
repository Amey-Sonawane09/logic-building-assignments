public class Main24 {
	public static void main(String[] args) {
		int level = 1;
		switch(level) {
		case 1:
		System.out.println("Level 1");
		case 2:
		System.out.println("Level 2");
		case 3:
		System.out.println("Level 3");
		default:
		System.out.println("Unknown level");
		}
	}
}

/* Error message: None

Explanation:
Another case of missing break statements in between switch cases. Break terminates the loop if a case matches the specified case.

Fix:
public class Main24 {
	public static void main(String[] args) {
		int level = 1;
		switch(level) {
		case 1:
		System.out.println("Level 1");
		break;
		case 2:
		System.out.println("Level 2");
		break;
		case 3:
		System.out.println("Level 3");
		break;
		default:
		System.out.println("Unknown level");
		break;
		}
	}
}
*/