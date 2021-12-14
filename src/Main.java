package calculadora;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Proxy proxy = new Proxy();

        System.out.println(proxy.soma(1.0,1.0));
        System.out.println(proxy.sub(2.0,1.0));
        System.out.println(proxy.mult(5.0,2.0));
        System.out.println(proxy.div(8.0,5.0));

	}
	
}
