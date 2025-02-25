package java_250219.ch06.second;

public class Product<T,M> {
	
	private T Product;
	private M model;
	
	public T getProduct() {
		return Product;
	}	
	public void setProduct(T product) {
		Product = product;		
	}
	public M getModel() {
		return model;
	}
	public void setModel(M model) {
		this.model = model;
	}

}

//Exception : 일반 예외=컴파일 체크 예외=checked. 런타임예외를 상속하지 않는 클래스.//           
// RuntimeException : 런타임 예외
// Multi(다중) Catch Block : 두 가지 이상의 예외 동시발생 시 처리방법. 컴파일 과정에서 예외 처리 코드 검사하지 않은 예외. 상위의 Exception을 위에 먼저 작성해야 함.
// Exception Handling(예외 처리)
// - Exception : 컴파일러에서 예외를 발생시켜 개발자로 하여금 강제적으로 예외 처리코드를 작성하도록 함
// - RuntimeException : 개발자가 경험으로 처리. --> try-catch-final