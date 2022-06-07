package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CashbackHackServiceTest {

    @org.junit.Test
    public void shouldCalculateRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 39000;
        int actual = cashbackHackService.remain(amount);
        int expected = 0;
        assertEquals (expected, actual);

    }
}