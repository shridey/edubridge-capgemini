package challenges.stocks;

class StockHighException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public StockHighException(String message) {
		super(message);
	}
	
}

class StockLowException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public StockLowException(String message) {
		super(message);
	}
	
}

class Stocks {
	public float stockRate;
	
	public Stocks(float stockRate) {
		this.stockRate = stockRate;
	}
	
	public String checkRate(float rate) throws Exception {
		float percentage = (rate / stockRate) * 100;
		if (percentage == 80) {
			return "Hope to raise";
		} else if (percentage < 80) {
			throw new StockLowException("Under Loss");
		} else {
			throw new StockHighException("Under Profit");
		}
	}
}

public class Main {

	public static void main(String[] args) throws Exception {
		Stocks stocks = new Stocks(10.0f);
		System.out.println(stocks.checkRate(9.0f));
	}

}
