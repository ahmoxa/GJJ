package com.company.tasks3;

/**
 * Created by vlasyk on 29.12.14.
 */
public class Task9 {
    public static void main(String[] args) {
        boolean x = false;
        boolean y = false;
        boolean z = false;

        boolean result = !(x || y) && (!x || !z);
        System.out.println("x = " + x + " y = " + y + " z = " + z + " result = " + result);

        x = false;
        y = false;
        z = true;

        result = !(x || y) && (!x || !z);
        System.out.println("x = " + x + " y = " + y + " z = " + z + " result = " + result);

        x = false;
        y = true;
        z = false;

        result = !(x || y) && (!x || !z);
        System.out.println("x = " + x + " y = " + y + " z = " + z + " result = " + result);

        x = true;
        y = false;
        z = false;

        result = !(x || y) && (!x || !z);
        System.out.println("x = " + x + " y = " + y + " z = " + z + " result = " + result);

        x = false;
        y = true;
        z = true;

        result = !(x || y) && (!x || !z);
        System.out.println("x = " + x + " y = " + y + " z = " + z + " result = " + result);

        x = true;
        y = true;
        z = false;

        result = !(x || y) && (!x || !z);
        System.out.println("x = " + x + " y = " + y + " z = " + z + " result = " + result);

        x = true;
        y = false;
        z = true;

        result = !(x || y) && (!x || !z);
        System.out.println("x = " + x + " y = " + y + " z = " + z + " result = " + result);

        x = true;
        y = true;
        z = true;

        result = !(x || y) && (!x || !z);
        System.out.println("x = " + x + " y = " + y + " z = " + z + " result = " + result);

    }
}
