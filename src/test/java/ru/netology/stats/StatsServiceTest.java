package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

    @org.junit.jupiter.api.Test
    void sumSales() {
        StatsService service = new StatsService();
        int expected = 180;
        long actual = service.sumSales(purchases);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @org.junit.jupiter.api.Test
    void avSumSales() {
        StatsService service = new StatsService();
        int expected = 15;
        long actual = service.avSumSales();
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @org.junit.jupiter.api.Test
    void maxSales() {
        StatsService service = new StatsService();
        int expected = 8;
        int actual = service.maxSales(purchases);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @org.junit.jupiter.api.Test
    void minSales() {
        StatsService service = new StatsService();
        int expected = 9;
        int actual = service.minSales(purchases);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @org.junit.jupiter.api.Test
    void salesBelowAv() {
        StatsService service = new StatsService();
        int expected = 5;
        long actual = service.salesBelowAv(purchases);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }

    @org.junit.jupiter.api.Test
    void salesAboveAv() {
        StatsService service = new StatsService();
        int expected = 5;
        long actual = service.salesAboveAv(purchases);
        assertEquals(expected, actual);
        System.out.println("expected = " + expected + " and" + " actual = " + actual);
    }
}