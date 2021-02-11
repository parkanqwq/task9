package com.company;

public class MyArrayDataException extends Exception {

    public MyArrayDataException(int a, int b, String[][] arr) {
        super("В массиве arr["+a+"]["+b+"] возникла проблема, там лежит вместо цифры: " + arr[a][b]);
    }


}
