public class Main7 {
	public static void main(String[] args) {
		int x = "Hello";
		System.out.println(x);
	}
}

/* Error message:
incompatible types: String cannot be converted to int
                int x = "Hello";

Explanation:
The value passed in the integer variable x should be integer only. Whereas in this snippet a string "Hello" is passed in it. Java enforces type safety for a couple of reasons. One of them is data loss. Suppose you declare 10.55 as a value in a variable as "int x = 10.55", then obviously 0.55 is going to be ignored and thus data loss. Another reason is avoiding errors at runtime. This saves time when the code has a few hundred lines and is distributed amongst a lot of files.

Fix:
public class Main7 {
	public static void main(String[] args) {
		int x = 9;
		System.out.println(x);
	}
} */