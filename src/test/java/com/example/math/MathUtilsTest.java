package com.example.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;

public class MathUtilsTest {

    private final MathUtils mathUtils = new MathUtils();

    @Test
    void testAdd() {
        assertEquals(5, mathUtils.add(2, 3), "2 + 3 should equal 5");
        assertEquals(-1, mathUtils.add(-2, 1), "-2 + 1 should equal -1");

        // Kiểm thử giá trị biên
        assertEquals(Integer.MAX_VALUE, mathUtils.add(Integer.MAX_VALUE, 0), "MAX_VALUE + 0 should equal MAX_VALUE");
        assertEquals(Integer.MIN_VALUE, mathUtils.add(Integer.MIN_VALUE, 0), "MIN_VALUE + 0 should equal MIN_VALUE");

        // Kiểm thử dữ liệu ngẫu nhiên
        Random random = new Random();
        int a = random.nextInt();
        int b = random.nextInt();
        assertEquals(a + b, mathUtils.add(a, b), a + " + " + b + " should equal " + (a + b));
    }

    @Test
    void testSubtract() {
        assertEquals(1, mathUtils.subtract(3, 2), "3 - 2 should equal 1");
        assertEquals(-3, mathUtils.subtract(-2, 1), "-2 - 1 should equal -3");

        // Kiểm thử giá trị biên
        assertEquals(0, mathUtils.subtract(Integer.MAX_VALUE, Integer.MAX_VALUE), "MAX_VALUE - MAX_VALUE should equal 0");
        assertEquals(0, mathUtils.subtract(Integer.MIN_VALUE, Integer.MIN_VALUE), "MIN_VALUE - MIN_VALUE should equal 0");
    }

    @Test
    void testMultiply() {
        assertEquals(6, mathUtils.multiply(2, 3), "2 * 3 should equal 6");
        assertEquals(-2, mathUtils.multiply(-1, 2), "-1 * 2 should equal -2");

        // Kiểm thử giá trị biên
        assertEquals(0, mathUtils.multiply(0, Integer.MAX_VALUE), "0 * MAX_VALUE should equal 0");
        assertEquals(Integer.MAX_VALUE, mathUtils.multiply(1, Integer.MAX_VALUE), "1 * MAX_VALUE should equal MAX_VALUE");
    }

    @Test
    void testMultiplyOverflow() {
        assertThrows(IllegalArgumentException.class,
                () -> mathUtils.multiply(Integer.MAX_VALUE, 2),
                "Multiplication overflow should throw IllegalArgumentException");
    }

    @Test
    void testDivide() {
        // Các trường hợp kiểm thử khác
        assertEquals(2, mathUtils.divide(6, 3), "6 / 3 should equal 2");

        // Kiểm tra ngoại lệ khi chia cho 0
        assertThrows(IllegalArgumentException.class, () -> mathUtils.divide(1, 0), "Division by zero should throw an exception");

        // Kiểm tra overflow
        assertThrows(IllegalArgumentException.class, () -> mathUtils.divide(Integer.MIN_VALUE, -1), "Division results in overflow");
    }

    @Test
    void testDivideOverflow() {
        // Kiểm tra ngoại lệ khi chia Integer.MIN_VALUE cho -1
        assertThrows(IllegalArgumentException.class,
                () -> mathUtils.divide(Integer.MIN_VALUE, -1),
                "Division results in overflow should throw IllegalArgumentException");
    }



    @Test
    void testEdgeCases() {
        // Kiểm thử ngoại lệ khi vượt quá giá trị tối đa
        assertThrows(IllegalArgumentException.class,
                () -> mathUtils.add(Integer.MAX_VALUE, 1),
                "Adding beyond MAX_VALUE should throw IllegalArgumentException");

        // Kiểm thử ngoại lệ khi vượt quá giá trị tối thiểu
        assertThrows(IllegalArgumentException.class,
                () -> mathUtils.subtract(Integer.MIN_VALUE, 1),
                "Subtracting beyond MIN_VALUE should throw IllegalArgumentException");
    }

}
