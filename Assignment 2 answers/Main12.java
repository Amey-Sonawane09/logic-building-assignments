public class Main12 {
	public static void main(String[] args) {
		while (true) {
		System.out.println("Infinite Loop");
		}
	}
}

/* Error message:
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop
Infinite Loop...

Explanation:
The exit condition on the while loop has been not defined appropirately, neither is there any increment or decrement operator which leads to the infinite loop.

Fix:
public class Main12 {
    	public static void main(String[] args) {
        	int x = 0;
        	while (x < 5) {
            		System.out.println("Loop running...");
            		x++;
        	}
        	System.out.println("Loop ended.");
    	}
} */
