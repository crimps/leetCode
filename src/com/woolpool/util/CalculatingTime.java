package com.woolpool.util;

/**
 * 精确计算方法的执行时间
 */
public class CalculatingTime {
    public void example() {
        long start = System.nanoTime();
        for(int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        long end = System.nanoTime();
        System.out.println(end + ":" + start + "=" + (end - start));
    }

    public static long nanoTime() {
        long start = System.nanoTime();

        long end = System.nanoTime();
        return end - start;
    }
}
