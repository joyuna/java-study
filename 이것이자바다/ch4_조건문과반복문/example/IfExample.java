/*
date. 2023.01.02
 */
package 이것이자바다.ch4_조건문과반복문.example;

public class IfExample {
    public static void main(String[] args) {
        int score = 93;

        if(score>=90) {
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A 입니다.");
        }

        if(score<90)
            System.out.println("점수가 90보다 작습니다.");
            System.out.println("등급은 B 입니다.");
    }
}