package musiclibrary;

import java.util.ArrayList;
import java.util.Scanner;

public class Account extends AccountManager{
    protected ArrayList<String> friends = new ArrayList<String>();
    
    public Account() {
          
    }
    
    public void addFriends() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the person you want to add: ");
        String userToAdd = scanner.nextLine();
        
        
                if(friends.contains(userToAdd)){
                    System.out.println("The user is already added.");
                }else{
                    friends.add(userToAdd);
                    System.out.println("User " + userToAdd + " is added successfully.");
                }   
    }
          

    public void deleteFriends() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the person you want to delete: ");
        String userToDelete = scanner.nextLine();
        
        
                if(friends.contains(userToDelete)){
                    friends.remove(userToDelete);
                    System.out.println("User " + userToDelete + " is deleted successfully.");
                }else{
                    System.out.println("User " + userToDelete + " is not found.");
                }   
            
       
    }
}