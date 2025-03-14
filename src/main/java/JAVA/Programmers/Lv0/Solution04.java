package JAVA.Programmers.Lv0;

import java.util.Scanner;

public class Solution04 {

	public static void main(String[] args) {
		
		
//		대소문자 바꿔서 출력하기
//		
//		문제 설명
//		영어 알파벳으로 이루어진 문자열 str이 주어집니다. 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
//
//		제한사항
//		1 ≤ str의 길이 ≤ 20
//		str은 알파벳으로 이루어진 문자열입니다.
//		입출력 예
//		입력 #1
//
//		aBcDeFg
//		출력 #1
//
//		AbCdEfG

	
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
       
        
        if(a.length() >= 1 && a.length() <= 20){
            
            for(int i = 0; i < a.length(); i++){
            
                char index = a.charAt(i);
                    
                if(index >= 65 && index <= 90){
                    
                    System.out.print((char)(index+32));
                    
                }else if(index >= 97 && index <= 122){
                    
                    System.out.print((char)(index-32));  
                    
                }else{
                     System.out.println("알파벳이 아닙니다"); 
                }
                
            }
            
                
            
        }else{
            System.out.println("str길이 오류");
        }
    }
		
	
	
	}


