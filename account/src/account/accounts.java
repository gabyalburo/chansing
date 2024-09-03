/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author SCC
 */
public class accounts {
    
    
    String Id, Fname, Lname, Email, User, Pass;
    
    
    public void accountStorage(String id, String fname, String lname,String email, String user, String pass){
        
        this.Id = id;
        this.Fname = fname;
        this.Lname = lname;
        this.Email = email;
        this.User = user;
        this.Pass = pass;
        
    }
    
    public void passwordVerify(String password) {
        
        boolean valid = false; 

        do { // start a loop
            //      Asks user to enter password

            //      Checks to see if password is at least 8 characters. 
            if (password.length()<8) 
            {
                valid = false;
                System.out.println("Password must have at least 8 characters");
                break; // skip to next iteration
            }

            //      Checks each character to see if it is acceptable.
            for (int i = 0; i < password.length(); i++){
                char c = password.charAt(i);

                if (       ('a' <= c && c <= 'z') // Checks if it is a lower case letter
                        || ('A' <= c && c <= 'Z') //Checks if it is an upper case letter
                        || ('0' <= c && c <= '9') //Checks to see if it is a digit
                ) 
                {

                    valid = true;
                }
                else 
                {
                    // tells the user that only letters & digits are allowed
                    System.out.println("Only letter & digits are acceptable.");
                    valid = false;
                    break;
                }

            }
        } while(!valid);   
    }

   public void viewAccount(){
       
       System.out.printf("%-10s %-10s %-10s %-30s %-10s %-10s\n",
                        "ID", "First Name", "Last Name", "Email", "Username", "Password");
       System.out.printf("%-10s %-10s %-10s %-30s %-10s %-10s\n",
                        this.Id, this.Fname, this.Lname, this.Email, this.User, this.Pass); 
       
   }
    
}
