package ex_16_Arrays;

import java.util.Arrays;

public class Lab151_InterviewQ {
    // Find the second largest number in an array
    public static void main(String[] args) {
        int[] numbers = {12, 34, 10, 1, 100, 3, 4, 32};
        Arrays.sort(numbers); //1, 2, 3, 10..
        System.out.println(numbers[numbers.length-2]);
    }
}
