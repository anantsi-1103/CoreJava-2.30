package MultiThreading;

public class code2 {
	public static void main(String[] args) {
		MyRunnable myrun = new MyRunnable(); // interface ko call kra
		Thread t1 = new Thread(myrun); // thread k object bana kr interface ko refer krliya

		t1.start();

	}
}

class MyRunnable implements Runnable {

	public void run() {
		System.out.println("Thread by Runnable Interface");
	}

}
