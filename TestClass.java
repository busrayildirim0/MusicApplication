
package musiclibrary;

public class TestClass {
    public static void main(String[] args) {
        Account account1 = new Account();
        Music music = new Music();
        //account1.createAccount();
        //account1.updatePassword();
        //System.out.println(account1.password);
        //music.share();
        PremiumAccount p1 = new PremiumAccount();
        p1.payment(1256455, true);
    }
}
