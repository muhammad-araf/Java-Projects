class user{
    private String username;
    private String password;
    void input(String username, String password){
        this.username = username;
        this.password = password;
    }
    void print(){
        System.out.println(username);
        System.out.println(password);
    }

}
public class Authenticator {
    public static void main(String[] args){
        user s = new user();
        s.input("araf","123");
        s.print();

    }
}
