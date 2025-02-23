public class Main6 {
	public static void main(String[] args) {
		int x = y + 10;
		System.out.println(x);
	}
}

/* Error message displayed:
cannot find symbol
    int x = y + 10;
  symbol:   variable y

Explantion:
The variable "y"  was never declared before using it in the program. Variables need to be declared in order to the machine know the initial value of them, since they are to be undegone processes, like addition in this program.

Fix:
public class Main6 {
	public static void main(String[] args) {
		int y = 20;
		int x = y + 10;
		System.out.println(x);
	}
} */