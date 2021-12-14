package calculadora;

import java.net.*;
import java.io.*;

public class ClienteTCP {
	DataOutputStream out;
	DataInputStream in;
	Socket s = null;
	int serverPort = 7896;
	
	public ClienteTCP() {
		// TODO Auto-generated constructor stub
	}
	
	public void rodar () {

		try{
			s = new Socket("127.0.0.1", serverPort);    
			in = new DataInputStream( s.getInputStream());
			out = new DataOutputStream( s.getOutputStream());
		
			
			
		} catch (UnknownHostException e){
			System.out.println("Socket:"+e.getMessage());
		} catch (EOFException e){
			System.out.println("EOF:"+e.getMessage());
		} catch (IOException e){
			System.out.println("readline:"+e.getMessage());
		}
	}
	
	
	public void enviar(String msg) throws IOException {
		out.writeUTF(msg);      	// UTF is a string encoding see Sn. 4.4q		
	}
	
	public String getResposta() throws IOException {

        String data = "";

        data = in.readUTF();
        return String.valueOf(data);

	}
	
	public void close() throws IOException {
		s.close();
	}
	
	
	
}