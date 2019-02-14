
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;


public class Server1 {
    public static void main(String[] args) throws IOException{
        try{
            
        ServerSocket listener = new ServerSocket(4000);
        System.out.println("Server is ready and waiting to receive the request");
        Socket ssoc = listener.accept();
        
        InputStream is = ssoc.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        String temp = dis.readUTF();
        System.out.println(temp);
            
        }
        catch(IOException e){
            System.out.println("e");
        }
        
    }
}
