// src/test/java/ru/netology/service/CashbackHackServiceTestNGTest.java
package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTestNGTest {

    @Test
    public void shouldReturnZeroIfAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        Assert.assertEquals(result, 0);
    }

    @Test
    public void shouldReturnRemainderIfAmountIsNotMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        Assert.assertEquals(result, 100);
    }
}
