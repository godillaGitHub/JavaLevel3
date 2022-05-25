package level3;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWorkApp {

    public static void main(String[] args) {

        //задание 1
        creatArray1();

        //задание 2
        creatArray2();

        //задание 3
        creatArray3();

        //задание 4
        creatArray4();

        //задание 5
        int len = getNumFromScanner("Введите длину массива: ");
        int initialValue = getNumFromScanner("Введите любое целое число: ");
        int[] nums1 = creatArray5(len, initialValue);
        System.out.println(Arrays.toString(nums1));
        System.out.println();

        //задание 6
        creatArray6();

        //задание 7
        int[] nums2 = {2, 2, 2, 1, 2, 2, 10, 1};
        if (checkBalance(nums2)) {
            System.out.println("Массив " + Arrays.toString(nums2) + " прошел проверку");
        } else {
            System.out.println("Массив " + Arrays.toString(nums2) + " не прошел проверку");
        }
        System.out.println();

        //задание 8 - положительное число
        int n1 = 8;
        int[] nums3 = {3, 5, 6, 1, 2};
        System.out.println("Число n = " + n1);
        System.out.println("Исходный массив " + Arrays.toString(nums3));

        int[] nums4 = creatArray8(nums3, n1);
        System.out.println("Должны получить массив [1, 2, 3, 5, 6 ]");
        System.out.println("Получили Массив со смещением " + Arrays.toString(nums4));
        System.out.println();

        //задание 8 - отрицательное число
        int n2 = -2;
        int[] nums5 = {3, 5, 6, 1};
        System.out.println("Число n = " + n2);
        System.out.println("Исходный массив " + Arrays.toString(nums5));

        int[] nums6 = creatArray8(nums5, n2);
        System.out.println("Получили Массив со смещением " + Arrays.toString(nums6));
        System.out.println();

    }

    private static int getNumFromScanner(String task) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print(task);
            if (in.hasNextInt()) {
                return in.nextInt();
            }
        }
    }


    /*1. Задать целочисленный массив, состоящий из элементов 0 и 1.
    Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
    */
    private static void creatArray1() {
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = 1;
            } else if (nums[i] == 1) {
                nums[i] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println();
    }

    /*2. Задать пустой целочисленный массив длиной 100.
    С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100
    */
    private static void creatArray2() {
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
        System.out.println(Arrays.toString(nums));
        System.out.println();
    }

    /*3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
    и числа меньшие 6 умножить на 2
    */
    private static void creatArray3() {
        int[] nums = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 6) {
                nums[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(nums));
        System.out.println();
    }

    /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
    и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей,
    если обе сложно). Определить элементы одной из диагоналей можно
    по следующему принципу: индексы таких элементов равны,
    то есть [0][0], [1][1], [2][2], …, [n][n] с помощью цикла(-ов) заполнить его
    диагональные элементы единицами (можно только одну из диагоналей, если обе сложно).
    Определить элементы одной из диагоналей можно по следующему принципу:
    индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n]
    */
    private static void creatArray4() {
        int[][] table = new int[5][5];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table.length; j++) {
                if (i == j || i == (table.length - 1 - j)) {
                    table[i][j] = 1;
                } else {
                    table[i][j] = 0;
                }
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    /*5. Написать метод, принимающий на вход два аргумента: len и initialValue,
    и возвращающий одномерный массив типа int длиной len,
    каждая ячейка которого равна initialValue
    */
    private static int[] creatArray5(int len, int initialValue) {
        int[] nums = new int[len];
        for (int i = 0; i < len; i++) {
            nums[i] = initialValue;
        }
        return nums;
    }

    /* 6. Задать одномерный массив и найти в нем минимальный
     и максимальный элементы
    */
    private static void creatArray6() {
        int[] nums = {1, 5, 3, 9, 4, 6, 8, 10, 0, -1};
        int intMin = nums[0];
        int intMax = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (intMin > nums[i]) {
                intMin = nums[i];
            }
            if (intMax < nums[i]) {
                intMax = nums[i];
            }
        }
        System.out.println("Массив: " + Arrays.toString(nums));
        System.out.println("Минимальное значение массива: " + intMin);
        System.out.println("Максимальное значение массива: " + intMax);
        System.out.println();
    }

    /* 7. Написать метод, в который передается не пустой одномерный целочисленный массив,
    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    Примеры:
    checkBalance([2, 2, 2, 1, 2, 2, ||| 10, 1]) → true, т.е. 2 + 2 + 2 + 1 + 2 + 2 = 10 + 1
    checkBalance([1, 1, 1, ||| 2, 1]) → true, т.е. 1 + 1 + 1 = 2 + 1
    граница показана символами |||, эти символы в массив не входят и не имеют никакого отношения к ИЛИ.
    */
    private static boolean checkBalance(int[] nums) {

        int sumLeft = 0;
        int sumRight = 0;
        String borderLineLeft = "";
        String borderLineRight = "";

        if (nums.length < 2) {
            System.out.println("Расчет не выполнен. Минимальная длина массива = 2");
            return false;
        }

        for (int i = 0; i < nums.length; i++) {
            sumLeft += nums[i];
            borderLineLeft += ", " + nums[i];
            sumRight = 0;
            borderLineRight = "";
            for (int j = i + 1; j < nums.length; j++) {
                sumRight += nums[j];
                borderLineRight += ", " + nums[i];
            }
            if (sumLeft == sumRight) {
                break;
            }
        }

        if (sumLeft == sumRight) {

            System.out.println("Сумма левой части: " + sumLeft);
            System.out.println("Сумма правой части: " + sumRight);
            System.out.println("Граница массива: {" + borderLineLeft + "|||" + borderLineRight + "}");

            return true;

        } else {
            return false;
        }

    }

    /* 8. Написать метод, которому на вход подается одномерный массив и число n
    (может быть положительным, или отрицательным), при этом метод должен сместить
    все элементы массива на n позиций. Элементы смещаются циклично.
    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ];
    [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    */
    private static int[] creatArray8(int[] nums, int n) {

        int temp, offset;
        int[] numsClone = nums.clone(); //клонирую чисто, чтобы не портить массив nums и возвращаю numsClone

        if (n > 0) {

            offset = calcOffset(numsClone.length, n);
            for (int i = 0; i < offset; i++) {
                temp = numsClone[0];
                for (int j = 1; j < numsClone.length; j++) {
                    numsClone[j - 1] = numsClone[j];
                }
                numsClone[numsClone.length - 1] = temp;
            }
        } else {

            offset = calcOffset(numsClone.length, n*=-1);
            for (int i = 0; i < offset; i++) {
                temp = numsClone[numsClone.length - 1];
                for (int j = numsClone.length - 1; j > 0; j--) {
                    numsClone[j] = numsClone[j - 1];
                }
                numsClone[0] = temp;
            }

        }

        return numsClone;

    }

    private static int calcOffset(int len, int n) {

        int offset = n;

        //вычисляем смещение правильно
        //допустим длина массива 10, а ввели смещение 15 - > должны получить смещение 5
        if (offset > len) {
            while (offset >= len) {
                offset = offset - len;
            }
            System.out.println("Количество смещений, которые надо выполнить: " + offset);
        }

        return offset;
    }

}

