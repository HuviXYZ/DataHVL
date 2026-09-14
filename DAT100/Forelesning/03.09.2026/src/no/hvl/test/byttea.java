package no.hvl.test;

public class byttea {

    public static void bytte(int x, int y) {
        int temp = x;
        x = y;
        y = temp;

        System.out.println("x " + x + "y" + y );
    }
}
