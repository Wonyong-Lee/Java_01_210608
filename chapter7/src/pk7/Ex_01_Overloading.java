package pk7;

public class Ex_01_Overloading {

	// �ʵ� = �������
	
	// �����ڻ���(����Ʈ ������)
	
	// method ����
	
	// method �ߺ���� = Overloading : Ŭ������ ������ �̸��� method�� ����.
	
	// Overloading(������) : �������� ���������� ȿ������ �ش�ȭ��
	
	public void getResult(int n) {
		System.out.println(n + "��(��) int�Դϴ�.");
	}
	
	public void getResult(char n) {
		System.out.println(n + "��(��) char�Դϴ�.");
	}
	
	public void getResult(String n) {
		System.out.println(n + "��(��) String�Դϴ�.");
	}
	
	public void getResult(int n, String str) {
		System.out.println(n + "��(��) int " + str + "��(��) str �Դϴ�.");
	}
	
}