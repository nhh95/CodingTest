package JAVA.Programmers.Lv0;

import java.util.Scanner;

public class Solution03 {

	public static void main(String[] args) {
		
		
		/*
		 * 문자열 반복해서 출력하기
		 * 
		 * 문제 설명 문자열 str과 정수 n이 주어집니다. str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
		 * 
		 * 제한사항 1 ≤ str의 길이 ≤ 10 1 ≤ n ≤ 5 입출력 예 입력 #1
		 * 
		 * string 5 출력 #1
		 * 
		 * stringstringstringstringstring
		 */
	
		 Scanner sc = new Scanner(System.in);
	        String str = sc.next();
	        int n = sc.nextInt();
	        
	        if(str.length() >= 1 && str.length() <= 10 ){
	            
	            if(n >=1 && n <= 5){
	                for(int i =0; i < n; i++)
	                    System.out.printf(str);
	                
	            }else{
	                System.out.println("실행불가");
	            }
	                
	            
	        }
	            else{
	                System.out.println("실행불가");
	            }
	
	
	}
}


