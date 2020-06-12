package ru.netology.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class CashbackHackServiceTestWithApi {

    CashbackHackService service = new CashbackHackService();


    @Test
    public void shouldReturn1() {
        Assertions.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldReturn0() {
        Assertions.assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldReturn999() {
        Assertions.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldReturn999IfExists1001() {
        Assertions.assertEquals(999, service.remain(1001));
    }
    

    @Test
    public void shouldReturn500() {
        Assertions.assertEquals(500, service.remain(500));
    }
}