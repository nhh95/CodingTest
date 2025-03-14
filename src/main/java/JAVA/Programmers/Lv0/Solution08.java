package JAVA.Programmers.Lv0;

import java.util.Scanner;

public class Solution08 {

	public static void main(String[] args) {
		
		
//		문자열 돌리기
//		
//		문제 설명
//		문자열 str이 주어집니다.
//		문자열을 시계방향으로 90도 돌려서 아래 입출력 예와 같이 출력하는 코드를 작성해 보세요.
//
//		제한사항
//		1 ≤ str의 길이 ≤ 10
//
//		입출력 예
//		입력 #1
//
//		abcde
//		출력 #1
//
//		a
//		b
//		c
//		d
//		e
	
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        
        if(a.length() >= 1 && a.length() <= 10 ){
        
            for(int i = 0; i < a.length(); i++){
            
            
            
            System.out.println(a.charAt(i));
            
            }
            
        }else{
            System.out.println("문자 길이 초과");
        }
        
        sc.close();
    }
		
	
	
}


