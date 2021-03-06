package pk13;

public abstract class Car {

	public abstract void drive();
	public abstract void stop();
	public void clear() {}; // 필수는 아님, 추가 구현해야할시 많이 사용됨
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	// template : 변경불가능한 프로젝트의 기본틀
	public final void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
