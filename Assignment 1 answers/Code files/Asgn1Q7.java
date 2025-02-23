class Asgn1Q7 {
	public static void main(String[] args) {
		int a = 3;
		int b = 6;
		int c = 45;
		if (a > b && a > c) {
			System.out.println("a = " + a + " is largest among a, b and c");
		} else if (b > a && b > c) {
			System.out.println("b = " + b + " is largest among a, b and c");
		} else {
			System.out.println("c = " + c + " is largest among a, b and c");
		}
	}
}