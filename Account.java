
package musiclibrary;

import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Account extends User implements UserInterface{
    
    public Account(String fullName, String userName, long phoneNumber, String email, String password, long accountId) {
       super(fullName, userName, phoneNumber, email, password, accountId);
    }

    @Override
    public void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create Account");
        System.out.print("Full Name: ");
        this.fullName = scanner.nextLine();
        System.out.print("Email: ");
        this.email = scanner.nextLine();
        System.out.print("User Name: ");
        this.userName = scanner.nextLine();
        System.out.print("Password: ");
        this.password = scanner.nextLine();
       
        System.out.println("Account is created successfully.");
        System.out.println("Full name: " + this.fullName +"\n"+ "Email: "+ this.email+ "\n" + "User Name: "+ this.userName+ "\n" + "Password: " + this.password + "\n");
    }

    @Override
    public void logInToAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("User Name: ");
        String inputUserName = scanner.nextLine();
        System.out.print("Password: ");
        String inputPassword = scanner.nextLine();
        
        if(inputUserName == this.userName && inputPassword == this.password){
            System.out.println("You log in your account successfully.");
        }else{
            System.out.println("You entered wrong info. Please try again. ");
            logInToAccount();
        }
    }

    @Override
    public void deleteAccount(long accountId) {
        User userToDelete = null;
        for(User user : users){
            if(user.getAccountId() == accountId){
                userToDelete = user;
                break;
            }
        }
        
        if (userToDelete != null) {
            this.getUsers().remove(userToDelete);
            System.out.println("Account with ID " + accountId + " deleted successfully.");
        } else {
            System.out.println("Account with ID " + accountId + " not found.");
        }
    }
    
    @Override
    public void logOut(){
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                // Yeni bir JFrame oluşturun
                JFrame frame = new JFrame("Button Example");
                // Buton oluşturun
                JButton button = new JButton("Log Out");

                // Butonu frame'e ekle
                frame.add(button);

                // Frame'i boyutlandırın ve görünür yapın
                frame.setSize(300, 200);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
        });
    }
    @Override
    public void updatePassword(){
        String newPassword = null;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to update your password? ");
        boolean answer = scanner.nextBoolean();
        if(answer== true){
   
            System.out.print("Enter new password: ");
            newPassword = scanner.nextLine();
  
        }
        password= newPassword;
    }
    @Override
    public void updateUserName(){
        System.out.println("user name is updated.");
    }
    
    
}
