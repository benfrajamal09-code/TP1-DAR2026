
package clientPackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.Scanner;
public class Client3 {
    public static void main(String[] args) {
        String ipServeur = "192.168.100.9";
        int port = 5000;
        try {
            InetAddress adresse = InetAddress.getByName(ipServeur);
            InetSocketAddress adresseServeur =
                    new InetSocketAddress(adresse, port);
            Socket socket = new Socket();
            socket.connect(adresseServeur);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(
                    socket.getOutputStream(), true);
            Scanner clavier = new Scanner(System.in);
            System.out.println("=== CALCULATRICE TCP ===");
            System.out.println("1. Addition");
            System.out.println("2. Soustraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Choisissez une operation : ");
            String operation = clavier.nextLine();
            System.out.print("Entrez la valeur de x : ");
            double x = Double.parseDouble(clavier.nextLine());
            System.out.print("Entrez la valeur de y : ");
            double y = Double.parseDouble(clavier.nextLine());
            out.println(operation);
            out.println(x);
            out.println(y);
            String resultat = in.readLine();
            System.out.println(resultat);
            socket.close();
        } catch (Exception e) {
            System.out.println("Erreur client : " + e.getMessage());
        }
    }
}
