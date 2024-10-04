package august03.exceptions.challenge.q3;

class Customer {
	int id;
	String name;
	double walletBalance;
	String address;
	
	public Customer(int id, String name, double walletBalance, String address) {
		super();
		this.id = id;
		this.name = name;
		this.walletBalance = walletBalance;
		this.address = address;
	}
}

class Item {
	int id;
	String name;
	String companyName;
	double price;
	boolean isInStock;
	
	public Item(int id, String name, String companyName, double price, boolean isInStock) {
		super();
		this.id = id;
		this.name = name;
		this.companyName = companyName;
		this.price = price;
		this.isInStock = isInStock;
	}
}

class ShoppingWebsite {
	public String purchaseItem(Item i, Customer c) throws ItemOutOfStockException, InsufficientBalanceException {
		if (!i.isInStock) {
			throw new ItemOutOfStockException("item is out of stock");
		}
		
		if (c.walletBalance < i.price) {
			throw new InsufficientBalanceException("customer wallet balance is not sufficient");
		}
		
		return "Order Successful";
	}
}

class InsufficientBalanceException extends Exception {
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String message) {
		super(message);
	}
}

class ItemOutOfStockException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public ItemOutOfStockException(String message) {
		super(message);
	}
}

public class Source {

	public static void main(String[] args) throws ItemOutOfStockException, InsufficientBalanceException {
		Customer cusDet = new Customer(927392, "Steve", 900.0, "USA");
		Item itemDet = new Item(27392, "T-Shirt", "US polo", 800, false);
		ShoppingWebsite obj = new ShoppingWebsite();
		String out = obj.purchaseItem(itemDet, cusDet);
		System.out.println("out = \"" + out + "\"");
	}

}
