import java.util.*;

public class java_int_to_string {
    public static void main(String[] args) {

        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();
            String s = Integer.toString(n); // Convert integer to string

            // Rest of the code remains unchanged
            if (n == Integer.parseInt(s)) {
                System.out.println("Good job");
            } else {
                System.out.println("Wrong answer.");
            }
        } catch (SecurityException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }
}
