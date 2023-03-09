package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

class CashbackHackServiceTest {

    @Test
    public void missingOneTest(){
        CashbackHackService service = new CashbackHackService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void spent1000Test(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void amountMoreBoundary(){
        CashbackHackService service = new CashbackHackService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }


}
