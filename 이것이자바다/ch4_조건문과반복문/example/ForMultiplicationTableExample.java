/*
date. 2023.01.02
 */
package 이것이자바다.ch4_조건문과반복문.example;

public class ForMultiplicationTableExample {
    public static void main(String[] args) {
        for(int m=2; m<=9; m++) {
            System.out.println("*** " + m + "단 ***");
            for(int n=1; n<=9; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }
    }
}
