package com.company;

public class Main {

    // приверы, для показа как работет =))
    private static String[][] arr = {{"3","5","3","3"},{"0","1","2","3"},{"0","3","2","3"},{"0","1","2","3"}};
    private static String[][] arr2 = {{"3","5","3","3"},{"0","add","2","3"},{"0","3","2","3"},{"0","1","2","3"}};
    private static String[][] arr3 = {{"0","1","2","3"},{"0","3","2","3"},{"0","1"}};

    public static void main(String[] args){

        System.out.println();
        try {
            onlyFourArr(arr);
        } catch (MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
            System.out.println();
            System.out.println("Расчитать не получается из за ошибки!");
        }
        System.out.println("Программа завершена");
    }

    private static void onlyFourArr(String[][] arr) throws MyArrayDataException, MyArraySizeException {

        int a;
        int b;
        int sum = 0;

        if (arr.length == 4) {
            for (int i = 0; i < 4; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException(arr);
                }
            }
        } else throw new MyArraySizeException(arr);

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                a = i;
                b = j;
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException(a,b, arr);
                }
            }
        }
        System.out.println("Сумма всех чисел в массиве равна: " + sum);
    }
}
