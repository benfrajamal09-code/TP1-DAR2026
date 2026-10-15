
package serverPackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
public class Server3 {
    public static void main(String[] args) {
        int port = 5000;
        try {
            InetAddress adresse = InetAddress.getByName("0.0.0.0");
            InetSocketAddress adresseServeur = new InetSocketAddress(adresse, port);
            ServerSocket serverSocket = new ServerSocket();
            serverSocket.bind(adresseServeur);
            System.out.println("Serveur en attente sur le port " + port);
            Socket socket = serverSocket.accept();
            System.out.println("Client connecté !");
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            String operation = in.readLine();
            double x = Double.parseDouble(in.readLine());
            double y = Double.parseDouble(in.readLine());
            double resultat;
            switch (operation) {
                case "1":
                    resultat = x + y;
                    break;
                case "2":
                    resultat = x - y;
                    break;
                case "3":
                    resultat = x * y;
                    break;
                case "4":
                    if (y == 0) {
                        out.println("Erreur : division par zero");
                        socket.close();
                        serverSocket.close();
                        return;
                    }
                    resultat = x / y;
                    break;
                default:
                    out.println("Erreur : operation invalide");
                    socket.close();
                    serverSocket.close();
                    return;
            }
            out.println("Resultat = " + resultat);
            socket.close();
            serverSocket.close();
        } catch (Exception e) {
            System.out.println("Erreur serveur : " + e.getMessage());
        }
    }
}
