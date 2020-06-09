package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1() {
        Assert.assertEquals(1, service.remain(999));
    }

    @Test
    public void shouldReturn999() {
        Assert.assertEquals(999, service.remain(1));
    }

    @Test
    public void shouldReturn999IfExists1001() {
        Assert.assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldReturn1002() {
        Assert.assertEquals(1002, service.remain(-2));
    }

    @Test
    public void shouldReturn500() {
        Assert.assertEquals(500, service.remain(500));
    }
}