package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnZeroIfAmountIsMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(1000);
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnRemainderIfAmountIsNotMultipleOfBoundary() {
        CashbackHackService service = new CashbackHackService();
        int result = service.remain(900);
        assertEquals(100, result);
    }
}