package testapp;

import java.util.Scanner;

public class passChecker {
    
    public boolean valid = false;
    
    public void passInput() {
        Scanner sc = new Scanner(System.in);
        
        boolean status = false;
        
        System.out.println("1. Must be above 8 characters long\n"
                          +"2. Must have at least 1 upper & 1 lower case letters\n"
                          +"3. Must have atleast 1 number\n"
                          +"4. Must have atleast 1 special character\n"
                          +"5. Must not have common names like 'admin', 'password', and '1234'\n");
        
        while (!status) {
            System.out.print("Enter password: ");
            String pass = sc.next();
            status = passVerify(pass); // Capture the return value and update status
        }
        
        System.out.println("Password accepted.");
    }
    
    public boolean passVerify(String password) {
        
         if (
                
                password.equals("admin") || password.equals("password") || password.equals("1234")
                
             )
        {
            System.out.println("Must not have common names like 'admin', 'password', and '1234'");
            return false;
        } 
        
        if (password.length() < 8) {
            System.out.println("Pass too short!");
            return false;
        } 
        
        else {
            return true;
        }
    }    
}
