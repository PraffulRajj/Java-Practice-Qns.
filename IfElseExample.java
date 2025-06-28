import java.util.Scanner;
public class IfElseExample {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            switch (scanner.nextInt()) {
                case 1: System.out.println(a+b);
                break;
                    
                case 2: System.out.println(a-b);
                break;

                case 3: System.out.println(a*b);
                break;
            
                case 4: 
                    if (b != 0) {
                        System.out.println(a/b);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;
                case 5:
                    if (b != 0) {
                        System.out.println(a % b);
                    } else {
                        System.out.println("Division by zero is not allowed.");
                    }
                    break;    
                default:
                    break;
            }
        }
    }
}
    
        