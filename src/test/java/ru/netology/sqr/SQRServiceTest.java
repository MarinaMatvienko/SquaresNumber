package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void testSet() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calculateSQR(200, 300);
        //System.out.println(count);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testNoValue() {
        SQRService service = new SQRService();

        int expected = 0;
        int actual = service.calculateSQR(10, 99);
        //System.out.println(count);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMinValue() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calculateSQR(100, 100);
        //System.out.println(count);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testMaxValue() {
        SQRService service = new SQRService();

        int expected = 22;
        int actual = service.calculateSQR(100, 1000);
        //System.out.println(count);

        Assertions.assertEquals(expected, actual);
    }
}
