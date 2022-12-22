package practiePac.Practice5;

//Дана последовательность натуральных чисел (одно число в строке),
//завершающаяся числом 0. Определите наибольшее значение числа в этой
//последовательности.

import java.util.Scanner;

public class Page4 {
    public static Scanner scan = new Scanner(System.in);

    public static void printSeq(int num, int n) {
        for (int i = num; i > 0; i--) {
            if (n==0) return;
            System.out.print(num);
            System.out.print(' ');
            n--;
        }
        printSeq(num+1, n);
    }

    public static void main(String[] args) {
        printSeq(1, scan.nextInt());
    }
}
