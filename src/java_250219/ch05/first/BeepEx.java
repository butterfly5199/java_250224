package java_250219.ch05.first;

import java.awt.Toolkit;
import java.util.Date;

public class BeepEx {
	
	public static void main(String[] args)  {
		Toolkit toolkit = Toolkit.getDefaultToolkit(); 	// ctrl + shift + o
		Date now = new Date();       
		String nowTime = now.toString();
		System.out.println("nowTime : " + nowTime);
		
		
		for (int i=0; i<5; i++) {
			toolkit.beep();
			
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}			
		}
	}
}
		