package java_250219.ch05.first;

import java.awt.Toolkit;

public class BeepPrintRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=0; i<5; ++i) {
			toolkit.beep();
			
			try {	Thread.sleep(500);	} catch(Exception e) {}
			
		}
		
	}
	
}
