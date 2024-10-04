package challenges;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Runnable runnable = () -> {
        	System.out.println("Start");
        };
        
        Thread thread = new Thread(runnable);
        
       thread.start();
	}

}
