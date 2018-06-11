package pallindrome;

public class Difference {
	double[] numbers = new double[10];
	
	public Difference() {
		// TODO Auto-generated constructor stub
	}
	public Difference(double[] numbers) {
		this.numbers=numbers;
	}
	
	
	
	public double differ(double[] numbers) {
		
		double min = numbers[0];
		double max = numbers[0];
		for(int i=1; i<numbers.length;i++) {
			if(numbers[i]<min) {
				min = numbers[i];
			}
		}
			for(int i=1; i<numbers.length;i++) {
				if(numbers[i]>max) {
					max = numbers[i];
				}
			}
			return max-min;
		}
	
}

