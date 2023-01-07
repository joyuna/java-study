/*
date. 2023.01.02
 */
package 이것이자바다.ch4_조건문과반복문.example;

public class ForFloatCounterExample {
    public static void main(String[] args) {
        for(float x=0.1f; x<=1.0f; x+=0.1f) {
            System.out.println(x);
        }
    }
}
