package ro.mirodone;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Count count = new Count();

        System.out.println(Arrays.toString(
                count.countPositivesSumNegatives(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));

        System.out.println(Arrays.toString(
                count.countPositivesSumNegatives(new int[]{})));
    }
}
