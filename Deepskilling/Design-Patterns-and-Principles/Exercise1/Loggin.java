package Exercise1;

public class Loggin {
    private static Loggin instance;

    private Loggin() {
    };

    public static Loggin getInstance() {
        if (instance == null)
            instance = new Loggin();
        return instance;
    }

    public void addLog(String msg) {
        System.out.println("[LOG]" + msg);
    }
}
