import java.awt.List;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
	private static ArrayList<String> clientes; 
	
	public Server() throws IOException{
		int porta = 6969; 
		ServerSocket server = new ServerSocket(porta);
		System.out.println("Servidor ouvindo na porta " + porta);
		while(true){
			//aceita uma nova conexão
			Socket cliente = server.accept(); 
			new ThreadClient(cliente).start();
			
		}
	}
	
	public static void main(String [] args) throws IOException{
		new Server();
		clientes = new ArrayList<String>();
		
	}
}
