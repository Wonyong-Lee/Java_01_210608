package pk8;

public class TimesTable {

	public void showTable(int num) {
		System.out.println(num + "��");
		
		for(int i=1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
}
