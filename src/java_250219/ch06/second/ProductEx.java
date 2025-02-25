package java_250219.ch06.second;

public class ProductEx {

	public static void main(String[] args) {
		
		Product<String, Integer> iPhone6 = new Product<>();		
		iPhone6.setModel(6);
		
		Product<String, String> iPhone6s = new Product<>();
		iPhone6.setModel("6s");
		
		// 객체(클래스) 등 레퍼런스 타입은 다 됨.
		
//public class Tv { 
		
//		Product<Tv, String> product = new Product<>();
//		
//		Tv tv = new Tv();
//		
//		product.setProduct(tv);

	}
//}
}

// 타입 파라미터 제한

// 와일드 카드 : "?" -> 구체적인 타입 대신 아래 3가지 정도의 형태 사용 가능 
// * 제네릭타입<?> : 제한없음
// * 제네릭타입<? extends 상위타입> : 하위클래스 제한
// * 제네릭타입<? super 상위타입> : 상위클래스 제한

  