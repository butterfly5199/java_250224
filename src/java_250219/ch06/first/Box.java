package java_250219.ch06.first;

public class Box<T> {
	
	
//	public int a;
	
	private T t;
	
	public T getT() {
		return t;
	}
	
	public void setT(T t) {
		this.t= t;
	}
	
}

// 자바에서 제네릭(Generics)은 "클래스 내부에서 사용할 데이터 타입을 외부에서 지정하는 기법"을 의미함.
// 객체별로 다른 타입의 자료가 저장될 수 있도록 한다. <>: 꺽쇠. 다이아몬드 연산자라고 함.