
package clientPackage;

import java.io.IOException;
import java.net.Socket;

public class Client {

    public static void main(String[] args) {

        Socket socket = null;

        try {
            System.out.println(
                "Je suis un client pas encore connecte..."
            );
            socket = new Socket("127.0.0.1", 5000);

            System.out.println("Je suis un client connecte");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            try {
                if (socket != null) {
                    socket.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

