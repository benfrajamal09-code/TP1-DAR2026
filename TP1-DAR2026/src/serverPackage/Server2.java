
package serverPackage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
public class Server2 {
    public static void main(String[] args) {
    	int port = 5000;
        try {
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Serveur en attente du client...");
            Socket socket = serverSocket.accept();
            System.out.println("Client connecté.");
            DataInputStream in =
                    new DataInputStream(socket.getInputStream());
            DataOutputStream out =
                    new DataOutputStream(socket.getOutputStream());
            int x;
            while (true) {
                x = in.readInt();
                if (x == 0) {
                    System.out.println("Fin de la communication.");
                    break;
                }
                int resultat = x * 5;
                System.out.println("Nombre reçu : " + x);
                System.out.println("Résultat : " + resultat);

                out.writeInt(resultat);
                out.flush();
            }
            in.close();
            out.close();
            socket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
