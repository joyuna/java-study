/*
date. 2023.01.02
 */
package 이것이자바다.ch4_조건문과반복문.example;

public class ForSumFrom1To100Example2 {
    public static void main(String[] args) {
        int sum = 0;

        int i = 0;
        for (i = 1; i <= 100; i++) {
            sum += i;
        }

        System.out.println("1~" + (i - 1) + " 합 : " + sum);
    }
}
