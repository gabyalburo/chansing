package account;

//this is the main!

import java.util.Scanner;

public class Account {
    
    int accCount = 0;  // Keep accCount as an instance variable

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Account account = new Account();  // Create an instance of Account
        accounts[] ac = new accounts[100];
        
        boolean status = false;
        
        do {
            System.out.println("------------------------------------");
            System.out.print("1. Add\n2. View\n3. Exit\n");
            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();
        
            switch(choice) {
                case 1:
                    account.accountRegistration(ac);  // Call accountRegistration using the instance
                    break;

                case 2:
                    for(int i = 0; i < account.accCount; i++) {  // Access accCount through the instance
                        ac[i].viewAccount();
                    }
                    break;
                
                case 3:
                    System.exit(0);
                    break;

                default:    
                    System.out.println("Invalid choice. Please try again.");
            }
            
        } while(!status);
    }

    public void accountRegistration(accounts[] ac) {  // Change to instance method and pass the accounts array
        
        accounts call = new accounts();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("------------------------------------");
        System.out.print(" Enter no. of Account(s): ");
        int accNum = sc.nextInt();
        
        for(int i = 0; i < accNum; i++) {
            ac[i] = new accounts();
            
            System.out.println("------------------------------------");
            System.out.println("  Enter Details of Account " + (i + 1));
            System.out.print("  ID: ");
            String id = sc.next();
            System.out.print("  First Name: ");
            String firstName = sc.next();
            System.out.print("  Last Name: ");
            String lastName = sc.next();
            System.out.print("  Email: ");
            String email = sc.next();
            System.out.print("  Username: ");
            String userName = sc.next();
            System.out.print("  Password: ");
            String passWord = sc.next();
            call.passwordVerify(passWord);
            
            ac[i].accountStorage(id, firstName, lastName, email, userName, passWord);
            
            accCount++;  // Update the instance variable
        }
    }
}
