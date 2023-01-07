/*
date. 2023.01.05
 */
package 이것이자바다.ch5_참조타입;

public class ArrayCopyByForExample {
    public static void main(String[] args) {
        int[] oldIntArray = {1, 2, 3};
        int[] newIntArray = new int[5];

        for(int i = 0; i < oldIntArray.length; i++) {
            newIntArray[i] = oldIntArray[i];
        }

        for(int i = 0; i < newIntArray.length; i++) {
            System.out.print(newIntArray[i] + ", ");
        }
    }
}
