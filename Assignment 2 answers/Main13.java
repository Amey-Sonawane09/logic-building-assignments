public class Main13 {
	public static void main(String[] args) {
		String str = null;
		System.out.println(str.length());
	}
}

/* Error message:
Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "<local1>" is null

Explanation:
Because string str is pointing to null, which means its pointing to nothing, so the String.length() function is trying to access a string which does not exist at all.

Fix:
public class Main13 {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(str.length());
	}
} */