package Exercise1;

public class Ex1 {
    public static void main(String[] args) {
        Loggin l1 = Loggin.getInstance();
        Loggin l2 = Loggin.getInstance();
        l1.addLog("User Created");
        l2.addLog("User Logged In");
        System.out.println(l1 == l2);
    }
}