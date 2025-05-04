package com.epam.loops;

public class Pyramid {
    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

    public void printPyramid(int height) {
        int i, j, start, stop, start2;
        stop = height;

        for (i = 0; i < height; i++) {
            start = height - (stop - 1);
            start2 = height - (stop - 1);

            for (j = 0; j < stop - 1; j++) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(start);
                start--;
            }
            for (j = 1; j < start2; j++) {
                System.out.print(j + 1);
            }
            stop--;
            System.out.println();
        }
    }
}
