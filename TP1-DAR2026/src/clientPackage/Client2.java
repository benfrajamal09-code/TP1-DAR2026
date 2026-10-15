
package clientPackage;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
public class Client2 {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 5000);
            System.out.println("Client connecté au serveur.");
            DataInputStream in =
                    new DataInputStream(socket.getInputStream());
            DataOutputStream out =
                    new DataOutputStream(socket.getOutputStream());
            Scanner clavier = new Scanner(System.in);
            int x;
            do {
                System.out.print("Entrez un entier (0 pour quitter) : ");
                x = clavier.nextInt();

                out.writeInt(x);
                out.flush();

                if (x != 0) {
                    int resultat = in.readInt();
                    System.out.println("Résultat reçu : " + resultat);
                }
            } while (x != 0);
            System.out.println("Fin de la communication.");
            in.close();
            out.close();
            socket.close();
            clavier.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
