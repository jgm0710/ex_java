package kr.ac.mjc.gumin.java.concurrency;

public class GugudanEx {

	public static void main(String[] args) {
		Gugudan gugudan = new Gugudan();
		
	
		new Thread(()->{
			gugudan.print(2);
		}).start();
		new Thread(()->{
		
			gugudan.print(3);
		}).start();
		new Thread(()->{
		
			gugudan.print(4);
		}).start();
		new Thread(()->{
			
			gugudan.print(5);
		}).start();
		new Thread(()->{
		
			gugudan.print(6);
		}).start();
		new Thread(()->{
			
			gugudan.print(7);
		}).start();
		new Thread(()->{
			
			gugudan.print(8);
		}).start();
		new Thread(()->{
		
			gugudan.print(9);
		}).start();
		
		
		
		
		
		
		/*
		 * System.out.println("3��"); new Thread(()->{ gugudan.print(3); }).start();
		 * System.out.println("4��"); new Thread(()->{ gugudan.print(4); }).start();
		 * System.out.println("5��"); new Thread(()->{ gugudan.print(5); }).start();
		 * System.out.println("6��"); new Thread(()->{ gugudan.print(6); }).start();
		 * System.out.println("7��"); new Thread(()->{ gugudan.print(7); }).start();
		 * System.out.println("8��"); new Thread(()->{ gugudan.print(8); }).start();
		 * System.out.println("9��"); new Thread(()->{ gugudan.print(9); }).start();
		 */
		
	}

}

class Gugudan {
	public synchronized void print(int n) {
		System.out.println(n+"단");
		for(int i=1; i<10; i++) {
			System.out.format("%d * %d = %d\n", n,i,n*i);
		}
	}
}
