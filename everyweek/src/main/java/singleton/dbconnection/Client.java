package singleton.dbconnection;

public class Client {
	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new MyThread(i + "").start();
		}
	}
	
	
}
class MyThread extends Thread{
	public MyThread(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		DBConnection.getInstance();
	}
}