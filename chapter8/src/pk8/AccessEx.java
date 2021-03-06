package pk8;

// 접근한정자실습
public class AccessEx {

	// 멤버변수
	private int aa;     // 은닉화(동일한 클래스에서만 사용가능)
	public int bb;      // 공통
	int cc;             // 패키지가 같으면 사용가능
	
	// 생성자
	
	// method
	public void SetA(int a) {
		aa=a; // private 이여도 public method를 통해서 외부에서 사용가능
	}
	
	public void SetB(int b) {
		bb=b;
	}
	
	public void SetC(int c) {
		cc=c;
	}
	
	public void Disp() {
		System.out.println("aa값 : " + aa + " \nbb값 : " + bb + "\ncc값 : " + cc);
	}
	
	public static void main(String[] args) {

		AccessEx obj = new AccessEx();
		
		// obj.aa=10; // 멤버변수 직접접근
		obj.SetA(10); // method로 변수방 초기화
		
		
		obj.SetB(20);
		
		// obj.cc=30;
		obj.SetC(30);
		
		obj.Disp();
		
	}

}
