package august02.threading;

class Runner extends Thread {

	static String[] winners = new String[10];
	static int winner = 0;
	
	private int distanceTravelled = 0;
	private int destination = 10;
	
	private static final Object LOCK = new Object();

	public int getDistanceTravelled() {
		return distanceTravelled;
	}

	public void setDistanceTravelled(int distanceTravelled) {
		this.distanceTravelled = distanceTravelled;
	}

	public void handleRace() {
		while (this.getDistanceTravelled() < destination) {
			try {
				Thread.sleep(1000);
				synchronized (LOCK) {
					this.setDistanceTravelled(this.getDistanceTravelled() + 1);
					System.out.println(Thread.currentThread().getName() + " reached " + this.getDistanceTravelled());
					
					if (this.getDistanceTravelled() == destination) {
						Runner.winners[Runner.winner++] = Thread.currentThread().getName();
						break;
					}
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void run() {
		handleRace();
	}
}

public class Race {

	public static void main(String[] args) {
		Runner runner1 = new Runner();
		Runner runner2 = new Runner();
		Runner runner3 = new Runner();
		Runner runner4 = new Runner();
		Runner runner5 = new Runner();
		Runner runner6 = new Runner();
		Runner runner7 = new Runner();
		Runner runner8 = new Runner();
		Runner runner9 = new Runner();
		Runner runner10 = new Runner();

		runner1.setName("Shri");
		runner2.setName("Ravi");
		runner3.setName("Kirti ji");
		runner4.setName("Tannu");
		runner5.setName("Saniya");
		runner6.setName("Ahmed");
		runner7.setName("Abdullah");
		runner8.setName("Gourav");
		runner9.setName("Chetan");
		runner10.setName("Aarti");

		runner1.start();
		runner2.start();
		runner3.start();
		runner4.start();
		runner5.start();
		runner6.start();
		runner7.start();
		runner8.start();
		runner9.start();
		runner10.start();
		
		try {
            runner1.join();
            runner2.join();
            runner3.join();
            runner4.join();
            runner5.join();
            runner6.join();
            runner7.join();
            runner8.join();
            runner9.join();
            runner10.join();
            
            System.out.println("\n*********************************\n");
            for (int i = 0; i < Runner.winners.length; i++) {
                System.out.println("Winner " + (i + 1) + ": " + Runner.winners[i]);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
	}
}