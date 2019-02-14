
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;


public class Client_Server {
    public static void main(String[] args) throws IOException{
        Socket csoc = new Socket("localhost",4000);
        
        OutputStream os = csoc.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);
        
        InputStream is = csoc.getInputStream();
        DataInputStream dis = new DataInputStream(is);
        
        Scanner scan = new Scanner(System.in);
        
        for(int i=1; i<=5; i++){
            String msg = scan.next();
            dos.writeUTF(msg);
            
            String temp =dis.readUTF();
            System.out.println(temp);
        }
        
    }
    
}
