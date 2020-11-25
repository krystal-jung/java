package ThreadDemo;


public class RunnableDemo implements Runnable {
	public void run() {
		for(int i =0;i<8;i++) {
			System.out.println(Thread.currentThread().getName()+"正在运行！");
		}
	}

	public static void main(String[] args) {
		for(int i =0;i<10;i++) {
			RunnableDemo runnable = new RunnableDemo();
			Thread t = new Thread(runnable);
			t.setName("runnable"+i);
			t.start();
		}

	}

}
