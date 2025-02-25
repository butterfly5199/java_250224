package java_250219.ch05.first;

import java.awt.Toolkit;

public class BeepPrintThreadEx {
	
	public static void main(String[] args) {
		
		//way1
		Runnable runnable = new BeepPrintRunnable();
		Thread thread = new Thread(runnable);
		
		
		//way2
//		Thread thread = new Thread(new Runnable() {
//			Toolkit toolkit = Toolkit.getDefaultToolkit();
//			public void run() {
//				
//				for(int i=0; i<5; ++i) {
//					toolkit.beep();
//					try {	Thread.sleep(500);	} catch(Exception e) {}
//					
//				}
//			}
//			
//		});
		
		thread.start();
		
		for(int i=0; i<5; ++i) {
			System.out.println("12");
			try {	Thread.sleep(500);	} catch(Exception e) {}
			
		}
		
			
		
	}

}
