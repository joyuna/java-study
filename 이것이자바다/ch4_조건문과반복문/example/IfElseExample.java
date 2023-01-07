/*
date. 2023.01.01
 */
package 이것이자바다.ch4_조건문과반복문.example;

public class IfElseExample {
    public static void main(String[] args) {
        int score = 85;

        if(score>=90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        } else {
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
        }
    }
}
