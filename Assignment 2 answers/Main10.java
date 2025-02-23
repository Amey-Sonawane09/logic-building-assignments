public class Main10 {
	public void display() {
		System.out.println("No parameters");
	}
	public void display(int num) {
		System.out.println("With parameter: " + num);
	}
	public static void main(String[] args) {
		display();
		display(5);
	}
}

/* Error message: 
Main10.java:9: error: non-static method display() cannot be referenced from a static context
                display();
                ^
Main10.java:10: error: non-static method display(int) cannot be referenced from a static context
                display(5);
                ^

Explanation:
Inclusion of "static" in the main function creates the space in the function static in context. Both the display() functions were declared non-statically, meaning an object of the Main10 class needs to be created in the main function for them to be accesible in it.

Fix:
public class Main10 {
	public void display() {
		System.out.println("No parameters");
	}
	public void display(int num) {
		System.out.println("With parameter: " + num);
	}
	public static void main(String[] args) {
		Main obj = new Main();
		obj.display();
		obj.display(5);
	}
} */