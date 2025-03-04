class identifier{
    private String username;
    void inp(String inp){
        username = inp;
    }
    void print(){
        System.out.println("Your UserName is: " + username);
    }
}
public class AccessIdentifier {
    public static void main(String[] args){
        identifier id = new identifier();
        id.inp("m-araf");
        id.print();
    }
    
}
