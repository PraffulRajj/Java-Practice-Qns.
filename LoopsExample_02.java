import java.util.Scanner;

public class LoopsExample_02 {
//Make a menu driven program. The user can enter 2 numbers, either 1 or 0. 
//If the user enters 1 then keep taking input from the user for a student’s marks(out of 100). 
//If they enter 0 then stop.
//If he/ she scores : 
//Marks >=90 -> print “This is Good”
//89 >= Marks >= 60 -> print “This is also Good”
//59 >= Marks >= 0 -> print “This is Good as well”
//Because marks don’t matter but our effort does.
//(Hint : use do-while loop but think & understand why)

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.print("Enter 1 to enter student's marks or 0 to exit: ");
        int a = sc.nextInt();
        int marks;
        do {
            if (a == 1) {
                System.out.print("Enter student's marks (0-100): ");
                marks = sc.nextInt();
                
                if (marks >= 90) {
                    System.out.println("This is Good");
                } else if (marks >= 60) {
                    System.out.println("This is also Good");
                } else if (marks >= 0) {
                    System.out.println("This is Good as well");
                    
                } else {
                    System.out.println("Invalid marks. Please enter a number between 0 and 100.");
                }
            } else if (a == 0) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid input. Please enter either 1 or 0.");
            }
        } while (true);
    }
}
