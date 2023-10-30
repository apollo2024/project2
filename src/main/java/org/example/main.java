package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    }
    public static boolean Task3(int[] temp){
        for (int i = 1; i < temp.length-1; i++) {
            if (temp[i-1] == 0 && temp[i+1] == 0){
                return false;
            }
        }
        return true;
    }

    public static void Task2(){
        int[] getIn = new int[10];
        getIn = new int[]{89, 67, 3, 44, 5, 7, 3};
        int counter = 0;
        int low = getIn[0];
        int high = 0;
        for (int j : getIn) {
            if (j > high) {
                high = j;
            } else if (j < low) {
                low = j;
            }
        }
        counter = high - low;
        System.out.println(counter);
    }

    public static void Task1() {
        int[] getIn = new int[10];
        getIn = new int[]{1, 2, 3, 4, 5, 7, 8};
        int counter = 0;

        for (int temp:getIn) {
            if (temp % 2 == 0){
                counter++;
            }
        }

        System.out.println(counter);
    }
}
