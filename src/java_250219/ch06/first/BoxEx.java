package java_250219.ch06.first;

public class BoxEx {
	
	public static void main(String[] args) {
		
//		Box box = new Box();
//		
//		box.a = 1;
//		System.out.println(box.a);
	
		Box<Integer> box = new Box<>();
//		Box<Integer> box = new Box<Integer>();  --> 위와 표기법이 다를 뿐 같은 것.
		box.setT(1);		
		System.out.println(box.getT());
		
		
//		Box<int> box2 = new Box<>;  //error : 원시데이터(int. float, double) 타입이므로 오류발생
		// 제네릭 타입 매개변수에 정수형(Integer), 실수형(Double), 문자열(String) 타입, 클래스(ex.Apple)로 지정 가능.
		// 클래스 등 레퍼런스 타입은 다 됨.
		
		Box<String> box3 = new Box<>();
		box3.setT("Tony");
		System.out.println(box3.getT());
		
	}
	

}
