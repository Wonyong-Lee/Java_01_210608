package pk7;

public class FunTest_02 {

	public static void main(String[] args) {

		
		int num1=10;
		int num2=20;
		
		int sum = addNum(num1, num2);     // 메소드 호출
		System.out.println(num1 + "+"+ num2 + "=" + sum + "입니다.");
	}
	
	public static int addNum(int n1, int n2) {
		int result = n1+n2;
		return result;
	}

}
