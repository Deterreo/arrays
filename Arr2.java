package com.company;

public class Arr2 {

        public static void main(String[] args) {
            int numbers[] = { 3, -5, 2, 120, 67, 4, -43, 9, 88, 1 };
            int min, max;
            min = max = numbers[0];

            for (int i = 1; i < 10; i++) {
                if (numbers[i] < min)
                    min = numbers[i];
                if(numbers[i] > max) {
                    max = numbers[i];
                }
            }
            System.out.println("min : " + min + "; max : " + max);
        }
}
