package com.company;

import java.util.Arrays;

public class MyArraySizeException extends Exception {

    public MyArraySizeException(String[][] arr) {
        super(Arrays.deepToString(arr));
        System.out.println("Массив имеет размер не 4 на 4");
    }
}
