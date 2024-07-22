
package basicjava;
import java.util.Scanner;

public class Java14_Assignment_3_User_Input {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int id, price;
        String title, description, category;
        
        System.out.print("Enter Id: ");
        id = input.nextInt();
        input.nextLine(); //Consume the leftover newline
        
        System.out.print("Enter Title: ");
        title = input.nextLine();
        
        System.out.print("Enter Price: ");
        price = input.nextInt();
        input.nextLine(); //Consume the leftover newline
        
        System.out.print("Enter Description: ");
        description = input.nextLine();
        
        System.out.print("Enter Category: ");
        category = input.nextLine();
        
        
        
        System.out.println("Id: " + id);
        System.out.println("Title: " + title);
        System.out.println("Price: " + price + " euros");
        System.out.println("Description: " + description);
        System.out.println("Category: " + category);
        
        input.close();
    }
}
