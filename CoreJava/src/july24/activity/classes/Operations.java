package july24.activity.classes;

import july24.activity.interfaces.Arithmetic;

public class Operations implements Arithmetic {
	
	private double num1;
	private double num2;
	
	Operations(double num1, double num2) {
		this.setNum1(num1);
		this.setNum2(num2);
	}
	
	public int getSum() {
		int sum = 0;
		if (!(this.getNum1() > this.getNum2())) {
			for (double i = this.getNum1(); i <= this.getNum2(); i++) {
				sum += i;
			}
		}
		return sum;
	}
	
	@Override
	public double getAddition() {
		return this.getNum1() + this.getNum2();
	}
	
	@Override
	public double getSubtraction() {
		return this.getNum1() - this.getNum2();
	}
	
	@Override
	public double getMultiplication() {
		return this.getNum1() * this.getNum2();
	}
	
	@Override
	public double getDivision() {
		double result = 0;
		try {
			result = this.getNum1() / this.getNum2();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public double getNum1() {
		return num1;
	}

	public void setNum1(double num1) {
		this.num1 = num1;
	}

	public double getNum2() {
		return num2;
	}

	public void setNum2(double num2) {
		this.num2 = num2;
	}
	
	
}
