package com.company.tasks4;


public class Task8 {
    public static void main(String[] args) {
        int[] regions = new int[12];
        regions[0] = 1_000;
        regions[1] = 500;
        regions[2] = 100;
        regions[3] = 399;
        regions[4] = 2_000;
        regions[5] = 2_130;
        regions[6] = 50;
        regions[7] = 300;
        regions[8] = 766;
        regions[9] = 178;
        regions[10] = 333;
        regions[11] = 2_134;

        int[] density = new int[12];
        density[0] = 10;
        density[1] = 20;
        density[2] = 40;
        density[3] = 110;
        density[4] = 66;
        density[5] = 56;
        density[6] = 11;
        density[7] = 10;
        density[8] = 10;
        density[9] = 10;
        density[10] = 10;
        density[11] = 10;

        int totalSquare = 0;
        for (int i = 0; i < 12; i++) {
            totalSquare += regions[i] / density[i];
        }
        System.out.println("totalSquare = " + totalSquare);
    }
}
