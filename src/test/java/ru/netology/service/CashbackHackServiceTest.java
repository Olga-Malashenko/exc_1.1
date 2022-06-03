package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void shouldCalculateRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2750;
        int actual = cashbackHackService.remain(amount);
        int expected = 250;
        assertEquals(actual, expected);
    }
}