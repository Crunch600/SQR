package ru.netology.qa54.SQR.SQRService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void shouldSqrQuantityLimit(int expected, int lowerLimit, int upperLimit) {
        SQRService service = new SQRService();

        int actual = service.SQRquantity(lowerLimit, upperLimit);

        Assertions.assertEquals(expected, actual);
    }
    }