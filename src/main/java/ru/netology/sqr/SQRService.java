package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int minValue, int maxValue) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= minValue) {
                if (i * i <= maxValue) {
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
