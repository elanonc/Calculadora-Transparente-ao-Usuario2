package calculadora; 

import java.io.IOException;

public class Proxy {

	ClienteTCP clienteTCP;
	
	public Proxy() {
		this.clienteTCP = new ClienteTCP();
		this.clienteTCP.rodar();
	}
	
	public double soma(double a ,double b) throws IOException {
		String msg = String.valueOf(a + ";+;" + b);
		this.clienteTCP.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTCP.getResposta());
		
	}
	public double sub(double a ,double b) throws NumberFormatException, IOException {
		String msg = a + ";-;" + b;
		this.clienteTCP.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTCP.getResposta());
		
	}
	public double mult(double a ,double b) throws NumberFormatException, IOException {
		String msg = a + ";*;" + b;
		this.clienteTCP.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTCP.getResposta());
	
	}
	public double div(double a ,double b) throws NumberFormatException, IOException {
		String msg = a + ";/;" + b;
		this.clienteTCP.enviar(msg);
		System.out.println("\nEnviado");
		return Double.parseDouble(this.clienteTCP.getResposta());
	}
	
	public void close() throws IOException{
		this.clienteTCP.close();
	}
	
}
