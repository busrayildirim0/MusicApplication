package musiclibrary;

import java.util.ArrayList;

public class User {
    protected String fullName;
    protected String userName;
    protected long phoneNumber;
    protected String email;
    protected String password;
    protected int accountId;
    private ArrayList<String> users = new ArrayList<>();
    protected ArrayList<User> friends;

    public User() {
        
    }
    public void addUserToArraylist(){
        getUsers().add("Büşra Yıldırım");
        getUsers().add("Havva Nur Aslan");
    }
    public void showInfo(){
        System.out.println(getUsers().get(0));
        System.out.println(getUsers().get(1));

    }

    
    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAccountId() {
        return this.accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }


    public ArrayList<User> getFriends() {
        return friends;
    }

    public void setFriends(ArrayList<User> friends) {
        this.friends = friends;
    }

    public ArrayList<String> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<String> users) {
        this.users = users;
    }
}
