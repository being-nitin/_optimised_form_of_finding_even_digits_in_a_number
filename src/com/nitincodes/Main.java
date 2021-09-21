package com.nitincodes;

public class Main {

    public static void main(String[] args) {
	//java program to find even digits an an array:
    int[] nums = {123,5647,78,890,678923};
        System.out.println(digits(678923));
    }
    static int digits(int num){
        return (int)(Math.log10(num)+1);
    }
}
