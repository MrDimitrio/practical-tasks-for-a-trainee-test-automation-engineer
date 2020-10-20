package io.github.valentyn.nahai.basics.operators;

/**
 * Task:
 * In the following program, explain why the value "13" is printed twice in a row.
 * Put the explanation in comments.
 */
public class PrePostIncrement {
    public static void main(String[] args) {
        int i = 10;
        i++;
        
        System.out.println(i);    // "11" / i = 10 +1; i = 11
        ++i;
        System.out.println(i);    // "12" /
        System.out.println(++i);  // "13"
        System.out.println(i++);  // "13
        // "
        System.out.println(i);    // "14"
        
        int a = 7; // это мой пример, который описывает ДЗ 
        System.out.println(a++);
        System.out.println(a);
        
        // в 16 строчке  12 + 1 = 13.
        // в 17 строчке мы выражаем i - и оно всё ещё = 13 (Постфиксная форма, 
        // описывается после переменной "а++ или а--", 
        // инкрементирует или декрементирует переменную после вычисления.)
        // в 19 мтрочке мы выводим переменную уже после вычисления 13 + 1 = 14
    }
}
