import java.util.Scanner;

public class day07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases
        scanner.nextLine(); // Consume newline
        
        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            StringBuilder even = new StringBuilder();
            StringBuilder odd = new StringBuilder();
            
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    even.append(s.charAt(j)); // Even index characters
                } else {
                    odd.append(s.charAt(j)); // Odd index characters
                }
            }
            
            System.out.println(even + " " + odd);
        }
        
        scanner.close();
    }
}
