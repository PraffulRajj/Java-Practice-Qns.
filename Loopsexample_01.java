import java.util.Scanner;

public class Loopsexample_01 {
    public static void main(String[] args) {
        
        //Print all even numbers till n.

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n = sc.nextInt();
        

        int i = 1;
        for(i = 1; i <= n; i++) {
            if(i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
    
}
