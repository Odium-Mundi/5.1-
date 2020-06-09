package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn0() {
        //здесь должно вернуть 0
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldReturn100() {
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void shouldReturn1() {
        Assert.assertEquals(service.remain(999), 1);
    }

    @Test
    public void shouldReturn999() {
        Assert.assertEquals(service.remain(1), 999);
    }

    @Test
    public void shouldReturn999WhenAmount1001() {
        Assert.assertEquals(service.remain(1001), 999);
    }
}