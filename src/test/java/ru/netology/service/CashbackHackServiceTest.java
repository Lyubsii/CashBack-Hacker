package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void remain() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        cashbackHackService.remain(amount);

        int actual = cashbackHackService.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);

    }
}