package trainning;

public class DmbCellPhone {

	DmbCellPhone() {
		super();
	}
	
	DmbCellPhone(String model, String color) {
		super(model, color);
	}
	
	void powerOff() {
		System.out.println(super.model + " 전원을 끕니다.");
	}
	
	void powerOn() {
		System.out.println(super.model + " 전원을 켭니다.");
	}
}
