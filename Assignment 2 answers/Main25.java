public class Main25 {
	public static void main(String[] args) {
		double score = 85.0;
		switch(score) {
			case 100:
			System.out.println("Perfect score!");
			break;
			case 85:
			System.out.println("Great job!");
			break;
			default:
			System.out.println("Keep trying!");
		}
	}
}

/* Error message:
 primitive patterns are a preview feature and are disabled by default.
                switch(score) {
                      ^
  (use --enable-preview to enable primitive patterns)
Main25.java:5: error: constant label of type int is not compatible with switch selector type double
                        case 100:
                             ^
Main25.java:8: error: constant label of type int is not compatible with switch selector type double
                        case 85:
                             ^
Explanation:
The switch case in java does not support double data type values, and hence the switch case did not go through the end. For such special cases, if-else can be used if the conditions to be checked are few.

Fix:
public class Main25 {
    public static void main(String[] args) {
        double score = 85.0;

        if (score == 100.0) {
            System.out.println("Perfect score!");
        } else if (score == 85.0) {
            System.out.println("Great job!");
        } else {
            System.out.println("Keep trying!");
        }
    }
} */