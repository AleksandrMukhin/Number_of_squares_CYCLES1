package ru.netology.sqr.homeworks_CYCLES1.services;

public class SQRService {

    public int CalcSQRService(int startRange, int endRange) {
        int total = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= startRange && i * i <= endRange) {
                total++;
            }
        }
        return total;
    }
}

