package java_250219.ch05.first;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
		Toolkit tookit = Toolkit.getDefaultToolkit();
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
