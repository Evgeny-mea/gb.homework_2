package ru.gb.catch_the_drop;

public class Main {
//    Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
      public static void changeNumbers (int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            } else if (array[i] == 1) {
                array[i] = 0;
            }
        }
    }

//  Задать пустой целочисленный массив размером 8.
//  Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
    public static void printArr(int[] arr){
        int go = 1;
        for (int i = 0; i < arr.length; i++, go = go + 3){
            arr[i] = go;
        }
    }

//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//    написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
    public static void chageNumbers(int[] ary) {
        for (int i = 0; i < ary.length; i++) {
            if (ary[i] < 6) {
                ary[i] *= 2;
            }
        }
    }

//  Задать одномерный массив.
//  Написать методы поиска в нём минимального и максимального элемента;
    public static void scanNumbersMin(int[] array) {
        int minValue = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
         }
    }
    public static void scanNumbersMax(int[] array){
        int maxValue = array [0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
    }





    public static void main(String[] args) {
//    Задать целочисленный массив, состоящий из элементов 0 и 1.
//    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//    Написать метод, заменяющий в принятом массиве 0 на 1, 1 на 0;
        int[] array = new int[]{1,0,1,1,1,0,0,1,0,0,0};
        changeNumbers(array);


//    Задать пустой целочисленный массив размером 8.
//    Написать метод, который помощью цикла заполнит его значениями 1 4 7 10 13 16 19 22;
        int[] arr =  new int [8];
        printArr(arr);

//  Задать одномерный массив.
//  Написать методы поиска в нём минимального и максимального элемента;
        int[] array2 = new int[]{12,10,11,14,61,10,30,51,310,10,20};
        scanNumbersMin (array2);
        scanNumbersMax (array2);




//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ],
//    написать метод, принимающий на вход массив и умножающий числа меньше 6 на 2;
        int[] ary = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        chageNumbers (ary);
        }
}
