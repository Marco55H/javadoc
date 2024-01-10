package clases;

public class Operaciones {

	double num1;
	double num2;

	public Operaciones() {
		
	}

	public Operaciones(double num1, double num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public double suma() {
		return num1+num2;
	}
	
	public double resta() {
		return num1-num2;
	}
	
	public double multiplicacion() {
		return num1*num2;
	}
	
	public double division() {
		double res = 0;
		
		if(num2 != 0) {
			res = num1/num2;
		} 
		return res;
	}
	
	public double max() {
		return num1>num2 ? num1 : num2; 
	}
	
	public double min() {
		return num1<num2 ? num1 : num2; 
	}
}
