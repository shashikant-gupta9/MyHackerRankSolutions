import java.util.Scanner;

public class ReadLinesUntilEOF {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int lineNumber = 0;
        
        // Read input until EOF
        while (scanner.hasNext()) {
            lineNumber++;
            String line = scanner.nextLine();
            System.out.println(lineNumber + " " + line);
        }

        scanner.close();
    }
}
