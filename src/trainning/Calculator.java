package trainning;

public class Calculator {

	public static void main(String[] args) {
		Calculator calculator  = new Calculator () {
			calculator.PAI_1(3.14159);
			calculator.PAI_2(3.14159265358979323846);
		}
	}
		
class Computer {
	double param;
	
	public void circleArea() {
		System.out.println("원의 면적을 계산합니다.");
	}

}

class Computer extends Calculator {
//	int param;
	
	public Computer (int param) {
		this.param = param;
	}
	
	@Override
	public void circleArea() {
		circleArea = PAI_1 * param * param;
	}
	
	public class ComputerExample{
		public static void main(String[] args) {

		Circle circle = new Circle(7);
		
		circle.circleArea();
		
		System.out.println("원의 반지름 : " + param);
		System.out.println("원의 면적 : " + circleArea);
		}		

	}
	
}

}
