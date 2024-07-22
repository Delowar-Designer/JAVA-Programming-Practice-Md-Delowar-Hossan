
package basicjava;
import java.util.Scanner;

public class Java13_input_from_the_user {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number;
        
        
        double num1;
        
        System.out.print("Enter any double value : ");
        num1 = input.nextDouble();
        
        System.out.println(num1);
        
        
        String name;
        System.out.print("Enter your name : ");
        name = input.nextLine();
        
        System.out.println("My Name is "+name);
        
        
//        String name = "Programer Delowar.Designer";
//        System.out.println("Welcame : "+name);
        
        
        
        System.out.print("Enter any nuumber : ");
        number = input.nextInt();
        
        
        System.out.println("Number = "+number);
    }
}
