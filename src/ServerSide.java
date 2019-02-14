
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerSide {

    public static void main(String[] args) throws IOException {
        try {
            ServerSocket listener = new ServerSocket(4000);
            System.out.println("Server is ready and is waiting to recieve request");
            Socket ssoc = listener.accept();

            InputStream is = ssoc.getInputStream();
            DataInputStream dis = new DataInputStream(is);

            OutputStream os = ssoc.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);

            String path = "C:\\spiderman\\\\ioprg\\\\Movies.txt";
            String temp = null;

            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            path = dis.readUTF();

            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }

        } catch (IOException e) {
        }

    }

}
