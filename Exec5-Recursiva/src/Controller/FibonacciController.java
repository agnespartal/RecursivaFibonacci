package Controller;

public class FibonacciController {

	public FibonacciController() {
		super();
		}
	
	public int sequenciaFibonacci(int num) {
		
		if (num == 1 || num == 2) {
			return 1;
		} else {
			return sequenciaFibonacci(num-1) + sequenciaFibonacci(num-2);
		}
	}
}


