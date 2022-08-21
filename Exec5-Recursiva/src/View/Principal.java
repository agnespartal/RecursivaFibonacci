package View;

import Controller.FibonacciController;

public class Principal {

	public static void main(String[] args) {
		FibonacciController fib = new FibonacciController();
		
		
		int num = 9;
		int resultado = fib.sequenciaFibonacci(num);
		System.out.println(resultado);
	}
	

}
