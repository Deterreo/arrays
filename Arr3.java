package com.company;

public class Arr3 {
    public static void main(String[] args) {

        int numbers[] = {3, -5, 2, 120, 67, 4, -43, 9, 88, 1};
        int even[] = new int[numbers.length];
        int odd[] = new int[numbers.length];
        int nodd = 0;
        int neven = 0;
        int indeven[] = new int [numbers.length];
        int indodd[] = new int [numbers.length];

        for (int i = 0; i < numbers.length; i++){
            int x = numbers[i];
            if (x % 2 == 0){
                even[neven] = x;
                indeven[neven] = i;
                neven++;
            }else{
                odd[nodd] = x;
                indodd[neven] = i;
                nodd++;
            }
        }
        System.out.print("Even = ");
        for (int i = 0; i < neven; i++) {
            System.out.print(even[i] + " ");
        }
        System.out.println("");
        System.out.print("Index = ");
        for (int i = 0; i < neven; i++) {
            System.out.print(indeven[i] + " ");
        }
        System.out.println("");
        System.out.print("Odd = ");
        for (int i = 0; i < nodd; i++) {
            System.out.print(odd[i] + " ");
        }
        System.out.println("");
        System.out.print("Index = ");
        for (int i = 0; i < nodd; i++) {
            System.out.print(indodd[i] + " ");
        }
    }
}