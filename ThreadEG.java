class MyThreadEG implements Runnable {
	public void run() {
		for (int i = 1; i <= 100; i++) {
			if (i % 10 == 0)
				System.out.println(i);
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex) {}
			
		}

	}

}

public class ThreadEG {
	public static void main(String[] args) {
		MyThreadEG mt = new MyThreadEG();

		Thread one = new Thread(mt);
		one.setName("Shweta's Thread");
		one.start();

	}

}
