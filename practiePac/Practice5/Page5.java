package practiePac.Practice5;

//От 1 до n
//Дано натуральное число n. Выведите все числа от 1 до n.

import java.util.Scanner;

public class Page5 {
    public static void seqPrint(int n, int k) {
        if (n<k) return;
        System.out.print(k);
        System.out.print(' ');
        seqPrint(n, ++k);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        seqPrint(scan.nextInt(), 1);
    }
}
