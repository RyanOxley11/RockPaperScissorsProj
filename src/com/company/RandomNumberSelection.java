package com.company;

import java.util.Random;

public class RandomNumberSelection {
    public static void main(String[] args) {
        String[] arr = {"0","1","2"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
        System.out.println(arr[randomNumber]);
    }
}

