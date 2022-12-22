package practiePac.Practice5;

//Количество элементов, равных максимуму
//Дана последовательность натуральных чисел (одно число в строке),
//завершающаяся числом 0. Определите, какое количество элементов этой
//последовательности, равны ее наибольшему элементу.

import java.util.Scanner;

public class Page2 {
    public static Scanner scan = new Scanner(System.in);

    public static int maxNumber(int m, int s) {
        int n = scan.nextInt();
        if (n==0) return s;
        if (n>m) {
            s = 0;
            m = n;
        }
        if (n==m) s++;
        return maxNumber(m, s);
    }

    public static void main(String[] args) {
        System.out.println(maxNumber(0, 0));
    }
}
