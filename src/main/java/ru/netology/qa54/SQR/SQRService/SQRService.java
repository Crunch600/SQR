package ru.netology.qa54.SQR.SQRService;

public class SQRService {
    public int SQRquantity(int lowerLimit, int upperLimit) {
        int count = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerLimit) {
                if (i * i <= upperLimit) {
                    count++;
                }
            }
        }
        //System.out.println(count);
        return count;
    }
}
