package Controller;

public class FibonacciController {

	public FibonacciController() {
		super();
		}
	
	public int sequenciaFibonacci(int num) {
		//condição de parada quando o valor inicial for igual a 1 ou 2
		if (num == 1 || num == 2) {
			return 1;
		} else {
			return sequenciaFibonacci(num-1) + sequenciaFibonacci(num-2);
			//nem froid explica, só sei que deu certo
		}
	}
}


