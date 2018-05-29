package com.example.demo.util;

public class FibnacciCounter {

    public static int getFibnacci(Integer num) {
        if(null == num || num <= 0){
            return -1;
        }
        if(num == 1 || num == 2){
            return 1;
        }
        return getFibnacci(num -1 ) + getFibnacci(num -2 );
    }
}
