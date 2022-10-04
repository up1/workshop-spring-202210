package com.example.day01;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyWorkTest {

    @DisplayName("Start with Include")
    @Test
    public void case01() {
        MyWork myWork = new MyWork("[1,5]");
        boolean result = myWork.isStartWithInclude();
        assertTrue(result);
    }

    @DisplayName("Start with Exclude")
    @Test
    public void case02() {
        MyWork myWork = new MyWork("(1,5]");
        boolean result = myWork.isStartWithInclude();
        assertFalse(result);
    }

    @DisplayName("Start number 1 with Include")
    @Test
    public void case03() {
        MyWork myWork = new MyWork("[1,5]");
        int result = myWork.getStartNumber();
        assertEquals(1, result);
    }

    @DisplayName("Start number 1 with Exclude")
    @Test
    public void case04() {
        MyWork myWork = new MyWork("(1,5]");
        int result = myWork.getStartNumber();
        assertEquals(2, result);
    }

}