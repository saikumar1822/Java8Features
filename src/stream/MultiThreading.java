package stream;

/*class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("child thread");
		}
	}

}
*/
public class MultiThreading {
	public static void main(String[] args) {
		//MyRunnable r = new MyRunnable();
		Runnable r1=()->{for (int i = 0; i < 10; i++) {
			System.out.println("Lambda thread");
		}
		};
		Thread t = new Thread(r1);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("main thread");
		}

	}
}
