/*
date. 2023.01.02
 */
package 이것이자바다.ch4_조건문과반복문.example;

public class SwitchStringExample {
    public static void main(String[] args) {
        String position = "과장";

        switch(position) {
            case "부장":
                System.out.println("700만원");
                break;
            case "과장":
                System.out.println("500만원");
                break;
            default:
                System.out.println("300만원");
        }
    }
}
