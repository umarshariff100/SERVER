
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;


public class Server_Socket {
    public static void main(String[] args){
        try{
            ServerSocket ser = new ServerSocket(9999);
            Socket sock = ser.accept();
            BufferedReader ed = new BufferedReader(new InputStreamReader(sock.getInputStream()));
            String tmp = ed.readLine();
            System.out.println("I receved : " + tmp);
            
        }
        catch(IOException ex){
            
        }
    }
    
}
