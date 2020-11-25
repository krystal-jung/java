package ThreadDemo;

class MyThread extends Thread{
	public void run() {
	for(int i = 0;i<3;i++) {
		System.out.println(Thread.currentThread().getName()+"-ÕýÔÚÖ´ÐÐ£¡");
	}
	}
}
public class ThreadDemo {

	public static void main(String[] args) {
		for(int i = 0;i<10;i++) {
		MyThread thread = new MyThread();
		thread.start();
		}

	}

}
