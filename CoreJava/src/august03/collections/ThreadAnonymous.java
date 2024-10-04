package august03.collections;

public class ThreadAnonymous {

	public static void main(String[] args) {
		Thread t1=new Thread() {
			public void run() {
				System.out.println("run method");
			}
		};
		
		t1.start();
		
		new Thread() {
			public void run() {
				System.out.println("run method");
			}
		}.start();
		
		Runnable rob=new Runnable() {
			@Override
			public void run() {
				System.out.println("run method of Runnable interface");
			}
		};
		
		Thread t2=new Thread(rob);
		t2.start();
		
		new Thread(new Runnable() {
			@Override
			public void run() {
				
			}
		}).start();
	}
}
