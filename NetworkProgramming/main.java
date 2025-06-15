public class main {
    public static void main(String[] args) {
    try{
        ServerSocket server = new ServerSocket(5000);
        Socket client = server.accept();
        DataInputStream inp = new DataInputStream(client.getInputStream());
        DataOutputStream out = new DataOutputStream(client.getOutputStream());
        String name = inp.readUTF();
        out.writeUTF("Hello, "+name);
    }catch (IOException e){
            System.out.println("Error: " + e.getMessage());
    }
}
}
