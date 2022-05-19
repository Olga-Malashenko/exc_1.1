package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldCalculateRemain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2800;
        int actual = cashbackHackService.remain(amount);
        int expected = 200;
        assertEquals (expected, actual);

    }
}