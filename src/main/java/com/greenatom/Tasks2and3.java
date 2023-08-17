package com.greenatom;

/**
 * Класс с решением задач 2 и 3 (3.2). Решение задачи 1 в файле Task_1.sql
 * Для задания 2 создан метод getSwappedValues
 * Для задания 3.2 создан метод isPalindrome
 *
 * @author Игорь Головков
 */
public class Tasks2and3 {

    public static void main(String[] args) {
        Tasks2and3 methodExecuteObj = new Tasks2and3();
        /* Задача 2: Есть 2 целочисленных переменных a и b, в которых хранятся определенные значения.
           Нужно написать на Java метод, меняющий местами значения переменных a и b, не используя 3й переменной. */
        int a = 5, b = 8;
        System.out.println("a = " + a + ", b = " + b);
        int[] aAndBArray = methodExecuteObj.getSwappedValues(a, b);
        a = aAndBArray[0];
        b = aAndBArray[1];
        System.out.println("a = " + a + ", b = " + b);

        // Задача 3.2. Написать на Java метод, проверяющий является ли строка палиндромом.
        String testStr1 = "дом", testStr2 = "довод";
        System.out.println("Строка " + testStr1 + " - это палиндром: " + methodExecuteObj.isPalindrome(testStr1));
        System.out.println("Строка " + testStr2 + " - это палиндром: " + methodExecuteObj.isPalindrome(testStr2));
    }

    /**
     * @param a Первая переменная, значение которой требуется обменять
     * @param b Вторая переменная, значение которой требуется обменять
     * @return Массив, содержащий значения переменных после обмена
     * Возвращает массив, т. к. в Java переменные передаются по значению, а не по ссылке
     */
    private int[] getSwappedValues(int a, int b) {
        a = b - a;
        b -= a;
        a += b;
        return new int[]{a, b};
    }

    /**
     * @param str Строка, которую нужно проверить на палиндром
     * @return Булевое значение, отвечающее является ли строка палиндромом
     */
    private boolean isPalindrome(String str) {
        char[] formerStr = str.toCharArray();
        for (int i = 0; i < formerStr.length / 2; i++) {
            if (formerStr[i] != formerStr[formerStr.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}