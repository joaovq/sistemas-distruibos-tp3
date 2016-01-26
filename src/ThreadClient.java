import java.io.DataOutputStream;
import java.io.ObjectInputStream;
import java.net.Socket;

public class ThreadClient extends Thread {
	private Socket cliente; 
	
	public ThreadClient(Socket cliente){
		this.cliente = client; 
	}
	
	public void run(){
		try{
			ObjectInputStream entrada = new ObjectInputStream(cliente.getInputStream());
	        DataOutputStream saida  = new DataOutputStream(cliente.getOutputStream());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
