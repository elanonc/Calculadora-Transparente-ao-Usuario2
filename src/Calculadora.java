package calculadora;

public class Calculadora {

	private double total;

	public Calculadora() {
		this.total = 0.0;
		// TODO Auto-generated constructor stub
	}

	public void somar(double a,double b) { 
		this.total = a + b;
	}

	public void subtrair(double a,double b) {
		this.total = a - b;
	}

	public void dividir(double a,double b) {
		this.total = a / b;
	}

	public void multiplicar(double a,double b) { 
		this.total = a * b;
	}
	
	public double getTotal() {
		return this.total;
	}

}
