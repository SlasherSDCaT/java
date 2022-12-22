package practiePac.Practice5;

//Дана последовательность натуральных чисел (одно число в строке),
//завершающаяся числом 0. Определите наибольшее значение числа в этой
//последовательности.

import java.util.Scanner;

public class Page3 {
    public static Scanner scan = new Scanner(System.in);

    public static int maxSize() {
        int n = scan.nextInt();
        if (n==0) return 0;
        int max = maxSize();
        if (n>max) return n;
        return max;
    }

    public static void main(String[] args) {
        System.out.println(maxSize());
    }
}
