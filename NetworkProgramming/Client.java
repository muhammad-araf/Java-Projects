
public class Client {

    public static void main(String[] args) {
        Socket socket = new Socket("localhost", 5000);
        DataOutputStream output = new DataOutputStream(socket.getOutputStream());
        DataInputStream inp = new DataInputStream(socket.getInputStream());
        output.writeUTF("Araf");
        String msg = inp.readUTF();
        System.out.println("your name is "+msg);

    }
}
