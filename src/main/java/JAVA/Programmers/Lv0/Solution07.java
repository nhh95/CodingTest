package JAVA.Programmers.Lv0;

import java.util.Scanner;

public class Solution07 {

	public static void main(String[] args) {
		
		
//		문자열 붙여서 출력하기
//		
//		문제 설명
//		두 개의 문자열 str1, str2가 공백으로 구분되어 입력으로 주어집니다.
//		입출력 예와 같이 str1과 str2을 이어서 출력하는 코드를 작성해 보세요.
//
//		제한사항
//		1 ≤ str1, str2의 길이 ≤ 10
//		입출력 예
//		입력 #1
//
//		apple pen
//		출력 #1
//
//		applepen
//		입력 #2
//
//		Hello World!
//		출력 #2
//
//		HelloWorld!
	
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        
        
        if(a.length() >= 1 && a.length() <= 10 && b.length() >= 1 && b.length() <= 10){
            System.out.printf(a);
            System.out.printf(b);
            
        }else{
            System.out.println("문자 길이 초과");
        }
 
	}
		
	
	
}


