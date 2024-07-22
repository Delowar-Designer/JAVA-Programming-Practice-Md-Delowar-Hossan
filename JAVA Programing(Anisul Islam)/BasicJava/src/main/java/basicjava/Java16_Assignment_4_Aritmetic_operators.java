
package basicjava;

import java.util.Scanner;

public class Java16_Assignment_4_Aritmetic_operators {
    public static void main(String [] args){
        
        try(Scanner input = new Scanner(System.in)){
            int phonePrice = 1800; //1800 euros
            int numberOfInstallment, installmentPerMonth;
            
            System.out.print("Number of installments? ");
            // Get number of installments from user
            numberOfInstallment = input.nextInt();
            
            // calculate installment amount per month
            installmentPerMonth = phonePrice / numberOfInstallment;
            
            System.out.println("Monthly installment Amoutn: " + installmentPerMonth + " euros");
        }
    }
    
}
