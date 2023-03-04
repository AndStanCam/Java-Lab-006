package src;

import java.util.Scanner;

/**
 * @author Trevor Hartman
 * @author Ander Stanley-Camba
 *
 * @since 2023-03-03
 * @version 1.0
 */

public class Lab006 {
    private int n;
    private int m;

    /**
     *
     * @param n is a whole number only
     * @param m is a whoe number only
     */
    public Lab006(int n, int m) {
        this.n = n;
        this.m = m;

    }

    /**
     * @return true if n is divisible by m, else returns false
     */
    public boolean isDivisible() {
        return this.n % this.m == 0;

    }

    public static void main(String[] args) {
        System.out.println("We will test if num1 is divisible evenly by num2\nPlease enter a number for num1:");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        System.out.println("Great! Now enter a number for num2:");
        int num2 = sc.nextInt();
        Lab006 lab006 = new Lab006(num1, num2);
        boolean result = lab006.isDivisible();
        if (result) {
            System.out.printf("%d CAN be divided by %d evenly!", num1, num2);
            return;
        }
        System.out.printf("%d can NOT be divided evenly by %d", num1, num2);
    }

}
