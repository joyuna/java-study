/*
date. 2023.01.04
 */
package 이것이자바다.ch4_조건문과반복문.example;

public class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
