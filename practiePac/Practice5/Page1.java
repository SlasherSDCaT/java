package practiePac.Practice5;

//Цифры числа справа налево
//Дано натуральное число N. Выведите все его цифры по одной, в обратном
//порядке, разделяя их пробелами или новыми строками.

import java.util.Scanner;

public class Page1 {
    public static int printRevNumber(int n) {
        if (n<10) {
            System.out.println(n % 10);
            return 0;
        }
        System.out.print(n%10);
        System.out.print(' ');
        return printRevNumber(n/10);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        printRevNumber(n);
    }
}
