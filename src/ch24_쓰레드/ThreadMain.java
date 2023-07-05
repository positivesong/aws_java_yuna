package ch24_쓰레드;

public class ThreadMain {

	public static void main(String[] args) {
		
		Thread thread1 = new Thread(() -> {
			System.out.println("스레드 이름: " + Thread.currentThread().getName());
			
			for(int i = 0; i < 50; i++) {
				System.out.print(Thread.currentThread().getName() + ": ");
				System.out.println(i);
				try {
					Thread.sleep(2000);  // 2초 멈췄다가 실행 - 카운트 다운 등
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}, "1번 스레드");
		
		Thread thread2 = new Thread(() -> {
			System.out.println("스레드 이름: " + Thread.currentThread().getName());
			
			for(int i = 0; i < 50; i++) {
				System.out.print(Thread.currentThread().getName() + ": ");
				System.out.println(i);
			}
		}, "2번 스레드");
		
		Thread thread3 = new Thread(new ThreadTest(), "3번 스레드");
		
		Thread thread4 = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("스레드 이름: " + Thread.currentThread().getName());
				System.out.println("4번 스레드 실행");
			}
		}, "4번 스레드");
		
		thread1.start();
//		try {
//			thread2.join();  // join() 호출되면 thread1 실행 되고 진행됨. 기다려줌
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		thread2.start();
//		thread3.start();
//		thread4.start();
	}

}
