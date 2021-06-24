package Exam;

import java.util.Scanner;



public class Example_09 {

	public static void main(String[] args) {

		boolean run = true;
		
		int studentNum = 0;
		int[] scores = null;
		
	
		
		Scanner scanner=new Scanner(System.in);
		
		while(true) {
			System.out.println("=============================================================");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("=============================================================");
			System.out.println("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
					System.out.print("학생수>");
					studentNum=Integer.parseInt(scanner.nextLine());
					scores=new int[studentNum];
			}else if(selectNo == 2) {	
				for(int i=0; i<scores.length; i++) {
					System.out.println((i + 1) + "번째 학생점수:");
					scores[i]=Integer.parseInt(scanner.nextLine());
				}
			}else if(selectNo == 3) {
				for (int i=0; i<scores.length; i++) {
					System.out.println((i+1) +"번째 학생 점수 : " + scores[i]);
				}
				System.out.println();
			}else if(selectNo == 4) {
				int max=0;
				int sum=0;
				double avg=0.0;
				for(int i=0; i<scores.length;i++) {
					max = (max<scores[i]) ? scores[i] : max;
					sum += scores[i];
				}
				avg=(double)sum/studentNum;
				System.out.println("최고 점수 : " + max);
				System.out.println("평균 점수 : " + avg);
			}else if(selectNo == 5) {
				run = false;
			}System.out.println("프로그램종료");
		}
	}

}
