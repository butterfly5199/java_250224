package java_250219.ch07.first;

import java.awt.Toolkit;

public class TryCatchFinalEx {

//	public static void main(String[] args) {		
//		Toolkit toolkit = Toolkit.getDefaultToolkit();
				
//		for(int i=0; i<5; ++i) {
//			toolkit.beep();
//			try {					
//				Thread.sleep(500);	// try 구문 안에만 있으면 위치는 상관없음.
//			} catch(InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}	
//	}
//}
//	
	public static void main(String[] args) throws InterruptedException { // 예외 던지기(회피. 떠넘기기..)		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; ++i) {
			toolkit.beep();
			Thread.sleep(500);
		}
	}
	
	public void abc() throws InterruptedException {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; ++i) {
			toolkit.beep();
			Thread.sleep(500);
		}
	}
	
	// 방법 1.
//	public void xyz() throws InterruptedException{  //throws 사용 하거나, try-catch로 문제 해결
//		abc();
//	}

	// 방법 2.
	public void xyz() {  //throws 사용 하거나, try-catch로 문제 해결		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for(int i=0; i<5; ++i) {
			toolkit.beep();
			try {					
				Thread.sleep(500);	// try 구문 안에만 있으면 위치는 상관없음.
			} catch(InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			abc();
		}

	}



