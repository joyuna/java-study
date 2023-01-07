/*
date. 2023.01.05
 */
package 이것이자바다.ch5_참조타입;

public class StringEqualsExample {
    public static void main(String[] args) {
        String strVar1 = "신민철";
        String strVar2 = "신민철";

        if(strVar1 == strVar2) {
            System.out.println("strVar1과 strVar2는 참조가 같음");
        } else {
            System.out.println("strVar1과 strVar2는 참조가 다름");
        }

        if(strVar1.equals(strVar2)) { // equals() 메소드 사용
            System.out.println("strVar1과 strVar2는 문자열이 같음");
        }

        String strVar3 = new String("신민철"); // new 연산자 사용
        String strVar4 = new String("신민철"); // new 연산자 사용

        if(strVar3 == strVar4) {
            System.out.println("strVar3과 strVar4는 참조가 같음");
        } else {
            System.out.println("strVar3과 strVar4는 참조가 다름");
        }

        if(strVar3.equals(strVar4)) { // equals() 메소드 사용
            System.out.println("strVar3과 strVar4는 문자열이 같음");
        }
    }
}
