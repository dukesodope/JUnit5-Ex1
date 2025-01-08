package com.example.math;

public class MathUtils {
    public int add(int a, int b) {
        // Kiểm tra overflow
        if ((b > 0 && a > Integer.MAX_VALUE - b) || (b < 0 && a < Integer.MIN_VALUE - b)) {
            throw new IllegalArgumentException("Addition results in overflow");
        }
        return a + b;
    }

    public int subtract(int a, int b) {
        // Kiểm tra underflow
        if ((b > 0 && a < Integer.MIN_VALUE + b) || (b < 0 && a > Integer.MAX_VALUE + b)) {
            throw new IllegalArgumentException("Subtraction results in underflow");
        }
        return a - b;
    }

    public int multiply(int a, int b) {
        if (a > 0 && b > 0 && a > Integer.MAX_VALUE / b ||
                a < 0 && b < 0 && a < Integer.MAX_VALUE / b ||
                a > 0 && b < 0 && b < Integer.MIN_VALUE / a ||
                a < 0 && b > 0 && a < Integer.MIN_VALUE / b) {
            throw new IllegalArgumentException("Multiplication results in overflow");
        }
        return a * b;
    }


    public int divide(int a, int b) {
        // Kiểm tra phép chia cho 0
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }

        // Kiểm tra overflow khi a là Integer.MIN_VALUE và b là -1
        if (a == Integer.MIN_VALUE && b == -1) {
            throw new IllegalArgumentException("Division results in overflow: Integer.MIN_VALUE / -1 exceeds Integer.MAX_VALUE");
        }

        return a / b; // Thực hiện phép chia nếu không có lỗi
    }
}


