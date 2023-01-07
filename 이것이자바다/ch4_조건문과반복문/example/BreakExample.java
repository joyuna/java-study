/*
date. 2023.01.04
 */
package 이것이자바다.ch4_조건문과반복문.example;

public class BreakExample {
    public static void main(String[] args) {
        while(true) {
            int num = (int)(Math.random()*6) + 1;
            System.out.println(num);
            if(num==6) {
              break;
            }
        }
        System.out.println("프로그램 종료");
    }
}
