package org.example.Easy;

public class ClimbStairs {

    int count;

    public int climb(int n) {
        switch (n) {
            case 1:
                count = 1;
                break;
            case 2:
                count = 2;
                break;
            case 3:
                count = 3;
                break;
            default:
                count = climb(n - 1) + climb(n - 2);
        }
        return count;
    }
}
