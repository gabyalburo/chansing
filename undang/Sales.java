
package undang;

import java.util.Scanner;

public class Sales {
    public void getSales(){
        Scanner input = new Scanner(System.in);
        
        String C_NAME, P_NAME;
        int QUANTITY, PRICE, CASH, CHANGE;
        
        System.out.print("Enter Customer name: ");
        C_NAME = input.nextLine();
        System.out.print("Enter Product Name: ");
        P_NAME = input.nextLine();
        System.out.print("Enter Quantity: ");
        QUANTITY = input.nextInt();
        System.out.print("Enter Price: ");
        PRICE = input.nextInt();
        System.out.print("Enter Cash: ");
        CASH = input.nextInt();
        
        System.out.println("---------------------------");
        System.out.println("RECEIPT:");
        System.out.println("---------------------------");
        System.out.println("Name: "+C_NAME);
        System.out.println("\nItem Name: "+P_NAME);
        System.out.println("Quantity: "+QUANTITY);
        System.out.println("---------------------------");
        System.out.println("Total Due: "+(PRICE*QUANTITY)+".00");
        System.out.println("Cash: "+CASH+".00");
        System.out.println("---------------------------");
        System.out.println("Change: "+(CASH-(PRICE*QUANTITY))+".00");
    }
        