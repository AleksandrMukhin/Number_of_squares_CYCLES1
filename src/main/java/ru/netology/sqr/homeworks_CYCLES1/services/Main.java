package ru.netology.sqr.homeworks_CYCLES1.services;

public class Main {
    public static void main(String[] args) {

        SQRService service = new SQRService();
        int total = service.CalcSQRService(500, 900);
        System.out.println("Количество попаданий в диапазон: " + total);
    }
}


